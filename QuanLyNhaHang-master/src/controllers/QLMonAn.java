package controllers;

import dao.LoaiMonDAO;
import dao.MonAnDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import model.LoaiMon;
import model.MonAn;
import utils.MsgBox;

public class QLMonAn {

    public static MonAnDAO dao = new MonAnDAO();

    public static void insert(MonAn entity) {
        if (dao.insert(entity) > 0) {
            MsgBox.alert(null, "Thêm mới thành công!");
        } else {
            MsgBox.alert(null, "Thêm mới thất bại!");
        }
    }

    public static void update(MonAn entity) {
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

    public static void fillToCbo(JComboBox cbo) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbo.getModel();
        model.removeAllElements();
        List<MonAn> list = dao.selectAll();
        model.addElement("Chưa chọn");
        for (MonAn entity : list) {
            model.addElement(entity.getTenMon());
        }
    }

    public static void fillToCboTenMonByLoaiMon(JComboBox cbo, String maLoai) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbo.getModel();
        model.removeAllElements();
        List<MonAn> list = dao.selectByMaLoai(maLoai);
        if (list != null) {
            model.addElement("Chưa chọn");
            for (MonAn entity : list) {
                model.addElement(entity.getTenMon());
            }
        }

    }
    
    public static void fillToCboMaMonByLoaiMon(JComboBox cbo, String maLoai) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbo.getModel();
        model.removeAllElements();
        List<MonAn> list = dao.selectByMaLoai(maLoai);
        if (list != null) {
            model.addElement("Chưa chọn");
            for (MonAn entity : list) {
                model.addElement(entity.getMaMon());
            }
        }
    }
}
