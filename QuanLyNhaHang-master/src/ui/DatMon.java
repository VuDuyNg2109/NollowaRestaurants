package ui;

import controllers.QLBan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import utils.Auth;
import utils.MsgBox;
import utils.XDate;
import utils.XInit;
import model.HoaDon;
import model.HoaDonCT;
import model.KhachHang;
import model.LoaiMon;
import model.KhuyenMai;
import model.KhuyenMaiCT;
import controllers.QLDatMon;
import controllers.QLKhachHang;
import controllers.QLHoaDon;
import controllers.QLHoaDonCT;
import controllers.QLKhuyenMai;
import controllers.QLKhuyenMaiCT;
import controllers.QLLoaiMon;
import controllers.QLMonAn;
import controllers.QLNhanVien;
import controllers.QLThongKe;
import java.util.Calendar;
import model.Ban;
import model.MonAn;
import utils.Entity;

public class DatMon extends javax.swing.JFrame {

    HashMap<JButton, String> listButtonName;
    DefaultTableModel tblmodel;

    public DatMon() {
        initComponents();
        XInit.init(this);
        this.init();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btnKhaiVi = new javax.swing.JButton();
        btnMonSup = new javax.swing.JButton();
        btnHaiSan = new javax.swing.JButton();
        btnMonHeo = new javax.swing.JButton();
        btnMonGa = new javax.swing.JButton();
        btnMonBo = new javax.swing.JButton();
        btnMonRau = new javax.swing.JButton();
        btnGoi = new javax.swing.JButton();
        btnMonLau = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnSinhTo = new javax.swing.JButton();
        btnBia = new javax.swing.JButton();
        btnNuocNgot = new javax.swing.JButton();
        btnNuocEp = new javax.swing.JButton();
        pnlHoaDon = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtPhiDichVu = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtThue = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        txtGiamGia = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtKhachHang = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSoDT = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();
        lblNhanVien = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblHoaDon = new javax.swing.JLabel();
        lblSoBan = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtKhachTra = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtTraKhach = new javax.swing.JTextField();
        lblKhuyenMai = new javax.swing.JLabel();
        cboKhuyenMai = new javax.swing.JComboBox<>();
        cboPay = new javax.swing.JComboBox<>();
        btnIn = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        rdoNu = new javax.swing.JRadioButton();
        rdoNam = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        lblNgayKhuyenMai = new javax.swing.JLabel();
        dateNgaySinh = new com.toedter.calendar.JDateChooser();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThucDon = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        btnFindKhachHang = new javax.swing.JButton();
        btnResetKhachHang = new javax.swing.JButton();
        btnAddKhachHang = new javax.swing.JButton();
        btnUpdateKhachHang = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btnAddHoaDon = new javax.swing.JButton();
        btnResetHoaDon = new javax.swing.JButton();
        btnFindHoaDon = new javax.swing.JButton();
        btnUpdateHoaDon = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btnTang = new javax.swing.JButton();
        btnGiam = new javax.swing.JButton();
        btnThemMon = new javax.swing.JButton();
        btnXoaMon = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btnDanhMuc = new javax.swing.JButton();
        btnSoDoBan = new javax.swing.JButton();
        btnHuongDan = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("QUẢN LÝ NHÀ HÀNG - ĐẶT MÓN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnKhaiVi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/Potatos-icon.png"))); // NOI18N
        btnKhaiVi.setText("Khai Vị");
        btnKhaiVi.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Vui Lòng Nhấp Chọn Món Ăn</div>\n</body>\n\n</html>");
        btnKhaiVi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhaiVi.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnKhaiVi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhaiVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhaiViActionPerformed(evt);
            }
        });

        btnMonSup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/Soup-icon.png"))); // NOI18N
        btnMonSup.setText("Món Súp");
        btnMonSup.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Vui Lòng Nhấp Chọn Món Ăn</div>\n</body>\n\n</html>");
        btnMonSup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMonSup.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMonSup.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMonSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonSupActionPerformed(evt);
            }
        });

        btnHaiSan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/Crab-icon.png"))); // NOI18N
        btnHaiSan.setText("Hải Sản");
        btnHaiSan.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Vui Lòng Nhấp Chọn Món Ăn</div>\n</body>\n\n</html>");
        btnHaiSan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHaiSan.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnHaiSan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHaiSan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHaiSanActionPerformed(evt);
            }
        });

        btnMonHeo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/Pork-icon.png"))); // NOI18N
        btnMonHeo.setText("Món Heo");
        btnMonHeo.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Vui Lòng Nhấp Chọn Món Ăn</div>\n</body>\n\n</html>");
        btnMonHeo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMonHeo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMonHeo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMonHeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonHeoActionPerformed(evt);
            }
        });

        btnMonGa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/Chicken-icon.png"))); // NOI18N
        btnMonGa.setText("Món Gà");
        btnMonGa.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Vui Lòng Nhấp Chọn Món Ăn</div>\n</body>\n\n</html>");
        btnMonGa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMonGa.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMonGa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMonGa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonGaActionPerformed(evt);
            }
        });

        btnMonBo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/Steak-icon.png"))); // NOI18N
        btnMonBo.setText("Món Bò");
        btnMonBo.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Vui Lòng Nhấp Chọn Món Ăn</div>\n</body>\n\n</html>");
        btnMonBo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMonBo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMonBo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMonBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonBoActionPerformed(evt);
            }
        });

        btnMonRau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/Fruits-Vegetables-icon.png"))); // NOI18N
        btnMonRau.setText("Món Rau");
        btnMonRau.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Vui Lòng Nhấp Chọn Món Ăn</div>\n</body>\n\n</html>");
        btnMonRau.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMonRau.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMonRau.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMonRau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonRauActionPerformed(evt);
            }
        });

        btnGoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/Salad-icon.png"))); // NOI18N
        btnGoi.setText("Gỏi-Salad");
        btnGoi.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Vui Lòng Nhấp Chọn Món Ăn</div>\n</body>\n\n</html>");
        btnGoi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGoi.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGoi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoiActionPerformed(evt);
            }
        });

        btnMonLau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/hot-pot.png"))); // NOI18N
        btnMonLau.setText("Món Lẫu");
        btnMonLau.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Vui Lòng Nhấp Chọn Món Ăn</div>\n</body>\n\n</html>");
        btnMonLau.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMonLau.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMonLau.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMonLau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonLauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMonRau, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnMonBo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addComponent(btnKhaiVi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnGoi, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addComponent(btnMonGa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMonSup, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMonHeo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(btnMonLau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(btnHaiSan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnGoi, btnHaiSan, btnKhaiVi, btnMonBo, btnMonGa, btnMonHeo, btnMonLau, btnMonRau, btnMonSup});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMonSup)
                    .addComponent(btnKhaiVi)
                    .addComponent(btnHaiSan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMonGa)
                    .addComponent(btnMonHeo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMonBo))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMonLau)
                    .addComponent(btnMonRau)
                    .addComponent(btnGoi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnGoi, btnHaiSan, btnKhaiVi, btnMonBo, btnMonGa, btnMonHeo, btnMonLau, btnMonRau, btnMonSup});

        jTabbedPane1.addTab("Món Ăn", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 204, 102));

        btnSinhTo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/SinhTo-icon.png"))); // NOI18N
        btnSinhTo.setText("Sinh Tố");
        btnSinhTo.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Vui Lòng Nhấp Chọn Thức Uống</div>\n</body>\n\n</html>");
        btnSinhTo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSinhTo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSinhTo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSinhTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinhToActionPerformed(evt);
            }
        });

        btnBia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/Beer-icon.png"))); // NOI18N
        btnBia.setText("Các Loại Bia");
        btnBia.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Vui Lòng Nhấp Chọn Thức Uống</div>\n</body>\n\n</html>");
        btnBia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBia.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiaActionPerformed(evt);
            }
        });

        btnNuocNgot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/7up-icon.png"))); // NOI18N
        btnNuocNgot.setText("Nước Ngọt");
        btnNuocNgot.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Vui Lòng Nhấp Chọn Thức Uống</div>\n</body>\n\n</html>");
        btnNuocNgot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuocNgot.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnNuocNgot.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuocNgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuocNgotActionPerformed(evt);
            }
        });

        btnNuocEp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/Juice-icon.png"))); // NOI18N
        btnNuocEp.setText("Nước Ép");
        btnNuocEp.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Vui Lòng Nhấp Chọn Thức Uống</div>\n</body>\n\n</html>");
        btnNuocEp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuocEp.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnNuocEp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuocEp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuocEpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuocEp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSinhTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuocNgot, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 28, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBia, btnNuocEp, btnNuocNgot, btnSinhTo});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBia)
                    .addComponent(btnNuocNgot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuocEp)
                    .addComponent(btnSinhTo))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBia, btnNuocEp, btnNuocNgot, btnSinhTo});

        jTabbedPane1.addTab("Thức Uống", jPanel5);

        pnlHoaDon.setBackground(new java.awt.Color(255, 204, 102));
        pnlHoaDon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Phí DV (5%):");

        txtPhiDichVu.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPhiDichVu.setText("0.0");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Thuế VAT (10%):");

        txtThue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtThue.setText("0.0");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Tổng Tiền:");

        txtTongTien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTongTien.setText("0.0");

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblHoaDon);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Giảm giá:");

        txtGiamGia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGiamGia.setText("0.0");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Ngày Sinh:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Khách Hàng:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Email:");

        txtSoDT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSoDTFocusLost(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Điện Thoại:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Giờ:");

        lblClock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblClock.setText("12/01/2022 00:00:00 AM");

        lblNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNhanVien.setText("Lê Nguyễn Ngọc Hân");

        jLabel31.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel31.setText("Nhân Viên:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Số Hóa Đơn: ");

        lblHoaDon.setText("HD006");
        lblHoaDon.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblHoaDonPropertyChange(evt);
            }
        });

        lblSoBan.setText("20");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Số Bàn:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Tiền Khách Trả:");

        txtKhachTra.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtKhachTra.setText("0.0");
        txtKhachTra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKhachTraKeyReleased(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Tiền Trả Lại Khách:");

        txtTraKhach.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTraKhach.setText("0.0");

        lblKhuyenMai.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblKhuyenMai.setForeground(new java.awt.Color(255, 51, 0));
        lblKhuyenMai.setText("Khuyến Mãi 30/4 - 1/5");

        cboKhuyenMai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Khuyến Mãi" }));
        cboKhuyenMai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboKhuyenMaiItemStateChanged(evt);
            }
        });

        cboPay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cboPay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền Mặt", "Chuyển Khoản", "Cà Thẻ" }));

        btnIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/printer-32.png"))); // NOI18N
        btnIn.setText("IN HÓA ĐƠN");
        btnIn.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>In Hóa Đơn</div>\n</body>\n\n</html>");
        btnIn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInActionPerformed(evt);
            }
        });

        btnThanhToan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/card-in-use-32.png"))); // NOI18N
        btnThanhToan.setText("THANH TOÁN");
        btnThanhToan.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Thanh Toán Hóa Đơn</div>\n</body>\n\n</html>");
        btnThanhToan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Giới Tính:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Địa Chỉ:");

        lblNgayKhuyenMai.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblNgayKhuyenMai.setForeground(new java.awt.Color(255, 51, 0));
        lblNgayKhuyenMai.setText("Từ ngày 30/4/2022 đến ngày 1/5/2022");

        dateNgaySinh.setDateFormatString("dd-MM-yyyy");
        dateNgaySinh.setPreferredSize(new java.awt.Dimension(120, 25));

        javax.swing.GroupLayout pnlHoaDonLayout = new javax.swing.GroupLayout(pnlHoaDon);
        pnlHoaDon.setLayout(pnlHoaDonLayout);
        pnlHoaDonLayout.setHorizontalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonLayout.createSequentialGroup()
                        .addComponent(cboKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNgayKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(313, 313, 313))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonLayout.createSequentialGroup()
                        .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonLayout.createSequentialGroup()
                                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel31))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(txtKhachHang)
                                    .addComponent(txtSoDT)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(165, 165, 165)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                        .addComponent(lblSoBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(99, 99, 99))
                                    .addComponent(lblHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(337, 337, 337))
                            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlHoaDonLayout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(18, 18, 18)
                                        .addComponent(dateNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addGap(18, 18, 18)
                                            .addComponent(rdoNam)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rdoNu))
                                        .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                            .addComponent(jLabel25)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pnlHoaDonLayout.createSequentialGroup()
                        .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlHoaDonLayout.createSequentialGroup()
                                .addComponent(btnIn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnThanhToan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlHoaDonLayout.createSequentialGroup()
                                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPhiDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                        .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel26))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtKhachTra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTraKhach))
                                    .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                        .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel22))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtThue)
                                            .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlHoaDonLayout.setVerticalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlHoaDonLayout.createSequentialGroup()
                        .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(lblClock))
                        .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtKhachHang)
                                    .addComponent(jLabel13)))
                            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31)
                                    .addComponent(lblNhanVien))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoDT)
                            .addComponent(jLabel14)
                            .addComponent(jLabel18)))
                    .addGroup(pnlHoaDonLayout.createSequentialGroup()
                        .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lblHoaDon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(lblSoBan))
                        .addGap(12, 12, 12)
                        .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu))
                        .addGap(7, 7, 7)
                        .addComponent(dateNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNgayKhuyenMai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtPhiDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(txtGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtKhachTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(txtTraKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIn)
                    .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThanhToan)
                        .addComponent(cboPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pnlHoaDonLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnIn, btnThanhToan});

        pnlHoaDonLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblClock, txtKhachHang, txtSoDT});

        jPanel7.setBackground(new java.awt.Color(255, 204, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thực Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblThucDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ));
        jScrollPane1.setViewportView(tblThucDon);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 204, 102));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Khách hàng"));

        btnFindKhachHang.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFindKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search-9-24.png"))); // NOI18N
        btnFindKhachHang.setText("Tìm kiếm");
        btnFindKhachHang.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Tìm Kiếm Thông Tin Khách Hàng</div>\n</body>\n\n</html>");
        btnFindKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFindKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindKhachHangActionPerformed(evt);
            }
        });

        btnResetKhachHang.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnResetKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-24.png"))); // NOI18N
        btnResetKhachHang.setText("Làm mới");
        btnResetKhachHang.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Cập Nhật Thông Tin Khách Hàng</div>\n</body>\n\n</html>");
        btnResetKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnResetKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetKhachHangActionPerformed(evt);
            }
        });

        btnAddKhachHang.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-user-3-24.png"))); // NOI18N
        btnAddKhachHang.setText("Lưu KH");
        btnAddKhachHang.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>LưuThông Tin Khách Hàng</div>\n</body>\n\n</html>");
        btnAddKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAddKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddKhachHangActionPerformed(evt);
            }
        });

        btnUpdateKhachHang.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdateKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-24.png"))); // NOI18N
        btnUpdateKhachHang.setText("Cập nhật");
        btnUpdateKhachHang.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Cập Nhật Thông Tin Khách Hàng</div>\n</body>\n\n</html>");
        btnUpdateKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUpdateKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateKhachHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFindKhachHang)
                    .addComponent(btnUpdateKhachHang)
                    .addComponent(btnAddKhachHang)
                    .addComponent(btnResetKhachHang))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddKhachHang, btnFindKhachHang, btnResetKhachHang, btnUpdateKhachHang});

        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(btnFindKhachHang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateKhachHang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddKhachHang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnResetKhachHang)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddKhachHang, btnFindKhachHang, btnResetKhachHang, btnUpdateKhachHang});

        jPanel9.setBackground(new java.awt.Color(255, 204, 102));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Hóa đơn"));

        btnAddHoaDon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-list-24.png"))); // NOI18N
        btnAddHoaDon.setText("Lưu HĐ");
        btnAddHoaDon.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Lưu Thông Tin Hóa Đơn</div>\n</body>\n\n</html>");
        btnAddHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAddHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHoaDonActionPerformed(evt);
            }
        });

        btnResetHoaDon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnResetHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-24.png"))); // NOI18N
        btnResetHoaDon.setText("Làm mới");
        btnResetHoaDon.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Làm Mới Hóa Đơn</div>\n</body>\n\n</html>");
        btnResetHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnResetHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetHoaDonActionPerformed(evt);
            }
        });

        btnFindHoaDon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFindHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search-9-24.png"))); // NOI18N
        btnFindHoaDon.setText("Tìm kiếm");
        btnFindHoaDon.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n\n<body>\n    <div>Tìm Kiếm Thông Tin Hóa Đơn</div>\n</body>\n\n</html>");
        btnFindHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFindHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindHoaDonActionPerformed(evt);
            }
        });

        btnUpdateHoaDon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdateHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-24.png"))); // NOI18N
        btnUpdateHoaDon.setText("Cập nhật");
        btnUpdateHoaDon.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n\n<body>\n    <div>Cập Nhật Thông Tin Hóa Đơn</div>\n</body>\n\n</html>");
        btnUpdateHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUpdateHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFindHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddHoaDon)
                    .addComponent(btnResetHoaDon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddHoaDon, btnFindHoaDon, btnResetHoaDon, btnUpdateHoaDon});

        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(btnFindHoaDon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateHoaDon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddHoaDon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnResetHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddHoaDon, btnFindHoaDon, btnResetHoaDon, btnUpdateHoaDon});

        jPanel10.setBackground(new java.awt.Color(255, 204, 102));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Thêm món"));

        btnTang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus-24.png"))); // NOI18N
        btnTang.setText("TĂNG");
        btnTang.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Tăng Số Lượng Món Hóa Đơn</div>\n</body>\n\n</html>");
        btnTang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTangActionPerformed(evt);
            }
        });

        btnGiam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGiam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/minus-24.png"))); // NOI18N
        btnGiam.setText("GIẢM");
        btnGiam.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Giảm Số Lượng Món Hóa Đơn</div>\n</body>\n\n</html>");
        btnGiam.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGiam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiamActionPerformed(evt);
            }
        });

        btnThemMon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThemMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-list-24.png"))); // NOI18N
        btnThemMon.setText("THÊM");
        btnThemMon.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Thêm Món Vào Hóa Đơn</div>\n</body>\n\n</html>");
        btnThemMon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThemMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMonActionPerformed(evt);
            }
        });

        btnXoaMon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoaMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-24.png"))); // NOI18N
        btnXoaMon.setText(" XÓA");
        btnXoaMon.setToolTipText("<html>\n<style>\n    div {\n        color: \"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 8px;\n    }\n</style>\n\n<body>\n    <div>Xóa Món Trong Hóa Đơn</div>\n</body>\n\n</html>");
        btnXoaMon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnXoaMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaMonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThemMon, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTang, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel10Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnGiam, btnTang, btnThemMon, btnXoaMon});

        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(btnThemMon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoaMon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGiam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnGiam, btnTang, btnThemMon, btnXoaMon});

        jToolBar1.setBackground(new java.awt.Color(255, 255, 204));
        jToolBar1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 204)));
        jToolBar1.setFloatable(false);
        jToolBar1.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);
        jToolBar1.setToolTipText("");
        jToolBar1.setBorderPainted(false);

        btnDanhMuc.setBackground(new java.awt.Color(255, 255, 255));
        btnDanhMuc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDanhMuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/purchase-order-32.png"))); // NOI18N
        btnDanhMuc.setText("Danh Mục");
        btnDanhMuc.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 204, 102)));
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

        btnSoDoBan.setBackground(new java.awt.Color(255, 255, 255));
        btnSoDoBan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSoDoBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/table-32.png"))); // NOI18N
        btnSoDoBan.setText("Đặt Bàn");
        btnSoDoBan.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(255, 204, 102)));
        btnSoDoBan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSoDoBan.setMaximumSize(new java.awt.Dimension(90, 60));
        btnSoDoBan.setMinimumSize(new java.awt.Dimension(90, 60));
        btnSoDoBan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSoDoBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoDoBanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSoDoBan);

        btnHuongDan.setBackground(new java.awt.Color(255, 255, 255));
        btnHuongDan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/help-32.png"))); // NOI18N
        btnHuongDan.setText("Hướng Dẫn");
        btnHuongDan.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(255, 204, 102)));
        btnHuongDan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongDan.setMaximumSize(new java.awt.Dimension(90, 60));
        btnHuongDan.setMinimumSize(new java.awt.Dimension(90, 60));
        btnHuongDan.setPreferredSize(new java.awt.Dimension(90, 60));
        btnHuongDan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHuongDan);

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 51, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close-window-32.png"))); // NOI18N
        btnExit.setText("THOÁT");
        btnExit.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(255, 204, 102)));
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setMaximumSize(new java.awt.Dimension(90, 60));
        btnExit.setMinimumSize(new java.awt.Dimension(90, 60));
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExit);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTabbedPane1)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(354, 354, 354))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pnlHoaDon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuocEpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuocEpActionPerformed
        fillToThucDonTable(btnNuocEp);
    }//GEN-LAST:event_btnNuocEpActionPerformed

    private void btnNuocNgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuocNgotActionPerformed
        fillToThucDonTable(btnNuocNgot);
    }//GEN-LAST:event_btnNuocNgotActionPerformed

    private void btnBiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiaActionPerformed
        fillToThucDonTable(btnBia);
    }//GEN-LAST:event_btnBiaActionPerformed

    private void btnSinhToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinhToActionPerformed
        fillToThucDonTable(btnSinhTo);
    }//GEN-LAST:event_btnSinhToActionPerformed

    private void btnMonLauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonLauActionPerformed
        fillToThucDonTable(btnMonLau);
    }//GEN-LAST:event_btnMonLauActionPerformed

    private void btnGoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoiActionPerformed
        fillToThucDonTable(btnGoi);
    }//GEN-LAST:event_btnGoiActionPerformed

    private void btnMonRauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonRauActionPerformed
        fillToThucDonTable(btnMonRau);
    }//GEN-LAST:event_btnMonRauActionPerformed

    private void btnMonBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonBoActionPerformed
        fillToThucDonTable(btnMonBo);
    }//GEN-LAST:event_btnMonBoActionPerformed

    private void btnMonGaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonGaActionPerformed
        fillToThucDonTable(btnMonGa);
    }//GEN-LAST:event_btnMonGaActionPerformed

    private void btnMonHeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonHeoActionPerformed
        fillToThucDonTable(btnMonHeo);
    }//GEN-LAST:event_btnMonHeoActionPerformed

    private void btnHaiSanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHaiSanActionPerformed
        fillToThucDonTable(btnHaiSan);
    }//GEN-LAST:event_btnHaiSanActionPerformed

    private void btnMonSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonSupActionPerformed
        fillToThucDonTable(btnMonSup);
    }//GEN-LAST:event_btnMonSupActionPerformed

    private void btnKhaiViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhaiViActionPerformed
        fillToThucDonTable(btnKhaiVi);
    }//GEN-LAST:event_btnKhaiViActionPerformed

    private void btnFindKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindKhachHangActionPerformed
        // TODO add your handling code here:
        String soDT = (String) MsgBox.prompt(btnFindKhachHang, "Nhập số điện thoại khách hàng cần tìm: ");
        if (soDT != null) {
            KhachHang kh = QLKhachHang.dao.selectById(soDT.trim());
            this.setFormKhachHang(kh);
        }
        updateStatusKhachHang();
    }//GEN-LAST:event_btnFindKhachHangActionPerformed


    private void btnFindHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindHoaDonActionPerformed
        // TODO add your handling code here:
        findHoaDon();
    }//GEN-LAST:event_btnFindHoaDonActionPerformed

    private void btnUpdateKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateKhachHangActionPerformed
        // TODO add your handling code here:
        QLKhachHang.update(this.getFormKhachHang());
    }//GEN-LAST:event_btnUpdateKhachHangActionPerformed

    private void btnUpdateHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHoaDonActionPerformed
        // TODO add your handling code here:
        btnUpdateKhachHangActionPerformed(evt);
        QLHoaDon.update(this.getFormHoaDon());
        String maHD = lblHoaDon.getText();
        List<HoaDonCT> list = QLHoaDonCT.dao.selectAllById(maHD.substring(4));
        for (HoaDonCT hdct : list) {
            QLHoaDonCT.detele(String.valueOf(hdct.getMaHoaDonCT()));
        }
        for (int i = 0; i < tblHoaDon.getRowCount(); i++) {
            QLHoaDonCT.insert(this.getFormHoaDonCT(i));
        }
