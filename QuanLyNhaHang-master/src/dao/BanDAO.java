package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;
import model.Ban;

public class BanDAO extends DAO<Ban, String> {

    String INSERT_SQL = "INSERT INTO DatBan (MaBan, MaHoaDon, TinhTrang) VALUES (?, ?, ?);";
    String UPDATE_SQL = "UPDATE DatBan SET MaHoaDon = ?, TinhTrang = ? WHERE MaBan  = ?;";
    String DELETE_SQL = "DELETE FROM DatBan WHERE MaBan  = ?;";
    String SELECT_ALL_SQL = "SELECT * FROM DatBan;";
    String SELECT_BY_ID_SQL = "SELECT * FROM DatBan WHERE MaBan  = ?;";
    String SELECT_BY_MAHOADON_SQL = "SELECT * FROM DatBan WHERE MaHoaDon  = ?;";

    @Override
    public int insert(Ban entity) {
        Object args[]
                = {
                    entity.getMaBan(),
                    entity.getMaHoaDon(),
                    entity.isTinhTrang()
                };
        return XJdbc.updateData(INSERT_SQL, args);
    }

    @Override
    public int update(Ban entity) {
        Object args[]
                = {
                    entity.getMaHoaDon(),
                    entity.isTinhTrang(),
                    entity.getMaBan()
                };
        return XJdbc.updateData(UPDATE_SQL, args);
    }

    @Override
    public int delete(String... id) {
        return XJdbc.updateData(DELETE_SQL, id);
    }

    @Override
    public Ban selectById(String... id) {
        List<Ban> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<Ban> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<Ban> selectBySql(String sql, Object... args) {
        List<Ban> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                Ban entity = new Ban();
                entity.setMaBan(rs.getInt("MaBan"));
                entity.setMaHoaDon(rs.getInt("MaHoaDon"));
                entity.setTinhTrang(rs.getBoolean("TinhTrang"));
                list.add(entity);
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            System.out.println("Lỗi selectBySql: " + ex);
            throw new RuntimeException(ex);
        }
    }

    public Ban selectByMaHoaDon(String...maHoaDon) {
        List<Ban> list = this.selectBySql(SELECT_BY_MAHOADON_SQL, maHoaDon);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
