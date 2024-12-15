package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;
import model.NguyenLieu;

public class NguyenLieuDAO {

    String INSERT_SQL = "INSERT INTO NguyenLieu (MaNgLieu, TenNgLieu, DonVi, SoLuong, HinhNL, MaLoaiNgLieu) VALUES (?, ?, ?, ?, ?, ?);";
    String UPDATE_SQL = "UPDATE NguyenLieu SET TenNgLieu = ?, DonVi = ?, SoLuong = ?, HinhNL = ?, MaLoaiNgLieu = ? WHERE MaNgLieu = ?;";
    String DELETE_SQL = "DELETE FROM NguyenLieu WHERE MaNgLieu = ?;";
    String SELECT_ALL_SQL = "SELECT * FROM NguyenLieu;";
    String SELECT_BY_ID_SQL = "SELECT * FROM NguyenLieu WHERE MaNgLieu = ?;";
    String SELECT_BY_NAME_SQL = "SELECT * FROM NguyenLieu WHERE TenNgLieu = ?";
    String SELECT_ALL_BY_MANGLIEU_SQL = "SELECT * FROM NguyenLieu WHERE MaLoaiNgLieu = ?";
    

    public int insert(NguyenLieu entity) {
        Object args[]
                = {
                    entity.getMaNgLieu(),
                    entity.getTenNgLieu(),
                    entity.getDonVi(),
                    entity.getSoLuong(),
                    entity.getHinhNL(),
                    entity.getMaLoaiNgLieu()
                };
        return XJdbc.updateData(INSERT_SQL, args);
    }

    public int update(NguyenLieu entity) {
        Object args[]
                = {
                    entity.getTenNgLieu(),
                    entity.getDonVi(),
                    entity.getSoLuong(),
                    entity.getHinhNL(),
                    entity.getMaLoaiNgLieu(),
                    entity.getMaNgLieu()
                };
        return XJdbc.updateData(UPDATE_SQL, args);
    }

    public int delete(String... id) {
        return XJdbc.updateData(DELETE_SQL, id);
    }

    public NguyenLieu selectById(String... id) {
        List<NguyenLieu> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<NguyenLieu> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    protected List<NguyenLieu> selectBySql(String sql, Object... args) {
        List<NguyenLieu> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                NguyenLieu entity = new NguyenLieu();
                entity.setMaNgLieu(rs.getString("MaNgLieu"));
                entity.setTenNgLieu(rs.getString("TenNgLieu"));
                entity.setDonVi(rs.getString("DonVi"));
                entity.setSoLuong(rs.getFloat("SoLuong"));
                entity.setHinhNL(rs.getString("HinhNL"));
                entity.setMaLoaiNgLieu(rs.getString("MaLoaiNgLieu"));
                list.add(entity);
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            System.out.println("Lỗi selectBySql: " + ex);
            throw new RuntimeException(ex);
        }
    }

    public NguyenLieu selectByName(String name) {
        // Sử dụng được lệnh này với điều kiện, nguyên liệu không trùng tên
        List<NguyenLieu> list = this.selectBySql(SELECT_BY_NAME_SQL, name);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<NguyenLieu> selectByMaLoaiNgLieu(String maLoaiNgLieu) {
        return this.selectBySql(SELECT_ALL_BY_MANGLIEU_SQL, maLoaiNgLieu);
    }
}
