package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;
import model.LoaiMon;

public class LoaiMonDAO extends DAO<LoaiMon, String> {

String INSERT_SQL = "INSERT INTO LoaiMon (MaLoaiMon, TenLoaiMon) VALUES (?, ?);";
String UPDATE_SQL = "UPDATE LoaiMon SET TenLoaiMon = ? WHERE MaLoaiMon = ?;";
String DELETE_SQL = "DELETE FROM LoaiMon WHERE MaLoaiMon = ?;";
String SELECT_ALL_SQL = "SELECT * FROM LoaiMon;";
String SELECT_BY_ID_SQL = "SELECT * FROM LoaiMon WHERE MaLoaiMon = ?;";
String SELECT_BY_NAME_SQL = "SELECT * FROM LoaiMon WHERE TenLoaiMon = ?";

    @Override
    public int insert(LoaiMon entity) {
        Object args[]
                = {
                    entity.getMaLoaiMon(),
                    entity.getTenLoaiMon()
                };
        return XJdbc.updateData(INSERT_SQL, args);
    }

    @Override
    public int update(LoaiMon entity) {
        Object args[]
                = {
                    entity.getTenLoaiMon(),
                    entity.getMaLoaiMon()
                };
        return XJdbc.updateData(UPDATE_SQL, args);
    }

    @Override
    public int delete(String...id) {
        return XJdbc.updateData(DELETE_SQL, id);
    }

    @Override
    public LoaiMon selectById(String...id) {
        List<LoaiMon> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<LoaiMon> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<LoaiMon> selectBySql(String sql, Object... args) {
        List<LoaiMon> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                LoaiMon entity = new LoaiMon();
                entity.setMaLoaiMon(rs.getString("MaLoaiMon"));
                entity.setTenLoaiMon(rs.getString("TenLoaiMon"));
                list.add(entity);
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            System.out.println("Lỗi selectBySql: " + ex);
            throw new RuntimeException(ex);
        }
    }
    
    // Sử dụng được lệnh này với điều kiện, loại món không trùng tên
    public LoaiMon selectByName(String name) {
        List<LoaiMon> list = this.selectBySql(SELECT_BY_NAME_SQL, name);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
