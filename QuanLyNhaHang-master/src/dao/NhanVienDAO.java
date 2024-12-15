package dao;

import utils.XJdbc;
import model.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO extends DAO<NhanVien, String> {

    String INSERT_SQL = "INSERT INTO NhanVien (MaNV, MatKhau, HoTenNV, GioiTinh, NgaySinh, SoDT, Email, DiaChi, HinhNV, MaCV) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    String UPDATE_SQL = "UPDATE NhanVien SET MatKhau = ?, HoTenNV = ?, GioiTinh = ?, NgaySinh = ?, SoDT = ?, Email = ?, DiaChi = ?, HinhNV = ?, MaCV = ? WHERE MaNV = ?;";
    String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV = ?;";
    String SELECT_ALL_SQL = "SELECT * FROM NhanVien;";
    String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE MaNV = ?;";
    String SELECT_BY_NAME_SQL = "SELECT * FROM NhanVien WHERE HoTenNV = ?";
    String SELECT_BY_CHUCVU_SQL = "SELECT * FROM NhanVien WHERE MaCV = ?;";
    String SELECT_BY_GIOITINH_SQL = "SELECT * FROM NhanVien WHERE GioiTinh = ?;";

    @Override
    public int insert(NhanVien entity) {
        Object args[]
                = {
                    entity.getMaNV(),
                    entity.getMatKhau(),
                    entity.getHoTenNV(),
                    entity.getGioiTinh(),
                    entity.getNgaySinh(),
                    entity.getSoDT(),
                    entity.getEmail(),
                    entity.getDiaChi(),
                    entity.getHinhNV(),
                    entity.getMaCV()
                };
        return XJdbc.updateData(INSERT_SQL, args);
    }

    @Override
    public int update(NhanVien entity) {
        Object args[]
                = {
                    entity.getMatKhau(),
                    entity.getHoTenNV(),
                    entity.getGioiTinh(),
                    entity.getNgaySinh(),
                    entity.getSoDT(),
                    entity.getEmail(),
                    entity.getDiaChi(),
                    entity.getHinhNV(),
                    entity.getMaCV(),
                    entity.getMaNV()
                };
        return XJdbc.updateData(UPDATE_SQL, args);
    }

    @Override
    public int delete(String... id) {
        return XJdbc.updateData(DELETE_SQL, id);
    }

    @Override
    public NhanVien selectById(String... id) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setHoTenNV(rs.getString("HoTenNV"));
                entity.setGioiTinh(rs.getString("GioiTinh"));
                entity.setNgaySinh(rs.getDate("NgaySinh"));
                entity.setSoDT(rs.getString("SoDT"));
                entity.setEmail(rs.getString("Email"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setHinhNV(rs.getString("HinhNV"));
                entity.setMaCV(rs.getString("MaCV"));
                list.add(entity);
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            System.out.println("Lỗi selectBySql: " + ex);
            throw new RuntimeException(ex);
        }
    }

    public NhanVien selectByName(String name) {
        // Sử dụng được lệnh này với điều kiện, nhân viên không trùng tên
        List<NhanVien> list = this.selectBySql(SELECT_BY_NAME_SQL, name);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<NhanVien> selectByChucVu(String chucVu) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_CHUCVU_SQL, chucVu);
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }
    
    public List<NhanVien> selectByGioiTinh(String gioiTinh) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_GIOITINH_SQL, gioiTinh);
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }
}
