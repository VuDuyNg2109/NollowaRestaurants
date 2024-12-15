package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.KhuyenMaiCT;
import utils.XJdbc;

public class KhuyenMaiCTDAO extends DAO<KhuyenMaiCT, String> {

    String INSERT_SQL = "INSERT INTO  (MaKhuyenMai, MaMon, GiaTriKMCT) VALUES (?, ?, ?);";
    String UPDATE_SQL = "UPDATE  SET GiaTriKMCT = ? WHERE MaMon = ? AND MaKhuyenMai = ?;";
    String DELETE_SQL = "DELETE FROM  WHERE MaMon = ? AND MaKhuyenMai = ?;";
    String SELECT_ALL_SQL = "SELECT * FROM KhuyenMaiCT;";
    String SELECT_BY_ID1_SQL = "SELECT * FROM KhuyenMaiCT WHERE MaKhuyenMai = ?;";
    String SELECT_BY_ID2_SQL = "SELECT * FROM KhuyenMaiCT WHERE MaMon = ?";
    String SELECT_BY_ID_SQL = "SELECT * FROM KhuyenMaiCT WHERE MaMon = ? AND MaKhuyenMai = ?;";

    @Override
    public int insert(KhuyenMaiCT entity) {
        Object args[]
                = {
                    entity.getMaKhuyenMai(),
                    entity.getMaMon(),
                    entity.getGiaTriKMCT()
                };
        return XJdbc.updateData(INSERT_SQL, args);
    }

    @Override
    public int update(KhuyenMaiCT entity) {
        Object args[]
                = {
                    entity.getGiaTriKMCT(),
                    entity.getMaMon(),
                    entity.getMaKhuyenMai()
                };
        return XJdbc.updateData(UPDATE_SQL, args);
    }

    @Override
    public int delete(String... id) {
        return XJdbc.updateData(DELETE_SQL, id);
    }

    @Override
    public KhuyenMaiCT selectById(String...id) {
        List<KhuyenMaiCT> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<KhuyenMaiCT> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<KhuyenMaiCT> selectBySql(String sql, Object... args) {
        List<KhuyenMaiCT> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                KhuyenMaiCT entity = new KhuyenMaiCT();
                entity.setMaKhuyenMai(rs.getString("MaKhuyenMai"));
                entity.setMaMon(rs.getString("MaMon"));
                entity.setGiaTriKMCT(rs.getFloat("GiaTriKMCT"));
                list.add(entity);
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            System.out.println("Lỗi selectBySql: " + ex);
            throw new RuntimeException(ex);
        }
    }

    public List<KhuyenMaiCT> selectById1(String id) {
        List<KhuyenMaiCT> list = this.selectBySql(SELECT_BY_ID1_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    public List<KhuyenMaiCT> selectById2(String id) {
        List<KhuyenMaiCT> list = this.selectBySql(SELECT_BY_ID2_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }
}
