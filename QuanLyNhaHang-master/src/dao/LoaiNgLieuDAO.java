package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;
import model.LoaiNgLieu;

public class LoaiNgLieuDAO extends DAO<LoaiNgLieu, String> {

String INSERT_SQL = "INSERT INTO LoaiNgLieu (MaLoaiNgLieu, TenLoaiNgLieu) VALUES (?, ?);";
String UPDATE_SQL = "UPDATE LoaiNgLieu SET TenLoaiNgLieu = ? WHERE MaLoaiNgLieu = ?;";
String DELETE_SQL = "DELETE FROM LoaiNgLieu WHERE MaLoaiNgLieu = ?;";
String SELECT_ALL_SQL = "SELECT * FROM LoaiNgLieu;";
String SELECT_BY_ID_SQL = "SELECT * FROM LoaiNgLieu WHERE MaLoaiNgLieu = ?;";
String SELECT_BY_NAME_SQL = "SELECT * FROM LoaiNgLieu WHERE TenLoaiNgLieu = ?";

    @Override
    public int insert(LoaiNgLieu entity) {
        Object args[]
                = {
                    entity.getMaLoaiNgLieu(),
                    entity.getTenLoaiNgLieu()
                };
        return XJdbc.updateData(INSERT_SQL, args);
    }

    @Override
    public int update(LoaiNgLieu entity) {
        Object args[]
                = {
                    entity.getTenLoaiNgLieu(),
                    entity.getMaLoaiNgLieu()
                };
        return XJdbc.updateData(UPDATE_SQL, args);
    }

    @Override
    public int delete(String...id) {
        return XJdbc.updateData(DELETE_SQL, id);
    }

    @Override
    public LoaiNgLieu selectById(String...id) {
        List<LoaiNgLieu> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<LoaiNgLieu> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<LoaiNgLieu> selectBySql(String sql, Object... args) {
        List<LoaiNgLieu> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                LoaiNgLieu entity = new LoaiNgLieu();
                entity.setMaLoaiNgLieu(rs.getString("MaLoaiNgLieu"));
                entity.setTenLoaiNgLieu(rs.getString("TenLoaiNgLieu"));
                list.add(entity);
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            System.out.println("Lỗi selectBySql: " + ex);
            throw new RuntimeException(ex);
        }
    }

    // Sử dụng được lệnh này với điều kiện, loại nguyên liệu không trùng tên
    public LoaiNgLieu selectByName(String name) {
        List<LoaiNgLieu> list = this.selectBySql(SELECT_BY_NAME_SQL, name);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
