package ui;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
//import javax.swing.event.ChangeListener;
//import javax.swing.table.DefaultTableModel;
import controllers.QLCaTruc;
import controllers.QLChiTietCaTruc;
import controllers.QLChucVu;
import controllers.QLHoaDon;
import controllers.QLKhachHang;
import controllers.QLKhuyenMai;
import controllers.QLLoaiNgLieu;
import controllers.QLNguyenLieu;
import controllers.QLThongKe;
import controllers.QLNhanVien;
import controllers.QLPhieuNhap;
import controllers.QLPhieuNhapCT;
import dao.CaTrucDAO;
import dao.HoaDonDAO;
import dao.KhachHangDAO;
import dao.NguyenLieuDAO;
import dao.NhanVienDAO;
import dao.PhieuNhapDAO;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import model.CaTruc;
import model.KhachHang;
import model.NguyenLieu;
import model.NhanVien;
import model.PhieuNhap;
import model.ChucVu;
import model.HoaDon;
import model.KhuyenMai;
import model.PhieuNhapCT;
import utils.Auth;
import utils.Entity;
import utils.MsgBox;
import utils.OutputExcel;
import utils.XDate;
import utils.XImage;
import utils.XInit;

public class ThongKe extends javax.swing.JFrame {

    public ThongKe() {
        initComponents();
        XInit.init(this);
        this.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGender = new javax.swing.ButtonGroup();
        pnlTool = new javax.swing.JPanel();
        pnlTimkiem = new javax.swing.JPanel();
        cboThongKe = new javax.swing.JComboBox<>();
        btnChiTiet = new javax.swing.JButton();
        btnXuatFile = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        lblHinh = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblTong = new javax.swing.JLabel();
        lblMax = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        txtMin = new javax.swing.JTextField();
        txtMax = new javax.swing.JTextField();
        txtTong = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtTongSoLuong = new javax.swing.JTextField();
        tabs = new javax.swing.JTabbedPane();
        pnlNhanVien = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        cboChucVu = new javax.swing.JComboBox<>();
        pnlTimkiem1 = new javax.swing.JPanel();
        spnLuongTu = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        spnLuongDen = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        btnLocLuongNhanVien = new javax.swing.JButton();
        btnBoLocNhanVien = new javax.swing.JButton();
        pnlCaTruc = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblCaTruc = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        cboTenNhanVien = new javax.swing.JComboBox<>();
        pnlTimkiem2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnLocCaTruc = new javax.swing.JButton();
        DateNgayTrucTu = new com.toedter.calendar.JDateChooser();
        DateNgayTrucDen = new com.toedter.calendar.JDateChooser();
        btnBoLocCaTruc = new javax.swing.JButton();
        lblTenNhanVien = new javax.swing.JLabel();
        pnlKhachHang = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        rdoKhachHangNam = new javax.swing.JRadioButton();
        rdoKhachHangNu = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        btnBoLocKhachHang = new javax.swing.JButton();
        pnlTimkiem10 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        DateNgaySinhTu = new com.toedter.calendar.JDateChooser();
        btnLocKhachHang = new javax.swing.JButton();
        DateNgaySinhDen = new com.toedter.calendar.JDateChooser();
        pnlHoaDon = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        cboNguoiThanhToanHD = new javax.swing.JComboBox<>();
        pnlTimkiem5 = new javax.swing.JPanel();
        spnHoaDonTu = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        spnHoaDonDen = new javax.swing.JSpinner();
        btnLocTongTienHD = new javax.swing.JButton();
        btnBoLocHoaDon = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        cboNguoiLapHoaDon = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        cboHinhThucTT = new javax.swing.JComboBox<>();
        pnlTimkiem6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnNgayLapHD = new javax.swing.JButton();
        DateNgayLapTu = new com.toedter.calendar.JDateChooser();
        DateNgayLapDen = new com.toedter.calendar.JDateChooser();
        pnlKhuyenMai = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblKhuyenMai = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        pnlTimkiem7 = new javax.swing.JPanel();
        spnGTKMTu = new javax.swing.JSpinner();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        spnGTKMDen = new javax.swing.JSpinner();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        btnBoLocKhuyenMai = new javax.swing.JButton();
        pnlTimkiem8 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        DateNgayBatDauTu = new com.toedter.calendar.JDateChooser();
        DateNgayBatDauDen = new com.toedter.calendar.JDateChooser();
        btnLocKhuyenMai = new javax.swing.JButton();
        pnlTimkiem9 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        DateNgayKetThucTu = new com.toedter.calendar.JDateChooser();
        DateNgayKetThucDen = new com.toedter.calendar.JDateChooser();
        pnlNguyenLieu = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblNguyenLieu = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        cboLoaiNguyenLieu = new javax.swing.JComboBox<>();
        pnlTimkiem11 = new javax.swing.JPanel();
        spnSoLuongTu = new javax.swing.JSpinner();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        spnSoLuongDen = new javax.swing.JSpinner();
        btnLocNguyenLieu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnBoLocNguyenLieu = new javax.swing.JButton();
        pnlPhieuNhap = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPhieuNhap = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        cboTenNguoiNhap = new javax.swing.JComboBox<>();
        btnBoLocPhieuNhap = new javax.swing.JButton();
        lblTenNhanVien1 = new javax.swing.JLabel();
        pnlTimkiem12 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        btnLocNgayNhapPhieuNhap = new javax.swing.JButton();
        DateNgayNhapTu = new com.toedter.calendar.JDateChooser();
        DateNgayNhapDen = new com.toedter.calendar.JDateChooser();
        pnlPhieuNhapCT = new javax.swing.JPanel();
        pnlFindByPhieuNhap = new javax.swing.JPanel();
        cboPhieuNhap = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cboNguyenLieu = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        btnBoLocPhieuNhapCT = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblPhieuNhapCT = new javax.swing.JTable();
        tlb = new javax.swing.JToolBar();
        btnDanhMuc1 = new javax.swing.JButton();
        btnDatMon1 = new javax.swing.JButton();
        btnHuongDan1 = new javax.swing.JButton();
        btnExit1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("QUẢN LÝ NHÀ HÀNG - THỐNG KÊ");
        setBackground(new java.awt.Color(255, 255, 204));
        setName(""); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(721, 406));

