package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.KhuyenMai;
import utils.XJdbc;

public class KhuyenMaiDAO extends DAO<KhuyenMai, String> {

    String INSERT_SQL = "INSERT INTO KhuyenMai (MaKhuyenMai, TenKhuyenMai, NgayBatDau, NgayKetThuc, GiaTriKMHD) VALUES (?, ?, ?, ?, ?);";
    String UPDATE_SQL = "UPDATE KhuyenMai SET TenKhuyenMai = ?, NgayBatDau = ?, NgayKetThuc = ?, GiaTriKMHD = ? WHERE MaKhuyenMai = ?;";
    String DELETE_SQL = "DELETE FROM KhuyenMai WHERE MaKhuyenMai = ?;";
    String SELECT_ALL_SQL = "SELECT * FROM KhuyenMai;";
    String SELECT_BY_ID_SQL = "SELECT * FROM KhuyenMai WHERE MaKhuyenMai = ?;";
    String SELECT_BY_NAME_SQL = "SELECT * FROM KhuyenMai WHERE TenKhuyenMai = ?";
    String SELECT_BY_TODAY_SQL = "Select * From KhuyenMai Where NgayBatDau <= DATE(NOW()) and NgayKetThuc >= DATE(NOW());";
    String SELECT_BY_DATES_SQL = "Select * From KhuyenMai Where NgayBatDau <= ? and NgayKetThuc >= ? ;";
    

    @Override
    public int insert(KhuyenMai entity) {
        Object args[]
                = {
                    entity.getMaKhuyenMai(),
                    entity.getTenKhuyenMai(),
                    entity.getNgayBatDau(),
                    entity.getNgayKetThuc(),
                    entity.getGiaTriKMHD()

                };
        return XJdbc.updateData(INSERT_SQL, args);
    }

    @Override
    public int update(KhuyenMai entity) {
        Object args[]
                = {
                    entity.getTenKhuyenMai(),
                    entity.getNgayBatDau(),
                    entity.getNgayKetThuc(),
                    entity.getGiaTriKMHD(),
                    entity.getMaKhuyenMai()
                };
        return XJdbc.updateData(UPDATE_SQL, args);
    }

    @Override
    public int delete(String... id) {
        return XJdbc.updateData(DELETE_SQL, id);
    }

    @Override
    public KhuyenMai selectById(String... id) {
        List<KhuyenMai> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<KhuyenMai> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<KhuyenMai> selectBySql(String sql, Object...args) {
        List<KhuyenMai> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                KhuyenMai entity = new KhuyenMai();
                entity.setMaKhuyenMai(rs.getString("MaKhuyenMai"));
                entity.setTenKhuyenMai(rs.getString("TenKhuyenMai"));
                entity.setNgayBatDau(rs.getDate("NgayBatDau"));
                entity.setNgayKetThuc(rs.getDate("NgayKetThuc"));
                entity.setGiaTriKMHD(rs.getFloat("GiaTriKMHD"));
                list.add(entity);
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            System.out.println("Lỗi selectBySql: " + ex);
            throw new RuntimeException(ex);
        }
    }

    // Sử dụng được lệnh này với điều kiện, khuyến mãi không trùng tên
    public KhuyenMai selectByName(String name) {
        List<KhuyenMai> list = this.selectBySql(SELECT_BY_NAME_SQL, name);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public List<KhuyenMai> selectByToDay(String...id) {
        return this.selectBySql(SELECT_BY_TODAY_SQL, id);
    }
    public List<KhuyenMai> selectByDates(String...ids) {
        return this.selectBySql(SELECT_BY_DATES_SQL, ids);
    }
}
