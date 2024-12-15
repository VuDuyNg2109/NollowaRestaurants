package controllers;

import static controllers.QLNhanVien.dao;
import dao.PhieuNhapCTDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ChucVu;
import model.NhanVien;
import model.PhieuNhapCT;
import utils.MsgBox;

public class QLPhieuNhapCT {

    public static PhieuNhapCTDAO dao = new PhieuNhapCTDAO();

    public static void insert(PhieuNhapCT entity) {
        if (dao.insert(entity) > 0) {
            MsgBox.alert(null, "Thêm mới thành công!");
        } else {
            MsgBox.alert(null, "Thêm mới thất bại!");
        }
    }

    public static void update(PhieuNhapCT entity) {
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
        List<PhieuNhapCT> list = dao.selectAll();
        model.addElement("Chưa chọn mã phiếu nhập CT");
        for (PhieuNhapCT entity : list) {
            model.addElement(entity.getMaPhieuNhapCT());
        }
    }
    public static void fillAllToCboByMaPhieuNhap(JComboBox cbo, String maPhieuNhap) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbo.getModel();
        model.removeAllElements();
        List<PhieuNhapCT> list = dao.selectAllByMaPhieuNhap(maPhieuNhap);
        model.addElement("Chưa chọn mã phiếu nhập CT");
        for (PhieuNhapCT entity : list) {
            model.addElement(entity.getMaPhieuNhapCT());
        }
    }

    public static void fillAllMaPhieuNhapToCbo(JComboBox cbo) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbo.getModel();
        model.removeAllElements();
        List<PhieuNhapCT> list = dao.selectAll();
        model.addElement("Chưa chọn mã phiếu nhập");
        for (PhieuNhapCT entity : list) {
            model.addElement(entity.getMaPhieuNhap());
        }
    }

    public static void fillToTable(JTable tbl, List<PhieuNhapCT> list) {
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
        model.setRowCount(0); // Xóa tất cả các hàng trên JTable
        if (list != null) {
            for (PhieuNhapCT pn : list) {
                // "Mã Phiếu Nhập CT", "Mã Phiếu Nhập", "Nguyên Liệu", "Số Lượng", "Đơn Vị", "Đơn Giá"
                Object[] row
                        = {
                            pn.getMaPhieuNhapCT(),
                            pn.getMaPhieuNhap(),
                            QLNguyenLieu.dao.selectById(pn.getMaNgLieu()).getTenNgLieu(),
                            pn.getSoLuong(),
                            pn.getDonVi(),
                            pn.getDonGia()
                        };

                model.addRow(row); // Thêm một hàng vào JTable
            }
        } else {
            MsgBox.alert(tbl, "Không tìm thấy thông tin!");
        }
    }

    public static void fillAllToTable(JTable tbl) {
        List<PhieuNhapCT> list = dao.selectAll(); // đọc dữ liệu từ CSDL
        fillToTable(tbl, list);
    }

    public static void fillAllToTableByMaPhieuNhap(JTable tbl, String maPhieuNhap) {
        List<PhieuNhapCT> list = dao.selectAllByMaPhieuNhap(maPhieuNhap); // đọc dữ liệu từ CSDL
        fillToTable(tbl, list);
    }

    public static void fillAllToTableByMaNguyenLieu(JTable tbl, String maNguyenLieu) {
        List<PhieuNhapCT> list = dao.selectAllByMaNguyenLieu(maNguyenLieu); // đọc dữ liệu từ CSDL
        fillToTable(tbl, list);
    }
}
