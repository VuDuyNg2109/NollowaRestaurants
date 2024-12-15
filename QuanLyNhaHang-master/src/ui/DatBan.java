package ui;

import controllers.QLBan;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.SwingConstants.BOTTOM;
import static javax.swing.SwingConstants.CENTER;
import model.Ban;
import utils.Auth;
import utils.MsgBox;
import utils.XInit;

/**
 * @author hanle
 */
public class DatBan extends javax.swing.JFrame {

    public DatBan() {
        initComponents();
        XInit.init(this);

        addButton(pnlDatBan, lblTinhTrang);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnTrong = new javax.swing.JButton();
        btnDatCho = new javax.swing.JButton();
        btnDaDat = new javax.swing.JButton();
        lblTinhTrang = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnDanhMuc = new javax.swing.JButton();
        btnDatMon = new javax.swing.JButton();
        btnHuongDan1 = new javax.swing.JButton();
        btnThemBan = new javax.swing.JButton();
        btnExit1 = new javax.swing.JButton();
        scrDatBan = new javax.swing.JScrollPane();
        pnlDatBan = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("QUẢN LÝ NHÀ HÀNG - ĐẶT BÀN");

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 204, 102)));
        jPanel2.setAlignmentX(0.1F);

        btnTrong.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnTrong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/table-blue-32.png"))); // NOI18N
        btnTrong.setText("Còn Trống");

        btnDatCho.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnDatCho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/table-organce-32.png"))); // NOI18N
        btnDatCho.setText("Đã Đặt Chỗ");

        btnDaDat.setBackground(new java.awt.Color(204, 204, 204));
        btnDaDat.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnDaDat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/table-red-32.png"))); // NOI18N
        btnDaDat.setText("Đã Đặt Món");

        lblTinhTrang.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        lblTinhTrang.setForeground(new java.awt.Color(153, 0, 0));
        lblTinhTrang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTinhTrang.setText("Hiện Tại Nhà Hàng Còn 11 Bàn Trống");

        jToolBar1.setBackground(new java.awt.Color(255, 255, 204));
        jToolBar1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 204, 102)));
        jToolBar1.setFloatable(false);
        jToolBar1.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);
        jToolBar1.setToolTipText("");

        btnDanhMuc.setBackground(new java.awt.Color(255, 255, 255));
        btnDanhMuc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDanhMuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/purchase-order-32.png"))); // NOI18N
        btnDanhMuc.setText("Danh Mục");
        btnDanhMuc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(255, 204, 102)));
        btnDanhMuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDanhMuc.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnDanhMuc.setMaximumSize(new java.awt.Dimension(90, 60));
        btnDanhMuc.setMinimumSize(new java.awt.Dimension(90, 60));
        btnDanhMuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhMucActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDanhMuc);

        btnDatMon.setBackground(new java.awt.Color(255, 255, 255));
        btnDatMon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDatMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/restaurant-3-32.png"))); // NOI18N
        btnDatMon.setText("Đặt Món");
        btnDatMon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(255, 204, 102)));
        btnDatMon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDatMon.setMaximumSize(new java.awt.Dimension(90, 60));
        btnDatMon.setMinimumSize(new java.awt.Dimension(90, 60));
        btnDatMon.setPreferredSize(new java.awt.Dimension(90, 60));
        btnDatMon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDatMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatMonActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDatMon);

        btnHuongDan1.setBackground(new java.awt.Color(255, 255, 255));
        btnHuongDan1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHuongDan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/help-32.png"))); // NOI18N
        btnHuongDan1.setText("Hướng Dẫn");
        btnHuongDan1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(255, 204, 102)));
        btnHuongDan1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongDan1.setMaximumSize(new java.awt.Dimension(90, 60));
        btnHuongDan1.setMinimumSize(new java.awt.Dimension(90, 60));
        btnHuongDan1.setPreferredSize(new java.awt.Dimension(90, 60));
        btnHuongDan1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHuongDan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDan1ActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHuongDan1);

        btnThemBan.setBackground(new java.awt.Color(255, 255, 255));
        btnThemBan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThemBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus-32.png"))); // NOI18N
        btnThemBan.setText("Thêm Bàn");
        btnThemBan.setToolTipText("Thêm bàn mới");
        btnThemBan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(255, 204, 102)));
        btnThemBan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThemBan.setMaximumSize(new java.awt.Dimension(90, 60));
        btnThemBan.setMinimumSize(new java.awt.Dimension(90, 60));
        btnThemBan.setPreferredSize(new java.awt.Dimension(90, 60));
        btnThemBan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThemBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemBanMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnThemBanMouseReleased(evt);
            }
        });
        btnThemBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemBanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnThemBan);

        btnExit1.setBackground(new java.awt.Color(255, 255, 255));
        btnExit1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit1.setForeground(new java.awt.Color(255, 51, 0));
        btnExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close-window-32.png"))); // NOI18N
        btnExit1.setText("THOÁT");
        btnExit1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(255, 204, 102)));
        btnExit1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit1.setMaximumSize(new java.awt.Dimension(90, 60));
        btnExit1.setMinimumSize(new java.awt.Dimension(90, 60));
        btnExit1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExit1);

        pnlDatBan.setBackground(new java.awt.Color(255, 204, 102));
        pnlDatBan.setLayout(new java.awt.GridLayout(5, 5, 2, 2));
        scrDatBan.setViewportView(pnlDatBan);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrDatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(btnTrong)
                .addGap(18, 18, 18)
                .addComponent(btnDatCho, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDaDat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDaDat, btnDatCho, btnTrong});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTrong, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDatCho, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDaDat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTinhTrang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrDatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDaDat, btnDatCho, btnTrong});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhMucActionPerformed
        // TODO add your handling code here:
        new DanhMuc().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDanhMucActionPerformed

    private void btnHuongDan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDan1ActionPerformed
        // TODO add your handling code here:
        new HuongDan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHuongDan1ActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void btnThemBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemBanActionPerformed

    private void btnThemBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemBanMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnThemBanMouseClicked

    private void btnThemBanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemBanMouseReleased
        // TODO add your handling code here:
        JButton button = new JButton();
        listButton.add(button);
        int len = listButton.size();
        System.out.println(len);
        button.setText("Bàn số " + String.valueOf(len));
        addBtn(listButton.get(len - 1), pnlDatBan, lblTinhTrang);
        pnlDatBan.revalidate();
        pnlDatBan.repaint();
    }//GEN-LAST:event_btnThemBanMouseReleased

    private void btnDatMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatMonActionPerformed
        // TODO add your handling code here:

        if (soBan == 0) {
            if (MsgBox.confirm(null, "Bạn muốn mở hóa đơn đã lưu")) {
                new DatMon().setVisible(true);
                this.dispose();
            } else {
                MsgBox.alert(null, "Để tạo hóa đơn mới bạn vui lòng chọn bàn!");
            }
        } else {
            new DatMon().setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_btnDatMonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (!Auth.isLogin()) {
                    new Login().setVisible(true);
                    MsgBox.alert(null, "Vui lòng đăng nhập!");
                } else {
                    new DatBan().setVisible(true);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaDat;
    private javax.swing.JButton btnDanhMuc;
    private javax.swing.JButton btnDatCho;
    private javax.swing.JButton btnDatMon;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnHuongDan1;
    private javax.swing.JButton btnThemBan;
    private javax.swing.JButton btnTrong;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblTinhTrang;
    private javax.swing.JPanel pnlDatBan;
    private javax.swing.JScrollPane scrDatBan;
    // End of variables declaration//GEN-END:variables

    public static List<JButton> listButton = new ArrayList<JButton>();

    void addButton(JPanel pnl, JLabel lbl) {
        pnl.setBackground(new Color(255, 204, 102));
        int h = 0, w = 0;
        for (int i = 0; i < 20; i++) {
            String txt;
            if (i < 9) {
                txt = "Bàn số 0" + (i + 1);
            } else {
                txt = "Bàn số " + (i + 1);
            }
            listButton.add(new JButton(txt));
            addBtn(listButton.get(i), pnl, lbl);
        }
    }
    public static int soBan = 0;

    void addBtn(JButton btn, JPanel pnl, JLabel lbl) {
//        btn.setSize(50,50);
//        btn.setMargin(new Insets(5, 5, 5, 5));
//        btn.setMaximumSize(new Dimension(65, 70));
//        btn.setMinimumSize(new Dimension(65, 70));
        btn.setBackground(new Color(255, 255, 255));
        btn.setFont(new Font("Lucida Grande", 0, 18));
//        btn.setIcon(new ImageIcon(getClass().getResource("/icon/table-blue-32.png")));
//        btn.setToolTipText("table-blue-32.png");
        quanLyBan(btn, lbl);
        btn.setHorizontalTextPosition(CENTER);
        btn.setVerticalTextPosition(BOTTOM);
        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                switch (btn.getToolTipText()) {
                    case "table-blue-32.png":
                        giuCho(btn, lbl);
                        break;
                    case "table-organce-32.png":
                        if (MsgBox.confirm(null, "Khách hàng cần đặt món!")) {
                            btn.setIcon(new ImageIcon(getClass().getResource("/icon/table-red-32.png")));
                            btn.setToolTipText("table-red-32.png");
                            openDatMon(btn);
                        } else {
                            if (MsgBox.confirm(null, "Khách hàng hủy đặt bàn!")) {
                                huyCho(btn, lbl);
                            }
                        }
                        break;
                    case "table-red-32.png":
                        if (quanLyBan(btn, lbl)) {
                            if (MsgBox.confirm(null, "Bạn muốn chỉnh sửa hóa đơn cho " + btn.getText())) {
                                openDatMon(btn);
                            }
                        }

                        break;
//                    default:
//                        btn.setIcon(new ImageIcon(getClass().getResource("/icon/table-blue-32.png")));
//                        btn.setToolTipText("table-blue-32.png");
//                        break;
                }
            }

        });

        pnl.add(btn);
    }

    void openDatMon(JButton btn) {
        String ban = btn.getText();
        soBan = Integer.parseInt(ban.substring(7));
        new DatMon().setVisible(true);
        dispose();
    }

    boolean quanLyBan(JButton btn, JLabel lbl) {
        String tenBan = btn.getText();
        String soBan = tenBan.substring(7);
        Boolean tinhTrang = false;

//        System.out.println(soBan);

        Ban ban = QLBan.dao.selectById(soBan);
        if (ban == null) {
            btn.setIcon(new ImageIcon(getClass().getResource("/icon/table-blue-32.png")));
            btn.setToolTipText("table-blue-32.png");
//            System.out.println(btn.getToolTipText());
        } else {
            tinhTrang = ban.isTinhTrang();
            if (tinhTrang) {
                btn.setIcon(new ImageIcon(getClass().getResource("/icon/table-red-32.png")));
                btn.setToolTipText("table-red-32.png");
//                System.out.println(btn.getToolTipText());

            } else {

                btn.setIcon(new ImageIcon(getClass().getResource("/icon/table-organce-32.png")));
                btn.setToolTipText("table-organce-32.png");
//                System.out.println(btn.getToolTipText());
            }
        }
        setTinhTrang(lbl);
        return tinhTrang;
    } // Neu tinhTrang false 

    void giuCho(JButton btn, JLabel lbl) {
        Ban entity = new Ban();

        String tenBan = btn.getText();
        int soBan = Integer.parseInt(tenBan.substring(7));
        entity.setMaBan(soBan);
        entity.setMaHoaDon(0);
        entity.setTinhTrang(false);

        QLBan.insert(entity);
        btn.setIcon(new ImageIcon(getClass().getResource("/icon/table-organce-32.png")));
        btn.setToolTipText("table-organce-32.png");
        setTinhTrang(lbl);
    }

    void huyCho(JButton btn, JLabel lbl) {
        String tenBan = btn.getText();
        QLBan.detele(tenBan.substring(7));
        btn.setIcon(new ImageIcon(getClass().getResource("/icon/table-blue-32.png")));
        btn.setToolTipText("table-blue-32.png");
        setTinhTrang(lbl);
    }

    void setTinhTrang(JLabel lbl) {

        int dem = 0;
        for (JButton btn : listButton) {
            if (btn.getToolTipText() != null) {
                if (btn.getToolTipText().equals("table-blue-32.png")) {
                    dem = dem + 1;
                }
            } 
        }
        lbl.setText("Hiện Tại Nhà Hàng Còn " + dem + " Bàn Trống");
    }

    void doiBan(){

//        QLBan.detele(String.valueOf(soBan));
        // xoa so ban cu, thay vao so ban moi, lam sao kho mo dat mon, thong tin hoa duoc dua theo bang dat ban show cung
    }
}
