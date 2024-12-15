
package controllers;

import dao.NhaCungCapDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import model.NhaCungCap;
import utils.MsgBox;

public class QLNhaCungCap {
    public static NhaCungCapDAO dao = new NhaCungCapDAO();
    
    public static void insert(NhaCungCap entity) {
        if (dao.insert(entity) > 0) {
            MsgBox.alert(null, "Thêm mới thành công!");
        } else {
            MsgBox.alert(null, "Thêm mới thất bại!");
        }
    }

    public static void update(NhaCungCap entity) {
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
        List<NhaCungCap> list = dao.selectAll();
        model.addElement("Chưa chọn");
        for (NhaCungCap entity : list) {
            model.addElement(entity.getTenCC());
        }
    }
}