        pnlTool.setBackground(new java.awt.Color(255, 255, 204));
        pnlTool.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 0, new java.awt.Color(255, 204, 102)));

        pnlTimkiem.setBackground(new java.awt.Color(255, 204, 102));
        pnlTimkiem.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm Kiếm"));

        cboThongKe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboThongKe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboThongKeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlTimkiemLayout = new javax.swing.GroupLayout(pnlTimkiem);
        pnlTimkiem.setLayout(pnlTimkiemLayout);
        pnlTimkiemLayout.setHorizontalGroup(
            pnlTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboThongKe, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlTimkiemLayout.setVerticalGroup(
            pnlTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboThongKe)
        );

        btnChiTiet.setBackground(new java.awt.Color(255, 255, 255));
        btnChiTiet.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/info-2-32.png"))); // NOI18N
        btnChiTiet.setText("Chi Tiết");
        btnChiTiet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChiTiet.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietActionPerformed(evt);
            }
        });

        btnXuatFile.setBackground(new java.awt.Color(255, 255, 255));
        btnXuatFile.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnXuatFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/download-2-32.png"))); // NOI18N
        btnXuatFile.setText("Xuất File");
        btnXuatFile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXuatFile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnXuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatFileActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-list-32.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        lblHinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/calendar-128.png"))); // NOI18N
        lblHinh.setSize(new java.awt.Dimension(128, 128));

        jPanel8.setBackground(new java.awt.Color(255, 204, 102));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Thống Kê"));

        lblTong.setText("Tổng:");

        lblMax.setText("Cao nhất:");

        lblMin.setText("Thấp nhất:");

        jLabel16.setText("Tổng số lượng:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTong, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMin, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMin)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTongSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTong, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtMax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtMax, txtMin, txtTong, txtTongSoLuong});

        jPanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel16, lblMax, lblMin, lblTong});

        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtTongSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTong)
                    .addComponent(txtTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMax)
                    .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMin)
                    .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtMax, txtMin, txtTong, txtTongSoLuong});

        jPanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel16, lblMax, lblMin, lblTong});

        javax.swing.GroupLayout pnlToolLayout = new javax.swing.GroupLayout(pnlTool);
        pnlTool.setLayout(pnlToolLayout);
        pnlToolLayout.setHorizontalGroup(
            pnlToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToolLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlToolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlToolLayout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnChiTiet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXuatFile)))
                .addContainerGap())
        );

        pnlToolLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnChiTiet, btnThem, btnXuatFile});

        pnlToolLayout.setVerticalGroup(
            pnlToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToolLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnXuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlToolLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnChiTiet, btnThem, btnXuatFile});

        tabs.setBackground(new java.awt.Color(255, 255, 204));
        tabs.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 204, 102)));
        tabs.setToolTipText("Chi Tiết Phiếu Nhập");
        tabs.setFocusTraversalKeysEnabled(false);
        tabs.setMaximumSize(new java.awt.Dimension(546, 332));
        tabs.setMinimumSize(new java.awt.Dimension(546, 332));
        tabs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabsStateChanged(evt);
            }
        });

        pnlNhanVien.setBackground(new java.awt.Color(255, 255, 204));
        pnlNhanVien.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        tblNhanVien.setAutoCreateRowSorter(true);
        tblNhanVien.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)));
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Họ Tên NV", "Giới Tính", "Số ĐT", "Địa Chỉ", "Chức Vụ ", "Lương", "Mật Khẩu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.setToolTipText("tblNhanVien");
        tblNhanVien.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblNhanVien.setFocusTraversalKeysEnabled(false);
        tblNhanVien.setGridColor(new java.awt.Color(204, 204, 204));
        tblNhanVien.setName("tblNhanVien"); // NOI18N
        tblNhanVien.setShowGrid(false);
        tblNhanVien.setShowHorizontalLines(true);
        tblNhanVien.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tblNhanVien);
        if (tblNhanVien.getColumnModel().getColumnCount() > 0) {
            tblNhanVien.getColumnModel().getColumn(0).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(1).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(2).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(3).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(4).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(5).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(6).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(7).setResizable(false);
        }
        tblNhanVien.getAccessibleContext().setAccessibleName("tblNhanVien");

        jPanel7.setBackground(new java.awt.Color(255, 204, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Lọc"));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("Giới tính:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setText("Chức vụ:");

        btnGender.add(rdoNam);
        rdoNam.setText("Nam");
        rdoNam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdoNamItemStateChanged(evt);
            }
        });

        btnGender.add(rdoNu);
        rdoNu.setText("Nữ");
        rdoNu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdoNuItemStateChanged(evt);
            }
        });

        cboChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboChucVu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboChucVuItemStateChanged(evt);
            }
        });

        pnlTimkiem1.setBackground(new java.awt.Color(255, 204, 102));
        pnlTimkiem1.setBorder(javax.swing.BorderFactory.createTitledBorder("Mức lương:"));

        spnLuongTu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnLuongTuStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setText("Từ:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setText("Đến:");

        btnLocLuongNhanVien.setText("Lọc");
        btnLocLuongNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocLuongNhanVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTimkiem1Layout = new javax.swing.GroupLayout(pnlTimkiem1);
        pnlTimkiem1.setLayout(pnlTimkiem1Layout);
        pnlTimkiem1Layout.setHorizontalGroup(
            pnlTimkiem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimkiem1Layout.createSequentialGroup()
                .addComponent(btnLocLuongNhanVien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnLuongTu, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnLuongDen, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTimkiem1Layout.setVerticalGroup(
            pnlTimkiem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTimkiem1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTimkiem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(spnLuongDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnLuongTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btnLocLuongNhanVien))
                .addContainerGap())
        );

        pnlTimkiem1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {spnLuongDen, spnLuongTu});

        btnBoLocNhanVien.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBoLocNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/empty-filter-24.png"))); // NOI18N
        btnBoLocNhanVien.setText("Bỏ lọc");
        btnBoLocNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBoLocNhanVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBoLocNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoLocNhanVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cboChucVu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoNam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoNu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTimkiem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnBoLocNhanVien)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBoLocNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTimkiem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap(7, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlNhanVienLayout = new javax.swing.GroupLayout(pnlNhanVien);
        pnlNhanVien.setLayout(pnlNhanVienLayout);
        pnlNhanVienLayout.setHorizontalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlNhanVienLayout.setVerticalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("Nhân Viên", pnlNhanVien);

        pnlCaTruc.setBackground(new java.awt.Color(255, 255, 204));

        tblCaTruc.setAutoCreateRowSorter(true);
        tblCaTruc.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)));
        tblCaTruc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ngày Trực", "Nhân Viên", "Mã Ca Trực", "Thời Gian Bắt Đầu", "Thời Gian Kết Thúc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCaTruc.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblCaTruc.setFocusTraversalKeysEnabled(false);
        tblCaTruc.setGridColor(new java.awt.Color(204, 204, 204));
        tblCaTruc.setShowGrid(false);
        jScrollPane6.setViewportView(tblCaTruc);

        jPanel4.setBackground(new java.awt.Color(255, 204, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Lọc"));

        cboTenNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboTenNhanVien.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTenNhanVienItemStateChanged(evt);
            }
        });

        pnlTimkiem2.setBackground(new java.awt.Color(255, 204, 102));
        pnlTimkiem2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ngày trực:"));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setText("Từ:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel10.setText("Đến:");

        btnLocCaTruc.setText("Lọc");
        btnLocCaTruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocCaTrucActionPerformed(evt);
            }
        });

        DateNgayTrucTu.setDateFormatString("yyyy-MM-dd");
        DateNgayTrucTu.setMinSelectableDate(new java.util.Date(-62135791137000L));

        DateNgayTrucDen.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout pnlTimkiem2Layout = new javax.swing.GroupLayout(pnlTimkiem2);
        pnlTimkiem2.setLayout(pnlTimkiem2Layout);
        pnlTimkiem2Layout.setHorizontalGroup(
            pnlTimkiem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimkiem2Layout.createSequentialGroup()
                .addComponent(btnLocCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateNgayTrucTu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateNgayTrucDen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        pnlTimkiem2Layout.setVerticalGroup(
            pnlTimkiem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTimkiem2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTimkiem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateNgayTrucDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateNgayTrucTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTimkiem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9)
                        .addComponent(btnLocCaTruc)))
                .addContainerGap())
        );

        btnBoLocCaTruc.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBoLocCaTruc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/empty-filter-24.png"))); // NOI18N
        btnBoLocCaTruc.setText("Bỏ lọc");
        btnBoLocCaTruc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBoLocCaTruc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBoLocCaTruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoLocCaTrucActionPerformed(evt);
            }
        });

        lblTenNhanVien.setText("Tên nhân viên:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenNhanVien)
                    .addComponent(cboTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlTimkiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBoLocCaTruc)
                .addGap(39, 39, 39))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBoLocCaTruc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTimkiem2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTenNhanVien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlCaTrucLayout = new javax.swing.GroupLayout(pnlCaTruc);
        pnlCaTruc.setLayout(pnlCaTrucLayout);
        pnlCaTrucLayout.setHorizontalGroup(
            pnlCaTrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCaTrucLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCaTrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCaTrucLayout.setVerticalGroup(
            pnlCaTrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCaTrucLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        tabs.addTab("Ca Trực", pnlCaTruc);

        pnlKhachHang.setBackground(new java.awt.Color(255, 255, 204));

        tblKhachHang.setAutoCreateRowSorter(true);
        tblKhachHang.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)));
        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tên KH", "Giới Tính", "Ngày Sinh", "Số ĐT", "Email", "Địa Chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhachHang.setFocusTraversalKeysEnabled(false);
        tblKhachHang.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane5.setViewportView(tblKhachHang);

        jPanel6.setBackground(new java.awt.Color(255, 204, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Lọc"));

        btnGender.add(rdoKhachHangNam);
        rdoKhachHangNam.setText("Nam");
        rdoKhachHangNam.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdoKhachHangNamStateChanged(evt);
            }
        });

        btnGender.add(rdoKhachHangNu);
        rdoKhachHangNu.setText("Nữ");
        rdoKhachHangNu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdoKhachHangNuStateChanged(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel21.setText("Giới tính:");

        btnBoLocKhachHang.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBoLocKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/empty-filter-24.png"))); // NOI18N
        btnBoLocKhachHang.setText("Bỏ lọc");
        btnBoLocKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnBoLocKhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBoLocKhachHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBoLocKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoLocKhachHangActionPerformed(evt);
            }
        });

        pnlTimkiem10.setBackground(new java.awt.Color(255, 204, 102));
        pnlTimkiem10.setBorder(javax.swing.BorderFactory.createTitledBorder("Ngày sinh:"));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel15.setText("Từ:");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel27.setText("Đến:");

        DateNgaySinhTu.setDateFormatString("yyyy-MM-dd");

        btnLocKhachHang.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnLocKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/filled-filter-24.png"))); // NOI18N
        btnLocKhachHang.setText("Lọc");
        btnLocKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocKhachHangActionPerformed(evt);
            }
        });

        DateNgaySinhDen.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout pnlTimkiem10Layout = new javax.swing.GroupLayout(pnlTimkiem10);
        pnlTimkiem10.setLayout(pnlTimkiem10Layout);
        pnlTimkiem10Layout.setHorizontalGroup(
            pnlTimkiem10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimkiem10Layout.createSequentialGroup()
                .addComponent(btnLocKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateNgaySinhTu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateNgaySinhDen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTimkiem10Layout.setVerticalGroup(
            pnlTimkiem10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimkiem10Layout.createSequentialGroup()
                .addComponent(btnLocKhachHang)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlTimkiem10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTimkiem10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateNgaySinhDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addGroup(pnlTimkiem10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(DateNgaySinhTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoKhachHangNam)
                    .addComponent(rdoKhachHangNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlTimkiem10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBoLocKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBoLocKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(rdoKhachHangNam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoKhachHangNu)
                        .addGap(7, 7, 7))
                    .addComponent(pnlTimkiem10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlKhachHangLayout = new javax.swing.GroupLayout(pnlKhachHang);
        pnlKhachHang.setLayout(pnlKhachHangLayout);
        pnlKhachHangLayout.setHorizontalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlKhachHangLayout.setVerticalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("Khách Hàng", pnlKhachHang);

        pnlHoaDon.setBackground(new java.awt.Color(255, 255, 204));

        tblHoaDon.setAutoCreateRowSorter(true);
        tblHoaDon.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)));
        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tblHoaDon.setFocusTraversalKeysEnabled(false);
        tblHoaDon.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(tblHoaDon);

        jPanel9.setBackground(new java.awt.Color(255, 204, 102));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Lọc"));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel14.setText("Người thanh toán:");

        cboNguoiThanhToanHD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboNguoiThanhToanHD.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboNguoiThanhToanHDItemStateChanged(evt);
            }
        });

        pnlTimkiem5.setBackground(new java.awt.Color(255, 204, 102));
        pnlTimkiem5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tổng tiền:"));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel22.setText("Từ:");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel23.setText("Đến:");

        btnLocTongTienHD.setText("Lọc");
        btnLocTongTienHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocTongTienHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTimkiem5Layout = new javax.swing.GroupLayout(pnlTimkiem5);
        pnlTimkiem5.setLayout(pnlTimkiem5Layout);
        pnlTimkiem5Layout.setHorizontalGroup(
            pnlTimkiem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimkiem5Layout.createSequentialGroup()
                .addComponent(btnLocTongTienHD, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnHoaDonTu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnHoaDonDen, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTimkiem5Layout.setVerticalGroup(
            pnlTimkiem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTimkiem5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTimkiem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(spnHoaDonDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnHoaDonTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(btnLocTongTienHD))
                .addContainerGap())
        );

        btnBoLocHoaDon.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBoLocHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/empty-filter-24.png"))); // NOI18N
        btnBoLocHoaDon.setText("Bỏ lọc");
        btnBoLocHoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBoLocHoaDon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBoLocHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoLocHoaDonActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel24.setText("Người Lập:");

        cboNguoiLapHoaDon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboNguoiLapHoaDon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboNguoiLapHoaDonItemStateChanged(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel25.setText("Hình thức thanh toán:");

        cboHinhThucTT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboHinhThucTT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboHinhThucTTItemStateChanged(evt);
            }
        });

        pnlTimkiem6.setBackground(new java.awt.Color(255, 204, 102));
        pnlTimkiem6.setBorder(javax.swing.BorderFactory.createTitledBorder("Ngày lập:"));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel13.setText("Từ:");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel26.setText("Đến:");

        btnNgayLapHD.setText("Lọc");
        btnNgayLapHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNgayLapHDActionPerformed(evt);
            }
        });

        DateNgayLapTu.setDateFormatString("yyyy-MM-dd");

        DateNgayLapDen.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout pnlTimkiem6Layout = new javax.swing.GroupLayout(pnlTimkiem6);
        pnlTimkiem6.setLayout(pnlTimkiem6Layout);
        pnlTimkiem6Layout.setHorizontalGroup(
            pnlTimkiem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimkiem6Layout.createSequentialGroup()
                .addComponent(btnNgayLapHD, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(DateNgayLapTu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateNgayLapDen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        pnlTimkiem6Layout.setVerticalGroup(
            pnlTimkiem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTimkiem6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTimkiem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateNgayLapDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateNgayLapTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTimkiem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(jLabel13)
                        .addComponent(btnNgayLapHD)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboHinhThucTT, 0, 88, Short.MAX_VALUE)
                    .addComponent(cboNguoiLapHoaDon, 0, 88, Short.MAX_VALUE)
                    .addComponent(cboNguoiThanhToanHD, 0, 88, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(pnlTimkiem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBoLocHoaDon))
                    .addComponent(pnlTimkiem6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(pnlTimkiem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlTimkiem5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBoLocHoaDon)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(cboNguoiLapHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cboNguoiThanhToanHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(cboHinhThucTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnlHoaDonLayout = new javax.swing.GroupLayout(pnlHoaDon);
        pnlHoaDon.setLayout(pnlHoaDonLayout);
        pnlHoaDonLayout.setHorizontalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlHoaDonLayout.setVerticalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabs.addTab("Hóa Đơn", pnlHoaDon);

        tblKhuyenMai.setAutoCreateRowSorter(true);
        tblKhuyenMai.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)));
        tblKhuyenMai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tblKhuyenMai.setFocusTraversalKeysEnabled(false);
        tblKhuyenMai.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane8.setViewportView(tblKhuyenMai);

        jPanel10.setBackground(new java.awt.Color(255, 204, 102));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Lọc"));

        pnlTimkiem7.setBackground(new java.awt.Color(255, 204, 102));
        pnlTimkiem7.setBorder(javax.swing.BorderFactory.createTitledBorder("Giá trị khuyến mãi:"));

        spnGTKMTu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnGTKMTuStateChanged(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel28.setText("Từ:");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel29.setText("Đến:");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel37.setText("%");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel38.setText("%");

        javax.swing.GroupLayout pnlTimkiem7Layout = new javax.swing.GroupLayout(pnlTimkiem7);
        pnlTimkiem7.setLayout(pnlTimkiem7Layout);
        pnlTimkiem7Layout.setHorizontalGroup(
            pnlTimkiem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimkiem7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTimkiem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(pnlTimkiem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spnGTKMTu, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(spnGTKMDen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTimkiem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTimkiem7Layout.setVerticalGroup(
            pnlTimkiem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimkiem7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTimkiem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(spnGTKMTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(5, 5, 5)
                .addGroup(pnlTimkiem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(spnGTKMDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBoLocKhuyenMai.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBoLocKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/empty-filter-24.png"))); // NOI18N
        btnBoLocKhuyenMai.setText("Bỏ lọc");
        btnBoLocKhuyenMai.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBoLocKhuyenMai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBoLocKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoLocKhuyenMaiActionPerformed(evt);
            }
        });

        pnlTimkiem8.setBackground(new java.awt.Color(255, 204, 102));
        pnlTimkiem8.setBorder(javax.swing.BorderFactory.createTitledBorder("Ngày bắt đầu khuyến mãi:"));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel32.setText("Từ:");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel33.setText("Đến:");

        DateNgayBatDauTu.setDateFormatString("yyyy-MM-dd");

        DateNgayBatDauDen.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout pnlTimkiem8Layout = new javax.swing.GroupLayout(pnlTimkiem8);
        pnlTimkiem8.setLayout(pnlTimkiem8Layout);
        pnlTimkiem8Layout.setHorizontalGroup(
            pnlTimkiem8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTimkiem8Layout.createSequentialGroup()
                .addGroup(pnlTimkiem8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTimkiem8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel32)
                        .addGap(18, 18, 18))
                    .addGroup(pnlTimkiem8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pnlTimkiem8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DateNgayBatDauTu, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(DateNgayBatDauDen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        pnlTimkiem8Layout.setVerticalGroup(
            pnlTimkiem8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimkiem8Layout.createSequentialGroup()
                .addGroup(pnlTimkiem8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32)
                    .addComponent(DateNgayBatDauTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTimkiem8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33)
                    .addComponent(DateNgayBatDauDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLocKhuyenMai.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnLocKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/filled-filter-24.png"))); // NOI18N
        btnLocKhuyenMai.setText("Lọc");
        btnLocKhuyenMai.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLocKhuyenMai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLocKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocKhuyenMaiActionPerformed(evt);
            }
        });

        pnlTimkiem9.setBackground(new java.awt.Color(255, 204, 102));
        pnlTimkiem9.setBorder(javax.swing.BorderFactory.createTitledBorder("Ngày kết thúc khuyến mãi:"));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel34.setText("Từ:");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel35.setText("Đến:");

        DateNgayKetThucTu.setDateFormatString("yyyy-MM-dd");

        DateNgayKetThucDen.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout pnlTimkiem9Layout = new javax.swing.GroupLayout(pnlTimkiem9);
        pnlTimkiem9.setLayout(pnlTimkiem9Layout);
        pnlTimkiem9Layout.setHorizontalGroup(
            pnlTimkiem9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTimkiem9Layout.createSequentialGroup()
                .addGroup(pnlTimkiem9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTimkiem9Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18))
                    .addGroup(pnlTimkiem9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pnlTimkiem9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DateNgayKetThucTu, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(DateNgayKetThucDen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        pnlTimkiem9Layout.setVerticalGroup(
            pnlTimkiem9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimkiem9Layout.createSequentialGroup()
                .addGroup(pnlTimkiem9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel34)
                    .addComponent(DateNgayKetThucTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTimkiem9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35)
                    .addComponent(DateNgayKetThucDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTimkiem7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnlTimkiem8, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlTimkiem9, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBoLocKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLocKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlTimkiem7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlTimkiem8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlTimkiem9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnLocKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBoLocKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlKhuyenMaiLayout = new javax.swing.GroupLayout(pnlKhuyenMai);
        pnlKhuyenMai.setLayout(pnlKhuyenMaiLayout);
        pnlKhuyenMaiLayout.setHorizontalGroup(
            pnlKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
            .addGroup(pnlKhuyenMaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlKhuyenMaiLayout.setVerticalGroup(
            pnlKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhuyenMaiLayout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("Khuyến Mãi", pnlKhuyenMai);

        pnlNguyenLieu.setBackground(new java.awt.Color(255, 255, 204));

        tblNguyenLieu.setAutoCreateRowSorter(true);
        tblNguyenLieu.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)));
        tblNguyenLieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tblNguyenLieu.setFocusTraversalKeysEnabled(false);
        tblNguyenLieu.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane4.setViewportView(tblNguyenLieu);

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lọc"));

        cboLoaiNguyenLieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theo Loại Nguyên Liệu", "Item 2", "Item 3", "Item 4" }));
        cboLoaiNguyenLieu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboLoaiNguyenLieuItemStateChanged(evt);
            }
        });

        pnlTimkiem11.setBackground(new java.awt.Color(255, 204, 102));
        pnlTimkiem11.setBorder(javax.swing.BorderFactory.createTitledBorder("Số lượng:"));

        spnSoLuongTu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnSoLuongTuStateChanged(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel30.setText("Từ:");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel31.setText("Đến:");

        btnLocNguyenLieu.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnLocNguyenLieu.setText("Lọc");
        btnLocNguyenLieu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLocNguyenLieu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLocNguyenLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocNguyenLieuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTimkiem11Layout = new javax.swing.GroupLayout(pnlTimkiem11);
        pnlTimkiem11.setLayout(pnlTimkiem11Layout);
        pnlTimkiem11Layout.setHorizontalGroup(
            pnlTimkiem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimkiem11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLocNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnSoLuongTu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnSoLuongDen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTimkiem11Layout.setVerticalGroup(
            pnlTimkiem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimkiem11Layout.createSequentialGroup()
                .addGroup(pnlTimkiem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLocNguyenLieu)
                    .addGroup(pnlTimkiem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(spnSoLuongTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31)
                        .addComponent(spnSoLuongDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jLabel4.setText("Loại Nguyên Liệu:");

        btnBoLocNguyenLieu.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBoLocNguyenLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/empty-filter-24.png"))); // NOI18N
        btnBoLocNguyenLieu.setText("Bỏ lọc");
        btnBoLocNguyenLieu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBoLocNguyenLieu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBoLocNguyenLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoLocNguyenLieuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cboLoaiNguyenLieu, 0, 228, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(pnlTimkiem11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBoLocNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTimkiem11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboLoaiNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnBoLocNguyenLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlNguyenLieuLayout = new javax.swing.GroupLayout(pnlNguyenLieu);
        pnlNguyenLieu.setLayout(pnlNguyenLieuLayout);
        pnlNguyenLieuLayout.setHorizontalGroup(
            pnlNguyenLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNguyenLieuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNguyenLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlNguyenLieuLayout.setVerticalGroup(
            pnlNguyenLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNguyenLieuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("Nguyên Liệu", pnlNguyenLieu);

        pnlPhieuNhap.setBackground(new java.awt.Color(255, 255, 204));

        tblPhieuNhap.setAutoCreateRowSorter(true);
        tblPhieuNhap.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)));
        tblPhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPhieuNhap.setFocusTraversalKeysEnabled(false);
        tblPhieuNhap.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane3.setViewportView(tblPhieuNhap);

        jPanel5.setBackground(new java.awt.Color(255, 204, 102));

        cboTenNguoiNhap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboTenNguoiNhap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTenNguoiNhapItemStateChanged(evt);
            }
        });

        btnBoLocPhieuNhap.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBoLocPhieuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/empty-filter-24.png"))); // NOI18N
        btnBoLocPhieuNhap.setText("Bỏ lọc");
        btnBoLocPhieuNhap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBoLocPhieuNhap.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBoLocPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoLocPhieuNhapActionPerformed(evt);
            }
        });

        lblTenNhanVien1.setText("Người nhập:");

        pnlTimkiem12.setBackground(new java.awt.Color(255, 204, 102));
        pnlTimkiem12.setBorder(javax.swing.BorderFactory.createTitledBorder("Ngày nhập:"));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel19.setText("Từ:");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel36.setText("Đến:");

        btnLocNgayNhapPhieuNhap.setText("Lọc");
        btnLocNgayNhapPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocNgayNhapPhieuNhapActionPerformed(evt);
            }
        });

        DateNgayNhapTu.setDateFormatString("yyyy-MM-dd");

        DateNgayNhapDen.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout pnlTimkiem12Layout = new javax.swing.GroupLayout(pnlTimkiem12);
        pnlTimkiem12.setLayout(pnlTimkiem12Layout);
        pnlTimkiem12Layout.setHorizontalGroup(
            pnlTimkiem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimkiem12Layout.createSequentialGroup()
                .addComponent(btnLocNgayNhapPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(DateNgayNhapTu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateNgayNhapDen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        pnlTimkiem12Layout.setVerticalGroup(
            pnlTimkiem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTimkiem12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTimkiem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateNgayNhapDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateNgayNhapTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTimkiem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel36)
                        .addComponent(jLabel19)
                        .addComponent(btnLocNgayNhapPhieuNhap)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenNhanVien1)
                    .addComponent(cboTenNguoiNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTimkiem12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnBoLocPhieuNhap)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTenNhanVien1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboTenNguoiNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnlTimkiem12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBoLocPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnlPhieuNhapLayout = new javax.swing.GroupLayout(pnlPhieuNhap);
        pnlPhieuNhap.setLayout(pnlPhieuNhapLayout);
        pnlPhieuNhapLayout.setHorizontalGroup(
            pnlPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlPhieuNhapLayout.setVerticalGroup(
            pnlPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("Phiếu Nhập", pnlPhieuNhap);

        pnlPhieuNhapCT.setBackground(new java.awt.Color(255, 255, 204));

        pnlFindByPhieuNhap.setBackground(new java.awt.Color(255, 204, 102));

        cboPhieuNhap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboPhieuNhap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboPhieuNhapItemStateChanged(evt);
            }
        });

        jLabel11.setText("Phiếu Nhập:");

        cboNguyenLieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboNguyenLieu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboNguyenLieuItemStateChanged(evt);
            }
        });

        jLabel17.setText("Nguyên Liệu:");

        btnBoLocPhieuNhapCT.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBoLocPhieuNhapCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/empty-filter-24.png"))); // NOI18N
        btnBoLocPhieuNhapCT.setText("Bỏ lọc");
        btnBoLocPhieuNhapCT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnBoLocPhieuNhapCT.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBoLocPhieuNhapCT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBoLocPhieuNhapCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoLocPhieuNhapCTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFindByPhieuNhapLayout = new javax.swing.GroupLayout(pnlFindByPhieuNhap);
        pnlFindByPhieuNhap.setLayout(pnlFindByPhieuNhapLayout);
        pnlFindByPhieuNhapLayout.setHorizontalGroup(
            pnlFindByPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFindByPhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBoLocPhieuNhapCT, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFindByPhieuNhapLayout.setVerticalGroup(
            pnlFindByPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFindByPhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFindByPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBoLocPhieuNhapCT)
                    .addGroup(pnlFindByPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(cboNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblPhieuNhapCT.setAutoCreateRowSorter(true);
        tblPhieuNhapCT.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)));
        tblPhieuNhapCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tblPhieuNhapCT.setFocusTraversalKeysEnabled(false);
        tblPhieuNhapCT.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane7.setViewportView(tblPhieuNhapCT);

        javax.swing.GroupLayout pnlPhieuNhapCTLayout = new javax.swing.GroupLayout(pnlPhieuNhapCT);
        pnlPhieuNhapCT.setLayout(pnlPhieuNhapCTLayout);
        pnlPhieuNhapCTLayout.setHorizontalGroup(
            pnlPhieuNhapCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFindByPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane7)
        );
        pnlPhieuNhapCTLayout.setVerticalGroup(
            pnlPhieuNhapCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPhieuNhapCTLayout.createSequentialGroup()
                .addComponent(pnlFindByPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("CTPhiếu Nhập", pnlPhieuNhapCT);

        tlb.setBackground(new java.awt.Color(255, 255, 204));
        tlb.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 204, 102)));
        tlb.setFloatable(false);
        tlb.setForeground(new java.awt.Color(255, 255, 255));
        tlb.setRollover(true);
        tlb.setToolTipText("");

        btnDanhMuc1.setBackground(new java.awt.Color(255, 255, 255));
        btnDanhMuc1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDanhMuc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/purchase-order-32.png"))); // NOI18N
        btnDanhMuc1.setText("Danh Mục");
        btnDanhMuc1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(255, 204, 102)));
        btnDanhMuc1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDanhMuc1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnDanhMuc1.setMaximumSize(new java.awt.Dimension(90, 60));
        btnDanhMuc1.setMinimumSize(new java.awt.Dimension(90, 60));
        btnDanhMuc1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDanhMuc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhMuc1ActionPerformed(evt);
            }
        });
        tlb.add(btnDanhMuc1);

        btnDatMon1.setBackground(new java.awt.Color(255, 255, 255));
        btnDatMon1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDatMon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-list-32.png"))); // NOI18N
        btnDatMon1.setText("Thêm Mới");
        btnDatMon1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(255, 204, 102)));
        btnDatMon1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDatMon1.setMaximumSize(new java.awt.Dimension(90, 60));
        btnDatMon1.setMinimumSize(new java.awt.Dimension(90, 60));
        btnDatMon1.setPreferredSize(new java.awt.Dimension(90, 60));
        btnDatMon1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDatMon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatMon1ActionPerformed(evt);
            }
        });
        tlb.add(btnDatMon1);

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
        tlb.add(btnHuongDan1);

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
        tlb.add(btnExit1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE))
            .addComponent(tlb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tlb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabs.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabsStateChanged
        // TODO add your handling code here:
        showAllByTab((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_tabsStateChanged

    private void cboThongKeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThongKeItemStateChanged
        // TODO add your handling code here:
        if (cboThongKe.getSelectedIndex() > 0) {
            this.cboThongKe_ItemStateChanged();
        }
    }//GEN-LAST:event_cboThongKeItemStateChanged

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        Entity.setNull();
        this.btnThemActionPerformed();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietActionPerformed
        // TODO add your handling code here:
        this.btnChiTietActionPerformed();
    }//GEN-LAST:event_btnChiTietActionPerformed

    private void btnXuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileActionPerformed
        // TODO add your handling code here:
        this.btnXuatFileActionPerformed();
    }//GEN-LAST:event_btnXuatFileActionPerformed

    private void rdoNamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoNamItemStateChanged
        // TODO add your handling code here:
        this.rdoGenderNhanVienItemStateChanged();
    }//GEN-LAST:event_rdoNamItemStateChanged

    private void rdoNuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoNuItemStateChanged
        // TODO add your handling code here:
        this.rdoGenderNhanVienItemStateChanged();
    }//GEN-LAST:event_rdoNuItemStateChanged

    private void spnLuongTuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnLuongTuStateChanged
        // TODO add your handling code here:
        spnLuongDen.setValue(spnLuongTu.getValue());
    }//GEN-LAST:event_spnLuongTuStateChanged

    private void cboChucVuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboChucVuItemStateChanged
        // TODO add your handling code here:
        if (cboChucVu.getSelectedIndex() > 0) {
            this.cboChucVuItemStateChanged();
        }
    }//GEN-LAST:event_cboChucVuItemStateChanged

    private void btnLocLuongNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocLuongNhanVienActionPerformed
        // TODO add your handling code here:
        this.btnLocLuongNhanVienActionPerformed();
    }//GEN-LAST:event_btnLocLuongNhanVienActionPerformed

    private void btnBoLocNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoLocNhanVienActionPerformed
        // TODO add your handling code here:
        this.removeFilter((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnBoLocNhanVienActionPerformed

    private void cboTenNhanVienItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTenNhanVienItemStateChanged
        // TODO add your handling code here:
        if (cboTenNhanVien.getSelectedIndex() > 0) {
            this.cboTenNhanVienItemStateChanged();
        }
    }//GEN-LAST:event_cboTenNhanVienItemStateChanged

    private void btnLocCaTrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocCaTrucActionPerformed
        // TODO add your handling code here:
        this.btnLocCaTrucActionPerformed();
    }//GEN-LAST:event_btnLocCaTrucActionPerformed

    private void btnBoLocCaTrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoLocCaTrucActionPerformed
        // TODO add your handling code here:
        this.removeFilter((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnBoLocCaTrucActionPerformed

    private void rdoKhachHangNamStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdoKhachHangNamStateChanged
        // TODO add your handling code here:
        this.rdoGenderKhachHangItemStateChanged();
    }//GEN-LAST:event_rdoKhachHangNamStateChanged

    private void rdoKhachHangNuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdoKhachHangNuStateChanged
        // TODO add your handling code here:
        this.rdoGenderKhachHangItemStateChanged();
    }//GEN-LAST:event_rdoKhachHangNuStateChanged

    private void btnLocKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocKhachHangActionPerformed
        // TODO add your handling code here:
        this.btnLocKhachHangActionPerformed();
    }//GEN-LAST:event_btnLocKhachHangActionPerformed

    private void btnBoLocKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoLocKhachHangActionPerformed
        // TODO add your handling code here:
        this.removeFilter((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnBoLocKhachHangActionPerformed

    private void cboNguoiLapHoaDonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboNguoiLapHoaDonItemStateChanged
        // TODO add your handling code here:
        if (cboNguoiLapHoaDon.getSelectedIndex() > 0) {
            this.cboNguoiLapHoaDonItemStateChanged();
        }
    }//GEN-LAST:event_cboNguoiLapHoaDonItemStateChanged

    private void cboNguoiThanhToanHDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboNguoiThanhToanHDItemStateChanged
        // TODO add your handling code here:
        if (cboNguoiThanhToanHD.getSelectedIndex() > 0) {
            this.cboNguoiThanhToanHDItemStateChanged();
        }
    }//GEN-LAST:event_cboNguoiThanhToanHDItemStateChanged

    private void cboHinhThucTTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboHinhThucTTItemStateChanged
        // TODO add your handling code here:
        if (cboHinhThucTT.getSelectedIndex() > 0) {
            this.cboHinhThucTTItemStateChanged();
        }
    }//GEN-LAST:event_cboHinhThucTTItemStateChanged

    private void btnNgayLapHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNgayLapHDActionPerformed
        // TODO add your handling code here:
        this.btnNgayLapHDActionPerformed();
    }//GEN-LAST:event_btnNgayLapHDActionPerformed

    private void btnLocTongTienHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocTongTienHDActionPerformed
        // TODO add your handling code here:
        this.btnLocTongTienHDActionPerformed();
    }//GEN-LAST:event_btnLocTongTienHDActionPerformed

    private void btnBoLocHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoLocHoaDonActionPerformed
        // TODO add your handling code here:
        this.removeFilter((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnBoLocHoaDonActionPerformed

    private void btnLocKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocKhuyenMaiActionPerformed
        // TODO add your handling code here:
        this.removeFilter((JComponent) tabs.getSelectedComponent());
        this.locGiaTriKhuyenMaiActionPerformed();
        this.locNgayBatDauKhuyenMaiActionPerformed();
        this.locNgayKetThucKhuyenMaiActionPerformed();
    }//GEN-LAST:event_btnLocKhuyenMaiActionPerformed

    private void btnBoLocKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoLocKhuyenMaiActionPerformed
        // TODO add your handling code here:
        this.removeFilter((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnBoLocKhuyenMaiActionPerformed

    private void spnGTKMTuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnGTKMTuStateChanged
        // TODO add your handling code here:
        spnGTKMDen.setValue(spnGTKMTu.getValue());
    }//GEN-LAST:event_spnGTKMTuStateChanged

    private void cboLoaiNguyenLieuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboLoaiNguyenLieuItemStateChanged
        // TODO add your handling code here:
        if (cboLoaiNguyenLieu.getSelectedIndex() > 0) {
            this.cboLoaiNguyenLieuItemStateChanged();
        }
    }//GEN-LAST:event_cboLoaiNguyenLieuItemStateChanged

    private void btnLocNguyenLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocNguyenLieuActionPerformed
        // TODO add your handling code here:
        this.btnLocNguyenLieuActionPerformed();
    }//GEN-LAST:event_btnLocNguyenLieuActionPerformed

    private void spnSoLuongTuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnSoLuongTuStateChanged
        // TODO add your handling code here:
        spnSoLuongDen.setValue(spnSoLuongTu.getValue());
    }//GEN-LAST:event_spnSoLuongTuStateChanged

    private void btnBoLocNguyenLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoLocNguyenLieuActionPerformed
        // TODO add your handling code here:
        this.removeFilter((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnBoLocNguyenLieuActionPerformed

    private void cboTenNguoiNhapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTenNguoiNhapItemStateChanged
        // TODO add your handling code here:
        if (cboTenNguoiNhap.getSelectedIndex() > 0) {
            this.cboTenNguoiNhapItemStateChanged();
        }
    }//GEN-LAST:event_cboTenNguoiNhapItemStateChanged

    private void btnLocNgayNhapPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocNgayNhapPhieuNhapActionPerformed
        // TODO add your handling code here:
        this.btnLocNgayNhapPhieuNhapActionPerformed();
    }//GEN-LAST:event_btnLocNgayNhapPhieuNhapActionPerformed

    private void btnBoLocPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoLocPhieuNhapActionPerformed
        // TODO add your handling code here:
        this.removeFilter((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnBoLocPhieuNhapActionPerformed

    private void cboPhieuNhapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboPhieuNhapItemStateChanged
        // TODO add your handling code here:
        if (cboPhieuNhap.getSelectedIndex() > 0) {
            this.cboPhieuNhapItemStateChanged();
        }
    }//GEN-LAST:event_cboPhieuNhapItemStateChanged

    private void cboNguyenLieuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboNguyenLieuItemStateChanged
        // TODO add your handling code here:
        if (cboNguyenLieu.getSelectedIndex() > 0) {
            this.cboNguyenLieuItemStateChanged();
        }
    }//GEN-LAST:event_cboNguyenLieuItemStateChanged

    private void btnBoLocPhieuNhapCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoLocPhieuNhapCTActionPerformed
        // TODO add your handling code here:
        this.removeFilter((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnBoLocPhieuNhapCTActionPerformed

    private void btnDanhMuc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhMuc1ActionPerformed
        // TODO add your handling code here:
        new DanhMuc().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDanhMuc1ActionPerformed

    private void btnDatMon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatMon1ActionPerformed
        // TODO add your handling code here:
        this.openThemMoi(0);
    }//GEN-LAST:event_btnDatMon1ActionPerformed

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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (!Auth.isLogin()) {
                    new Login().setVisible(true);
                    MsgBox.alert(null, "Vui lòng đăng nhập!");
                } else {
                    new ThongKe().setVisible(true);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateNgayBatDauDen;
    private com.toedter.calendar.JDateChooser DateNgayBatDauTu;
    private com.toedter.calendar.JDateChooser DateNgayKetThucDen;
    private com.toedter.calendar.JDateChooser DateNgayKetThucTu;
    private com.toedter.calendar.JDateChooser DateNgayLapDen;
    private com.toedter.calendar.JDateChooser DateNgayLapTu;
    private com.toedter.calendar.JDateChooser DateNgayNhapDen;
    private com.toedter.calendar.JDateChooser DateNgayNhapTu;
    private com.toedter.calendar.JDateChooser DateNgaySinhDen;
    private com.toedter.calendar.JDateChooser DateNgaySinhTu;
    private com.toedter.calendar.JDateChooser DateNgayTrucDen;
    private com.toedter.calendar.JDateChooser DateNgayTrucTu;
    private javax.swing.JButton btnBoLocCaTruc;
    private javax.swing.JButton btnBoLocHoaDon;
    private javax.swing.JButton btnBoLocKhachHang;
    private javax.swing.JButton btnBoLocKhuyenMai;
    private javax.swing.JButton btnBoLocNguyenLieu;
    private javax.swing.JButton btnBoLocNhanVien;
    private javax.swing.JButton btnBoLocPhieuNhap;
    private javax.swing.JButton btnBoLocPhieuNhapCT;
    private javax.swing.JButton btnChiTiet;
    private javax.swing.JButton btnDanhMuc1;
    private javax.swing.JButton btnDatMon1;
    private javax.swing.JButton btnExit1;
    private javax.swing.ButtonGroup btnGender;
    private javax.swing.JButton btnHuongDan1;
    private javax.swing.JButton btnLocCaTruc;
    private javax.swing.JButton btnLocKhachHang;
    private javax.swing.JButton btnLocKhuyenMai;
    private javax.swing.JButton btnLocLuongNhanVien;
    private javax.swing.JButton btnLocNgayNhapPhieuNhap;
    private javax.swing.JButton btnLocNguyenLieu;
    private javax.swing.JButton btnLocTongTienHD;
    private javax.swing.JButton btnNgayLapHD;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXuatFile;
    private javax.swing.JComboBox<String> cboChucVu;
    private javax.swing.JComboBox<String> cboHinhThucTT;
    private javax.swing.JComboBox<String> cboLoaiNguyenLieu;
    private javax.swing.JComboBox<String> cboNguoiLapHoaDon;
    private javax.swing.JComboBox<String> cboNguoiThanhToanHD;
    private javax.swing.JComboBox<String> cboNguyenLieu;
    private javax.swing.JComboBox<String> cboPhieuNhap;
    private javax.swing.JComboBox<String> cboTenNguoiNhap;
    private javax.swing.JComboBox<String> cboTenNhanVien;
    private javax.swing.JComboBox<String> cboThongKe;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblTenNhanVien;
    private javax.swing.JLabel lblTenNhanVien1;
    private javax.swing.JLabel lblTong;
    private javax.swing.JPanel pnlCaTruc;
    private javax.swing.JPanel pnlFindByPhieuNhap;
    private javax.swing.JPanel pnlHoaDon;
    private javax.swing.JPanel pnlKhachHang;
    private javax.swing.JPanel pnlKhuyenMai;
    private javax.swing.JPanel pnlNguyenLieu;
    private javax.swing.JPanel pnlNhanVien;
    private javax.swing.JPanel pnlPhieuNhap;
    private javax.swing.JPanel pnlPhieuNhapCT;
    private javax.swing.JPanel pnlTimkiem;
    private javax.swing.JPanel pnlTimkiem1;
    private javax.swing.JPanel pnlTimkiem10;
    private javax.swing.JPanel pnlTimkiem11;
    private javax.swing.JPanel pnlTimkiem12;
    private javax.swing.JPanel pnlTimkiem2;
    private javax.swing.JPanel pnlTimkiem5;
    private javax.swing.JPanel pnlTimkiem6;
    private javax.swing.JPanel pnlTimkiem7;
    private javax.swing.JPanel pnlTimkiem8;
    private javax.swing.JPanel pnlTimkiem9;
    private javax.swing.JPanel pnlTool;
    private javax.swing.JRadioButton rdoKhachHangNam;
    private javax.swing.JRadioButton rdoKhachHangNu;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JSpinner spnGTKMDen;
    private javax.swing.JSpinner spnGTKMTu;
    private javax.swing.JSpinner spnHoaDonDen;
    private javax.swing.JSpinner spnHoaDonTu;
    private javax.swing.JSpinner spnLuongDen;
    private javax.swing.JSpinner spnLuongTu;
    private javax.swing.JSpinner spnSoLuongDen;
    private javax.swing.JSpinner spnSoLuongTu;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblCaTruc;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTable tblKhuyenMai;
    private javax.swing.JTable tblNguyenLieu;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTable tblPhieuNhap;
    private javax.swing.JTable tblPhieuNhapCT;
    private javax.swing.JToolBar tlb;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMin;
    private javax.swing.JTextField txtTong;
    private javax.swing.JTextField txtTongSoLuong;
    // End of variables declaration//GEN-END:variables

    // Thieu thong ke mon an & cong thuc
    private void init() {
        this.phanQuyen();
    }

    private void phanQuyen() {

        if (!Auth.isManager()) {
            for (int i = 0; i < 2; i++) {
                tabs.remove(0);
            }
            if (Auth.user.getMaCV().toString().equals("CV002")) {
                for (int i = 0; i < 3; i++) {
                    tabs.remove(3);
                }
            } else if (Auth.user.getMaCV().toString().equals("CV003")) {
                for (int i = 0; i < 3; i++) {
                    tabs.remove(0);
                }
            }
        }
        if (QLThongKe.indexTabThongKe > 0) {
            tabs.setSelectedIndex(QLThongKe.indexTabThongKe);
        }
        showAllByTab((JComponent) tabs.getSelectedComponent());
    }

    private List<String> listForComboBox(List<Object[]> listObject, int col) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < listObject.size(); i++) {
            Object[] row = listObject.get(i);

            // kiem tra trung lap
            int j = 0;
            if (list != null) {
                for (; j < list.size(); j++) {
                    if (String.valueOf(row[col]).equals(list.get(j))) {
                        break;
                    }
                }
                if (j == list.size() && row[col] != null) {
                    list.add(String.valueOf(row[col]));
                }
            } else {
                list.add(String.valueOf(row[col]));
            }
        }
        return list;
    }

    private void showAllByTab(JComponent component) {

        if (pnlNhanVien.equals(component)) {
            QLThongKe.setColsForNhanVien(tblNhanVien);
//            QLNhanVien.fillAllToTable(tblNhanVien);
            XImage.setIcon("user-3-128.png", lblHinh);
            QLNhanVien.fillAllToCbo(cboThongKe);

            QLChucVu.fillToCbo(cboChucVu);

        } else if (pnlCaTruc.equals(component)) {
            QLThongKe.setColsForCaTruc(tblCaTruc);
//            QLThongKe.fillToCaTrucTblById(tblCaTruc);
            XImage.setIcon("calendar-128.png", lblHinh);
            QLCaTruc.fillAllToCbo(cboThongKe);

            QLThongKe.fillAllToCbo(cboTenNhanVien, listForComboBox(QLThongKe.listCaTruc, 1));

        } else if (pnlKhachHang.equals(component)) {
            QLThongKe.setColsForKhachHang(tblKhachHang);
//            QLKhachHang.fillAllToTable(tblKhachHang);
            XImage.setIcon("guest-128.png", lblHinh);
            QLKhachHang.fillAllToCbo(cboThongKe);

        } else if (pnlHoaDon.equals(component)) {
            QLThongKe.setColsForHoaDon(tblHoaDon);
//            QLThongKe.fillToBillsTblById(tblHoaDon);
            XImage.setIcon("bill-128.png", lblHinh);
            QLHoaDon.fillAllToCbo(cboThongKe);

            QLThongKe.fillAllToCbo(cboNguoiLapHoaDon, listForComboBox(QLThongKe.listHoaDon, 2));
            QLThongKe.fillAllToCbo(cboNguoiThanhToanHD, listForComboBox(QLThongKe.listHoaDon, 3));
            QLHoaDon.fillPaymentMethodToCbo(cboHinhThucTT);

        } else if (pnlKhuyenMai.equals(component)) {
            QLThongKe.setColsForKhuyenMai(tblKhuyenMai);
//            QLKhuyenMai.fillAllToTable(tblKhuyenMai);
            XImage.setIcon("sale-128.png", lblHinh);
            QLKhuyenMai.fillAllToCbo(cboThongKe);

        } else if (pnlNguyenLieu.equals(component)) {
            QLThongKe.setColsForNguyenLieu(tblNguyenLieu);
//            QLThongKe.fillToNguyenLieuTblById(tblNguyenLieu);
            XImage.setIcon("home-4-128.png", lblHinh);
            QLNguyenLieu.fillAllToCbo(cboThongKe);

            QLThongKe.fillAllToCbo(cboLoaiNguyenLieu, listForComboBox(QLThongKe.listNguyenLieu, 1));

        } else if (pnlPhieuNhap.equals(component)) {
            QLThongKe.setColsForPhieuNhap(tblPhieuNhap);
//            QLThongKe.fillToPhieuNhapTblById(tblPhieuNhap);
            XImage.setIcon("add-list-128.png", lblHinh);
            QLPhieuNhap.fillAllToCbo(cboThongKe);
            QLLoaiNgLieu.fillToCbo(cboLoaiNguyenLieu);

            QLThongKe.fillAllToCbo(cboTenNguoiNhap, listForComboBox(QLThongKe.listPhieuNhap, 2));

        } else if (pnlPhieuNhapCT.equals(component)) {
            QLThongKe.setColsForPhieuNhapCT(tblPhieuNhapCT);
//            QLPhieuNhapCT.fillTable(tblPhieuNhapCT);
            XImage.setIcon("list-rich-128.png", lblHinh);
            QLPhieuNhapCT.fillAllToCbo(cboThongKe);

            QLPhieuNhap.fillAllToCbo(cboPhieuNhap);
            QLNguyenLieu.fillAllToCbo(cboNguyenLieu);
        }
        this.setModelAllSpinner(component);
        removeFilter(component);
    }

    private void thongKe(JTable tbl, int col) {
        updateStatus(txtTongSoLuong, false, Color.white);
        JComponent component = (JComponent) tabs.getSelectedComponent();
        int tongSL = tbl.getRowCount();
        int tong = 0;
        int max = 0;
        int min = 0;

        if (pnlNhanVien.equals(component)) {
            String gt = String.valueOf(tbl.getValueAt(0, col));
            max = Integer.parseInt(gt);
            min = Integer.parseInt(gt);
            for (int i = 0; i < tongSL; i++) {
                int luong = Integer.parseInt(String.valueOf(tbl.getValueAt(i, col)));
                tong = tong + luong;
                if (luong > max) {
                    max = luong;
                } else if (luong < min) {
                    min = luong;
                }
            }

            lblTong.setText("Tổng lương");
            lblMax.setText("Lương cao nhất");
            lblMin.setText("Tổng thấp nhất");
            updateStatus(txtTong, false, Color.white);
            updateStatus(txtMax, false, Color.white);
            updateStatus(txtMin, false, Color.white);

        } else if (pnlCaTruc.isShowing()) {
            updateStatus(txtTong, false, Color.GRAY);
            updateStatus(txtMax, false, Color.GRAY);
            updateStatus(txtMin, false, Color.GRAY);

        } else if (pnlKhachHang.isShowing()) {
            updateStatus(txtTong, false, Color.GRAY);
            updateStatus(txtMax, false, Color.GRAY);
            updateStatus(txtMin, false, Color.GRAY);

        } else if (pnlHoaDon.isShowing()) {
            String gt = String.valueOf(tbl.getValueAt(0, col));
            max = Integer.parseInt(gt);
            min = Integer.parseInt(gt);
            for (int i = 0; i < tongSL; i++) {
                String gti = String.valueOf(tbl.getValueAt(i, col));
                int hoaDon = Integer.parseInt(gti);
                tong = tong + hoaDon;
                if (hoaDon > max) {
                    max = hoaDon;
                } else if (hoaDon < min) {
                    min = hoaDon;
                }
            }
            lblTong.setText("Tổng hóa đơn");
            lblMax.setText("Hóa đơn cao nhất");
            lblMin.setText("Hóa đơn thấp nhất");
            updateStatus(txtTong, false, Color.white);
            updateStatus(txtMax, false, Color.white);
            updateStatus(txtMin, false, Color.white);

        } else if (pnlKhuyenMai.isShowing()) {
            updateStatus(txtTong, false, Color.GRAY);
            updateStatus(txtMax, false, Color.GRAY);
            updateStatus(txtMin, false, Color.GRAY);

        } else if (pnlNguyenLieu.isShowing()) {
            String gt = String.valueOf(tbl.getValueAt(0, col));
            max = Integer.parseInt(gt.substring(0, gt.length() - 2));
            min = Integer.parseInt(gt.substring(0, gt.length() - 2));
            for (int i = 0; i < tongSL; i++) {
                String gti = String.valueOf(tbl.getValueAt(i, col));
                int nguyenLieu = Integer.parseInt(gt.substring(0, gt.length() - 2));
                tong = tong + nguyenLieu;
                if (nguyenLieu > max) {
                    max = nguyenLieu;
                } else if (nguyenLieu < min) {
                    min = nguyenLieu;
                }
            }
            lblTong.setText("Tổng nguyên liệu");
            lblMax.setText("Nguyên liệu cao nhất");
            lblMin.setText("Nguyên liệu thấp nhất");
            updateStatus(txtTong, false, Color.white);
            updateStatus(txtMax, false, Color.white);
            updateStatus(txtMin, false, Color.white);

        } else if (pnlPhieuNhap.isShowing()) {
            max = Integer.parseInt(String.valueOf(tbl.getValueAt(0, col)));
            min = Integer.parseInt(String.valueOf(tbl.getValueAt(0, col)));
            for (int i = 0; i < tongSL; i++) {
                int phieuNhap = Integer.parseInt(String.valueOf(tbl.getValueAt(i, col)));
                tong = tong + phieuNhap;
                if (phieuNhap > max) {
                    max = phieuNhap;
                } else if (phieuNhap < min) {
                    min = phieuNhap;
                }
            }
            lblTong.setText("Tổng phiếu nhập");
            lblMax.setText("Phiếu nhập cao nhất");
            lblMin.setText("Phiếu nhập thấp nhất");
            updateStatus(txtTong, false, Color.white);
            updateStatus(txtMax, false, Color.white);
            updateStatus(txtMin, false, Color.white);

        } else if (pnlPhieuNhapCT.isShowing()) {
            max = (int) Float.parseFloat(String.valueOf(tbl.getValueAt(0, col)));
            min = (int) Float.parseFloat(String.valueOf(tbl.getValueAt(0, col)));
            for (int i = 0; i < tongSL; i++) {
                int phieuNhapCT = (int) Float.parseFloat(String.valueOf(tbl.getValueAt(i, col)));
                tong = tong + phieuNhapCT;
                if (phieuNhapCT > max) {
                    max = phieuNhapCT;
                } else if (phieuNhapCT < min) {
                    min = phieuNhapCT;
                }
            }
            lblTong.setText("Tổng phiếu nhập CT");
            lblMax.setText("Phiếu nhập CT cao nhất");
            lblMin.setText("Phiếu nhập CT thấp nhất");
            updateStatus(txtTong, false, Color.white);
            updateStatus(txtMax, false, Color.white);
            updateStatus(txtMin, false, Color.white);
        }

        txtTongSoLuong.setText(String.valueOf(tongSL));
        txtTong.setText(String.valueOf(tong));
        txtMax.setText(String.valueOf(max));
        txtMin.setText(String.valueOf(min));
    }

    private void showTableById(JTable tbl, int indexCol, String id, List<Object[]> list) {
        // indexCol : vị trí lấy thông tin để fill
        List<Object[]> listByID = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Object[] row = list.get(i);
            if (String.valueOf(row[indexCol]).equals(id)) {
                listByID.add(row);
            }
        }
        QLThongKe.fillToTbl(tbl, listByID);
    }

    private void updateStatus(JComponent btn, boolean enable, Color color) {
        btn.setEnabled(enable);
        btn.setBackground(color);
    }

    private void cboThongKe_ItemStateChanged() {
        String id = String.valueOf(cboThongKe.getSelectedItem());

        if (pnlNhanVien.isShowing()) {
            List<NhanVien> listNhanVien = new ArrayList<NhanVien>();
            NhanVien nv = QLNhanVien.dao.selectByName(id);
            if (nv != null) {
                listNhanVien.add(nv);
            }
            QLNhanVien.fillToTable(tblNhanVien, listNhanVien);

        } else if (pnlCaTruc.isShowing()) {
            this.showTableById(tblCaTruc, 2, id, QLThongKe.listCaTruc);

        } else if (pnlKhachHang.isShowing()) {
            List<KhachHang> listKhachHang = new ArrayList<KhachHang>();
            KhachHang kh = QLKhachHang.dao.selectById(id);
            if (kh != null) {
                listKhachHang.add(kh);
            }
            QLKhachHang.fillToTable(tblKhachHang, listKhachHang);

        } else if (pnlHoaDon.isShowing()) {
            this.showTableById(tblHoaDon, 0, id, QLThongKe.listHoaDon);

        } else if (pnlKhuyenMai.isShowing()) {
            List<KhuyenMai> listKhuyenMai = new ArrayList<KhuyenMai>();
            KhuyenMai kh = QLKhuyenMai.dao.selectById(id);
            if (kh != null) {
                listKhuyenMai.add(kh);
            }
            QLKhuyenMai.fillToTable(tblKhuyenMai, listKhuyenMai);

        } else if (pnlNguyenLieu.isShowing()) {
            this.showTableById(tblNguyenLieu, 2, id, QLThongKe.listNguyenLieu);

        } else if (pnlPhieuNhap.isShowing()) {
            this.showTableById(tblPhieuNhap, 0, id, QLThongKe.listPhieuNhap);

        } else if (pnlPhieuNhapCT.isShowing()) {
            List<PhieuNhapCT> listPhieuNhapCT = new ArrayList<PhieuNhapCT>();
            PhieuNhapCT pnct = QLPhieuNhapCT.dao.selectById(id);

            if (pnct != null) {
                listPhieuNhapCT.add(pnct);
                System.out.println(pnct.getSoLuong());
            }
            QLPhieuNhapCT.fillToTable(tblPhieuNhapCT, listPhieuNhapCT);
        }
        filterData((JComponent) tabs.getSelectedComponent());

    }

    private void btnThemActionPerformed() {

        if (pnlNhanVien.isShowing()) {
            this.openThemMoi(0);
        } else if (pnlCaTruc.isShowing()) {
            this.openThemMoi(1);
        } else if (pnlKhachHang.isShowing() || pnlHoaDon.isShowing()) {
            if (!Auth.user.getMaCV().toString().equals("CV003")) {
                new DatMon().setVisible(true);
                this.dispose();
            }
        } else if (pnlKhuyenMai.isShowing()) {
            if (!Auth.isManager()) {
                this.openThemMoi(1);
            } else {
                this.openThemMoi(4);
            }
        } else if (pnlNguyenLieu.isShowing()) {
            if (!Auth.isManager()) {
                this.openThemMoi(4);
            } else {
                this.openThemMoi(6);
            }
        } else if (pnlPhieuNhap.isShowing()) {
            if (!Auth.isManager()) {
                this.openThemMoi(3);
            } else {
                this.openThemMoi(5);
            }
        } else if (pnlPhieuNhapCT.isShowing()) {
            if (!Auth.isManager()) {
                this.openThemMoi(3);
            } else {
                this.openThemMoi(5);
            }
        }
    }

    private void btnChiTietActionPerformed() {
        if (pnlNhanVien.isShowing()) {
            String maNV = String.valueOf(tblNhanVien.getValueAt(QLThongKe.getIndex(tblNhanVien), 0));
            Entity.nhanVien = QLNhanVien.dao.selectById(maNV);
            this.openThemMoi(0);

        } else if (pnlCaTruc.isShowing()) {
            String tenNhanVien = String.valueOf(tblCaTruc.getValueAt(QLThongKe.getIndex(tblCaTruc), 1));
            String maNV = QLNhanVien.dao.selectByName(tenNhanVien).getMaNV();
            String ngayTruc = String.valueOf(tblCaTruc.getValueAt(QLThongKe.getIndex(tblCaTruc), 0));
            Entity.ctCaTruc = QLChiTietCaTruc.dao.selectById(maNV, ngayTruc);
            this.openThemMoi(1);

        } else if (pnlKhachHang.isShowing()) {
            // Show ben DatMon
            Entity.hoaDon = null;
            String soDT = String.valueOf(tblKhachHang.getValueAt(QLThongKe.getIndex(tblKhachHang), 3));
            Entity.khachHang = QLKhachHang.dao.selectById(soDT);
            if (!Auth.user.getMaCV().toString().equals("CV003")) {
                new DatMon().setVisible(true);
                this.dispose();
            }
        } else if (pnlHoaDon.isShowing()) {
            // Show ben DatMon
            String maHD = String.valueOf(tblHoaDon.getValueAt(QLThongKe.getIndex(tblHoaDon), 0));
            Entity.hoaDon = QLHoaDon.dao.selectById(maHD);

            if (!Auth.user.getMaCV().toString().equals("CV003")) {
                new DatMon().setVisible(true);
                this.dispose();
            }

        } else if (pnlKhuyenMai.isShowing()) {
            String maKM = String.valueOf(tblKhuyenMai.getValueAt(QLThongKe.getIndex(tblKhuyenMai), 0));
            Entity.khuyenMai = QLKhuyenMai.dao.selectById(maKM);
            if (!Auth.isManager()) {
                this.openThemMoi(1);
            } else {
                this.openThemMoi(4);
            }
        } else if (pnlNguyenLieu.isShowing()) {
            String maNL = String.valueOf(tblNguyenLieu.getValueAt(QLThongKe.getIndex(tblNguyenLieu), 0));
            Entity.nguyenLieu = QLNguyenLieu.dao.selectById(maNL);
            if (!Auth.isManager()) {
                this.openThemMoi(4);
            } else {
                this.openThemMoi(6);
            }
        } else if (pnlPhieuNhap.isShowing()) {
            String maPN = String.valueOf(tblPhieuNhap.getValueAt(QLThongKe.getIndex(tblPhieuNhap), 0));
            Entity.phieuNhap = QLPhieuNhap.dao.selectById(maPN);
            if (!Auth.isManager()) {
                this.openThemMoi(3);
            } else {
                this.openThemMoi(5);
            }
        } else if (pnlPhieuNhapCT.isShowing()) {
            String maPN = String.valueOf(tblPhieuNhapCT.getValueAt(QLThongKe.getIndex(tblPhieuNhapCT), 1));
            Entity.phieuNhap = QLPhieuNhap.dao.selectById(maPN);
            String maPNCT = String.valueOf(tblPhieuNhapCT.getValueAt(QLThongKe.getIndex(tblPhieuNhapCT), 0));
            Entity.phieuNhapCT = QLPhieuNhapCT.dao.selectById(maPNCT);
            if (!Auth.isManager()) {
                this.openThemMoi(3);
            } else {
                this.openThemMoi(5);
            }
        }
    }

    void openThemMoi(int tab) {
        QLThongKe.indexTabThemMoi = tab;
        new ThemMoi().setVisible(true);
        this.dispose();
    }

    private void btnXuatFileActionPerformed() {

        if (pnlNhanVien.isShowing()) {
            DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
            OutputExcel out = new OutputExcel("NhanVien", model);

        } else if (pnlCaTruc.isShowing()) {
            DefaultTableModel model = (DefaultTableModel) tblCaTruc.getModel();
            OutputExcel out = new OutputExcel("CaTruc", model);

        } else if (pnlKhachHang.isShowing()) {
            DefaultTableModel model = (DefaultTableModel) tblKhachHang.getModel();
            OutputExcel out = new OutputExcel("KhachHang", model);
            
        } else if (pnlHoaDon.isShowing()) {
            DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
            OutputExcel out = new OutputExcel("HoaDon", model);

        } else if (pnlKhuyenMai.isShowing()) {
            DefaultTableModel model = (DefaultTableModel) tblKhuyenMai.getModel();
            OutputExcel out = new OutputExcel("KhuyenMai", model);

        } else if (pnlNguyenLieu.isShowing()) {
            DefaultTableModel model = (DefaultTableModel) tblNguyenLieu.getModel();
            OutputExcel out = new OutputExcel("NguyenLieu", model);

        } else if (pnlPhieuNhap.isShowing()) {
            DefaultTableModel model = (DefaultTableModel) tblPhieuNhap.getModel();
            OutputExcel out = new OutputExcel("PhieuNhap", model);
            
        } else if (pnlPhieuNhapCT.isShowing()) {
            DefaultTableModel model = (DefaultTableModel) tblPhieuNhapCT.getModel();
            OutputExcel out = new OutputExcel("PhieuNhapCT", model);

        }
    }

    private void filterData(JComponent component) {
        if (pnlNhanVien.equals(component)) {
            this.thongKe(tblNhanVien, 6);
            updateStatus(btnBoLocNhanVien, true, Color.white);

        } else if (pnlCaTruc.equals(component)) {
            this.thongKe(tblCaTruc, 0);
            updateStatus(btnBoLocCaTruc, true, Color.white);

        } else if (pnlKhachHang.equals(component)) {
            this.thongKe(tblKhachHang, 0);
            updateStatus(btnBoLocKhachHang, true, Color.white);

        } else if (pnlHoaDon.equals(component)) {
            this.thongKe(tblHoaDon, 4);
            updateStatus(btnBoLocHoaDon, true, Color.white);

        } else if (pnlKhuyenMai.equals(component)) {
            this.thongKe(tblKhuyenMai, 0);
            updateStatus(btnBoLocKhuyenMai, true, Color.white);

        } else if (pnlNguyenLieu.equals(component)) {
            this.thongKe(tblNguyenLieu, 4);
            updateStatus(btnBoLocNguyenLieu, true, Color.white);

        } else if (pnlPhieuNhap.equals(component)) {
            this.thongKe(tblPhieuNhap, 3);
            updateStatus(btnBoLocPhieuNhap, true, Color.white);

        } else if (pnlPhieuNhapCT.equals(component)) {
            this.thongKe(tblPhieuNhapCT, 3);
            updateStatus(btnBoLocPhieuNhapCT, true, Color.white);
        }

    }

    private void removeFilter(JComponent component) {
        cboThongKe.setSelectedIndex(0);
        
        if (pnlNhanVien.equals(component)) {
            QLNhanVien.fillAllToTable(tblNhanVien);
            this.thongKe(tblNhanVien, 6);
            updateStatus(btnBoLocNhanVien, false, Color.gray);

            btnGender.clearSelection();
            cboChucVu.setSelectedIndex(0);
            spnLuongDen.setValue(5000000);
            spnLuongTu.setValue(5000000);

        } else if (pnlCaTruc.equals(component)) {
            QLThongKe.fillToCaTrucTblById(tblCaTruc);
            this.thongKe(tblCaTruc, 0);
            updateStatus(btnBoLocCaTruc, false, Color.gray);

            cboTenNhanVien.setSelectedIndex(0);
            DateNgayTrucTu.setCalendar(null);
            DateNgayTrucDen.setCalendar(null);

        } else if (pnlKhachHang.equals(component)) {
            QLKhachHang.fillAllToTable(tblKhachHang);
            this.thongKe(tblKhachHang, 0);
            updateStatus(btnBoLocKhachHang, false, Color.gray);

            btnGender.clearSelection();
            DateNgaySinhTu.setCalendar(null);
            DateNgaySinhDen.setCalendar(null);

        } else if (pnlHoaDon.equals(component)) {
            QLThongKe.fillToBillsTblById(tblHoaDon);
            this.thongKe(tblHoaDon, 4);
            updateStatus(btnBoLocHoaDon, false, Color.gray);

            cboNguoiLapHoaDon.setSelectedIndex(0);
            cboNguoiThanhToanHD.setSelectedIndex(0);
            cboHinhThucTT.setSelectedIndex(0);
            DateNgayLapTu.setCalendar(null);
            DateNgayLapDen.setCalendar(null);
            spnHoaDonDen.setValue(100000);
            spnHoaDonTu.setValue(100000);

        } else if (pnlKhuyenMai.equals(component)) {
            QLKhuyenMai.fillAllToTable(tblKhuyenMai);
            this.thongKe(tblKhuyenMai, 0);
            updateStatus(btnBoLocKhuyenMai, false, Color.gray);

            spnGTKMDen.setValue(-1);
            spnGTKMTu.setValue(-1);
            DateNgayBatDauTu.setCalendar(null);
            DateNgayBatDauDen.setCalendar(null);
            DateNgayKetThucTu.setCalendar(null);
            DateNgayKetThucDen.setCalendar(null);

        } else if (pnlNguyenLieu.equals(component)) {
            QLThongKe.fillToNguyenLieuTblById(tblNguyenLieu);
            this.thongKe(tblNguyenLieu, 4);
            updateStatus(btnBoLocNguyenLieu, false, Color.gray);

            cboLoaiNguyenLieu.setSelectedIndex(0);
            spnSoLuongDen.setValue(-1);
            spnSoLuongTu.setValue(-1);

        } else if (pnlPhieuNhap.equals(component)) {
            QLThongKe.fillToPhieuNhapTblById(tblPhieuNhap);
            this.thongKe(tblPhieuNhap, 3);
            updateStatus(btnBoLocPhieuNhap, false, Color.gray);

            cboTenNguoiNhap.setSelectedIndex(0);
            DateNgayNhapTu.setCalendar(null);
            DateNgayNhapDen.setCalendar(null);

        } else if (pnlPhieuNhapCT.equals(component)) {
            QLPhieuNhapCT.fillAllToTable(tblPhieuNhapCT);
            this.thongKe(tblPhieuNhapCT, 3);
            updateStatus(btnBoLocPhieuNhapCT, false, Color.gray);

            cboPhieuNhap.setSelectedIndex(0);
            cboNguyenLieu.setSelectedIndex(0);
        }
    }

    private List<Object[]> listFilterByDate(JDateChooser DateTu, JDateChooser DateDen, List<Object[]> listObject, int col) {
        List<Object[]> listFilterByDate = new ArrayList<Object[]>();
        Date ngayTu = XDate.datetoDate(DateTu.getDate(), "yyyy-MM-dd");
        Date ngayDen = XDate.datetoDate(DateDen.getDate(), "yyyy-MM-dd");
        if (ngayTu != null && ngayDen != null) {
            for (int i = 0; i < listObject.size(); i++) {
                Object[] row = listObject.get(i);
                Date ngayLoc = XDate.stringToDate(String.valueOf(row[col]), "yyyy-MM-dd");
                if ((ngayLoc.equals(ngayTu) || ngayLoc.after(ngayTu)) && (ngayLoc.before(ngayDen) || ngayLoc.equals(ngayDen))) {
                    listFilterByDate.add(row);
                }
            }
            return listFilterByDate;
        }
        return null;
    }

    private List<Object[]> listFilterBySpinner(JSpinner spnTu, JSpinner spnDen, List<Object[]> listObject, int col) {
        List<Object[]> listFilterBySpinner = new ArrayList<Object[]>();
        int tu = Integer.parseInt(String.valueOf(spnTu.getValue()));
        int den = Integer.parseInt(String.valueOf(spnDen.getValue()));
        if (tu >= 0 && den >= 0) {
            for (int i = 0; i < listObject.size(); i++) {
                Object[] row = listObject.get(i);
                int spn = Integer.parseInt(String.valueOf(row[col]));
                if (spn >= tu && spn <= den) {
                    listFilterBySpinner.add(row);
                }
            }
            return listFilterBySpinner;
        }
        return null;
    }

    private void setModelAllSpinner(JComponent component) {
        if (pnlNhanVien.equals(component)) {
            int[] values = {5000000, 5000000, 50000000, 1000000};
            QLThongKe.setModelSpinner(spnLuongTu, spnLuongDen, values);

        } else if (pnlHoaDon.equals(component)) {
            int[] values = {100000, 100000, 100000000, 100000};
            QLThongKe.setModelSpinner(spnHoaDonTu, spnHoaDonDen, values);

        } else if (pnlKhuyenMai.equals(component)) {
            int[] values = {-1, -1, 100, 1};
            QLThongKe.setModelSpinner(spnGTKMTu, spnGTKMDen, values);

        } else if (pnlNguyenLieu.equals(component)) {
            int[] values = {-1, -1, 1000, 1};
            QLThongKe.setModelSpinner(spnSoLuongTu, spnSoLuongDen, values);
        }
    }

    /* tabNhanVien - GioiTinh */
    private void rdoGenderNhanVienItemStateChanged() {
//        btnGender.clearSelection();
        cboChucVu.setSelectedIndex(0);
        spnLuongDen.setValue(5000000);
        spnLuongTu.setValue(5000000);
        if (rdoNam.isSelected()) {
            QLNhanVien.fillToTableByGioiTinh(tblNhanVien, "Nam");
        } else if (rdoNu.isSelected()) {
            QLNhanVien.fillToTableByGioiTinh(tblNhanVien, "Nữ");
        } else {
            QLNhanVien.fillAllToTable(tblNhanVien);
        }
        filterData((JComponent) tabs.getSelectedComponent());
    }

    /* tabNhanVien - ChucVu */
    private void cboChucVuItemStateChanged() {
//        cboChucVu.setSelectedIndex(0);
        btnGender.clearSelection();
        spnLuongDen.setValue(5000000);
        spnLuongTu.setValue(5000000);
        ChucVu chucVu = QLChucVu.dao.selectByName(String.valueOf(cboChucVu.getSelectedItem()));
        if (chucVu != null) {
            QLNhanVien.fillToTableByChucVu(tblNhanVien, chucVu.getMaCV());
        }
        filterData((JComponent) tabs.getSelectedComponent());
    }

    /* tabNhanVien - Luong */
    private void btnLocLuongNhanVienActionPerformed() {
//        spnLuongDen.setValue(5000000);
//        spnLuongTu.setValue(5000000);
        btnGender.clearSelection();
        cboChucVu.setSelectedIndex(0);
        QLNhanVien.fillAllToTable(tblNhanVien);
        List<NhanVien> listNV = new ArrayList<NhanVien>();
        int luongTu = Integer.parseInt(String.valueOf(spnLuongTu.getValue()));
        int luongDen = Integer.parseInt(String.valueOf(spnLuongDen.getValue()));
        if (luongTu >= 5000000 && luongDen > 5000000) {
            for (int i = 0; i < tblNhanVien.getRowCount(); i++) {
                int luong = Integer.parseInt(String.valueOf(tblNhanVien.getValueAt(i, 6)));
                if (luong >= luongTu && luong <= luongDen) {
                    String maNV = String.valueOf(tblNhanVien.getValueAt(i, 0));
                    NhanVien nv = QLNhanVien.dao.selectById(maNV);
                    listNV.add(nv);
                }
            }
            QLNhanVien.fillToTable(tblNhanVien, listNV);
            filterData((JComponent) tabs.getSelectedComponent());
        }
    }

    /* tabCaTruc - TenNhanVien */
    private void cboTenNhanVienItemStateChanged() {
//        cboTenNhanVien.setSelectedIndex(0);
        DateNgayTrucTu.setCalendar(null);
        DateNgayTrucDen.setCalendar(null);
        List<Object[]> listCaTrucByNhanVien = new ArrayList<Object[]>();
        for (int i = 0; i < QLThongKe.listCaTruc.size(); i++) {
            Object[] row = QLThongKe.listCaTruc.get(i);
            if (row[1].equals(cboTenNhanVien.getSelectedItem())) {
                listCaTrucByNhanVien.add(row);
            }
        }
        QLThongKe.fillToTbl(tblCaTruc, listCaTrucByNhanVien);
        filterData((JComponent) tabs.getSelectedComponent());
    }

    /* tabCaTruc - DateNgayTrucTu */
    private void btnLocCaTrucActionPerformed() {
        cboTenNhanVien.setSelectedIndex(0);
//        DateNgayTrucTu.setCalendar(null);
//        DateNgayTrucDen.setCalendar(null);
        QLThongKe.fillToTbl(tblCaTruc, listFilterByDate(DateNgayTrucTu, DateNgayTrucDen, QLThongKe.listCaTruc, 0));
        filterData((JComponent) tabs.getSelectedComponent());
    }

    /* tabKhachHang - GioiTinh */
    private void rdoGenderKhachHangItemStateChanged() {
        btnGender.clearSelection();
//        DateNgaySinhTu.setCalendar(null);
//        DateNgaySinhDen.setCalendar(null);
        if (rdoKhachHangNam.isSelected()) {
            QLKhachHang.fillToTableByGioiTinh(tblKhachHang, "Nam");
        } else if (rdoKhachHangNu.isSelected()) {
            QLKhachHang.fillToTableByGioiTinh(tblKhachHang, "Nữ");
        } else {
            QLKhachHang.fillAllToTable(tblKhachHang);
        }
        filterData((JComponent) tabs.getSelectedComponent());
    }

    /* tabKhachHang - NgaySinh */
    private void btnLocKhachHangActionPerformed() {
        btnGender.clearSelection();
//            DateNgaySinhTu.setCalendar(null);
//            DateNgaySinhDen.setCalendar(null);
        List<KhachHang> listKhachHang = QLKhachHang.dao.selectAll();
        List<KhachHang> listKhachHangByNgaySinh = new ArrayList<KhachHang>();
        Date ngayTu = DateNgaySinhTu.getDate();
        Date ngayDen = DateNgaySinhDen.getDate();

        if (ngayTu != null && ngayDen != null) {
            for (KhachHang kh : listKhachHang) {
                Date ngaySinh = (Date) kh.getNgaySinh();
                if ((ngaySinh.equals(ngayTu) || ngaySinh.after(ngayTu)) && (ngaySinh.before(ngayDen) || ngaySinh.equals(ngayDen))) {
                    listKhachHangByNgaySinh.add(kh);
                }
            }
            QLKhachHang.fillToTable(tblKhachHang, listKhachHangByNgaySinh);
            filterData((JComponent) tabs.getSelectedComponent());
        }
    }

    /* tabHoaDon - NguoiLapHoaDon */
    private void cboNguoiLapHoaDonItemStateChanged() {
//        cboNguoiLapHoaDon.setSelectedIndex(0);
        cboNguoiThanhToanHD.setSelectedIndex(0);
        cboHinhThucTT.setSelectedIndex(0);
        DateNgayLapTu.setCalendar(null);
        DateNgayLapDen.setCalendar(null);
        spnHoaDonDen.setValue(100000);
        spnHoaDonTu.setValue(100000);
        String id = String.valueOf(cboNguoiLapHoaDon.getSelectedItem());
        showTableById(tblHoaDon, 2, id, QLThongKe.listHoaDon);
        filterData((JComponent) tabs.getSelectedComponent());
    }

    /* tabHoaDon - NguoiThanhToanHD */
    private void cboNguoiThanhToanHDItemStateChanged() {
        cboNguoiLapHoaDon.setSelectedIndex(0);
//        cboNguoiThanhToanHD.setSelectedIndex(0);
        cboHinhThucTT.setSelectedIndex(0);
        DateNgayLapTu.setCalendar(null);
        DateNgayLapDen.setCalendar(null);
        spnHoaDonDen.setValue(100000);
        spnHoaDonTu.setValue(100000);
        String id = String.valueOf(cboNguoiThanhToanHD.getSelectedItem());
        showTableById(tblHoaDon, 3, id, QLThongKe.listHoaDon);
        filterData((JComponent) tabs.getSelectedComponent());
    }

    /* tabHoaDon - HinhThucTT */
    private void cboHinhThucTTItemStateChanged() {
        cboNguoiLapHoaDon.setSelectedIndex(0);
        cboNguoiThanhToanHD.setSelectedIndex(0);
//        cboHinhThucTT.setSelectedIndex(0);
        DateNgayLapTu.setCalendar(null);
        DateNgayLapDen.setCalendar(null);
        spnHoaDonDen.setValue(100000);
        spnHoaDonTu.setValue(100000);
        String id = String.valueOf(cboHinhThucTT.getSelectedItem());
        showTableById(tblHoaDon, 5, id, QLThongKe.listHoaDon);
        filterData((JComponent) tabs.getSelectedComponent());
    }

    /* tabHoaDon - NgayLapHD */
    private void btnNgayLapHDActionPerformed() {
        cboNguoiLapHoaDon.setSelectedIndex(0);
        cboNguoiThanhToanHD.setSelectedIndex(0);
        cboHinhThucTT.setSelectedIndex(0);
//        DateNgayLapTu.setCalendar(null);
//        DateNgayLapDen.setCalendar(null);
        spnHoaDonDen.setValue(100000);
        spnHoaDonTu.setValue(100000);
        QLThongKe.fillToTbl(tblHoaDon, listFilterByDate(DateNgayLapTu, DateNgayLapDen, QLThongKe.listHoaDon, 1));
        filterData((JComponent) tabs.getSelectedComponent());
    }

    /* tabHoaDon - TongTienHD */
    private void btnLocTongTienHDActionPerformed() {
        cboNguoiLapHoaDon.setSelectedIndex(0);
        cboNguoiThanhToanHD.setSelectedIndex(0);
        cboHinhThucTT.setSelectedIndex(0);
        DateNgayLapTu.setCalendar(null);
        DateNgayLapDen.setCalendar(null);
//        spnHoaDonDen.setValue(100000);
//        spnHoaDonTu.setValue(100000);
        QLThongKe.fillToTbl(tblHoaDon, this.listFilterBySpinner(spnHoaDonTu, spnHoaDonDen, QLThongKe.listHoaDon, 4));
        filterData((JComponent) tabs.getSelectedComponent());
    }

    /* tabKhuyenMai - GiaTriKhuyenMai */
    private void locGiaTriKhuyenMaiActionPerformed() {
//        spnGTKMDen.setValue(-1);
//        spnGTKMTu.setValue(-1);
        DateNgayBatDauTu.setCalendar(null);
        DateNgayBatDauDen.setCalendar(null);
        DateNgayKetThucTu.setCalendar(null);
        DateNgayKetThucDen.setCalendar(null);
        QLKhuyenMai.fillAllToTable(tblKhuyenMai);
        List<KhuyenMai> listKhuyenMai = new ArrayList<KhuyenMai>();
        int tuGiaTriKM = Integer.parseInt(String.valueOf(spnLuongTu.getValue()));
        int denGiaTriKM = Integer.parseInt(String.valueOf(spnLuongDen.getValue()));

        if (tuGiaTriKM >= 0 && denGiaTriKM >= 0) {
            for (int i = 0; i < tblKhuyenMai.getRowCount(); i++) {
                int giaTriKM = Integer.parseInt(String.valueOf(tblKhuyenMai.getValueAt(i, 4)));
                if (giaTriKM >= tuGiaTriKM && giaTriKM <= denGiaTriKM) {
                    String maKM = String.valueOf(tblKhuyenMai.getValueAt(i, 0));
                    KhuyenMai km = QLKhuyenMai.dao.selectById(maKM);
                    listKhuyenMai.add(km);
                }
            }

            filterData((JComponent) tabs.getSelectedComponent());
        }
        QLKhuyenMai.fillToTable(tblKhuyenMai, listKhuyenMai);
    }

    /* tabKhuyenMai - NgayBatDauKhuyenMai */
    private void locNgayBatDauKhuyenMaiActionPerformed() {
        spnGTKMDen.setValue(-1);
        spnGTKMTu.setValue(-1);
//        DateNgayBatDauTu.setCalendar(null);
//        DateNgayBatDauDen.setCalendar(null);
        DateNgayKetThucTu.setCalendar(null);
        DateNgayKetThucDen.setCalendar(null);
        List<KhuyenMai> listKhuyenMai = QLKhuyenMai.dao.selectAll();
        List<KhuyenMai> listKhuyenMaiByNgayBatDau = new ArrayList<KhuyenMai>();
        Date ngayTu = DateNgayBatDauTu.getDate();
        Date ngayDen = DateNgayBatDauDen.getDate();

        if (ngayTu != null && ngayDen != null) {
            for (KhuyenMai km : listKhuyenMai) {
                Date ngayBatDau = (Date) km.getNgayBatDau();
                if ((ngayBatDau.equals(ngayTu) || ngayBatDau.after(ngayTu)) && (ngayBatDau.before(ngayDen) || ngayBatDau.equals(ngayDen))) {
                    listKhuyenMaiByNgayBatDau.add(km);
                }
            }
            QLKhuyenMai.fillToTable(tblKhuyenMai, listKhuyenMaiByNgayBatDau);
            filterData((JComponent) tabs.getSelectedComponent());
        }
    }

    /* tabKhuyenMai - NgayKetThucKhuyenMai */
    private void locNgayKetThucKhuyenMaiActionPerformed() {
        spnGTKMDen.setValue(-1);
        spnGTKMTu.setValue(-1);
        DateNgayBatDauTu.setCalendar(null);
        DateNgayBatDauDen.setCalendar(null);
//        DateNgayKetThucTu.setCalendar(null);
//        DateNgayKetThucDen.setCalendar(null);
        List<KhuyenMai> listKhuyenMai = QLKhuyenMai.dao.selectAll();
        List<KhuyenMai> listKhuyenMaiByNgayKetThuc = new ArrayList<KhuyenMai>();
        Date ngayTu = DateNgayKetThucTu.getDate();
        Date ngayDen = DateNgayKetThucDen.getDate();
        if (ngayTu != null && ngayDen != null) {
            for (KhuyenMai km : listKhuyenMai) {
                Date ngayKetThuc = (Date) km.getNgayKetThuc();
                if ((ngayKetThuc.equals(ngayTu) || ngayKetThuc.after(ngayTu)) && (ngayKetThuc.before(ngayDen) || ngayKetThuc.equals(ngayDen))) {
                    listKhuyenMaiByNgayKetThuc.add(km);
                }
            }
            QLKhuyenMai.fillToTable(tblKhuyenMai, listKhuyenMaiByNgayKetThuc);
            filterData((JComponent) tabs.getSelectedComponent());
        }
    }

    /* tabNguyenLieu - LoaiNguyenLieu */
    private void cboLoaiNguyenLieuItemStateChanged() {
//        cboLoaiNguyenLieu.setSelectedIndex(0);
        spnSoLuongDen.setValue(-1);
        spnSoLuongTu.setValue(-1);
        String id = String.valueOf(cboLoaiNguyenLieu.getSelectedItem());
        showTableById(tblNguyenLieu, 1, id, QLThongKe.listNguyenLieu);
        filterData((JComponent) tabs.getSelectedComponent());
    }

    /* tabNguyenLieu - SoLuongNguyenLieu */
    private void btnLocNguyenLieuActionPerformed() {
        cboLoaiNguyenLieu.setSelectedIndex(0);
//        spnSoLuongDen.setValue(-1);
//        spnSoLuongTu.setValue(-1);
        QLThongKe.fillToTbl(tblNguyenLieu, this.listFilterBySpinner(spnSoLuongTu, spnSoLuongDen, QLThongKe.listNguyenLieu, 4));
        filterData((JComponent) tabs.getSelectedComponent());
    }

    /* tabPhieuNhap - TenNguoiNhap */
    private void cboTenNguoiNhapItemStateChanged() {
//        cboTenNguoiNhap.setSelectedIndex(0);
        DateNgayNhapTu.setCalendar(null);
        DateNgayNhapDen.setCalendar(null);
        String id = String.valueOf(cboTenNguoiNhap.getSelectedItem());
        showTableById(tblPhieuNhap, 2, id, QLThongKe.listPhieuNhap);
        filterData((JComponent) tabs.getSelectedComponent());
    }

    /* tabPhieuNhap - NgayNhapPhieuNhap */
    private void btnLocNgayNhapPhieuNhapActionPerformed() {
        cboTenNguoiNhap.setSelectedIndex(0);
//            DateNgayNhapTu.setCalendar(null);
//            DateNgayNhapDen.setCalendar(null);
        QLThongKe.fillToTbl(tblPhieuNhap, listFilterByDate(DateNgayNhapTu, DateNgayNhapDen, QLThongKe.listPhieuNhap, 1));
        filterData((JComponent) tabs.getSelectedComponent());
    }

    /* tabPhieuNhapCT - PhieuNhap */
    private void cboPhieuNhapItemStateChanged() {
//        cboPhieuNhap.setSelectedIndex(0);
        cboNguyenLieu.setSelectedIndex(0);
        String maPhieuNhap = String.valueOf(cboPhieuNhap.getSelectedItem());
        QLPhieuNhapCT.fillAllToTableByMaPhieuNhap(tblPhieuNhapCT, maPhieuNhap);
        filterData((JComponent) tabs.getSelectedComponent());
    }

    /* tabPhieuNhapCT - NguyenLieu */
    private void cboNguyenLieuItemStateChanged() {
        cboPhieuNhap.setSelectedIndex(0);
//        cboNguyenLieu.setSelectedIndex(0);
        String nguyenLieu = String.valueOf(cboNguyenLieu.getSelectedItem());
        String maNguyenLieu = QLNguyenLieu.dao.selectByName(nguyenLieu).getMaNgLieu();
        QLPhieuNhapCT.fillAllToTableByMaNguyenLieu(tblPhieuNhapCT, maNguyenLieu);
        filterData((JComponent) tabs.getSelectedComponent());
    }
}
