
package controllers;

import dao.LoaiMonDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import model.LoaiMon;
import utils.MsgBox;

public class QLLoaiMon {
        
    public static LoaiMonDAO dao = new LoaiMonDAO();
    
    public static void insert(LoaiMon entity) {
        if (dao.insert(entity) > 0) {
            MsgBox.alert(null, "Thêm mới thành công!");
        } else {
            MsgBox.alert(null, "Thêm mới thất bại!");
        }
    }

    public static void update(LoaiMon entity) {
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
        List<LoaiMon> list = dao.selectAll();
        model.addElement("Chưa chọn");
        for (LoaiMon entity : list) {
            model.addElement(entity.getTenLoaiMon());
        }
    }
}
