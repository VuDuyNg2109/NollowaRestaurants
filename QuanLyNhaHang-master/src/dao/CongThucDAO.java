package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;
import model.CongThuc;

public class CongThucDAO extends DAO<CongThuc, String> {

    String INSERT_SQL = "INSERT INTO CongThuc (MaMon, MaNgLieu, DonVi, SoLuong) VALUES (?, ?, ?, ?);";
    String UPDATE_SQL = "UPDATE  SET DonVi = ?, SoLuong = ?,  = ? WHERE MaNgLieu = ? AND MaMon = ?;";
    String DELETE_SQL = "DELETE FROM  WHERE MaNgLieu = ? AND MaMon = ?;";
    String SELECT_ALL_SQL = "SELECT * FROM CongThuc;";
    String SELECT_BY_ID1_SQL = "SELECT * FROM CongThuc WHERE MaMon = ?;";
    String SELECT_BY_ID2_SQL = "SELECT * FROM CongThuc WHERE MaNgLieu = ?";
    String SELECT_BY_ID_SQL = "SELECT * FROM CongThuc WHERE MaNgLieu = ? AND MaMon = ?;";

    @Override
    public int insert(CongThuc entity) {
        Object args[]
                = {
                    entity.getMaMon(),
                    entity.getMaNgLieu(),
                    entity.getDonVi(),
                    entity.getSoLuong()
                };
        return XJdbc.updateData(INSERT_SQL, args);
    }

    @Override
    public int update(CongThuc entity) {
        Object args[]
                = {
                    entity.getDonVi(),
                    entity.getSoLuong(),
                    entity.getMaNgLieu(),
                    entity.getMaMon()
                };
        return XJdbc.updateData(UPDATE_SQL, args);
    }

    @Override
    public int delete(String...id) {
        return XJdbc.updateData(DELETE_SQL, id);
    }

    @Override
    public CongThuc selectById(String...id) {
        List<CongThuc> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<CongThuc> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<CongThuc> selectBySql(String sql, Object... args) {
        List<CongThuc> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                CongThuc entity = new CongThuc();
                entity.setMaMon(rs.getString("MaMon"));
                entity.setMaNgLieu(rs.getString("MaNgLieu"));
                entity.setDonVi(rs.getString("DonVi"));
                entity.setSoLuong(rs.getFloat("SoLuong"));
                list.add(entity);
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            System.out.println("Lỗi selectBySql: " + ex);
            throw new RuntimeException(ex);
        }
    }

    public CongThuc selectById1(String id) {
        List<CongThuc> list = this.selectBySql(SELECT_BY_ID1_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public CongThuc selectById2(String id) {
        List<CongThuc> list = this.selectBySql(SELECT_BY_ID2_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