//        for (int i = 0; i < tblHoaDon.getRowCount(); i++) {
//            List<HoaDonCT> list = QLHoaDonCT.dao.selectAllById(maHD.substring(4));
//            if (list != null) {
//                int j=0;
//                for (; j<list.size()-1; j++) {
//                    String tenMon = QLMonAn.dao.selectById(list.get(j).getMaMon()).getTenMon();
//                    System.out.println(tenMon);
//                    if (tblHoaDon.getValueAt(i, 0).equals(tenMon)) {
//                        QLHoaDonCT.update(this.getFormHoaDonCT(i));
//                        break;
//                    }
//                }
//                if(i == list.size()){
//                    QLHoaDonCT.insert(this.getFormHoaDonCT(i));
//                }
//            } else {
//                    QLHoaDonCT.insert(this.getFormHoaDonCT(i));
//            }
//        }
    }//GEN-LAST:event_btnUpdateHoaDonActionPerformed

    private void btnAddKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddKhachHangActionPerformed
        // TODO add your handling code here:
        QLKhachHang.insert(this.getFormKhachHang());
    }//GEN-LAST:event_btnAddKhachHangActionPerformed

    private void btnAddHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHoaDonActionPerformed
        // TODO add your handling code here:
        btnAddKhachHangActionPerformed(evt);
        QLHoaDon.insert(this.getFormHoaDon());
        for (int i = 0; i < tblHoaDon.getRowCount(); i++) {
            QLHoaDonCT.insert(this.getFormHoaDonCT(i));
        }

        Ban ban = QLBan.dao.selectById(lblSoBan.getText());
        if (ban == null) {
            QLBan.insert(this.getFormDatBan());
        } else {
            QLBan.update(this.getFormDatBan());
        }

    }//GEN-LAST:event_btnAddHoaDonActionPerformed


    private void btnResetKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetKhachHangActionPerformed
        // TODO add your handling code here:
        this.resetFormKhachHang();
    }//GEN-LAST:event_btnResetKhachHangActionPerformed

    private void btnResetHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetHoaDonActionPerformed
        // TODO add your handling code here:
        if (lblSoBan.getText().equals("Đã thanh toán")) {

            new DatBan().setVisible(true);
            this.dispose();
        } else {
            this.resetFormHoaDon();
        }

    }//GEN-LAST:event_btnResetHoaDonActionPerformed

