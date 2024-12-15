
package controllers;

import dao.CongThucDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import model.CongThuc;
import model.KhuyenMaiCT;
import utils.MsgBox;

public class QLCongThuc{
    
    public static CongThucDAO dao = new CongThucDAO();

    public static void insert(CongThuc entity) {
        if (dao.insert(entity) > 0) {
            MsgBox.alert(null, "Thêm mới thành công!");
        } else {
            MsgBox.alert(null, "Thêm mới thất bại!");
        }
    }

    public static void update(CongThuc entity) {
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
        List<CongThuc> list = dao.selectAll();
        model.addElement("Chưa chọn");
        for (CongThuc entity : list) {
            model.addElement(entity.getMaMon());
        }
    }
    
}
