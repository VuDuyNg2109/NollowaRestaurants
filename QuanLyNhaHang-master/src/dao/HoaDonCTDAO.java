package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;
import model.HoaDonCT;

public class HoaDonCTDAO extends DAO<HoaDonCT, String> {

    String INSERT_SQL = "INSERT INTO HoaDonCT (MaHoaDon, MaMon, SoLuong, DonVi) VALUES (?, ?, ?, ?);";
    String UPDATE_SQL = "UPDATE HoaDonCT SET SoLuong = ?, DonVi = ? WHERE MaHoaDon = ? AND MaMon = ?";
    String DELETE_SQL = "DELETE FROM HoaDonCT WHERE MaHoaDonCT = ?;";
    String SELECT_ALL_SQL = "SELECT * FROM HoaDonCT;";
    String SELECT_BY_ID_SQL = "SELECT * FROM HoaDonCT WHERE MaHoaDonCT = ?;";
    String SELECT_ALL_BY_ID_SQL = "SELECT * FROM HoaDonCT WHERE MaHoaDon = ?;";

    @Override
    public int insert(HoaDonCT entity) {
        Object args[]
                = {
                    entity.getMaHoaDon(),
                    entity.getMaMon(),
                    entity.getSoLuong(),
                    entity.getDonVi()
                };
        return XJdbc.updateData(INSERT_SQL, args);
    }

    @Override
    public int update(HoaDonCT entity) {
        Object args[]
                = {
                    entity.getSoLuong(),
                    entity.getDonVi(),
                    entity.getMaHoaDon(),
                    entity.getMaMon()
                };
        return XJdbc.updateData(UPDATE_SQL, args);
    }

    @Override
    public int delete(String...id) {
        return XJdbc.updateData(DELETE_SQL, id);
    }

    @Override
    public HoaDonCT selectById(String...id) {
        List<HoaDonCT> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<HoaDonCT> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<HoaDonCT> selectBySql(String sql, Object...args) {
        List<HoaDonCT> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                HoaDonCT entity = new HoaDonCT();
                entity.setMaHoaDonCT(rs.getInt("MaHoaDonCT"));
                entity.setMaHoaDon(rs.getInt("MaHoaDon"));
                entity.setMaMon(rs.getString("MaMon"));
                entity.setSoLuong(rs.getFloat("SoLuong"));
                entity.setDonVi(rs.getString("DonVi"));

                list.add(entity);
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            System.out.println("Lỗi selectBySql: " + ex);
            throw new RuntimeException(ex);
        }
    }

    public List<HoaDonCT> selectAllById(String id) {
        return this.selectBySql(SELECT_ALL_BY_ID_SQL, id);
    }
}
