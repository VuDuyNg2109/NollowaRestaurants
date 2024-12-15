package dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.XJdbc;

public class ThongKeDAO {

    private List<Object[]> getListOfArray(String sql, String[] colsSelected, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                Object[] var = new Object[colsSelected.length];
                for (int i = 0; i < colsSelected.length; i++) {
                    var[i] = rs.getObject(colsSelected[i]);
                }
                list.add(var);
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            System.out.println("Lỗi getListOfArray: " + ex);
        }
        return null;
    }

    private Object[] getValues(String sql, String[] colsSelected, Object... args) {
        List<Object[]> list = this.getListOfArray(sql, colsSelected, args);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private Object getValue(String sql, String[] colsSelected, Object... args) {
        List<Object[]> list = this.getListOfArray(sql, colsSelected, args);
        if (list.isEmpty()) {
            return null;
        }
        Object[] var = list.get(0);
        return var[0];
    }

    public List<Object[]> getThucDon(String maLoaiMon) {
        String sql = "{CALL sp_ThucDon (?)}";
        String[] cols = {"TenMon", "DonVi", "DonGia"};
        return this.getListOfArray(sql, cols, maLoaiMon);
    }

    public Object getSoHoaDon() {
        String sql = "{CALL sp_SoHoaDon}";
        String[] cols = {"Max(MaHoaDon)"};
        return this.getValue(sql, cols);
    }

//    public Object[] getHoaDon(String maLoaiMon) {
//        String sql = "{CALL sp_HoaDon (?)}";
//        String[] cols = {"MaHoaDon", "NgayLapHD", "HinhThucTT", "MaNV", "HoTenNV", "HoTenKH", "SoDT", "DiaChi"};
//        return this.getValues(sql, cols, maLoaiMon);
//    }
    // "Tên Món", "Số Lượng", "Đơn Vị", "Đơn Giá", "Giảm Giá", "Thành Tiền";
    public List<Object[]> getHoaDonCT(String maLoaiMon) {
        String sql = "{CALL sp_HoaDonCT (?)}";
        String[] cols = {"TenMon", "SoLuong", "DonVi", "DonGia", "GiamGia", "ThanhTien"};
        return this.getListOfArray(sql, cols, maLoaiMon);
    }

    // "Mã Hóa Đơn", "Ngày Lập", "Người Lập", "Tổng Tiền", "Thanh Toán"
    public List<Object[]> getThongKeHoaDon() {
        String sql = "{CALL spThongkeHoaDon()}";
        String[] cols = {"MaHoaDon", "NgayLapHD", "NhanVienLap","NhanVienTT", "TongTien", "HinhThucTT"};
        return this.getListOfArray(sql, cols);
    }

    // "Mã Phiếu Nhập", "Ngày Nhập", "Người Nhập", "Tổng Chi"
    public List<Object[]> getThongKePhieuNhap() {
        String sql = "{CALL spThongkePhieuNhap()}";
        String[] cols = {"MaPhieuNhap", "NgayNhap", "HoTenNV", "TongTien"};
        return this.getListOfArray(sql, cols);
    }

    // "Mã Nguyên Liệu", "Loại Nguyên Liệu", "Tên Nguyên Liệu", "Đơn Vị Tính", "Số Lượng"
    public List<Object[]> getThongKeNguyenLieu() {
        String sql = "{CALL spThongkeNguyenLieu()}";
        String[] cols = {"MaNgLieu", "TenLoaiNgLieu", "TenNgLieu", "DonVi", "SoLuong"};
        return this.getListOfArray(sql, cols);
    }

    // {"Ngày Trực", "Nhân Viên", "Mã Ca Trực", "Thời Gian Bắt Đầu", "Thời Gian Kết Thức"};
    public List<Object[]> getThongKeCaTruc() {
        String sql = "{CALL spThongkeCaTruc()}";
        String[] cols = {"NgayTruc", "HoTenNV", "MaCaTruc", "GioBatDau", "GioKetCa"};
        return this.getListOfArray(sql, cols);
    }

}
