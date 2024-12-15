package controllers;

import static controllers.QLKhachHang.dao;
import dao.KhuyenMaiDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.KhachHang;
import model.KhuyenMai;
import utils.MsgBox;
import utils.XDate;

public class QLKhuyenMai {

    public static KhuyenMaiDAO dao = new KhuyenMaiDAO();

    public static void insert(KhuyenMai entity) {
        if (dao.insert(entity) > 0) {
            MsgBox.alert(null, "Thêm mới thành công!");
        } else {
            MsgBox.alert(null, "Thêm mới thất bại!");
        }
    }

    public static void update(KhuyenMai entity) {
        if (dao.update(entity) > 0) {
            MsgBox.alert(null, "Cập nhật thành công!");
        } else {
            MsgBox.alert(null, "Cập nhật thất bại!");
        }
    }

    public static boolean detele(String... id) {
        if (dao.delete(id) > 0) {
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
        List<KhuyenMai> list = dao.selectAll();
        model.addElement("Chưa chọn");
        for (KhuyenMai entity : list) {
            model.addElement(entity.getMaKhuyenMai());
        }
    }

    public static void fillToCboByToday(JComboBox cbo) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbo.getModel();
        model.removeAllElements();
        List<KhuyenMai> list = dao.selectByToDay();
        model.addElement("Chưa chọn khuyến mãi");
        for (KhuyenMai entity : list) {
            model.addElement(entity.getMaKhuyenMai());
        }
    }

    public static void fillToCboByDates(JComboBox cbo, String... ids) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbo.getModel();
        model.removeAllElements();
        List<KhuyenMai> list = dao.selectByDates(ids);
        model.addElement("Chưa chọn khuyến mãi");
        for (KhuyenMai entity : list) {
            model.addElement(entity.getMaKhuyenMai());
        }
    }

    public static void fillToTable(JTable tbl, List<KhuyenMai> list) {
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
        model.setRowCount(0); // Xóa tất cả các hàng trên JTable
        if (list != null) {
            for (KhuyenMai km : list) {
                // "MaKhuyenMai","TenKhuyenMai","NgayBatDau","NgayKetThuc","GiaTriKMHD", "dd/MM/yyyy HH:mm:ss aa"
                Object[] row
                        = {
                            km.getMaKhuyenMai(),
                            km.getTenKhuyenMai(),
                            XDate.dateParseString(km.getNgayBatDau(), "dd/MM/yyyy HH:mm:ss aa"),
                            XDate.dateParseString(km.getNgayKetThuc(), "dd/MM/yyyy HH:mm:ss aa"),
                            String.valueOf(Math.round(km.getGiaTriKMHD() * 100) + "%")
                        };
                model.addRow(row); // Thêm một hàng vào JTable
            }
        } else {
            MsgBox.alert(tbl, "Không tìm thấy thông tin!");
        }
    }

    public static void fillAllToTable(JTable tbl) {
        List<KhuyenMai> list = dao.selectAll(); // đọc dữ liệu từ CSDL
        fillToTable(tbl, list);
    }
}
