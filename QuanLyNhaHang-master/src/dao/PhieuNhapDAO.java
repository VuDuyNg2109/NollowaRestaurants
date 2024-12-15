package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;
import model.PhieuNhap;

public class PhieuNhapDAO extends DAO<PhieuNhap, String> {

    String INSERT_SQL = "INSERT INTO PhieuNhap (MaPhieuNhap, MaCC, MaNV, NgayLapPhieu, NgayNhap) VALUES (?, ?, ?, ?, ?);";
    String UPDATE_SQL = "UPDATE PhieuNhap SET MaCC = ?, MaNV = ?, NgayLapPhieu = ?, NgayNhap = ? WHERE MaPhieuNhap = ?;";
    String DELETE_SQL = "DELETE FROM PhieuNhap WHERE MaPhieuNhap = ?;";
    String SELECT_ALL_SQL = "SELECT * FROM PhieuNhap;";
    String SELECT_BY_ID_SQL = "SELECT * FROM PhieuNhap WHERE MaPhieuNhap = ?;";
    
    

    @Override
    public int insert(PhieuNhap entity) {
        Object args[]
                = {
                    entity.getMaPhieuNhap(),
                    entity.getMaCC(),
                    entity.getMaNV(),
                    entity.getNgayLapPhieu(),
                    entity.getNgayNhap()
                };
        return XJdbc.updateData(INSERT_SQL, args);
    }

    @Override
    public int update(PhieuNhap entity) {
        Object args[]
                = {
                    entity.getMaCC(),
                    entity.getMaNV(),
                    entity.getNgayLapPhieu(),
                    entity.getNgayNhap(),
                    entity.getMaPhieuNhap()
                };
        return XJdbc.updateData(UPDATE_SQL, args);
    }

    @Override
    public int delete(String...id) {
        return XJdbc.updateData(DELETE_SQL, id);
    }

    @Override
    public PhieuNhap selectById(String...id) {
        List<PhieuNhap> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<PhieuNhap> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<PhieuNhap> selectBySql(String sql, Object... args) {
        List<PhieuNhap> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                PhieuNhap entity = new PhieuNhap();
                entity.setMaPhieuNhap(rs.getString("MaPhieuNhap"));
                entity.setMaCC(rs.getString("MaCC"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setNgayLapPhieu(rs.getDate("NgayLapPhieu"));
                entity.setNgayNhap(rs.getDate("NgayNhap"));
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
