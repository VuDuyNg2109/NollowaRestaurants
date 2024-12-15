
package controllers;

import dao.BanDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import model.Ban;
import utils.MsgBox;

public class QLBan {
    public static BanDAO dao = new BanDAO();

    public static void insert(Ban entity) {
        if (dao.insert(entity) > 0) {
            MsgBox.alert(null, "Đã đặt bàn thành công!");
        } else {
            MsgBox.alert(null, "Đặt bàn thất bại!");
        }
    }

    public static void update(Ban entity) {
        if (dao.update(entity) > 0) {
            MsgBox.alert(null, "Trạng thái bàn đã được cập nhật thành công!");
        } else {
            MsgBox.alert(null, "Trạng thái bàn cập nhật thất bại!");
        }
    }

    public static boolean detele(String...id) {
        if (dao.delete(id)> 0) {
            MsgBox.alert(null, "Bàn đã trống!");
            return true;
        } else {
            MsgBox.alert(null, "Bạn vẫn còn ở trạng thái đặt chỗ!");
        } 
        return false;
    }

}
