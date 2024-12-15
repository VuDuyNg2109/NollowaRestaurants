package controllers;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import utils.MsgBox;
import dao.NhanVienDAO;
import model.ChucVu;
import model.NhanVien;

public class QLNhanVien {

    public static NhanVienDAO dao = new NhanVienDAO();

    public static void insert(NhanVien entity) {
        if (dao.insert(entity) > 0) {
            MsgBox.alert(null, "Thêm mới thành công!");
        } else {
            MsgBox.alert(null, "Thêm mới thất bại!");
        }
    }

    public static void update(NhanVien entity) {
        if (dao.update(entity) > 0) {
            MsgBox.alert(null, "Cập nhật thành công!");
        } else {
            MsgBox.alert(null, "Cập nhật thất bại!");
        }
    }

    public static boolean detele(String ma) {
        if (dao.delete(ma) > 0) {
            MsgBox.alert(null, "Xóa thành công!");
            return true;
        } else {
            MsgBox.alert(null, "Xóa thất bại!");
        }
        return false;
    }

    public static void fillAllToCbo(JComboBox cbo) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbo.getModel();
        model.removeAllElements();
        List<NhanVien> list = dao.selectAll();
        model.addElement("Chưa chọn nhân viên");
        for (NhanVien nv : list) {
            model.addElement(nv.getHoTenNV());
        }
    }
    
    public static void fillToCboByChucVu(JComboBox cbo, String chucVu) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbo.getModel();
        model.removeAllElements();
        List<NhanVien> list = dao.selectByChucVu(chucVu);
        model.addElement("Chưa chọn nhân viên");
        for (NhanVien nv : list) {
            model.addElement(nv.getHoTenNV());
        }
    }
    
    
    public static void fillToTable(JTable tbl, List<NhanVien> list) {
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
        model.setRowCount(0); // Xóa tất cả các hàng trên JTable
        if (list != null) {
            for (NhanVien nv : list) {
                ChucVu chucVu = QLChucVu.dao.selectById(nv.getMaCV());
                String luong = String.valueOf((int)chucVu.getLuong());
                // MaNV, MatKhau, HoTenNV, GioiTinh, NgaySinh, SoDT, Email, DiaChi, HinhNV, MaCV
                Object[] row = 
                {
                    nv.getMaNV(), 
                    nv.getHoTenNV(), 
                    nv.getGioiTinh(), 
                    nv.getSoDT(), 
                    nv.getDiaChi(), 
                    chucVu.getChucVu(), 
                    luong,
                    nv.getMatKhau()
                };
                model.addRow(row); // Thêm một hàng vào JTable
            }
        } else {
            MsgBox.alert(tbl, "Không tìm thấy thông tin!");
        }
    }
    
    public static void fillAllToTable(JTable tbl) {
        List<NhanVien> list = dao.selectAll(); // đọc dữ liệu từ CSDL
        fillToTable(tbl, list);
    }
    
    public static void fillToTableByGioiTinh(JTable tbl, String gioTinh) {
        List<NhanVien> list = dao.selectByGioiTinh(gioTinh); // đọc dữ liệu từ CSDL
        fillToTable(tbl, list);
    }
    
    public static void fillToTableByChucVu(JTable tbl, String chucVu) {
        List<NhanVien> list = dao.selectByChucVu(chucVu); // đọc dữ liệu từ CSDL
        fillToTable(tbl, list);
    }
}
