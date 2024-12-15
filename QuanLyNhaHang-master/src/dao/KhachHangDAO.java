package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;
import model.KhachHang;

public class KhachHangDAO extends DAO<KhachHang, String> {

    String INSERT_SQL = "INSERT INTO KhachHang (SoDT, HoTenKH, GioiTinh, NgaySinh, Email, DiaChi) VALUES (?, ?, ?, ?, ?, ?);";
    String UPDATE_SQL = "UPDATE KhachHang SET HoTenKH = ?, GioiTinh = ?, NgaySinh = ?, Email = ?, DiaChi = ? WHERE SoDT = ?;";
    String DELETE_SQL = "DELETE FROM KhachHang WHERE SoDT = ?;";
    String SELECT_ALL_SQL = "SELECT * FROM KhachHang;";
    String SELECT_BY_ID_SQL = "SELECT * FROM KhachHang WHERE SoDT = ?;";
    String SELECT_BY_GIOITINH_SQL = "SELECT * FROM KhachHang WHERE GioiTinh = ?;";

    @Override
    public int insert(KhachHang entity) {
        Object args[]
                = {
                    entity.getSoDT(),
                    entity.getHoTenKH(),
                    entity.getGioiTinh(),
                    entity.getNgaySinh(),
                    entity.getEmail(),
                    entity.getDiaChi()
                };
        return XJdbc.updateData(INSERT_SQL, args);
    }

    @Override
    public int update(KhachHang entity) {
        Object args[]
                = {
                    entity.getHoTenKH(),
                    entity.getGioiTinh(),
                    entity.getNgaySinh(),
                    entity.getEmail(),
                    entity.getDiaChi(),
                    entity.getSoDT()
                };
        return XJdbc.updateData(UPDATE_SQL, args);
    }

    @Override
    public int delete(String...id) {
        return XJdbc.updateData(DELETE_SQL, id);
    }

    @Override
    public KhachHang selectById(String...id) {
        List<KhachHang> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<KhachHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                KhachHang entity = new KhachHang();
                entity.setSoDT(rs.getString("SoDT"));
                entity.setHoTenKH(rs.getString("HoTenKH"));
                entity.setGioiTinh(rs.getString("GioiTinh"));
                entity.setNgaySinh(rs.getDate("NgaySinh"));
                entity.setEmail(rs.getString("Email"));
                entity.setDiaChi(rs.getString("DiaChi"));
                list.add(entity);
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            System.out.println("Lỗi selectBySql: " + ex);
            throw new RuntimeException(ex);
        }
    }

    public List<KhachHang> selectByGioiTinh(String gioiTinh) {
        List<KhachHang> list = this.selectBySql(SELECT_BY_GIOITINH_SQL, gioiTinh);
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }
}
