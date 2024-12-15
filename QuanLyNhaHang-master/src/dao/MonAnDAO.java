package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;
import model.MonAn;

public class MonAnDAO extends DAO<MonAn, String> {

    String INSERT_SQL = "INSERT INTO MonAn (MaMon, TenMon, DonGia, DonVi, HinhMA, MaLoaiMon) VALUES (?, ?, ?, ?, ?, ?);";
    String UPDATE_SQL = "UPDATE MonAn SET TenMon = ?, DonGia = ?, DonVi = ?, HinhMA = ?, MaLoaiMon = ? WHERE MaMon = ?;";
    String DELETE_SQL = "DELETE FROM MonAn WHERE MaMon = ?;";
    String SELECT_ALL_SQL = "SELECT * FROM MonAn;";
    String SELECT_BY_ID_SQL = "SELECT * FROM MonAn WHERE MaMon = ?;";
    String SELECT_BY_NAME_SQL = "SELECT * FROM MonAn WHERE TenMon = ?";
    
    String SELECT_BY_MALOAI_SQL = "SELECT * FROM MonAn WHERE MaLoaiMon = ?";
    

    @Override
    public int insert(MonAn entity) {
        Object args[]
                = {
                    entity.getMaMon(),
                    entity.getTenMon(),
                    entity.getDonGia(),
                    entity.getDonVi(),
                    entity.getHinhMA(),
                    entity.getMaLoaiMon()

                };
        return XJdbc.updateData(INSERT_SQL, args);
    }

    @Override
    public int update(MonAn entity) {
        Object args[]
                = {
                    entity.getTenMon(),
                    entity.getDonGia(),
                    entity.getDonVi(),
                    entity.getHinhMA(),
                    entity.getMaLoaiMon(),
                    entity.getMaMon()
                };
        return XJdbc.updateData(UPDATE_SQL, args);
    }

    @Override
    public int delete(String...id) {
        return XJdbc.updateData(DELETE_SQL, id);
    }

    @Override
    public MonAn selectById(String...id) {
        List<MonAn> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<MonAn> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<MonAn> selectBySql(String sql, Object... args) {
        List<MonAn> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                MonAn entity = new MonAn();
                entity.setMaMon(rs.getString("MaMon"));
                entity.setTenMon(rs.getString("TenMon"));
                entity.setDonGia(rs.getFloat("DonGia"));
                entity.setDonVi(rs.getString("DonVi"));
                entity.setHinhMA(rs.getString("HinhMA"));
                entity.setMaLoaiMon(rs.getString("MaLoaiMon"));
                list.add(entity);
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            System.out.println("Lỗi selectBySql: " + ex);
            throw new RuntimeException(ex);
        }
    }

    // Sử dụng được lệnh này với điều kiện, món ăn không trùng tên
    public MonAn selectByName(String name) {
        List<MonAn> list = this.selectBySql(SELECT_BY_NAME_SQL, name);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public List<MonAn> selectByMaLoai(String maLoai) {
        return this.selectBySql(SELECT_BY_MALOAI_SQL, maLoai);
    }
}
