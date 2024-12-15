package utils;

import java.awt.BorderLayout;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//import javax.swing.*;
//import java.awt.*;

public class test {

    public static void main(String[] args) {
        String sinhNhat = "01-06-2024";
        Date sinhNhatN = XDate.stringToDate(sinhNhat, "dd-MM-yyyy");
        System.out.println(sinhNhat);
        Date truoc3Ngay = XDate.addDays(sinhNhatN, 5);
        System.out.println(sinhNhatN);
        System.out.println(truoc3Ngay);
        Date sau3Ngay = XDate.minusDays(sinhNhatN, 15);
        System.out.println(sau3Ngay);
        
        
        
//        Date now = XDate.stringToDate(sinhNhat, "dd-MM-yyyy");
//        Date after = XDate.addDays(now, 5);
//        System.out.println(after);
//        after = XDate.minusDays(now, 15);
//        System.out.println(after);

        
    }

//        public static void main(String[] args) {
//            JFrame jFrame = new JFrame("Scroll Pane Example");
//            jFrame.setSize(500, 300);
//            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            jFrame.setLayout(new BorderLayout());
//            JTextArea txtMain = new JTextArea();
//            
//            JScrollPane pane = new JScrollPane();
//            pane.setViewportView(txtMain);
//            jFrame.add(pane, BorderLayout.CENTER);
//
//            JButton btnAddText = new JButton("Add Text");
//            btnAddText
//                    .addActionListener(e -> {
//                        txtMain.setText(txtMain.getText()
//                                + "Example text Example text Example text Example textExample textExample textExample text\n");
//                        String text = txtMain.getText();
//                        txtMain.setCaretPosition(text != null ? text.length() : 0);
//                    });
//            jFrame.add(btnAddText, BorderLayout.SOUTH);
//            jFrame.setLocationRelativeTo(null);
//            jFrame.setVisible(true);
//        }
}
