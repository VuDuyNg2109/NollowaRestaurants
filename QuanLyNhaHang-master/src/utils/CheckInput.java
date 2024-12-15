package utils;

import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CheckInput {

    public static boolean checkTextEmpty(String txt, String hint) {
        // Nếu chuỗi txt rỗng, thông báo "hint" cho người dùng biết và trả về giá trị true
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(null, hint, "Lỗi", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        // Ngược lại trả về giá trị false
        return false;
    }

    public static boolean checkDateEmpty(JDateChooser date, String hint) {
        // Nếu chuỗi date rỗng, thông báo "hint" cho người dùng biết và trả về giá trị true
        if (date.getCalendar() == null) {
            JOptionPane.showMessageDialog(null, hint, "Lỗi", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        // Ngược lại trả về giá trị false
        return false;
    }

    public static boolean checkComboBoxEmpty(JComboBox cbo, String hint) {
            System.out.println(cbo.getSelectedIndex());
        if (cbo.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(null, hint, "Lỗi", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        // Ngược lại trả về giá trị false
        return false;
    }

    public static boolean checkRegex(String txt, String regex, String hint) {
        // Nếu chuỗi txt không so khớp với biểu thức chính quy "regex", thông báo "hint" cho người dùng biết và trả về giá trị true
        if (!txt.matches(regex)) {
            JOptionPane.showMessageDialog(null, hint, "Lỗi", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        // Ngược lại trả về giá trị false
        return false;
    }

    public static int checkInputInteger(String input, String hint) {
        try {
            return Integer.parseInt(input);
        } catch (Exception ex) {
            MsgBox.alert(null, hint);
        }
        return -1;
    }
    
    public static float checkInputFloat(String input, String hint) {
        try {
            return Float.parseFloat(input);
        } catch (Exception ex) {
            MsgBox.alert(null, hint);
        }
        return -1;
    }

}