//    List<Object[]> listHoaDon = 
    private void btnThemMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMonActionPerformed
        // TODO add your handling code here:

        Object[] row = QLDatMon.getFood(tblThucDon);
        if (row != null) {
            QLDatMon.themMon(tblHoaDon, row);
        }

//        this.tongHoaDon();
        this.capNhatKhuyenMai();
        this.updateStatus();
    }//GEN-LAST:event_btnThemMonActionPerformed


    private void btnXoaMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaMonActionPerformed
        // TODO add your handling code here:
        QLDatMon.xoaMon(tblHoaDon);
        this.tongHoaDonTruGiamGia();
        this.updateStatus();
    }//GEN-LAST:event_btnXoaMonActionPerformed

    private void btnGiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiamActionPerformed
        // TODO add your handling code here:
        QLDatMon.giamSoLuong(tblHoaDon);
        this.capNhatKhuyenMai();
//        this.tongHoaDonTruGiamGia();
        this.updateStatus();
    }//GEN-LAST:event_btnGiamActionPerformed

    private void btnTangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTangActionPerformed
        // TODO add your handling code here:
        int row = tblHoaDon.getSelectedRow();
        QLDatMon.tangSoLuong(tblHoaDon, row);
        this.capNhatKhuyenMai();
    }//GEN-LAST:event_btnTangActionPerformed

    private void btnDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhMucActionPerformed
        // TODO add your handling code here:
        new DanhMuc().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDanhMucActionPerformed

    private void btnSoDoBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoDoBanActionPerformed
        // TODO add your handling code here:
        new DatBan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSoDoBanActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
        // TODO add your handling code here:
        new HuongDan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHuongDanActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInActionPerformed
        

    }//GEN-LAST:event_btnInActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:
        HoaDon hd = QLHoaDon.dao.selectById(lblHoaDon.getText());
        if (hd != null) {
            btnUpdateHoaDonActionPerformed(evt);

        } else {
            QLHoaDon.insert(this.getFormHoaDon());
            for (int i = 0; i < tblHoaDon.getRowCount(); i++) {
                QLHoaDonCT.insert(this.getFormHoaDonCT(i));
            }
        }
        QLBan.detele(lblSoBan.getText());
        btnInActionPerformed(evt);
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void txtKhachTraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKhachTraKeyReleased
        // TODO add your handling code here:
        float money = Float.parseFloat(txtKhachTra.getText()) - Float.parseFloat(txtTongTien.getText());
        txtTraKhach.setText(String.valueOf(money));
    }//GEN-LAST:event_txtKhachTraKeyReleased

    private void txtSoDTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSoDTFocusLost
        // TODO add your handling code here:
        KhachHang kh = QLKhachHang.dao.selectById(txtSoDT.getText());
        if (kh != null) {
            if (MsgBox.confirm(this, "Mã khách hàng này đã tồn tại! Bạn có muốn nhập mới không?")) {
                txtSoDT.requestFocus();
                btnAddKhachHang.setEnabled(true);
                btnUpdateKhachHang.setEnabled(false);
                btnResetKhachHang.setEnabled(true);
            } else {
//                KhachHang khachHang = QLKhachHang.dao.selectById(kh.getSoDT());
                this.setFormKhachHang(kh);
                btnAddKhachHang.setEnabled(false);
                btnUpdateKhachHang.setEnabled(true);
                btnResetKhachHang.setEnabled(true);
            }
        }
    }//GEN-LAST:event_txtSoDTFocusLost

    private void cboKhuyenMaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboKhuyenMaiItemStateChanged
        // TODO add your handling code here:
        if (cboKhuyenMai.getSelectedIndex() > 0) {
            if (String.valueOf(cboKhuyenMai.getSelectedItem()).equals("SINHNHAT"))
            {
                Date now = new Date();
                int[] nowArr = XDate.getNgayThangNam(now);
            }                   
            this.capNhatKhuyenMai();
        }
    }//GEN-LAST:event_cboKhuyenMaiItemStateChanged

    private void lblHoaDonPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblHoaDonPropertyChange
        // TODO add your handling code here:
        updateStatus();
    }//GEN-LAST:event_lblHoaDonPropertyChange

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        // TODO add your handling code here:
        updateStatus();
    }//GEN-LAST:event_tblHoaDonMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (!Auth.isLogin()) {
                    new Login().setVisible(true);
                    MsgBox.alert(null, "Vui lòng đăng nhập!");
                } else {
                    new DatMon().setVisible(true);

                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddHoaDon;
    private javax.swing.JButton btnAddKhachHang;
    private javax.swing.JButton btnBia;
    private javax.swing.JButton btnDanhMuc;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFindHoaDon;
    private javax.swing.JButton btnFindKhachHang;
    private javax.swing.JButton btnGiam;
    private javax.swing.JButton btnGoi;
    private javax.swing.JButton btnHaiSan;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnIn;
    private javax.swing.JButton btnKhaiVi;
    private javax.swing.JButton btnMonBo;
    private javax.swing.JButton btnMonGa;
    private javax.swing.JButton btnMonHeo;
    private javax.swing.JButton btnMonLau;
    private javax.swing.JButton btnMonRau;
    private javax.swing.JButton btnMonSup;
    private javax.swing.JButton btnNuocEp;
    private javax.swing.JButton btnNuocNgot;
    private javax.swing.JButton btnResetHoaDon;
    private javax.swing.JButton btnResetKhachHang;
    private javax.swing.JButton btnSinhTo;
    private javax.swing.JButton btnSoDoBan;
    private javax.swing.JButton btnTang;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThemMon;
    private javax.swing.JButton btnUpdateHoaDon;
    private javax.swing.JButton btnUpdateKhachHang;
    private javax.swing.JButton btnXoaMon;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboKhuyenMai;
    private javax.swing.JComboBox<String> cboPay;
    private com.toedter.calendar.JDateChooser dateNgaySinh;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblKhuyenMai;
    private javax.swing.JLabel lblNgayKhuyenMai;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblSoBan;
    private javax.swing.JPanel pnlHoaDon;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTable tblThucDon;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGiamGia;
    private javax.swing.JTextField txtKhachHang;
    private javax.swing.JTextField txtKhachTra;
    private javax.swing.JTextField txtPhiDichVu;
    private javax.swing.JTextField txtSoDT;
    private javax.swing.JTextField txtThue;
    private javax.swing.JTextField txtTongTien;
    private javax.swing.JTextField txtTraKhach;
    // End of variables declaration//GEN-END:variables

    void init() {

        lblNhanVien.setText(Auth.user.getHoTenNV());
        QLDatMon.setColsForMenuTable(tblThucDon);
        QLDatMon.setColsForBillTable(tblHoaDon);
        fillToThucDonTable(btnKhaiVi);
        this.resetFormHoaDon();
        updateStatus();
        if (Entity.hoaDon != null) {
            String maHD = String.valueOf(Entity.hoaDon.getMaHoaDon());
            this.setFormHoaDon(maHD);
        } else {
            if (Entity.khachHang != null) {
                List<Ban> listBan = QLBan.dao.selectAll();
                for (int i = 0; i <= listBan.size(); i++) {
                    Ban b = QLBan.dao.selectById(String.valueOf(i + 1));

                    if (b == null) {
                        DatBan.soBan = i + 1;
                    }
                }
                this.setFormKhachHang(Entity.khachHang);
            }
            this.setBan();
        }

    }

    void findHoaDon() {
        this.resetFormHoaDon();
        String maHD = (String) MsgBox.prompt(btnFindKhachHang, "Nhập số hóa đơn cần tìm: ");
        if (maHD != null) {
            this.setFormHoaDon(maHD.substring(4));
        }
        updateStatusKhachHang();
        updateStatusHoaDon();
    }

    void setBan() {
        if (DatBan.soBan == 0) {
            findHoaDon();
        } else {
            lblSoBan.setText(String.valueOf(DatBan.soBan));
        }

//        soBan => maHoaDon => setFormHoaDon
        Ban ban = QLBan.dao.selectById(lblSoBan.getText());
        if (ban != null) {
            int maHoaDon = ban.getMaHoaDon();
            if (maHoaDon != 0) {
                this.setFormHoaDon(String.valueOf(maHoaDon));
            }
        }
    }

    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Date now = new Date();
            lblClock.setText(XDate.dateParseString(now, "dd/MM/yyyy HH:mm:ss aa"));
        }
    });

    private void createListBtn() {
        listButtonName = new HashMap<>();
        JButton[] btn
                = {
                    btnKhaiVi, btnMonSup, btnMonRau, btnGoi,
                    btnMonBo, btnMonGa, btnMonHeo, btnHaiSan, btnMonLau,
                    btnBia, btnNuocNgot, btnSinhTo, btnNuocEp
                };
        List<LoaiMon> loaiMon = QLLoaiMon.dao.selectAll();
        if (btn.length == loaiMon.size()) {
            for (int i = 0; i < btn.length; i++) {
                listButtonName.put(btn[i], loaiMon.get(i).getMaLoaiMon());
            }
        } else {
            MsgBox.alert(this, "Số lượng loại món và nút nhấn khác nhau! Vui lòng kiểm tra lại!");
        }
    }

    void fillToThucDonTable(JButton btn) {
        createListBtn();
        String maLoaiMon = listButtonName.get(btn);
        QLDatMon.fillToMenuTblById(maLoaiMon, tblThucDon);
    }

    void resetFormKhachHang() {
        txtKhachHang.setText("");
        txtSoDT.setText("");
        txtEmail.setText("");
        dateNgaySinh.setCalendar(null);
        txtDiaChi.setText("");
        if (rdoNam.isSelected()) {
            rdoNam.setSelected(false);
        } else {
            rdoNu.setSelected(false);
        }
        this.updateStatusKhachHang();
    }

    void setFormKhachHang(KhachHang kh) {
//        KhachHang kh = QLKhachHang.dao.selectById(soDT);
        if (kh != null) {
            resetFormKhachHang();
            txtKhachHang.setText(kh.getHoTenKH());
            txtSoDT.setText(kh.getSoDT());
            txtEmail.setText(kh.getEmail());
            if (kh.getNgaySinh() == null) {
                dateNgaySinh.setCalendar(null);
            } else {
                dateNgaySinh.setDate(kh.getNgaySinh());
//                this.sinhNhat();
            }
            txtDiaChi.setText(kh.getDiaChi());
            if (kh.getGioiTinh() != null) {
                if (kh.getGioiTinh().equals("Nam")) {
                    rdoNam.setSelected(true);
                } else {
                    rdoNu.setSelected(true);
                }
            }
        } else {
            MsgBox.alert(this, "Không tìm thấy thông tin khách hàng!");
        }
    }

    void sinhNhat() {
        Date now = new Date();
        int[] nowArr = XDate.getNgayThangNam(now);
        if (kiemTraSinhNhat(nowArr[2])) {
            if (dateNgaySinh.getCalendar() != null) {
                int[] ngaySinh = XDate.getNgayThangNam(dateNgaySinh.getDate());
                String sinhNhat = ngaySinh[0] + "-" + ngaySinh[1] + "-" + nowArr[2];
                Date sinhNhatN = XDate.stringToDate(sinhNhat, "dd-MM-yyyy");
                Date sau3Ngay = XDate.addDays(sinhNhatN, 3);
                Date truoc3Ngay = XDate.minusDays(sinhNhatN, 3);

                if ((now.after(truoc3Ngay) || now.equals(truoc3Ngay)) && (now.before(sau3Ngay) || now.equals(sau3Ngay))) {
                    cboKhuyenMai.setSelectedItem("SINHNHAT");
                }
            }
        }
    }

    boolean kiemTraSinhNhat(int year) {
        List<HoaDon> listHoaDonByKhachHang = QLHoaDon.dao.selectByKhachHang(txtSoDT.getText());
        for (HoaDon hd : listHoaDonByKhachHang) {
            if (hd.getMaKhuyenMai() != null) {
                int[] ngaylapHD = XDate.getNgayThangNam(hd.getNgayLapHD());
                if (ngaylapHD[2] == year && hd.getMaKhuyenMai().equals("SINHNHAT")) {
                    MsgBox.alert(this, "Mã SINHNHAT của quý khách đã được áp dụng rồi, không áp dụng được nữa");
                    return false;
                }
            }
        }
        return true;
    }

    void resetFormHoaDon() {

        timer.start();
        int soHD = (int) QLThongKe.thongke.getSoHoaDon() + 1;
        lblHoaDon.setText("HD00" + soHD);
        resetFormKhachHang();
        DefaultTableModel modelTbl = (DefaultTableModel) tblHoaDon.getModel();
        modelTbl.setRowCount(0);
        QLKhuyenMai.fillToCboByToday(cboKhuyenMai);
        cboKhuyenMai.setSelectedItem(0);
        tongHoaDonTruGiamGia();
        cboPay.setSelectedIndex(0);
        txtKhachTra.setText("");
        txtTraKhach.setText("");

        this.updateStatus();
    }

    void setFormHoaDon(String maHoaDon) {
        Ban ban = QLBan.dao.selectByMaHoaDon(maHoaDon);
        if (ban != null) {
            lblSoBan.setText(String.valueOf(DatBan.soBan));
        } else {
            lblSoBan.setText("Đã thanh toán");
        }
        HoaDon hd = QLHoaDon.dao.selectById(maHoaDon);
        timer.stop();
        if (hd != null) {
            btnUpdateHoaDon.setEnabled(true);
            KhachHang kh = QLKhachHang.dao.selectById(hd.getMaKH());
            setFormKhachHang(kh);
            lblHoaDon.setText("HD00" + hd.getMaHoaDon());
            lblClock.setText(XDate.dateParseString((Date) hd.getNgayLapHD(), "dd/MM/yyyy hh:mm:ss aa"));
            cboPay.setSelectedItem(hd.getHinhThucTT());
            String nv = QLNhanVien.dao.selectById(hd.getNhanVienTT()).getHoTenNV();
            lblNhanVien.setText(nv);

            String date = XDate.dateParseString((Date) hd.getNgayLapHD(), "yyyy/MM/dd hh:mm:ss");
            QLKhuyenMai.fillToCboByDates(cboKhuyenMai, date, date);
//            if(hd.getMaKhuyenMai().equals("SINHNHAT")){
//                
//            }
            cboKhuyenMai.setSelectedItem(hd.getMaKhuyenMai());

            KhuyenMai km = QLKhuyenMai.dao.selectById(hd.getMaKhuyenMai());
            if (km != null) {
                lblKhuyenMai.setText(km.getTenKhuyenMai());
            } else {
                lblKhuyenMai.setText("");
            }
        } else {
            MsgBox.alert(this, "Không tìm thấy thông tin hóa đơn!");
            this.resetFormHoaDon();
            return;
        }
        QLDatMon.fillToBillTblByID(maHoaDon, tblHoaDon);
        tongHoaDonTruGiamGia();
    }

    KhachHang getFormKhachHang() {
        KhachHang entity = new KhachHang();
        entity.setHoTenKH(txtKhachHang.getText().trim());
        entity.setSoDT(txtSoDT.getText().trim());
        entity.setNgaySinh(dateNgaySinh.getDate());
        entity.setDiaChi(txtDiaChi.getText().trim());
        entity.setEmail(txtEmail.getText().trim());
        String gioiTinh = rdoNam.isSelected() ? "Nam" : "Nữ";
        entity.setGioiTinh(gioiTinh);
        return entity;
    }

    HoaDon getFormHoaDon() {
        HoaDon entity = new HoaDon();
        String maHD = lblHoaDon.getText();
        entity.setMaHoaDon(Integer.parseInt(maHD.substring(4)));
        entity.setMaKH(txtSoDT.getText().trim());
        String maNV = QLNhanVien.dao.selectByName(lblNhanVien.getText().trim()).getMaNV();
        entity.setNhanVienLap(maNV);
        entity.setNhanVienTT(maNV);
        entity.setNgayLapHD(XDate.stringToDate(lblClock.getText(), "dd/MM/yyyy HH:mm:ss aa"));

        if (cboKhuyenMai.getSelectedIndex() > 0) {
            String maKhuyenMai = String.valueOf(cboKhuyenMai.getSelectedItem());
            entity.setMaKhuyenMai(maKhuyenMai);
        } else {
            entity.setMaKhuyenMai(null);
        }
        entity.setHinhThucTT(cboPay.getSelectedItem().toString());
        return entity;
    }

    Ban getFormDatBan() {
        Ban entity = new Ban();
        entity.setMaBan(Integer.parseInt(lblSoBan.getText()));
        String maHD = lblHoaDon.getText();
        entity.setMaHoaDon(Integer.parseInt(maHD.substring(4)));
        entity.setTinhTrang(true);
        return entity;
    }

    HoaDonCT getFormHoaDonCT(int i) {
        HoaDonCT entity = new HoaDonCT();
        String maHD = lblHoaDon.getText();
        entity.setMaHoaDon(Integer.parseInt(maHD.substring(4)));
        String tenMon = tblHoaDon.getValueAt(i, 0).toString();
        String maMon = QLMonAn.dao.selectByName(tenMon).getMaMon();
        entity.setMaMon(maMon);
        entity.setSoLuong(Float.parseFloat(tblHoaDon.getValueAt(i, 1).toString()));
        entity.setDonVi(tblHoaDon.getValueAt(i, 2).toString());
        return entity;
    }

    void tongHoaDonTruGiamGia() {
        if(tblHoaDon.getSelectedRow()>0)
        {
            float sum = QLDatMon.tongHoaDon(tblHoaDon);

        txtPhiDichVu.setText(String.valueOf(sum * 0.05));
        txtThue.setText(String.valueOf(sum * 0.1));
        txtTongTien.setText(String.valueOf(sum * 0.05 + sum * 0.1 + sum));

        float giam = QLDatMon.tongGiamGia(tblHoaDon);
        txtGiamGia.setText(String.valueOf(giam));
        }
    }

    void capNhatKhuyenMai() {

        float giaTri = 0;
        KhuyenMai km = QLKhuyenMai.dao.selectById(String.valueOf(cboKhuyenMai.getSelectedItem()));
        if (km != null) {
            if (km.getMaKhuyenMai().equals("SINHNHAT")) {
                if (dateNgaySinh.getCalendar() != null) {
                    lblNgayKhuyenMai.setText(XDate.dateParseString(dateNgaySinh.getDate(), "dd-MM-yyyy"));
                } else {
                    lblNgayKhuyenMai.setText("Chưa nhập ngày sinh của khách hàng!");
                }
            } else {
                String ngayBatDau = XDate.dateParseString(km.getNgayBatDau(), "dd/MM/yyyy");
                String ngayKetThuc = XDate.dateParseString(km.getNgayKetThuc(), "dd/MM/yyyy");
                lblNgayKhuyenMai.setText("(Từ " + ngayBatDau + " Đến " + ngayKetThuc + ")");
            }
            lblKhuyenMai.setText(km.getTenKhuyenMai());
            
            if (km.getGiaTriKMHD() > 0) {
                giaTri = km.getGiaTriKMHD();
            } else if (km.getGiaTriKMHD() == 0) {

                List<KhuyenMaiCT> list = QLKhuyenMaiCT.dao.selectById1(km.getMaKhuyenMai());
                if (list != null) {
                    for (int i = 0; i < tblHoaDon.getRowCount(); i++) {
                        for (KhuyenMaiCT entity : list) {
                            MonAn mon = QLMonAn.dao.selectByName(String.valueOf(tblHoaDon.getValueAt(i, 0)));
                            if (mon.getMaMon().equals(entity.getMaMon())) {
                                giaTri = entity.getGiaTriKMCT();
                            }
                        }
                    }

                }
            }
            System.out.println("Phan Tram Khuyen Mai: "+ giaTri);

        } else {
            lblKhuyenMai.setText("");
            lblNgayKhuyenMai.setText("");
        }
        for (int i = 0; i < tblHoaDon.getRowCount(); i++) {
            QLDatMon.capNhatGiamGia(tblHoaDon, i, giaTri);
        }
        tongHoaDonTruGiamGia();
    }

    void updateStatus() {
        int row = tblHoaDon.getSelectedRow();
        boolean edit = (row >= 0);
        if (edit) {
            btnXoaMon.setEnabled(true);
            btnTang.setEnabled(true);
            btnGiam.setEnabled(true);
        } else {
            btnXoaMon.setEnabled(false);
            btnTang.setEnabled(false);
            btnGiam.setEnabled(false);
        }
        updateStatusKhachHang();
        updateStatusHoaDon();
        txtPhiDichVu.setEnabled(false);
        txtThue.setEnabled(false);
        txtTongTien.setEnabled(false);
        txtGiamGia.setEnabled(false);
        txtTraKhach.setEnabled(false);
    }

    void updateStatusKhachHang() {
        Boolean edit = false;

        String soDT = txtSoDT.getText();
        KhachHang kh = QLKhachHang.dao.selectById(soDT);
        if (kh == null) {
            edit = true;
        }
        btnAddKhachHang.setEnabled(edit);
        btnUpdateKhachHang.setEnabled(!edit);

    }

    void updateStatusHoaDon() {
        Boolean edit = false;
        String maHoaDon = lblHoaDon.getText();
        HoaDon hd = QLHoaDon.dao.selectById(maHoaDon.substring(4));
        if (hd == null) {
            edit = true;
        }

        btnAddHoaDon.setEnabled(edit);
        btnUpdateHoaDon.setEnabled(!edit);
    }
}
