package dao;

import utils.XJdbc;
import model.HoaDon;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HoaDonDAO extends DAO<HoaDon, String> {

    String INSERT_SQL = "INSERT INTO HoaDon (NgayLapHD, HinhThucTT, NhanVienLap, NhanVienTT, MaKH, MaKhuyenMai) VALUES (?, ?, ?, ?, ?, ?);";
    // Không update NhanVienLap = ?
    String UPDATE_SQL = "UPDATE HoaDon SET NgayLapHD = ?, HinhThucTT = ?, NhanVienTT = ?, MaKH = ?, MaKhuyenMai = ? WHERE MaHoaDon = ?;";
    String DELETE_SQL = "DELETE FROM HoaDon WHERE MaHoaDon = ?;";
    String SELECT_ALL_SQL = "SELECT * FROM HoaDon;";
    String SELECT_BY_ID_SQL = "SELECT * FROM HoaDon WHERE MaHoaDon = ?;";
    String SELECT_PAYMENT_SQL = "SELECT distinct(HinhThucTT) FROM HoaDon;";
    String SELECT_BY_KHACHHANG_SQL = "SELECT * FROM HoaDon WHERE MaKH = ?;";

    @Override
    public int insert(HoaDon entity) {
        Object args[]
                = {
                    entity.getNgayLapHD(),
                    entity.getHinhThucTT(),
                    entity.getNhanVienLap(),
                    entity.getNhanVienTT(),
                    entity.getMaKH(),
                    entity.getMaKhuyenMai()
                };
        return XJdbc.updateData(INSERT_SQL, args);
    }

    @Override
    public int update(HoaDon entity) {
        Object args[]
                = {
                    entity.getNgayLapHD(),
                    entity.getHinhThucTT(),
//                    entity.getNhanVienLap(),
                    entity.getNhanVienTT(),
                    entity.getMaKH(),
                    entity.getMaKhuyenMai(),
                    entity.getMaHoaDon()
                };
        
        return XJdbc.updateData(UPDATE_SQL, args);
    }

    @Override
    public int delete(String... id) {
        return XJdbc.updateData(DELETE_SQL, id);
    }

    @Override
    public HoaDon selectById(String... id) {
        List<HoaDon> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<HoaDon> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                HoaDon entity = new HoaDon();
                entity.setMaHoaDon(rs.getInt("MaHoaDon"));
                entity.setNgayLapHD(rs.getDate("NgayLapHD"));
                entity.setHinhThucTT(rs.getString("HinhThucTT"));
                entity.setNhanVienLap(rs.getString("NhanVienLap"));
                entity.setNhanVienTT(rs.getString("NhanVienTT"));
                entity.setMaKH(rs.getString("MaKH"));
                entity.setMaKhuyenMai(rs.getString("MaKhuyenMai"));
                list.add(entity);
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            System.out.println("Lỗi selectBySql: " + ex);
            throw new RuntimeException(ex);
        }
    }
    
    public List<String> selectPaymentBySql() {
        List<String> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(SELECT_PAYMENT_SQL);
            while (rs.next()) {
                list.add(rs.getString("HinhThucTT"));
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            System.out.println("Lỗi selectPaymentBySql: " + ex);
            throw new RuntimeException(ex);
        }
    }

    public List<HoaDon> selectByKhachHang(String maKH) {
        return this.selectBySql(SELECT_BY_KHACHHANG_SQL, maKH);
    }
}
