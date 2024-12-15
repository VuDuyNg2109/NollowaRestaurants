
package controllers;

import static controllers.QLNhanVien.dao;
import dao.KhachHangDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.KhachHang;
import model.NhanVien;
import utils.MsgBox;

public class QLKhachHang {
    
    public static KhachHangDAO dao = new KhachHangDAO();

    public static void insert(KhachHang entity) {
        if (dao.insert(entity) > 0) {
            MsgBox.alert(null, "Thêm mới thành công!");
        } else {
            MsgBox.alert(null, "Thêm mới thất bại!");
        }
    }

    public static void update(KhachHang entity) {
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
        List<KhachHang> list = dao.selectAll();
        model.addElement("Chưa chọn số điện thoại");
        for (KhachHang ct : list) {
            model.addElement(ct.getSoDT());
        }
    }
    
    public static void fillAllToTable(JTable tbl) {
        List<KhachHang> list = dao.selectAll(); // đọc dữ liệu từ CSDL
        fillToTable(tbl, list);
    }
    public static void fillToTable(JTable tbl, List<KhachHang> list) {
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
        model.setRowCount(0); // Xóa tất cả các hàng trên JTable
        if (list != null) {
            // "Tên KH","Giới tính", "Ngày sinh", "Số ĐT", "Email","Địa chỉ"
            for (KhachHang kh : list) {
                Object[] row = 
                {
                    kh.getHoTenKH(),
                    kh.getGioiTinh(),
                    kh.getNgaySinh(),
                    kh.getSoDT(),
                    kh.getEmail(),
                    kh.getDiaChi()
               
                };
                model.addRow(row); // Thêm một hàng vào JTable
            }
        } else {
            MsgBox.alert(tbl, "Không tìm thấy thông tin!");
        }
    }
    
    public static void fillToTableByGioiTinh(JTable tbl, String gioTinh) {
        List<KhachHang> list = dao.selectByGioiTinh(gioTinh); // đọc dữ liệu từ CSDL
        fillToTable(tbl, list);
    }
}
