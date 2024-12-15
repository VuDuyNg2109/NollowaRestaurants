
package controllers;

import dao.KhuyenMaiCTDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import model.KhuyenMai;
import model.KhuyenMaiCT;
import utils.MsgBox;

public class QLKhuyenMaiCT {
    public static KhuyenMaiCTDAO dao = new KhuyenMaiCTDAO();
    
    public static void insert(KhuyenMaiCT entity) {
        if (dao.insert(entity) > 0) {
            MsgBox.alert(null, "Thêm mới thành công!");
        } else {
            MsgBox.alert(null, "Thêm mới thất bại!");
        }
    }

    public static void update(KhuyenMaiCT entity) {
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
        List<KhuyenMaiCT> list = dao.selectAll();
        model.addElement("Chưa chọn");
        for (KhuyenMaiCT entity : list) {
            model.addElement(entity.getMaKhuyenMai());
        }
    }
    
    public static void fillToCboByMaKhuyenMai(JComboBox cbo, String maKhuyenMai) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbo.getModel();
        model.removeAllElements();
        List<KhuyenMaiCT> list = dao.selectById1(maKhuyenMai);
        model.addElement("Chưa chọn Mã món");
        for (KhuyenMaiCT entity : list) {
            model.addElement(entity.getMaMon());
        }
    }
    
    
}
