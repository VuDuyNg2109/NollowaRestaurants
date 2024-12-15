
package controllers;

import dao.CaTrucDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import model.CaTruc;
import utils.MsgBox;

public class QLCaTruc {
    
    public static CaTrucDAO dao = new CaTrucDAO();

    public static void insert(CaTruc entity) {
        if (dao.insert(entity) > 0) {
            MsgBox.alert(null, "Thêm mới thành công!");
        } else {
            MsgBox.alert(null, "Thêm mới thất bại!");
        }
    }

    public static void update(CaTruc entity) {
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

    public static void fillAllToCbo(JComboBox cbo) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbo.getModel();
        model.removeAllElements();
        List<CaTruc> list = dao.selectAll();
        model.addElement("Chưa chọn ca trực");
        for (CaTruc ct : list) {
            model.addElement(ct.getMaCaTruc());
        }
    }
    
    public static void fillToCboByNgayTruc(JComboBox cbo) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbo.getModel();
        model.removeAllElements();
        List<CaTruc> list = dao.selectAll();
        
        model.addElement("Chưa chọn ca trực");
        for (CaTruc ct : list) {
            model.addElement(ct.getMaCaTruc());
        }
    }
}
