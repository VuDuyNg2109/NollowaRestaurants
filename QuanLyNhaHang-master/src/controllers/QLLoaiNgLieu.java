
package controllers;

import dao.LoaiNgLieuDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import model.LoaiNgLieu;
import utils.MsgBox;

public class QLLoaiNgLieu {
    public static LoaiNgLieuDAO dao = new LoaiNgLieuDAO();
    
    public static void insert(LoaiNgLieu entity) {
        if (dao.insert(entity) > 0) {
            MsgBox.alert(null, "Thêm mới thành công!");
        } else {
            MsgBox.alert(null, "Thêm mới thất bại!");
        }
    }

    public static void update(LoaiNgLieu entity) {
        if (dao.update(entity) > 0) {
            MsgBox.alert(null, "Cập nhật thành công!");
        } else {
            MsgBox.alert(null, "Cập nhật thất bại!");
        }
    }

    public static boolean detele(String...id) {
        if (dao.delete(id)> 0) {
            MsgBox.alert(null, "Xóa thành công!");
            return true;
        } else {
            MsgBox.alert(null, "Xóa thất bại!");
        } 
        return false;
    }
    
    public static void fillToCbo(JComboBox cbo) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbo.getModel();
        model.removeAllElements();
        List<LoaiNgLieu> list = dao.selectAll();
        model.addElement("Chưa chọn");
        for (LoaiNgLieu entity : list) {
            model.addElement(entity.getTenLoaiNgLieu());
        }
    }
}
