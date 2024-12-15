package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;
import model.CaTruc;

public class CaTrucDAO extends DAO<CaTruc, String> {

    String INSERT_SQL = "INSERT INTO CaTruc (GioBatDau, GioKetCa) VALUES (?, ?);";
    String UPDATE_SQL = "UPDATE CaTruc SET GioBatDau = ?, GioKetCa = ? WHERE MaCaTruc = ?;";
    String DELETE_SQL = "DELETE FROM CaTruc WHERE MaCaTruc = ?;";
    String SELECT_ALL_SQL = "SELECT * FROM CaTruc;";
    String SELECT_BY_ID_SQL = "SELECT * FROM CaTruc WHERE MaCaTruc = ?;";

    @Override
    public int insert(CaTruc entity) {
        Object args[]
                = {
                    entity.getGioBatDau(),
                    entity.getGioKetCa(),};
        return XJdbc.updateData(INSERT_SQL, args);
    }

    @Override
    public int update(CaTruc entity) {
        Object args[]
                = {
                    entity.getGioBatDau(),
                    entity.getGioKetCa(),
                    entity.getMaCaTruc()
                };
        return XJdbc.updateData(UPDATE_SQL, args);
    }

    @Override
    public int delete(String...id) {
        return XJdbc.updateData(DELETE_SQL, id);
    }

    @Override
    public CaTruc selectById(String...id) {
        List<CaTruc> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<CaTruc> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<CaTruc> selectBySql(String sql, Object... args) {
        List<CaTruc> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                CaTruc entity = new CaTruc();
                entity.setMaCaTruc(rs.getInt("MaCaTruc"));
                entity.setGioBatDau(rs.getTime("GioBatDau"));
                entity.setGioKetCa(rs.getTime("GioKetCa"));
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
