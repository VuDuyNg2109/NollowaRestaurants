
package utils;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class XInit {
    
    public static void init(JFrame frm) {
        frm.pack(); // Đặt kích thước form vừa đủ với nội dung
//        frm.setResizable(false); // Không cho phép thay đổi kích thước của form.
        frm.setLocationRelativeTo(null); // Đặt vị trí form xuất hiện về giữa màn hình khi sau khi nhấn run 
    }
    
    public static void setCols(JTable tbl, String[] cols, int... widthCols) {
        DefaultTableModel tblModel = (DefaultTableModel) tbl.getModel();
        tblModel.setColumnIdentifiers(cols);

        // Điều chỉnh lại chiều rộng của các cột cho bảng
        if (widthCols.length > 0) {
            for (int i = 0; i < cols.length; i++) {
                tbl.getColumn(cols[i]).setPreferredWidth(widthCols[i]);
            }
        }
    }
}
