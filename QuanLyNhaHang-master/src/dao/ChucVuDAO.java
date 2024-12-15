package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;
import model.ChucVu;

public class ChucVuDAO extends DAO<ChucVu, String> {

    String INSERT_SQL = "INSERT INTO ChucVu (MaCV, ChucVu, Luong) VALUES (?, ?, ?);";
    String UPDATE_SQL = "UPDATE ChucVu SET ChucVu = ?, Luong = ? WHERE MaCV = ?;";
    String DELETE_SQL = "DELETE FROM ChucVu WHERE MaCV = ?;";
    String SELECT_ALL_SQL = "SELECT * FROM ChucVu;";
    String SELECT_BY_ID_SQL = "SELECT * FROM ChucVu WHERE MaCV = ?;";
    String SELECT_BY_NAME_SQL = "SELECT * FROM ChucVu WHERE ChucVu = ?";

    @Override
    public int insert(ChucVu entity) {
        Object args[]
                = {
                    entity.getMaCV(),
                    entity.getChucVu(),
                    entity.getLuong()
                };
        return XJdbc.updateData(INSERT_SQL, args);
    }

    @Override
    public int update(ChucVu entity) {
        Object args[]
                = {
                    entity.getChucVu(),
                    entity.getLuong(),
                    entity.getMaCV()
                };
        return XJdbc.updateData(UPDATE_SQL, args);
    }

    @Override
    public int delete(String...id) {
        return XJdbc.updateData(DELETE_SQL, id);
    }

    @Override
    public ChucVu selectById(String...id) {
        List<ChucVu> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ChucVu> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<ChucVu> selectBySql(String sql, Object... args) {
        List<ChucVu> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                ChucVu entity = new ChucVu();
                entity.setMaCV(rs.getString("MaCV"));
                entity.setChucVu(rs.getString("ChucVu"));
                entity.setLuong(rs.getFloat("Luong"));
                list.add(entity);
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            System.out.println("Lỗi selectBySql: " + ex);
            throw new RuntimeException(ex);
        }
    }

    public ChucVu selectByName(String name) {
        List<ChucVu> list = this.selectBySql(SELECT_BY_NAME_SQL, name);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
}
