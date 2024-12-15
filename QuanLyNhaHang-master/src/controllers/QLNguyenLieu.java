
package controllers;

import dao.LoaiNgLieuDAO;
import dao.NguyenLieuDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import model.LoaiNgLieu;
import model.NguyenLieu;
import utils.MsgBox;

public class QLNguyenLieu {
    
    public static NguyenLieuDAO dao = new NguyenLieuDAO();

    public static void insert(NguyenLieu entity) {
        if (dao.insert(entity) > 0) {
            MsgBox.alert(null, "Thêm mới thành công!");
        } else {
            MsgBox.alert(null, "Thêm mới thất bại!");
        }
    }

    public static void update(NguyenLieu entity) {
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
        List<NguyenLieu> list = dao.selectAll();
        model.addElement("Chưa chọn nguyên liệu");
        for (NguyenLieu entity : list) {
            model.addElement(entity.getTenNgLieu());
        }
    }
    
    public static void fillToCboByMaLoaiNgLieu(JComboBox cbo, String maLoaiNgLieu) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbo.getModel();
        model.removeAllElements();
        List<NguyenLieu> list = dao.selectByMaLoaiNgLieu(maLoaiNgLieu);
        model.addElement("Chưa chọn");
        for (NguyenLieu entity : list) {
            model.addElement(entity.getTenNgLieu());
        }
    }

}
