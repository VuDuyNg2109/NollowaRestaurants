
package controllers;

import dao.NhaCungCapDAO;
import dao.PhieuNhapDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.NhaCungCap;
import model.NhanVien;
import model.PhieuNhap;
import utils.MsgBox;

public class QLPhieuNhap {
    
    public static PhieuNhapDAO dao = new PhieuNhapDAO();

    public static void insert(PhieuNhap entity) {
        if (dao.insert(entity) > 0) {
            MsgBox.alert(null, "Thêm mới thành công!");
        } else {
            MsgBox.alert(null, "Thêm mới thất bại!");
        }
    }

    public static void update(PhieuNhap entity) {
        if (dao.update(entity) > 0) {
            MsgBox.alert(null, "Cập nhật thành công!");
        } else {
            MsgBox.alert(null, "Cập nhật thất bại!");
        }
    }

    public static boolean detele(String ma) {
        if (dao.delete(ma)> 0) {
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
        List<PhieuNhap> list = dao.selectAll();
        model.addElement("Chưa chọn phiếu nhập");
        for (PhieuNhap entity : list) {
            model.addElement(entity.getMaPhieuNhap());
        }
    }
    
//    public static void fillTablePhieuNhap(JTable tblPhieuNhap) {
//        DefaultTableModel model = (DefaultTableModel) tblPhieuNhap.getModel();
//        model.setRowCount(0); // Xóa tất cả các hàng trên JTable
//        try {
//            List<PhieuNhap> list = dao.selectAll(); // đọc dữ liệu từ CSDL
//            for (PhieuNhap pn : list) {
//                // "Mã Phiếu Nhập", "Ngày Nhập", "Người Nhập", "Tổng Chi"
//                Object[] row = {pn.getMaPhieuNhap(), pn.getNgayNhap(), pn.getMaNV(), };
//                model.addRow(row);// Thêm môt hàng vào JTable
//            }
//        } catch (Exception e) {
//            MsgBox.alert(null, "Lỗi truy vấn dữ liệu!");
//        }
//    }
}
