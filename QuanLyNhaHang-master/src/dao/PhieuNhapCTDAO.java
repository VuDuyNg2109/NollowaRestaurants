package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.PhieuNhapCT;
import utils.XJdbc;

public class PhieuNhapCTDAO extends DAO<PhieuNhapCT, String> {

String INSERT_SQL = "INSERT INTO PhieuNhapCT (MaPhieuNhap, MaNgLieu, SoLuong, DonVi, DonGia) VALUES (?, ?, ?, ?, ?);";
String UPDATE_SQL = "UPDATE PhieuNhapCT SET MaPhieuNhap = ?, MaNgLieu = ?, SoLuong = ?, DonVi = ?, DonGia = ? WHERE MaPhieuNhapCT = ?;";
String DELETE_SQL = "DELETE FROM PhieuNhapCT WHERE MaPhieuNhapCT = ?;";
String SELECT_ALL_SQL = "SELECT * FROM PhieuNhapCT;";
String SELECT_BY_ID_SQL = "SELECT * FROM PhieuNhapCT WHERE MaPhieuNhapCT = ?;";
String SELECT_ALL_BY_MAPHIEUNHAP_SQL = "SELECT * FROM PhieuNhapCT WHERE MaPhieuNhap = ?;";
String SELECT_ALL_BY_MANGUYENLIEU_SQL = "SELECT * FROM PhieuNhapCT WHERE MaNgLieu = ?;";

    @Override
    public int insert(PhieuNhapCT entity) {
        Object args[]
                = {
//                    entity.getMaPhieuNhapCT(),
                    entity.getMaPhieuNhap(),
                    entity.getMaNgLieu(),
                    entity.getSoLuong(),
                    entity.getDonVi(),
                    entity.getDonGia()
                };
        return XJdbc.updateData(INSERT_SQL, args);
    }

    @Override
    public int update(PhieuNhapCT entity) {
        Object args[]
                = {
                    entity.getMaPhieuNhap(),
                    entity.getMaNgLieu(),
                    entity.getSoLuong(),
                    entity.getDonVi(),
                    entity.getDonGia(),
                    
                    entity.getMaPhieuNhapCT()
                };
        return XJdbc.updateData(UPDATE_SQL, args);
    }

    @Override
    public int delete(String... id) {
        return XJdbc.updateData(DELETE_SQL, id);
    }

    @Override
    public PhieuNhapCT selectById(String... id) {
        List<PhieuNhapCT> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<PhieuNhapCT> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<PhieuNhapCT> selectBySql(String sql, Object... args) {
        List<PhieuNhapCT> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                PhieuNhapCT entity = new PhieuNhapCT();
                entity.setMaPhieuNhapCT(rs.getInt("MaPhieuNhapCT"));
                entity.setMaPhieuNhap(rs.getString("MaPhieuNhap"));
                entity.setMaNgLieu(rs.getString("MaNgLieu"));
                entity.setSoLuong(rs.getFloat("SoLuong"));
                entity.setDonVi(rs.getString("DonVi"));
                entity.setDonGia(rs.getFloat("DonGia"));
                list.add(entity);
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            System.out.println("Lỗi selectBySql: " + ex);
            throw new RuntimeException(ex);
        }
    }
    
    public List<PhieuNhapCT> selectAllByMaPhieuNhap(String maPhieuNhap) {
        return this.selectBySql(SELECT_ALL_BY_MAPHIEUNHAP_SQL, maPhieuNhap);
    }
    public List<PhieuNhapCT> selectAllByMaNguyenLieu(String maPhieuNhap) {
        return this.selectBySql(SELECT_ALL_BY_MANGUYENLIEU_SQL, maPhieuNhap);
    }
}
