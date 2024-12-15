package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.ChiTietCaTruc;
import utils.XJdbc;

public class ChiTietCaTrucDAO extends DAO<ChiTietCaTruc, String> {

    String INSERT_SQL = "INSERT INTO ChiTietCaTruc (NgayTruc, MaNV, MaCaTruc) VALUES (?, ?, ?);";
    String UPDATE_SQL = "UPDATE ChiTietCaTruc SET MaCaTruc = ? WHERE MaNV = ? AND NgayTruc = ?;";
    String DELETE_SQL = "DELETE FROM ChiTietCaTruc WHERE MaNV = ? AND NgayTruc = ?;";
    String SELECT_ALL_SQL = "SELECT * FROM ChiTietCaTruc;";
    String SELECT_BY_ID1_SQL = "SELECT * FROM ChiTietCaTruc WHERE NgayTruc = ?;";
    String SELECT_BY_ID2_SQL = "SELECT * FROM ChiTietCaTruc WHERE MaNV = ?";
    String SELECT_BY_ID_SQL = "SELECT * FROM ChiTietCaTruc WHERE MaNV = ? AND NgayTruc = ?;";

    @Override
    public int insert(ChiTietCaTruc entity) {
        Object args[]
                = {
                    entity.getNgayTruc(),
                    entity.getMaNV(),
                    entity.getMaCaTruc()
                };
        return XJdbc.updateData(INSERT_SQL, args);
    }

    @Override
    public int update(ChiTietCaTruc entity) {
        Object args[]
                = {
                    entity.getMaCaTruc(),
                    entity.getMaNV(),
                    entity.getNgayTruc()
                };
        return XJdbc.updateData(UPDATE_SQL, args);
    }

    @Override
    public int delete(String... id) {
        return XJdbc.updateData(DELETE_SQL, id);
    }

    @Override
    public ChiTietCaTruc selectById(String...id) {
        List<ChiTietCaTruc> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ChiTietCaTruc> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<ChiTietCaTruc> selectBySql(String sql, Object... args) {
        List<ChiTietCaTruc> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                ChiTietCaTruc entity = new ChiTietCaTruc();
                entity.setNgayTruc(rs.getDate("NgayTruc"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setMaCaTruc(rs.getInt("MaCaTruc"));
                list.add(entity);
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            System.out.println("Lỗi selectBySql: " + ex);
            throw new RuntimeException(ex);
        }
    }
}
