package ui;

import controllers.QLCaTruc;
import controllers.QLChiTietCaTruc;
import controllers.QLChucVu;
import javax.swing.DefaultComboBoxModel;
import utils.XDate;
import utils.XInit;
import controllers.QLCongThuc;
import controllers.QLKhuyenMai;
import controllers.QLKhuyenMaiCT;
import controllers.QLLoaiMon;
import controllers.QLLoaiNgLieu;
import controllers.QLMonAn;
import controllers.QLNguyenLieu;
import controllers.QLNhaCungCap;
import controllers.QLNhanVien;
import controllers.QLPhieuNhap;
import controllers.QLPhieuNhapCT;
import controllers.QLThongKe;
import java.awt.Color;
import java.io.File;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import model.CaTruc;
import model.ChiTietCaTruc;
import model.ChucVu;
import model.NhanVien;
import model.MonAn;
import model.LoaiNgLieu;
import model.NguyenLieu;
import model.PhieuNhap;
import model.PhieuNhapCT;
import model.CongThuc;
import model.KhuyenMai;
import model.KhuyenMaiCT;
import model.LoaiMon;
import utils.Auth;
import utils.CheckInput;
import utils.Entity;
import utils.MsgBox;
import utils.XImage;

public class ThemMoi extends javax.swing.JFrame {

    final String REGEX_MANV = "\\w{2}+\\d{3}";
    final String REGEX_EMAIL = "\\w+@\\w+(\\.\\w{1,}){1,2}";
    final String REGEX_SODT = "0\\d{9}";
    List<NhanVien> listNhanVien = QLNhanVien.dao.selectAll();
    List<MonAn> listMonAn = QLMonAn.dao.selectAll();
    List<KhuyenMai> listKhuyenMai = QLKhuyenMai.dao.selectAll();
    List<PhieuNhap> listPhieuNhap = QLPhieuNhap.dao.selectAll();
    List<NguyenLieu> listNguyenLieu = QLNguyenLieu.dao.selectAll();

    public ThemMoi() {
        initComponents();
        XInit.init(this);
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGender = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        tabs = new javax.swing.JTabbedPane();
        pnlNhanVien = new javax.swing.JPanel();
        pnlFormNhanVien = new javax.swing.JPanel();
        lblMaNV = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        lblHoTen = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        txtSoDT = new javax.swing.JTextField();
        lblSoDT = new javax.swing.JLabel();
        lblChucVu = new javax.swing.JLabel();
        cboChucVu = new javax.swing.JComboBox<>();
        lblLuong = new javax.swing.JLabel();
        txtLuong = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        lblSoDT1 = new javax.swing.JLabel();
        lblSoDT2 = new javax.swing.JLabel();
        lblSoDT3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        lblDiaChi = new javax.swing.JLabel();
        dateNgaySinh = new com.toedter.calendar.JDateChooser();
        pnlCtrlFormNhanVien = new javax.swing.JPanel();
        btnResetNhanVien = new javax.swing.JButton();
        lblHinhNhanVien = new javax.swing.JLabel();
        btnAddNhanVien = new javax.swing.JButton();
        btnUpdateNhanVien = new javax.swing.JButton();
        btnDeleteNhanVien = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnFindNhanVien = new javax.swing.JButton();
        cboFindNhanVien = new javax.swing.JComboBox<>();
        cboFindChucVu = new javax.swing.JComboBox<>();
        btnPreNhanVien = new javax.swing.JButton();
        btnNextNhanVien = new javax.swing.JButton();
        btnFirstNhanVien = new javax.swing.JButton();
        btnLastNhanVien = new javax.swing.JButton();
        lblTitleNV = new javax.swing.JLabel();
        pnlCaTruc = new javax.swing.JPanel();
        pnlFormPhieuNhap2 = new javax.swing.JPanel();
        lblMaCaTruc = new javax.swing.JLabel();
        txtMaCaTruc = new javax.swing.JTextField();
        lblGioBatDau = new javax.swing.JLabel();
        txtGioBatDau = new javax.swing.JTextField();
        lblGioKetThuc = new javax.swing.JLabel();
        txtGioKetCa = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        btnUpdateCaTruc = new javax.swing.JButton();
        btnDeleteCaTruc = new javax.swing.JButton();
        btnAddCaTruc = new javax.swing.JButton();
        btnResetCaTruc = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        btnFindCaTruc = new javax.swing.JButton();
        cboFindCaTruc = new javax.swing.JComboBox<>();
        pnlFormPhieuNhapCT2 = new javax.swing.JPanel();
        lblTenNguyenLieu4 = new javax.swing.JLabel();
        lblNgayTruc = new javax.swing.JLabel();
        pnlCtr_CTCaTruc = new javax.swing.JPanel();
        btnUpdateCTCaTruc = new javax.swing.JButton();
        btnDeleteCTCaTruc = new javax.swing.JButton();
        btnAddCTCaTruc = new javax.swing.JButton();
        btnResetCTCaTruc = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        btnFindChiTietCaTruc = new javax.swing.JButton();
        cboFindNgayTruc = new javax.swing.JComboBox<>();
        cboNhanVienTruc = new javax.swing.JComboBox<>();
        lblNhanVienTruc = new javax.swing.JLabel();
        cboCaTruc = new javax.swing.JComboBox<>();
        dateNgayTruc = new com.toedter.calendar.JDateChooser();
        lblTitleCaTruc = new javax.swing.JLabel();
        pnlMonAn = new javax.swing.JPanel();
        pnlFormMonAn = new javax.swing.JPanel();
        lblMaMon = new javax.swing.JLabel();
        txtMaMon = new javax.swing.JTextField();
        lblTenMon = new javax.swing.JLabel();
        txtTenMon = new javax.swing.JTextField();
        lblDonVi = new javax.swing.JLabel();
        txtDonVi = new javax.swing.JTextField();
        lblLoaiMon = new javax.swing.JLabel();
        cboLoaiMon = new javax.swing.JComboBox<>();
        lblDonGia = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        lblHinhMonAn = new javax.swing.JLabel();
        pnlCtrlFormMonAn = new javax.swing.JPanel();
        btnAddMonAn = new javax.swing.JButton();
        btnDeleteMonAn = new javax.swing.JButton();
        btnUpdateMonAn = new javax.swing.JButton();
        btnResetMonAn = new javax.swing.JButton();
        pnlCtrlDieuHuong1 = new javax.swing.JPanel();
        btnFirstMonAn = new javax.swing.JButton();
        btnPreMonAn = new javax.swing.JButton();
        btnNextMonAn = new javax.swing.JButton();
        btnLastMonAn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnFindMonAn = new javax.swing.JButton();
        cboFindMonAn = new javax.swing.JComboBox<>();
        cboFindLoaiMon = new javax.swing.JComboBox<>();
        pnlCongThuc = new javax.swing.JPanel();
        pnlFormCongThuc = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        txtMaMonAuto = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txtDonViAuto = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        cboTenMon = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        cboNguyenLieu = new javax.swing.JComboBox<>();
        txtSoLuong = new javax.swing.JTextField();
        lblHinhCongThuc = new javax.swing.JLabel();
        pnlCtrlFormCongThuc = new javax.swing.JPanel();
        btnAddCongThuc = new javax.swing.JButton();
        btnUpdateCongThuc = new javax.swing.JButton();
        btnResetCongThuc = new javax.swing.JButton();
        btnDeleteCongThuc = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblHinhNguyenLieuCT = new javax.swing.JLabel();
        pnlKhuyenMai = new javax.swing.JPanel();
        pnlFormKhuyenMai = new javax.swing.JPanel();
        lblMaKhuyenMai = new javax.swing.JLabel();
        txtMaKhuyenMai = new javax.swing.JTextField();
        lblTenKhuyenMai = new javax.swing.JLabel();
        txtTenKhuyenMai = new javax.swing.JTextField();
        lblNgayBatDau = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        btnUpdateKhuyenMai = new javax.swing.JButton();
        btnDeleteKhuyenMai = new javax.swing.JButton();
        btnAddKhuyenMai = new javax.swing.JButton();
        btnResetKhuyenMai = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        btnFindKhuyenMai = new javax.swing.JButton();
        cboFindKhuyenMai = new javax.swing.JComboBox<>();
        btnFirstKhuyenMai = new javax.swing.JButton();
        btnPreKhuyenMai = new javax.swing.JButton();
        btnNextKhuyenMai = new javax.swing.JButton();
        btnLastKhuyenMai = new javax.swing.JButton();
        lblNgayKetThuc = new javax.swing.JLabel();
        txtGiaTriKMHD = new javax.swing.JTextField();
        lblGiaTriKMHD = new javax.swing.JLabel();
        dateNgayBatDau = new com.toedter.calendar.JDateChooser();
        dateNgayKetThuc = new com.toedter.calendar.JDateChooser();
        pnlFormKhuyenMaiCT = new javax.swing.JPanel();
        lblTenLoaiMonKM = new javax.swing.JLabel();
        cboTenLoaiMonKM = new javax.swing.JComboBox<>();
        lblMaMonKhuyenMai = new javax.swing.JLabel();
        pnlCtr_KhuyenMaiCT = new javax.swing.JPanel();
        btnUpdateKhuyenMaiCT = new javax.swing.JButton();
        btnDeleteKhuyenMaiCT = new javax.swing.JButton();
        btnAddKhuyenMaiCT = new javax.swing.JButton();
        btnResetKhuyenMaiCT = new javax.swing.JButton();
        cboMaMonKhuyenMai = new javax.swing.JComboBox<>();
        txtTenMonKhuyenMai = new javax.swing.JTextField();
        lblTenMonKhuyenMai = new javax.swing.JLabel();
        txtGiaTriKMCT = new javax.swing.JTextField();
        lblGiaTriKMCT = new javax.swing.JLabel();
        pnlPhieuNhap = new javax.swing.JPanel();
        pnlFormPhieuNhap = new javax.swing.JPanel();
        lblMaPhieuNhap = new javax.swing.JLabel();
        txtMaPhieuNhap = new javax.swing.JTextField();
        lblNgayLapPhieu = new javax.swing.JLabel();
        lblNgayNhap = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnUpdatePhieuNhap = new javax.swing.JButton();
        btnDeletePhieuNhap = new javax.swing.JButton();
        btnAddPhieuNhap = new javax.swing.JButton();
        btnResetPhieuNhap = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btnFindPhieuNhap = new javax.swing.JButton();
        cboFindPhieuNhap = new javax.swing.JComboBox<>();
        btnFirstPhieuNhap = new javax.swing.JButton();
        btnPrePhieuNhap = new javax.swing.JButton();
        btnNextPhieuNhap = new javax.swing.JButton();
        btnLastPhieuNhap = new javax.swing.JButton();
        lblNguoiNhap = new javax.swing.JLabel();
        cboNguoiNhap = new javax.swing.JComboBox<>();
        lblNhaCungCap = new javax.swing.JLabel();
        cboNhaCungCap = new javax.swing.JComboBox<>();
        dateNgayLapPhieu = new com.toedter.calendar.JDateChooser();
        dateNgayNhap = new com.toedter.calendar.JDateChooser();
        pnlFormPhieuNhapCT = new javax.swing.JPanel();
        txtDonGiaNgLieu = new javax.swing.JTextField();
        lblTenNguyenLieu2 = new javax.swing.JLabel();
        cboNguyenLieu_tabPhieuNhap = new javax.swing.JComboBox<>();
        lblDonGiaNgLieu = new javax.swing.JLabel();
        lblDonViNgLieu = new javax.swing.JLabel();
        txtDonViNgLieu = new javax.swing.JTextField();
        lblSoLuongNgLieu = new javax.swing.JLabel();
        txtSoLuongNgLieu = new javax.swing.JTextField();
        pnlCtr_CTPhieuNhap = new javax.swing.JPanel();
        btnUpdatePhieuNhapCT = new javax.swing.JButton();
        btnDeletePhieuNhapCT = new javax.swing.JButton();
        btnAddPhieuNhapCT = new javax.swing.JButton();
        btnResetPhieuNhapCT = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnFindPhieuNhapCT = new javax.swing.JButton();
        cboFindPhieuNhapCT = new javax.swing.JComboBox<>();
        pnlNguyenLieu = new javax.swing.JPanel();
        pnlFormMonAn1 = new javax.swing.JPanel();
        lblMaNgLieu = new javax.swing.JLabel();
        txtTenNgLieu = new javax.swing.JTextField();
        lblTenNguyenLieu = new javax.swing.JLabel();
        txtDonViNguyenLieu = new javax.swing.JTextField();
        lblLoaiNguyenLieu = new javax.swing.JLabel();
        lblDonViNguyenLieu = new javax.swing.JLabel();
        lblSoLuongNguyenLieu = new javax.swing.JLabel();
        cboLoaiNguyenLieu = new javax.swing.JComboBox<>();
        txtSoLuongNguyenLieu = new javax.swing.JTextField();
        txtMaNgLieu = new javax.swing.JTextField();
        lblHinhNguyenLieu = new javax.swing.JLabel();
        pnlCtrlFormMonAn1 = new javax.swing.JPanel();
        btnAddNguyenLieu = new javax.swing.JButton();
        btnDeleteNguyenLieu = new javax.swing.JButton();
        btnUpdateNguyenLieu = new javax.swing.JButton();
        btnResetNguyenLieu = new javax.swing.JButton();
        pnlCtrlDieuHuong2 = new javax.swing.JPanel();
        btnFirstNguyenLieu = new javax.swing.JButton();
        btnPreNguyenLieu = new javax.swing.JButton();
        btnNextNguyenLieu = new javax.swing.JButton();
        btnLastNguyenLieu = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        cboFindNguyenLieu = new javax.swing.JComboBox<>();
        btnFindNguyenLieu = new javax.swing.JButton();
        cboFindLoaiNgLieu = new javax.swing.JComboBox<>();
        tlb = new javax.swing.JToolBar();
        btnDanhMuc = new javax.swing.JButton();
        btnDatMon = new javax.swing.JButton();
        btnHuongDan = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Nhà Hàng");
        setName(""); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(721, 406));

        tabs.setBackground(new java.awt.Color(255, 255, 204));
        tabs.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabs.setMaximumSize(new java.awt.Dimension(546, 332));
        tabs.setMinimumSize(new java.awt.Dimension(546, 332));
        tabs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabsStateChanged(evt);
            }
        });

        pnlNhanVien.setBackground(new java.awt.Color(255, 255, 204));

        pnlFormNhanVien.setBackground(new java.awt.Color(255, 220, 126));

        lblMaNV.setText("Mã nhân viên");

        txtMaNV.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMaNV.setToolTipText("Nhập Mã nhân viên (Ví dụ: NV001...)");
        txtMaNV.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        txtMaNV.setSize(new java.awt.Dimension(175, 25));
        txtMaNV.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtMaNVCaretUpdate(evt);
            }
        });
        txtMaNV.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaNVFocusLost(evt);
            }
        });

        txtHoTen.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        txtHoTen.setSize(new java.awt.Dimension(175, 25));

        lblHoTen.setText("Họ và tên");

        btnGroupGender.add(rdoNam);
        rdoNam.setText("Nam");

        btnGroupGender.add(rdoNu);
        rdoNu.setText("Nữ");

        txtSoDT.setToolTipText("Nhập số điện thoại có 10 số");
        txtSoDT.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        txtSoDT.setSize(new java.awt.Dimension(175, 25));
        txtSoDT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSoDTFocusLost(evt);
            }
        });

        lblSoDT.setText("Số điện thoại");

        lblChucVu.setText("Chức vụ");

        cboChucVu.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        cboChucVu.setSize(new java.awt.Dimension(175, 25));

        lblLuong.setText("Lương");

        txtLuong.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        txtLuong.setSize(new java.awt.Dimension(175, 25));

        lblPass.setText("Mật Khẩu");

        txtPass.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        txtPass.setSize(new java.awt.Dimension(175, 25));

        lblSoDT1.setText("Ngày sinh");

        lblSoDT2.setText("Giới tính");

        lblSoDT3.setText("Email");

        txtEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        txtEmail.setSize(new java.awt.Dimension(175, 25));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        txtDiaChi.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        txtDiaChi.setSize(new java.awt.Dimension(175, 25));

        lblDiaChi.setText("Địa chỉ");

        dateNgaySinh.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout pnlFormNhanVienLayout = new javax.swing.GroupLayout(pnlFormNhanVien);
        pnlFormNhanVien.setLayout(pnlFormNhanVienLayout);
        pnlFormNhanVienLayout.setHorizontalGroup(
            pnlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormNhanVienLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormNhanVienLayout.createSequentialGroup()
                        .addGroup(pnlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSoDT1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSoDT2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSoDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSoDT3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDiaChi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblChucVu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFormNhanVienLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlFormNhanVienLayout.createSequentialGroup()
                                        .addComponent(rdoNam)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdoNu))
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(108, 108, 108))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormNhanVienLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pnlFormNhanVienLayout.createSequentialGroup()
                        .addComponent(lblMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pnlFormNhanVienLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cboChucVu, dateNgaySinh, txtDiaChi, txtEmail, txtHoTen, txtLuong, txtMaNV, txtPass, txtSoDT});

        pnlFormNhanVienLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblChucVu, lblDiaChi, lblHoTen, lblLuong, lblMaNV, lblPass, lblSoDT, lblSoDT1, lblSoDT2, lblSoDT3});

        pnlFormNhanVienLayout.setVerticalGroup(
            pnlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormNhanVienLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu)
                    .addComponent(lblSoDT2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSoDT1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoDT3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnlFormNhanVienLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEmail, txtHoTen, txtLuong, txtMaNV, txtPass, txtSoDT});

        pnlFormNhanVienLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblChucVu, lblDiaChi, lblHoTen, lblLuong, lblMaNV, lblPass, lblSoDT, lblSoDT1, lblSoDT2, lblSoDT3});

        pnlCtrlFormNhanVien.setBackground(new java.awt.Color(255, 255, 204));
        pnlCtrlFormNhanVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlCtrlFormNhanVien.setPreferredSize(new java.awt.Dimension(310, 440));

        btnResetNhanVien.setBackground(new java.awt.Color(51, 153, 255));
        btnResetNhanVien.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnResetNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-32.png"))); // NOI18N
        btnResetNhanVien.setText("Làm mới");
        btnResetNhanVien.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To New</div>\n</html>");
        btnResetNhanVien.setSize(new java.awt.Dimension(125, 44));
        btnResetNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetNhanVienActionPerformed(evt);
            }
        });

        lblHinhNhanVien.setBackground(new java.awt.Color(204, 204, 204));
        lblHinhNhanVien.setForeground(new java.awt.Color(255, 51, 51));
        lblHinhNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinhNhanVien.setText("Hình ảnh");
        lblHinhNhanVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblHinhNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblHinhNhanVien.setSize(new java.awt.Dimension(140, 195));
        lblHinhNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhNhanVienMouseClicked(evt);
            }
        });

        btnAddNhanVien.setBackground(new java.awt.Color(51, 153, 255));
        btnAddNhanVien.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAddNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-user-3-32.png"))); // NOI18N
        btnAddNhanVien.setText("Thêm");
        btnAddNhanVien.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Add</div>\n</html>");
        btnAddNhanVien.setSize(new java.awt.Dimension(125, 44));
        btnAddNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNhanVienActionPerformed(evt);
            }
        });

        btnUpdateNhanVien.setBackground(new java.awt.Color(51, 153, 255));
        btnUpdateNhanVien.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnUpdateNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnUpdateNhanVien.setText("Chỉnh sửa");
        btnUpdateNhanVien.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Update</div>\n</html>");
        btnUpdateNhanVien.setSize(new java.awt.Dimension(125, 44));
        btnUpdateNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateNhanVienActionPerformed(evt);
            }
        });

        btnDeleteNhanVien.setBackground(new java.awt.Color(51, 153, 255));
        btnDeleteNhanVien.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnDeleteNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnDeleteNhanVien.setText("Xóa");
        btnDeleteNhanVien.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Delete</div>\n</html>");
        btnDeleteNhanVien.setSize(new java.awt.Dimension(125, 44));
        btnDeleteNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteNhanVienActionPerformed(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnFindNhanVien.setText("Tìm Kiếm");
        btnFindNhanVien.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Find</div>\n</html>");
        btnFindNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindNhanVienActionPerformed(evt);
            }
        });

        cboFindNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboFindChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboFindChucVu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboFindChucVuItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFindNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboFindNhanVien, 0, 172, Short.MAX_VALUE)
                    .addComponent(cboFindChucVu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboFindChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindNhanVien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboFindNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnPreNhanVien.setBackground(new java.awt.Color(51, 153, 255));
        btnPreNhanVien.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnPreNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/previous-32.png"))); // NOI18N
        btnPreNhanVien.setText("Previous");
        btnPreNhanVien.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Previous</div>\n</html>");
        btnPreNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPreNhanVien.setSize(new java.awt.Dimension(114, 44));
        btnPreNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreNhanVienActionPerformed(evt);
            }
        });

        btnNextNhanVien.setBackground(new java.awt.Color(51, 153, 255));
        btnNextNhanVien.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnNextNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next-32.png"))); // NOI18N
        btnNextNhanVien.setText("Next");
        btnNextNhanVien.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Next</div>\n</html>");
        btnNextNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNextNhanVien.setSize(new java.awt.Dimension(114, 44));
        btnNextNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextNhanVienActionPerformed(evt);
            }
        });

        btnFirstNhanVien.setBackground(new java.awt.Color(51, 153, 255));
        btnFirstNhanVien.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnFirstNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/first-32.png"))); // NOI18N
        btnFirstNhanVien.setText("Fisrt");
        btnFirstNhanVien.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Fisrt</div>\n</html>");
        btnFirstNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFirstNhanVien.setSize(new java.awt.Dimension(114, 44));
        btnFirstNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstNhanVienActionPerformed(evt);
            }
        });

        btnLastNhanVien.setBackground(new java.awt.Color(51, 153, 255));
        btnLastNhanVien.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnLastNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/last-32.png"))); // NOI18N
        btnLastNhanVien.setText("Last");
        btnLastNhanVien.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Last</div>\n</html>");
        btnLastNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLastNhanVien.setSize(new java.awt.Dimension(114, 44));
        btnLastNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastNhanVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCtrlFormNhanVienLayout = new javax.swing.GroupLayout(pnlCtrlFormNhanVien);
        pnlCtrlFormNhanVien.setLayout(pnlCtrlFormNhanVienLayout);
        pnlCtrlFormNhanVienLayout.setHorizontalGroup(
            pnlCtrlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCtrlFormNhanVienLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlCtrlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCtrlFormNhanVienLayout.createSequentialGroup()
                        .addGroup(pnlCtrlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUpdateNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResetNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlCtrlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCtrlFormNhanVienLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnAddNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCtrlFormNhanVienLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeleteNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCtrlFormNhanVienLayout.createSequentialGroup()
                        .addGroup(pnlCtrlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNextNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFirstNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLastNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPreNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHinhNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnlCtrlFormNhanVienLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddNhanVien, btnDeleteNhanVien, btnUpdateNhanVien});

        pnlCtrlFormNhanVienLayout.setVerticalGroup(
            pnlCtrlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCtrlFormNhanVienLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlCtrlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlCtrlFormNhanVienLayout.createSequentialGroup()
                        .addComponent(btnPreNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNextNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFirstNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLastNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblHinhNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCtrlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCtrlFormNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnlCtrlFormNhanVienLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddNhanVien, btnDeleteNhanVien, btnUpdateNhanVien});

        lblTitleNV.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitleNV.setText("QUẢN LÝ NHÂN VIÊN");

        javax.swing.GroupLayout pnlNhanVienLayout = new javax.swing.GroupLayout(pnlNhanVien);
        pnlNhanVien.setLayout(pnlNhanVienLayout);
        pnlNhanVienLayout.setHorizontalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhanVienLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitleNV)
                    .addGroup(pnlNhanVienLayout.createSequentialGroup()
                        .addComponent(pnlFormNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlCtrlFormNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNhanVienLayout.setVerticalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhanVienLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblTitleNV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlCtrlFormNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlFormNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tabs.addTab("Nhân Viên", pnlNhanVien);

        pnlCaTruc.setBackground(new java.awt.Color(255, 255, 204));

        pnlFormPhieuNhap2.setBackground(new java.awt.Color(255, 220, 126));
        pnlFormPhieuNhap2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ca Trực", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 3, 14), new java.awt.Color(51, 51, 255))); // NOI18N
        pnlFormPhieuNhap2.setPreferredSize(new java.awt.Dimension(650, 200));

        lblMaCaTruc.setText("Mã Ca Trực");

        txtMaCaTruc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtMaCaTruc.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtMaCaTrucCaretUpdate(evt);
            }
        });

        lblGioBatDau.setText("Giờ Bắt Đầu");

        txtGioBatDau.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblGioKetThuc.setText("Giờ Kết Ca");

        txtGioKetCa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel12.setBackground(new java.awt.Color(255, 220, 126));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnUpdateCaTruc.setBackground(new java.awt.Color(51, 153, 255));
        btnUpdateCaTruc.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnUpdateCaTruc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnUpdateCaTruc.setText("Chỉnh sửa");
        btnUpdateCaTruc.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Update</div>\n</html>");
        btnUpdateCaTruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCaTrucActionPerformed(evt);
            }
        });

        btnDeleteCaTruc.setBackground(new java.awt.Color(51, 153, 255));
        btnDeleteCaTruc.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnDeleteCaTruc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnDeleteCaTruc.setText("Xóa");
        btnDeleteCaTruc.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Delete</div>\n</html>");
        btnDeleteCaTruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCaTrucActionPerformed(evt);
            }
        });

        btnAddCaTruc.setBackground(new java.awt.Color(51, 153, 255));
        btnAddCaTruc.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAddCaTruc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-list-32.png"))); // NOI18N
        btnAddCaTruc.setText("Thêm");
        btnAddCaTruc.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Add</div>\n</html>");
        btnAddCaTruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCaTrucActionPerformed(evt);
            }
        });

        btnResetCaTruc.setBackground(new java.awt.Color(51, 153, 255));
        btnResetCaTruc.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnResetCaTruc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-32.png"))); // NOI18N
        btnResetCaTruc.setText("Làm mới");
        btnResetCaTruc.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To New</div>\n</html>");
        btnResetCaTruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCaTrucActionPerformed(evt);
            }
        });

        jPanel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnFindCaTruc.setText("Tìm Kiếm");
        btnFindCaTruc.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Find</div>\n</html>");
        btnFindCaTruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindCaTrucActionPerformed(evt);
            }
        });

        cboFindCaTruc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(btnFindCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboFindCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboFindCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(btnResetCaTruc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(btnUpdateCaTruc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jPanel12Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddCaTruc, btnDeleteCaTruc, btnResetCaTruc, btnUpdateCaTruc});

        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetCaTruc)
                    .addComponent(btnAddCaTruc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateCaTruc)
                    .addComponent(btnDeleteCaTruc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFormPhieuNhap2Layout = new javax.swing.GroupLayout(pnlFormPhieuNhap2);
        pnlFormPhieuNhap2.setLayout(pnlFormPhieuNhap2Layout);
        pnlFormPhieuNhap2Layout.setHorizontalGroup(
            pnlFormPhieuNhap2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormPhieuNhap2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(pnlFormPhieuNhap2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGioBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGioKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormPhieuNhap2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGioKetCa, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGioBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pnlFormPhieuNhap2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtGioBatDau, txtGioKetCa, txtMaCaTruc});

        pnlFormPhieuNhap2Layout.setVerticalGroup(
            pnlFormPhieuNhap2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormPhieuNhap2Layout.createSequentialGroup()
                .addGroup(pnlFormPhieuNhap2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormPhieuNhap2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormPhieuNhap2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pnlFormPhieuNhap2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFormPhieuNhap2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGioBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGioBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFormPhieuNhap2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGioKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGioKetCa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnlFormPhieuNhap2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtGioBatDau, txtGioKetCa, txtMaCaTruc});

        pnlFormPhieuNhapCT2.setBackground(new java.awt.Color(255, 220, 126));
        pnlFormPhieuNhapCT2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi Tiết Ca Trực", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 3, 14), new java.awt.Color(51, 51, 255))); // NOI18N

        lblTenNguyenLieu4.setText("Ca trực");

        lblNgayTruc.setText("Ngày Trực");

        pnlCtr_CTCaTruc.setBackground(new java.awt.Color(255, 220, 126));
        pnlCtr_CTCaTruc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnUpdateCTCaTruc.setBackground(new java.awt.Color(51, 153, 255));
        btnUpdateCTCaTruc.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnUpdateCTCaTruc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnUpdateCTCaTruc.setText("Chỉnh sửa");
        btnUpdateCTCaTruc.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Update</div>\n</html>");
        btnUpdateCTCaTruc.setSize(new java.awt.Dimension(125, 44));
        btnUpdateCTCaTruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCTCaTrucActionPerformed(evt);
            }
        });

        btnDeleteCTCaTruc.setBackground(new java.awt.Color(51, 153, 255));
        btnDeleteCTCaTruc.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnDeleteCTCaTruc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnDeleteCTCaTruc.setText("Xóa");
        btnDeleteCTCaTruc.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Delete</div>\n</html>");
        btnDeleteCTCaTruc.setPreferredSize(new java.awt.Dimension(125, 44));
        btnDeleteCTCaTruc.setSize(new java.awt.Dimension(125, 44));
        btnDeleteCTCaTruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCTCaTrucActionPerformed(evt);
            }
        });

        btnAddCTCaTruc.setBackground(new java.awt.Color(51, 153, 255));
        btnAddCTCaTruc.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAddCTCaTruc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-list-32.png"))); // NOI18N
        btnAddCTCaTruc.setText("Thêm");
        btnAddCTCaTruc.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Add</div>\n</html>");
        btnAddCTCaTruc.setPreferredSize(new java.awt.Dimension(125, 44));
        btnAddCTCaTruc.setSize(new java.awt.Dimension(125, 44));
        btnAddCTCaTruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCTCaTrucActionPerformed(evt);
            }
        });

        btnResetCTCaTruc.setBackground(new java.awt.Color(51, 153, 255));
        btnResetCTCaTruc.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnResetCTCaTruc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-32.png"))); // NOI18N
        btnResetCTCaTruc.setText("Làm mới");
        btnResetCTCaTruc.setToolTipText("<html> <style>     div{         color:\"red\";         font-family: Verdana, Geneva, Tahoma, sans-serif;         background-color: antiquewhite;         font-size: 10px;     } </style> <div>Click To New</div> </html>");
        btnResetCTCaTruc.setPreferredSize(new java.awt.Dimension(125, 44));
        btnResetCTCaTruc.setSize(new java.awt.Dimension(125, 44));
        btnResetCTCaTruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCTCaTrucActionPerformed(evt);
            }
        });

        jPanel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnFindChiTietCaTruc.setText("Tìm Kiếm");
        btnFindChiTietCaTruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindChiTietCaTrucActionPerformed(evt);
            }
        });

        cboFindNgayTruc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFindChiTietCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboFindNgayTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFindChiTietCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cboFindNgayTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCtr_CTCaTrucLayout = new javax.swing.GroupLayout(pnlCtr_CTCaTruc);
        pnlCtr_CTCaTruc.setLayout(pnlCtr_CTCaTrucLayout);
        pnlCtr_CTCaTrucLayout.setHorizontalGroup(
            pnlCtr_CTCaTrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCtr_CTCaTrucLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCtr_CTCaTrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCtr_CTCaTrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlCtr_CTCaTrucLayout.createSequentialGroup()
                            .addComponent(btnUpdateCTCaTruc)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDeleteCTCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlCtr_CTCaTrucLayout.createSequentialGroup()
                            .addComponent(btnResetCTCaTruc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAddCTCaTruc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCtr_CTCaTrucLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddCTCaTruc, btnDeleteCTCaTruc, btnResetCTCaTruc, btnUpdateCTCaTruc});

        pnlCtr_CTCaTrucLayout.setVerticalGroup(
            pnlCtr_CTCaTrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCtr_CTCaTrucLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCtr_CTCaTrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetCTCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCTCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCtr_CTCaTrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteCTCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateCTCaTruc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cboNhanVienTruc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboNhanVienTruc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboNhanVienTrucItemStateChanged(evt);
            }
        });

        lblNhanVienTruc.setText("Nhân Viên Trực");

        cboCaTruc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboCaTruc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboCaTruc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCaTrucItemStateChanged(evt);
            }
        });

        dateNgayTruc.setDateFormatString("dd-MM-yyyy");
        dateNgayTruc.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateNgayTrucPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pnlFormPhieuNhapCT2Layout = new javax.swing.GroupLayout(pnlFormPhieuNhapCT2);
        pnlFormPhieuNhapCT2.setLayout(pnlFormPhieuNhapCT2Layout);
        pnlFormPhieuNhapCT2Layout.setHorizontalGroup(
            pnlFormPhieuNhapCT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormPhieuNhapCT2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFormPhieuNhapCT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenNguyenLieu4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNgayTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNhanVienTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormPhieuNhapCT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboNhanVienTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateNgayTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlCtr_CTCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pnlFormPhieuNhapCT2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cboCaTruc, cboNhanVienTruc, dateNgayTruc});

        pnlFormPhieuNhapCT2Layout.setVerticalGroup(
            pnlFormPhieuNhapCT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormPhieuNhapCT2Layout.createSequentialGroup()
                .addGroup(pnlFormPhieuNhapCT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormPhieuNhapCT2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pnlFormPhieuNhapCT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboNhanVienTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNhanVienTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFormPhieuNhapCT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateNgayTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNgayTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFormPhieuNhapCT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTenNguyenLieu4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlFormPhieuNhapCT2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlCtr_CTCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pnlFormPhieuNhapCT2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cboCaTruc, cboNhanVienTruc, dateNgayTruc});

        lblTitleCaTruc.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitleCaTruc.setText("QUẢN LÝ CA TRỰC");

        javax.swing.GroupLayout pnlCaTrucLayout = new javax.swing.GroupLayout(pnlCaTruc);
        pnlCaTruc.setLayout(pnlCaTrucLayout);
        pnlCaTrucLayout.setHorizontalGroup(
            pnlCaTrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCaTrucLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlCaTrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitleCaTruc)
                    .addComponent(pnlFormPhieuNhap2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFormPhieuNhapCT2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCaTrucLayout.setVerticalGroup(
            pnlCaTrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCaTrucLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFormPhieuNhap2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlFormPhieuNhapCT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        tabs.addTab("Ca Trực", pnlCaTruc);

        pnlMonAn.setBackground(new java.awt.Color(255, 255, 204));

        pnlFormMonAn.setBackground(new java.awt.Color(255, 220, 126));

        lblMaMon.setText("Mã Món");

        txtMaMon.setForeground(new java.awt.Color(204, 204, 204));
        txtMaMon.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtMaMon.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtMaMonCaretUpdate(evt);
            }
        });

        lblTenMon.setText("Tên Món");

        txtTenMon.setForeground(new java.awt.Color(204, 204, 204));
        txtTenMon.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDonVi.setText("Đơn Vị");

        txtDonVi.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblLoaiMon.setText("Loai Món");

        cboLoaiMon.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDonGia.setText("Đơn Giá");

        txtDonGia.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnlFormMonAnLayout = new javax.swing.GroupLayout(pnlFormMonAn);
        pnlFormMonAn.setLayout(pnlFormMonAnLayout);
        pnlFormMonAnLayout.setHorizontalGroup(
            pnlFormMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormMonAnLayout.createSequentialGroup()
                .addGroup(pnlFormMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormMonAnLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pnlFormMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLoaiMon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormMonAnLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTenMon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlFormMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDonVi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cboLoaiMon, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtTenMon, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pnlFormMonAnLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cboLoaiMon, txtDonGia, txtDonVi, txtMaMon, txtTenMon});

        pnlFormMonAnLayout.setVerticalGroup(
            pnlFormMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormMonAnLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlFormMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenMon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenMon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(pnlFormMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboLoaiMon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoaiMon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblHinhMonAn.setBackground(new java.awt.Color(204, 204, 204));
        lblHinhMonAn.setForeground(new java.awt.Color(255, 51, 51));
        lblHinhMonAn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinhMonAn.setText("Hình ảnh");
        lblHinhMonAn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblHinhMonAn.setPreferredSize(new java.awt.Dimension(300, 230));
        lblHinhMonAn.setSize(new java.awt.Dimension(300, 230));
        lblHinhMonAn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhMonAnMouseClicked(evt);
            }
        });

        pnlCtrlFormMonAn.setBackground(new java.awt.Color(255, 255, 204));

        btnAddMonAn.setBackground(new java.awt.Color(51, 153, 255));
        btnAddMonAn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAddMonAn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-list-32.png"))); // NOI18N
        btnAddMonAn.setText("Thêm");
        btnAddMonAn.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Add</div>\n</html>");
        btnAddMonAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMonAnActionPerformed(evt);
            }
        });

        btnDeleteMonAn.setBackground(new java.awt.Color(51, 153, 255));
        btnDeleteMonAn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnDeleteMonAn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnDeleteMonAn.setText("Xóa");
        btnDeleteMonAn.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Delete</div>\n</html>");
        btnDeleteMonAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMonAnActionPerformed(evt);
            }
        });

        btnUpdateMonAn.setBackground(new java.awt.Color(51, 153, 255));
        btnUpdateMonAn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnUpdateMonAn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnUpdateMonAn.setText("Chỉnh sửa");
        btnUpdateMonAn.setToolTipText("<html> <style>     div{         color:\"red\";         font-family: Verdana, Geneva, Tahoma, sans-serif;         background-color: antiquewhite;         font-size: 10px;     } </style> <div>Click To Update</div> </html>");
        btnUpdateMonAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMonAnActionPerformed(evt);
            }
        });

        btnResetMonAn.setBackground(new java.awt.Color(51, 153, 255));
        btnResetMonAn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnResetMonAn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-32.png"))); // NOI18N
        btnResetMonAn.setText("Làm mới");
        btnResetMonAn.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To New</div>\n</html>");
        btnResetMonAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetMonAnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCtrlFormMonAnLayout = new javax.swing.GroupLayout(pnlCtrlFormMonAn);
        pnlCtrlFormMonAn.setLayout(pnlCtrlFormMonAnLayout);
        pnlCtrlFormMonAnLayout.setHorizontalGroup(
            pnlCtrlFormMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCtrlFormMonAnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCtrlFormMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCtrlFormMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDeleteMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCtrlFormMonAnLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDeleteMonAn, btnResetMonAn, btnUpdateMonAn});

        pnlCtrlFormMonAnLayout.setVerticalGroup(
            pnlCtrlFormMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCtrlFormMonAnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCtrlFormMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCtrlFormMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlCtrlDieuHuong1.setBackground(new java.awt.Color(255, 255, 204));

        btnFirstMonAn.setBackground(new java.awt.Color(51, 153, 255));
        btnFirstMonAn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnFirstMonAn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/first-32.png"))); // NOI18N
        btnFirstMonAn.setText("Fisrt");
        btnFirstMonAn.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Fisrt</div>\n</html>");
        btnFirstMonAn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFirstMonAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstMonAnActionPerformed(evt);
            }
        });

        btnPreMonAn.setBackground(new java.awt.Color(51, 153, 255));
        btnPreMonAn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnPreMonAn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/previous-32.png"))); // NOI18N
        btnPreMonAn.setText("Previous");
        btnPreMonAn.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Previous</div>\n</html>");
        btnPreMonAn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPreMonAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreMonAnActionPerformed(evt);
            }
        });

        btnNextMonAn.setBackground(new java.awt.Color(51, 153, 255));
        btnNextMonAn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnNextMonAn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next-32.png"))); // NOI18N
        btnNextMonAn.setText("Next");
        btnNextMonAn.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Next</div>\n</html>");
        btnNextMonAn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNextMonAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextMonAnActionPerformed(evt);
            }
        });

        btnLastMonAn.setBackground(new java.awt.Color(51, 153, 255));
        btnLastMonAn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnLastMonAn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/last-32.png"))); // NOI18N
        btnLastMonAn.setText("Last");
        btnLastMonAn.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Last</div>\n</html>");
        btnLastMonAn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLastMonAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastMonAnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCtrlDieuHuong1Layout = new javax.swing.GroupLayout(pnlCtrlDieuHuong1);
        pnlCtrlDieuHuong1.setLayout(pnlCtrlDieuHuong1Layout);
        pnlCtrlDieuHuong1Layout.setHorizontalGroup(
            pnlCtrlDieuHuong1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCtrlDieuHuong1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCtrlDieuHuong1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCtrlDieuHuong1Layout.createSequentialGroup()
                        .addComponent(btnFirstMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLastMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCtrlDieuHuong1Layout.createSequentialGroup()
                        .addComponent(btnPreMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNextMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pnlCtrlDieuHuong1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFirstMonAn, btnLastMonAn, btnNextMonAn, btnPreMonAn});

        pnlCtrlDieuHuong1Layout.setVerticalGroup(
            pnlCtrlDieuHuong1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCtrlDieuHuong1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCtrlDieuHuong1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNextMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCtrlDieuHuong1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirstMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLastMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("QUẢN LÝ MÓN ĂN");

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnFindMonAn.setText("Tìm Kiếm");
        btnFindMonAn.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Find</div>\n</html>");
        btnFindMonAn.setPreferredSize(new java.awt.Dimension(100, 30));
        btnFindMonAn.setSize(new java.awt.Dimension(100, 30));
        btnFindMonAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindMonAnActionPerformed(evt);
            }
        });

        cboFindMonAn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboFindLoaiMon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboFindLoaiMon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboFindLoaiMonItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFindMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboFindLoaiMon, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboFindMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboFindLoaiMon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboFindMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMonAnLayout = new javax.swing.GroupLayout(pnlMonAn);
        pnlMonAn.setLayout(pnlMonAnLayout);
        pnlMonAnLayout.setHorizontalGroup(
            pnlMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMonAnLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnlMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMonAnLayout.createSequentialGroup()
                        .addGroup(pnlMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlFormMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlCtrlFormMonAn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMonAnLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblHinhMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlMonAnLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(pnlCtrlDieuHuong1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlMonAnLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pnlCtrlDieuHuong1, pnlCtrlFormMonAn});

        pnlMonAnLayout.setVerticalGroup(
            pnlMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMonAnLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(pnlMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHinhMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlFormMonAn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCtrlDieuHuong1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlCtrlFormMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(140, 140, 140))
        );

        pnlMonAnLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {pnlCtrlDieuHuong1, pnlCtrlFormMonAn});

        tabs.addTab("Món Ăn", pnlMonAn);

        pnlCongThuc.setBackground(new java.awt.Color(255, 255, 204));

        pnlFormCongThuc.setBackground(new java.awt.Color(255, 220, 126));

        jLabel53.setText("Mã Món");

        txtMaMonAuto.setBackground(java.awt.SystemColor.window);
        txtMaMonAuto.setForeground(new java.awt.Color(204, 204, 204));

        jLabel54.setText("Tên Món");

        txtDonViAuto.setBackground(java.awt.SystemColor.window);

        jLabel55.setText("Tên Nguyên Liệu");

        jLabel57.setText("Đơn Vị");

        cboTenMon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTenMonItemStateChanged(evt);
            }
        });

        jLabel58.setText("Số Lượng");

        cboNguyenLieu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboNguyenLieuItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlFormCongThucLayout = new javax.swing.GroupLayout(pnlFormCongThuc);
        pnlFormCongThuc.setLayout(pnlFormCongThucLayout);
        pnlFormCongThucLayout.setHorizontalGroup(
            pnlFormCongThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormCongThucLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlFormCongThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormCongThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonViAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormCongThucLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pnlFormCongThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaMonAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboTenMon, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlFormCongThucLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cboNguyenLieu, cboTenMon, txtDonViAuto, txtMaMonAuto, txtSoLuong});

        pnlFormCongThucLayout.setVerticalGroup(
            pnlFormCongThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormCongThucLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(pnlFormCongThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaMonAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormCongThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTenMon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormCongThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormCongThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonViAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormCongThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        lblHinhCongThuc.setBackground(new java.awt.Color(204, 204, 204));
        lblHinhCongThuc.setForeground(new java.awt.Color(255, 51, 51));
        lblHinhCongThuc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinhCongThuc.setText("Hình ảnh món ăn");
        lblHinhCongThuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblHinhCongThuc.setPreferredSize(new java.awt.Dimension(250, 180));
        lblHinhCongThuc.setSize(new java.awt.Dimension(250, 180));

        pnlCtrlFormCongThuc.setBackground(new java.awt.Color(255, 255, 204));

        btnAddCongThuc.setBackground(new java.awt.Color(51, 153, 255));
        btnAddCongThuc.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAddCongThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-list-32.png"))); // NOI18N
        btnAddCongThuc.setText("Thêm");
        btnAddCongThuc.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Add</div>\n</html>");
        btnAddCongThuc.setPreferredSize(new java.awt.Dimension(125, 44));
        btnAddCongThuc.setSize(new java.awt.Dimension(125, 44));
        btnAddCongThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCongThucActionPerformed(evt);
            }
        });

        btnUpdateCongThuc.setBackground(new java.awt.Color(51, 153, 255));
        btnUpdateCongThuc.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnUpdateCongThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnUpdateCongThuc.setText("Chỉnh sửa");
        btnUpdateCongThuc.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Update</div>\n</html>");
        btnUpdateCongThuc.setSize(new java.awt.Dimension(125, 44));
        btnUpdateCongThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCongThucActionPerformed(evt);
            }
        });

        btnResetCongThuc.setBackground(new java.awt.Color(51, 153, 255));
        btnResetCongThuc.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnResetCongThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-32.png"))); // NOI18N
        btnResetCongThuc.setText("Làm mới");
        btnResetCongThuc.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To New</div>\n</html>");
        btnResetCongThuc.setPreferredSize(new java.awt.Dimension(125, 44));
        btnResetCongThuc.setSize(new java.awt.Dimension(125, 44));
        btnResetCongThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCongThucActionPerformed(evt);
            }
        });

        btnDeleteCongThuc.setBackground(new java.awt.Color(51, 153, 255));
        btnDeleteCongThuc.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnDeleteCongThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnDeleteCongThuc.setText("Xóa");
        btnDeleteCongThuc.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Delete</div>\n</html>");
        btnDeleteCongThuc.setPreferredSize(new java.awt.Dimension(125, 44));
        btnDeleteCongThuc.setSize(new java.awt.Dimension(125, 44));
        btnDeleteCongThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCongThucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCtrlFormCongThucLayout = new javax.swing.GroupLayout(pnlCtrlFormCongThuc);
        pnlCtrlFormCongThuc.setLayout(pnlCtrlFormCongThucLayout);
        pnlCtrlFormCongThucLayout.setHorizontalGroup(
            pnlCtrlFormCongThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCtrlFormCongThucLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlCtrlFormCongThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCtrlFormCongThucLayout.createSequentialGroup()
                        .addComponent(btnUpdateCongThuc)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteCongThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCtrlFormCongThucLayout.createSequentialGroup()
                        .addComponent(btnResetCongThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddCongThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pnlCtrlFormCongThucLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddCongThuc, btnDeleteCongThuc, btnResetCongThuc, btnUpdateCongThuc});

        pnlCtrlFormCongThucLayout.setVerticalGroup(
            pnlCtrlFormCongThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCtrlFormCongThucLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCtrlFormCongThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCongThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetCongThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
                .addGroup(pnlCtrlFormCongThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateCongThuc)
                    .addComponent(btnDeleteCongThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlCtrlFormCongThucLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddCongThuc, btnDeleteCongThuc, btnResetCongThuc, btnUpdateCongThuc});

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("QUẢN LÝ CÔNG THỨC");

        lblHinhNguyenLieuCT.setBackground(new java.awt.Color(204, 204, 204));
        lblHinhNguyenLieuCT.setForeground(new java.awt.Color(255, 51, 51));
        lblHinhNguyenLieuCT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinhNguyenLieuCT.setText("Hình ảnh nguyên liệu");
        lblHinhNguyenLieuCT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblHinhNguyenLieuCT.setPreferredSize(new java.awt.Dimension(250, 180));
        lblHinhNguyenLieuCT.setSize(new java.awt.Dimension(250, 180));

        javax.swing.GroupLayout pnlCongThucLayout = new javax.swing.GroupLayout(pnlCongThuc);
        pnlCongThuc.setLayout(pnlCongThucLayout);
        pnlCongThucLayout.setHorizontalGroup(
            pnlCongThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCongThucLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlCongThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(pnlCongThucLayout.createSequentialGroup()
                        .addGroup(pnlCongThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlCtrlFormCongThuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlFormCongThuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCongThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHinhNguyenLieuCT, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHinhCongThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCongThucLayout.setVerticalGroup(
            pnlCongThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCongThucLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(pnlCongThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlCongThucLayout.createSequentialGroup()
                        .addComponent(pnlFormCongThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlCtrlFormCongThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCongThucLayout.createSequentialGroup()
                        .addComponent(lblHinhCongThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblHinhNguyenLieuCT, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        tabs.addTab("Công Thức", pnlCongThuc);

        pnlKhuyenMai.setBackground(new java.awt.Color(255, 255, 204));

        pnlFormKhuyenMai.setBackground(new java.awt.Color(255, 220, 126));
        pnlFormKhuyenMai.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Khuyến Mãi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 3, 14), new java.awt.Color(51, 51, 255))); // NOI18N

        lblMaKhuyenMai.setText("Mã khuyến mãi");
        lblMaKhuyenMai.setPreferredSize(new java.awt.Dimension(125, 25));
        lblMaKhuyenMai.setSize(new java.awt.Dimension(125, 25));

        txtMaKhuyenMai.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtMaKhuyenMai.setPreferredSize(new java.awt.Dimension(180, 25));
        txtMaKhuyenMai.setSize(new java.awt.Dimension(180, 25));
        txtMaKhuyenMai.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtMaKhuyenMaiCaretUpdate(evt);
            }
        });

        lblTenKhuyenMai.setText("Tên khuyến mãi");
        lblTenKhuyenMai.setPreferredSize(new java.awt.Dimension(125, 25));
        lblTenKhuyenMai.setSize(new java.awt.Dimension(125, 25));

        txtTenKhuyenMai.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTenKhuyenMai.setPreferredSize(new java.awt.Dimension(180, 25));
        txtTenKhuyenMai.setSize(new java.awt.Dimension(180, 25));

        lblNgayBatDau.setText("Ngày Bắt Đầu");
        lblNgayBatDau.setPreferredSize(new java.awt.Dimension(125, 25));
        lblNgayBatDau.setSize(new java.awt.Dimension(125, 25));

        jPanel16.setBackground(new java.awt.Color(255, 220, 126));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel16.setPreferredSize(new java.awt.Dimension(300, 200));
        jPanel16.setSize(new java.awt.Dimension(300, 200));

        btnUpdateKhuyenMai.setBackground(new java.awt.Color(51, 153, 255));
        btnUpdateKhuyenMai.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnUpdateKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnUpdateKhuyenMai.setText("Chỉnh sửa");
        btnUpdateKhuyenMai.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Update</div>\n</html>");
        btnUpdateKhuyenMai.setSize(new java.awt.Dimension(125, 44));
        btnUpdateKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateKhuyenMaiActionPerformed(evt);
            }
        });

        btnDeleteKhuyenMai.setBackground(new java.awt.Color(51, 153, 255));
        btnDeleteKhuyenMai.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnDeleteKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnDeleteKhuyenMai.setText("Xóa");
        btnDeleteKhuyenMai.setToolTipText("<html> <style>     div{         color:\"red\";         font-family: Verdana, Geneva, Tahoma, sans-serif;         background-color: antiquewhite;         font-size: 10px;     } </style> <div>Click To Delete</div> </html>");
        btnDeleteKhuyenMai.setPreferredSize(new java.awt.Dimension(125, 44));
        btnDeleteKhuyenMai.setSize(new java.awt.Dimension(125, 44));
        btnDeleteKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteKhuyenMaiActionPerformed(evt);
            }
        });

        btnAddKhuyenMai.setBackground(new java.awt.Color(51, 153, 255));
        btnAddKhuyenMai.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAddKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-list-32.png"))); // NOI18N
        btnAddKhuyenMai.setText("Thêm");
        btnAddKhuyenMai.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Add</div>\n</html>");
        btnAddKhuyenMai.setPreferredSize(new java.awt.Dimension(125, 44));
        btnAddKhuyenMai.setSize(new java.awt.Dimension(125, 44));
        btnAddKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddKhuyenMaiActionPerformed(evt);
            }
        });

        btnResetKhuyenMai.setBackground(new java.awt.Color(51, 153, 255));
        btnResetKhuyenMai.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnResetKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-32.png"))); // NOI18N
        btnResetKhuyenMai.setText("Làm mới");
        btnResetKhuyenMai.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To New</div>\n</html>");
        btnResetKhuyenMai.setPreferredSize(new java.awt.Dimension(125, 44));
        btnResetKhuyenMai.setSize(new java.awt.Dimension(125, 44));
        btnResetKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetKhuyenMaiActionPerformed(evt);
            }
        });

        jPanel17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnFindKhuyenMai.setText("Tìm Kiếm");
        btnFindKhuyenMai.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Find</div>\n</html>");
        btnFindKhuyenMai.setPreferredSize(new java.awt.Dimension(100, 30));
        btnFindKhuyenMai.setSize(new java.awt.Dimension(100, 30));
        btnFindKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindKhuyenMaiActionPerformed(evt);
            }
        });

        cboFindKhuyenMai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboFindKhuyenMai.setPreferredSize(new java.awt.Dimension(100, 25));
        cboFindKhuyenMai.setSize(new java.awt.Dimension(100, 25));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(btnFindKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboFindKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboFindKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnFirstKhuyenMai.setBackground(new java.awt.Color(51, 153, 255));
        btnFirstKhuyenMai.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnFirstKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/first-32.png"))); // NOI18N
        btnFirstKhuyenMai.setToolTipText("<html> <style>     div{         color:\"red\";         font-family: Verdana, Geneva, Tahoma, sans-serif;         background-color: antiquewhite;         font-size: 10px;     } </style> <div>Click To Fisrt</div> </html>");
        btnFirstKhuyenMai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFirstKhuyenMai.setPreferredSize(new java.awt.Dimension(50, 45));
        btnFirstKhuyenMai.setSize(new java.awt.Dimension(50, 45));
        btnFirstKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstKhuyenMaiActionPerformed(evt);
            }
        });

        btnPreKhuyenMai.setBackground(new java.awt.Color(51, 153, 255));
        btnPreKhuyenMai.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnPreKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/previous-32.png"))); // NOI18N
        btnPreKhuyenMai.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Previous</div>\n</html>");
        btnPreKhuyenMai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPreKhuyenMai.setPreferredSize(new java.awt.Dimension(50, 45));
        btnPreKhuyenMai.setSize(new java.awt.Dimension(50, 45));
        btnPreKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreKhuyenMaiActionPerformed(evt);
            }
        });

        btnNextKhuyenMai.setBackground(new java.awt.Color(51, 153, 255));
        btnNextKhuyenMai.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnNextKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next-32.png"))); // NOI18N
        btnNextKhuyenMai.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Next</div>\n</html>");
        btnNextKhuyenMai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNextKhuyenMai.setPreferredSize(new java.awt.Dimension(50, 45));
        btnNextKhuyenMai.setSize(new java.awt.Dimension(50, 45));
        btnNextKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextKhuyenMaiActionPerformed(evt);
            }
        });

        btnLastKhuyenMai.setBackground(new java.awt.Color(51, 153, 255));
        btnLastKhuyenMai.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnLastKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/last-32.png"))); // NOI18N
        btnLastKhuyenMai.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Last</div>\n</html>");
        btnLastKhuyenMai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLastKhuyenMai.setPreferredSize(new java.awt.Dimension(50, 45));
        btnLastKhuyenMai.setSize(new java.awt.Dimension(50, 45));
        btnLastKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastKhuyenMaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(btnFirstKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPreKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnUpdateKhuyenMai))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(btnNextKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLastKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnDeleteKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addComponent(btnResetKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAddKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel16Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddKhuyenMai, btnDeleteKhuyenMai, btnResetKhuyenMai, btnUpdateKhuyenMai});

        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateKhuyenMai)
                    .addComponent(btnDeleteKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFirstKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNextKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPreKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLastKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblNgayKetThuc.setText("Ngày Kết Thúc");
        lblNgayKetThuc.setPreferredSize(new java.awt.Dimension(125, 25));
        lblNgayKetThuc.setSize(new java.awt.Dimension(125, 25));

        txtGiaTriKMHD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtGiaTriKMHD.setPreferredSize(new java.awt.Dimension(180, 25));
        txtGiaTriKMHD.setSize(new java.awt.Dimension(180, 25));

        lblGiaTriKMHD.setText("Giá trị khuyến mãi");
        lblGiaTriKMHD.setPreferredSize(new java.awt.Dimension(125, 25));
        lblGiaTriKMHD.setSize(new java.awt.Dimension(125, 25));

        dateNgayBatDau.setDateFormatString("dd-MM-yyyy");
        dateNgayBatDau.setPreferredSize(new java.awt.Dimension(180, 25));

        dateNgayKetThuc.setDateFormatString("dd-MM-yyyy");
        dateNgayKetThuc.setPreferredSize(new java.awt.Dimension(180, 25));

        javax.swing.GroupLayout pnlFormKhuyenMaiLayout = new javax.swing.GroupLayout(pnlFormKhuyenMai);
        pnlFormKhuyenMai.setLayout(pnlFormKhuyenMaiLayout);
        pnlFormKhuyenMaiLayout.setHorizontalGroup(
            pnlFormKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormKhuyenMaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblGiaTriKMHD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNgayKetThuc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaKhuyenMai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenKhuyenMai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNgayBatDau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtGiaTriKMHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTenKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateNgayBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateNgayKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        pnlFormKhuyenMaiLayout.setVerticalGroup(
            pnlFormKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormKhuyenMaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormKhuyenMaiLayout.createSequentialGroup()
                        .addGroup(pnlFormKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFormKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(pnlFormKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFormKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFormKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGiaTriKMHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGiaTriKMHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnlFormKhuyenMaiCT.setBackground(new java.awt.Color(255, 220, 126));
        pnlFormKhuyenMaiCT.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Khuyến Mãi Chi Tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 3, 14), new java.awt.Color(51, 51, 255))); // NOI18N

        lblTenLoaiMonKM.setText("Loại món");
        lblTenLoaiMonKM.setPreferredSize(new java.awt.Dimension(125, 25));
        lblTenLoaiMonKM.setSize(new java.awt.Dimension(125, 25));

        cboTenLoaiMonKM.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboTenLoaiMonKM.setPreferredSize(new java.awt.Dimension(180, 25));
        cboTenLoaiMonKM.setSize(new java.awt.Dimension(180, 25));
        cboTenLoaiMonKM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTenLoaiMonKMItemStateChanged(evt);
            }
        });

        lblMaMonKhuyenMai.setText("Mã món");
        lblMaMonKhuyenMai.setPreferredSize(new java.awt.Dimension(125, 25));
        lblMaMonKhuyenMai.setSize(new java.awt.Dimension(125, 25));

        pnlCtr_KhuyenMaiCT.setBackground(new java.awt.Color(255, 220, 126));
        pnlCtr_KhuyenMaiCT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlCtr_KhuyenMaiCT.setPreferredSize(new java.awt.Dimension(300, 150));
        pnlCtr_KhuyenMaiCT.setSize(new java.awt.Dimension(300, 150));

        btnUpdateKhuyenMaiCT.setBackground(new java.awt.Color(51, 153, 255));
        btnUpdateKhuyenMaiCT.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnUpdateKhuyenMaiCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnUpdateKhuyenMaiCT.setText("Chỉnh sửa");
        btnUpdateKhuyenMaiCT.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Update</div>\n</html>");
        btnUpdateKhuyenMaiCT.setSize(new java.awt.Dimension(125, 44));
        btnUpdateKhuyenMaiCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateKhuyenMaiCTActionPerformed(evt);
            }
        });

        btnDeleteKhuyenMaiCT.setBackground(new java.awt.Color(51, 153, 255));
        btnDeleteKhuyenMaiCT.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnDeleteKhuyenMaiCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnDeleteKhuyenMaiCT.setText("Xóa");
        btnDeleteKhuyenMaiCT.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Delete</div>\n</html>");
        btnDeleteKhuyenMaiCT.setPreferredSize(new java.awt.Dimension(125, 44));
        btnDeleteKhuyenMaiCT.setSize(new java.awt.Dimension(125, 44));
        btnDeleteKhuyenMaiCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteKhuyenMaiCTActionPerformed(evt);
            }
        });

        btnAddKhuyenMaiCT.setBackground(new java.awt.Color(51, 153, 255));
        btnAddKhuyenMaiCT.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAddKhuyenMaiCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-list-32.png"))); // NOI18N
        btnAddKhuyenMaiCT.setText("Thêm");
        btnAddKhuyenMaiCT.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Add</div>\n</html>");
        btnAddKhuyenMaiCT.setPreferredSize(new java.awt.Dimension(125, 44));
        btnAddKhuyenMaiCT.setSize(new java.awt.Dimension(125, 44));
        btnAddKhuyenMaiCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddKhuyenMaiCTActionPerformed(evt);
            }
        });

        btnResetKhuyenMaiCT.setBackground(new java.awt.Color(51, 153, 255));
        btnResetKhuyenMaiCT.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnResetKhuyenMaiCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-32.png"))); // NOI18N
        btnResetKhuyenMaiCT.setText("Làm mới");
        btnResetKhuyenMaiCT.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To New</div>\n</html>");
        btnResetKhuyenMaiCT.setPreferredSize(new java.awt.Dimension(125, 44));
        btnResetKhuyenMaiCT.setSize(new java.awt.Dimension(125, 44));
        btnResetKhuyenMaiCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetKhuyenMaiCTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCtr_KhuyenMaiCTLayout = new javax.swing.GroupLayout(pnlCtr_KhuyenMaiCT);
        pnlCtr_KhuyenMaiCT.setLayout(pnlCtr_KhuyenMaiCTLayout);
        pnlCtr_KhuyenMaiCTLayout.setHorizontalGroup(
            pnlCtr_KhuyenMaiCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCtr_KhuyenMaiCTLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlCtr_KhuyenMaiCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateKhuyenMaiCT, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnResetKhuyenMaiCT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCtr_KhuyenMaiCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddKhuyenMaiCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteKhuyenMaiCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnlCtr_KhuyenMaiCTLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnResetKhuyenMaiCT, btnUpdateKhuyenMaiCT});

        pnlCtr_KhuyenMaiCTLayout.setVerticalGroup(
            pnlCtr_KhuyenMaiCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCtr_KhuyenMaiCTLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(pnlCtr_KhuyenMaiCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetKhuyenMaiCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddKhuyenMaiCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCtr_KhuyenMaiCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateKhuyenMaiCT)
                    .addComponent(btnDeleteKhuyenMaiCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        cboMaMonKhuyenMai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboMaMonKhuyenMai.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboMaMonKhuyenMai.setPreferredSize(new java.awt.Dimension(180, 25));
        cboMaMonKhuyenMai.setSize(new java.awt.Dimension(180, 25));
        cboMaMonKhuyenMai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboMaMonKhuyenMaiItemStateChanged(evt);
            }
        });

        txtTenMonKhuyenMai.setBackground(new java.awt.Color(204, 204, 204));
        txtTenMonKhuyenMai.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTenMonKhuyenMai.setPreferredSize(new java.awt.Dimension(180, 25));
        txtTenMonKhuyenMai.setSize(new java.awt.Dimension(180, 25));

        lblTenMonKhuyenMai.setText("Tên Món");
        lblTenMonKhuyenMai.setPreferredSize(new java.awt.Dimension(125, 25));
        lblTenMonKhuyenMai.setSize(new java.awt.Dimension(125, 25));

        txtGiaTriKMCT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtGiaTriKMCT.setPreferredSize(new java.awt.Dimension(180, 25));
        txtGiaTriKMCT.setSize(new java.awt.Dimension(180, 25));

        lblGiaTriKMCT.setText("Giá trị khuyến mãi");
        lblGiaTriKMCT.setPreferredSize(new java.awt.Dimension(125, 25));
        lblGiaTriKMCT.setSize(new java.awt.Dimension(125, 25));

        javax.swing.GroupLayout pnlFormKhuyenMaiCTLayout = new javax.swing.GroupLayout(pnlFormKhuyenMaiCT);
        pnlFormKhuyenMaiCT.setLayout(pnlFormKhuyenMaiCTLayout);
        pnlFormKhuyenMaiCTLayout.setHorizontalGroup(
            pnlFormKhuyenMaiCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormKhuyenMaiCTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormKhuyenMaiCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGiaTriKMCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenLoaiMonKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaMonKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenMonKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormKhuyenMaiCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboMaMonKhuyenMai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTenLoaiMonKM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenMonKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGiaTriKMCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(pnlCtr_KhuyenMaiCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFormKhuyenMaiCTLayout.setVerticalGroup(
            pnlFormKhuyenMaiCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormKhuyenMaiCTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormKhuyenMaiCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboTenLoaiMonKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormKhuyenMaiCTLayout.createSequentialGroup()
                        .addComponent(lblTenLoaiMonKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlFormKhuyenMaiCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaMonKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboMaMonKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(pnlFormKhuyenMaiCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenMonKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenMonKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(pnlFormKhuyenMaiCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGiaTriKMCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGiaTriKMCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlCtr_KhuyenMaiCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlKhuyenMaiLayout = new javax.swing.GroupLayout(pnlKhuyenMai);
        pnlKhuyenMai.setLayout(pnlKhuyenMaiLayout);
        pnlKhuyenMaiLayout.setHorizontalGroup(
            pnlKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhuyenMaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlFormKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFormKhuyenMaiCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlKhuyenMaiLayout.setVerticalGroup(
            pnlKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKhuyenMaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFormKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlFormKhuyenMaiCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        tabs.addTab("Khuyến Mãi", pnlKhuyenMai);

        pnlPhieuNhap.setBackground(new java.awt.Color(255, 255, 204));

        pnlFormPhieuNhap.setBackground(new java.awt.Color(255, 220, 126));
        pnlFormPhieuNhap.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phiếu Nhập", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 3, 14), new java.awt.Color(51, 51, 255))); // NOI18N

        lblMaPhieuNhap.setText("Mã phiếu nhập");
        lblMaPhieuNhap.setPreferredSize(new java.awt.Dimension(100, 25));
        lblMaPhieuNhap.setSize(new java.awt.Dimension(100, 25));

        txtMaPhieuNhap.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtMaPhieuNhap.setPreferredSize(new java.awt.Dimension(180, 25));
        txtMaPhieuNhap.setSize(new java.awt.Dimension(180, 25));
        txtMaPhieuNhap.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtMaPhieuNhapCaretUpdate(evt);
            }
        });

        lblNgayLapPhieu.setText("Ngày lập phiếu");
        lblNgayLapPhieu.setPreferredSize(new java.awt.Dimension(100, 25));
        lblNgayLapPhieu.setSize(new java.awt.Dimension(100, 25));

        lblNgayNhap.setText("Ngày nhập kho");
        lblNgayNhap.setPreferredSize(new java.awt.Dimension(100, 25));
        lblNgayNhap.setSize(new java.awt.Dimension(100, 25));

        jPanel4.setBackground(new java.awt.Color(255, 220, 126));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setPreferredSize(new java.awt.Dimension(280, 200));
        jPanel4.setSize(new java.awt.Dimension(280, 200));

        btnUpdatePhieuNhap.setBackground(new java.awt.Color(51, 153, 255));
        btnUpdatePhieuNhap.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnUpdatePhieuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnUpdatePhieuNhap.setText("Chỉnh sửa");
        btnUpdatePhieuNhap.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Update</div>\n</html>");
        btnUpdatePhieuNhap.setSize(new java.awt.Dimension(125, 44));
        btnUpdatePhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePhieuNhapActionPerformed(evt);
            }
        });

        btnDeletePhieuNhap.setBackground(new java.awt.Color(51, 153, 255));
        btnDeletePhieuNhap.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnDeletePhieuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnDeletePhieuNhap.setText("Xóa");
        btnDeletePhieuNhap.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Delete</div>\n</html>");
        btnDeletePhieuNhap.setPreferredSize(new java.awt.Dimension(125, 44));
        btnDeletePhieuNhap.setSize(new java.awt.Dimension(125, 44));
        btnDeletePhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePhieuNhapActionPerformed(evt);
            }
        });

        btnAddPhieuNhap.setBackground(new java.awt.Color(51, 153, 255));
        btnAddPhieuNhap.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAddPhieuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-list-32.png"))); // NOI18N
        btnAddPhieuNhap.setText("Thêm");
        btnAddPhieuNhap.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Add</div>\n</html>");
        btnAddPhieuNhap.setPreferredSize(new java.awt.Dimension(125, 44));
        btnAddPhieuNhap.setSize(new java.awt.Dimension(125, 44));
        btnAddPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPhieuNhapActionPerformed(evt);
            }
        });

        btnResetPhieuNhap.setBackground(new java.awt.Color(51, 153, 255));
        btnResetPhieuNhap.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnResetPhieuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-32.png"))); // NOI18N
        btnResetPhieuNhap.setText("Làm mới");
        btnResetPhieuNhap.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To New</div>\n</html>");
        btnResetPhieuNhap.setPreferredSize(new java.awt.Dimension(125, 44));
        btnResetPhieuNhap.setSize(new java.awt.Dimension(125, 44));
        btnResetPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPhieuNhapActionPerformed(evt);
            }
        });

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnFindPhieuNhap.setText("Tìm Kiếm");
        btnFindPhieuNhap.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Find</div>\n</html>");
        btnFindPhieuNhap.setPreferredSize(new java.awt.Dimension(100, 30));
        btnFindPhieuNhap.setSize(new java.awt.Dimension(100, 30));
        btnFindPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindPhieuNhapActionPerformed(evt);
            }
        });

        cboFindPhieuNhap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboFindPhieuNhap.setPreferredSize(new java.awt.Dimension(100, 25));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(btnFindPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboFindPhieuNhap, 0, 144, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboFindPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnFirstPhieuNhap.setBackground(new java.awt.Color(51, 153, 255));
        btnFirstPhieuNhap.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnFirstPhieuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/first-32.png"))); // NOI18N
        btnFirstPhieuNhap.setToolTipText("<html> <style>     div{         color:\"red\";         font-family: Verdana, Geneva, Tahoma, sans-serif;         background-color: antiquewhite;         font-size: 10px;     } </style> <div>Click To Fisrt</div> </html>");
        btnFirstPhieuNhap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFirstPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstPhieuNhapActionPerformed(evt);
            }
        });

        btnPrePhieuNhap.setBackground(new java.awt.Color(51, 153, 255));
        btnPrePhieuNhap.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnPrePhieuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/previous-32.png"))); // NOI18N
        btnPrePhieuNhap.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Previous</div>\n</html>");
        btnPrePhieuNhap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPrePhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrePhieuNhapActionPerformed(evt);
            }
        });

        btnNextPhieuNhap.setBackground(new java.awt.Color(51, 153, 255));
        btnNextPhieuNhap.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnNextPhieuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next-32.png"))); // NOI18N
        btnNextPhieuNhap.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Next</div>\n</html>");
        btnNextPhieuNhap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNextPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextPhieuNhapActionPerformed(evt);
            }
        });

        btnLastPhieuNhap.setBackground(new java.awt.Color(51, 153, 255));
        btnLastPhieuNhap.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnLastPhieuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/last-32.png"))); // NOI18N
        btnLastPhieuNhap.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Last</div>\n</html>");
        btnLastPhieuNhap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLastPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastPhieuNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(btnUpdatePhieuNhap)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDeletePhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(btnFirstPhieuNhap)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPrePhieuNhap)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnNextPhieuNhap)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnLastPhieuNhap))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(btnResetPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAddPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddPhieuNhap, btnDeletePhieuNhap, btnResetPhieuNhap, btnUpdatePhieuNhap});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdatePhieuNhap)
                    .addComponent(btnDeletePhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLastPhieuNhap, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFirstPhieuNhap, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNextPhieuNhap, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPrePhieuNhap, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        lblNguoiNhap.setText("Người nhập");
        lblNguoiNhap.setPreferredSize(new java.awt.Dimension(100, 25));
        lblNguoiNhap.setSize(new java.awt.Dimension(100, 25));

        cboNguoiNhap.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboNguoiNhap.setPreferredSize(new java.awt.Dimension(180, 25));
        cboNguoiNhap.setSize(new java.awt.Dimension(180, 25));

        lblNhaCungCap.setText("Nhà cung cấp");
        lblNhaCungCap.setPreferredSize(new java.awt.Dimension(100, 25));
        lblNhaCungCap.setSize(new java.awt.Dimension(100, 25));

        cboNhaCungCap.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboNhaCungCap.setPreferredSize(new java.awt.Dimension(180, 25));
        cboNhaCungCap.setSize(new java.awt.Dimension(180, 25));

        dateNgayLapPhieu.setDateFormatString("dd-MM-yyyy");
        dateNgayLapPhieu.setPreferredSize(new java.awt.Dimension(180, 25));

        dateNgayNhap.setDateFormatString("dd-MM-yyyy");
        dateNgayNhap.setPreferredSize(new java.awt.Dimension(180, 25));

        javax.swing.GroupLayout pnlFormPhieuNhapLayout = new javax.swing.GroupLayout(pnlFormPhieuNhap);
        pnlFormPhieuNhap.setLayout(pnlFormPhieuNhapLayout);
        pnlFormPhieuNhapLayout.setHorizontalGroup(
            pnlFormPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormPhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblMaPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNgayLapPhieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlFormPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblNgayNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNguoiNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboNguoiNhap, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboNhaCungCap, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateNgayNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateNgayLapPhieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        pnlFormPhieuNhapLayout.setVerticalGroup(
            pnlFormPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormPhieuNhapLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pnlFormPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNgayLapPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateNgayLapPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlFormPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboNguoiNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNguoiNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlFormPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlFormPhieuNhapLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlFormPhieuNhapCT.setBackground(new java.awt.Color(255, 220, 126));
        pnlFormPhieuNhapCT.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phiếu Nhập Chi Tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 3, 14), new java.awt.Color(51, 51, 255))); // NOI18N

        txtDonGiaNgLieu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDonGiaNgLieu.setPreferredSize(new java.awt.Dimension(180, 25));
        txtDonGiaNgLieu.setSize(new java.awt.Dimension(180, 25));

        lblTenNguyenLieu2.setText("Tên nguyên liệu");
        lblTenNguyenLieu2.setPreferredSize(new java.awt.Dimension(100, 25));
        lblTenNguyenLieu2.setSize(new java.awt.Dimension(100, 25));

        cboNguyenLieu_tabPhieuNhap.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboNguyenLieu_tabPhieuNhap.setPreferredSize(new java.awt.Dimension(180, 25));
        cboNguyenLieu_tabPhieuNhap.setSize(new java.awt.Dimension(180, 25));

        lblDonGiaNgLieu.setText("Đơn giá");
        lblDonGiaNgLieu.setPreferredSize(new java.awt.Dimension(100, 25));
        lblDonGiaNgLieu.setSize(new java.awt.Dimension(100, 25));

        lblDonViNgLieu.setText("Đơn vị");
        lblDonViNgLieu.setPreferredSize(new java.awt.Dimension(100, 25));
        lblDonViNgLieu.setSize(new java.awt.Dimension(100, 25));

        txtDonViNgLieu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDonViNgLieu.setPreferredSize(new java.awt.Dimension(180, 25));
        txtDonViNgLieu.setSize(new java.awt.Dimension(180, 25));

        lblSoLuongNgLieu.setText("Số lượng");
        lblSoLuongNgLieu.setPreferredSize(new java.awt.Dimension(100, 25));
        lblSoLuongNgLieu.setSize(new java.awt.Dimension(100, 25));

        txtSoLuongNgLieu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSoLuongNgLieu.setPreferredSize(new java.awt.Dimension(180, 25));
        txtSoLuongNgLieu.setSize(new java.awt.Dimension(180, 25));

        pnlCtr_CTPhieuNhap.setBackground(new java.awt.Color(255, 220, 126));
        pnlCtr_CTPhieuNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlCtr_CTPhieuNhap.setPreferredSize(new java.awt.Dimension(280, 150));
        pnlCtr_CTPhieuNhap.setSize(new java.awt.Dimension(280, 150));

        btnUpdatePhieuNhapCT.setBackground(new java.awt.Color(51, 153, 255));
        btnUpdatePhieuNhapCT.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnUpdatePhieuNhapCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnUpdatePhieuNhapCT.setText("Chỉnh sửa");
        btnUpdatePhieuNhapCT.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Update</div>\n</html>");
        btnUpdatePhieuNhapCT.setSize(new java.awt.Dimension(125, 44));
        btnUpdatePhieuNhapCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePhieuNhapCTActionPerformed(evt);
            }
        });

        btnDeletePhieuNhapCT.setBackground(new java.awt.Color(51, 153, 255));
        btnDeletePhieuNhapCT.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnDeletePhieuNhapCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnDeletePhieuNhapCT.setText("Xóa");
        btnDeletePhieuNhapCT.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Delete</div>\n</html>");
        btnDeletePhieuNhapCT.setPreferredSize(new java.awt.Dimension(125, 44));
        btnDeletePhieuNhapCT.setSize(new java.awt.Dimension(125, 44));
        btnDeletePhieuNhapCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePhieuNhapCTActionPerformed(evt);
            }
        });

        btnAddPhieuNhapCT.setBackground(new java.awt.Color(51, 153, 255));
        btnAddPhieuNhapCT.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAddPhieuNhapCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-list-32.png"))); // NOI18N
        btnAddPhieuNhapCT.setText("Thêm");
        btnAddPhieuNhapCT.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Add</div>\n</html>");
        btnAddPhieuNhapCT.setPreferredSize(new java.awt.Dimension(125, 44));
        btnAddPhieuNhapCT.setSize(new java.awt.Dimension(125, 44));
        btnAddPhieuNhapCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPhieuNhapCTActionPerformed(evt);
            }
        });

        btnResetPhieuNhapCT.setBackground(new java.awt.Color(51, 153, 255));
        btnResetPhieuNhapCT.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnResetPhieuNhapCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-32.png"))); // NOI18N
        btnResetPhieuNhapCT.setText("Làm mới");
        btnResetPhieuNhapCT.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To New</div>\n</html>");
        btnResetPhieuNhapCT.setPreferredSize(new java.awt.Dimension(125, 44));
        btnResetPhieuNhapCT.setSize(new java.awt.Dimension(125, 44));
        btnResetPhieuNhapCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPhieuNhapCTActionPerformed(evt);
            }
        });

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnFindPhieuNhapCT.setText("Tìm Kiếm");
        btnFindPhieuNhapCT.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Find</div>\n</html>");
        btnFindPhieuNhapCT.setPreferredSize(new java.awt.Dimension(100, 30));
        btnFindPhieuNhapCT.setSize(new java.awt.Dimension(100, 30));
        btnFindPhieuNhapCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindPhieuNhapCTActionPerformed(evt);
            }
        });

        cboFindPhieuNhapCT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboFindPhieuNhapCT.setPreferredSize(new java.awt.Dimension(150, 25));
        cboFindPhieuNhapCT.setSize(new java.awt.Dimension(150, 25));
        cboFindPhieuNhapCT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboFindPhieuNhapCTItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnFindPhieuNhapCT, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboFindPhieuNhapCT, 0, 156, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnFindPhieuNhapCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cboFindPhieuNhapCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlCtr_CTPhieuNhapLayout = new javax.swing.GroupLayout(pnlCtr_CTPhieuNhap);
        pnlCtr_CTPhieuNhap.setLayout(pnlCtr_CTPhieuNhapLayout);
        pnlCtr_CTPhieuNhapLayout.setHorizontalGroup(
            pnlCtr_CTPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCtr_CTPhieuNhapLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(pnlCtr_CTPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCtr_CTPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlCtr_CTPhieuNhapLayout.createSequentialGroup()
                            .addComponent(btnUpdatePhieuNhapCT)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDeletePhieuNhapCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlCtr_CTPhieuNhapLayout.createSequentialGroup()
                            .addComponent(btnResetPhieuNhapCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAddPhieuNhapCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12))
        );

        pnlCtr_CTPhieuNhapLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddPhieuNhapCT, btnDeletePhieuNhapCT, btnResetPhieuNhapCT, btnUpdatePhieuNhapCT});

        pnlCtr_CTPhieuNhapLayout.setVerticalGroup(
            pnlCtr_CTPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCtr_CTPhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCtr_CTPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetPhieuNhapCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddPhieuNhapCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCtr_CTPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdatePhieuNhapCT)
                    .addComponent(btnDeletePhieuNhapCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFormPhieuNhapCTLayout = new javax.swing.GroupLayout(pnlFormPhieuNhapCT);
        pnlFormPhieuNhapCT.setLayout(pnlFormPhieuNhapCTLayout);
        pnlFormPhieuNhapCTLayout.setHorizontalGroup(
            pnlFormPhieuNhapCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormPhieuNhapCTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormPhieuNhapCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDonGiaNgLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDonViNgLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSoLuongNgLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTenNguyenLieu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormPhieuNhapCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDonViNgLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormPhieuNhapCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtDonGiaNgLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboNguyenLieu_tabPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSoLuongNgLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(pnlCtr_CTPhieuNhap, 279, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlFormPhieuNhapCTLayout.setVerticalGroup(
            pnlFormPhieuNhapCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormPhieuNhapCTLayout.createSequentialGroup()
                .addGroup(pnlFormPhieuNhapCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormPhieuNhapCTLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(pnlFormPhieuNhapCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFormPhieuNhapCTLayout.createSequentialGroup()
                                .addComponent(cboNguyenLieu_tabPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnlFormPhieuNhapCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDonGiaNgLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlFormPhieuNhapCTLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(txtDonViNgLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(txtSoLuongNgLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlFormPhieuNhapCTLayout.createSequentialGroup()
                                .addComponent(lblTenNguyenLieu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addGroup(pnlFormPhieuNhapCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDonGiaNgLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlFormPhieuNhapCTLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(lblDonViNgLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(lblSoLuongNgLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(pnlCtr_CTPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlPhieuNhapLayout = new javax.swing.GroupLayout(pnlPhieuNhap);
        pnlPhieuNhap.setLayout(pnlPhieuNhapLayout);
        pnlPhieuNhapLayout.setHorizontalGroup(
            pnlPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPhieuNhapLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlFormPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFormPhieuNhapCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        pnlPhieuNhapLayout.setVerticalGroup(
            pnlPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPhieuNhapLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(pnlFormPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlFormPhieuNhapCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        tabs.addTab("Phiếu Nhập", pnlPhieuNhap);

        pnlNguyenLieu.setBackground(new java.awt.Color(255, 255, 204));

        pnlFormMonAn1.setBackground(new java.awt.Color(255, 220, 126));
        pnlFormMonAn1.setPreferredSize(new java.awt.Dimension(320, 235));
        pnlFormMonAn1.setSize(new java.awt.Dimension(320, 235));

        lblMaNgLieu.setText("Mã nguyên liệu");
        lblMaNgLieu.setPreferredSize(new java.awt.Dimension(120, 25));
        lblMaNgLieu.setSize(new java.awt.Dimension(120, 25));

        txtTenNgLieu.setForeground(new java.awt.Color(51, 51, 51));
        txtTenNgLieu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTenNgLieu.setPreferredSize(new java.awt.Dimension(160, 25));
        txtTenNgLieu.setSize(new java.awt.Dimension(160, 25));

        lblTenNguyenLieu.setText("Tên nguyên liệu");
        lblTenNguyenLieu.setPreferredSize(new java.awt.Dimension(120, 25));
        lblTenNguyenLieu.setSize(new java.awt.Dimension(120, 25));

        txtDonViNguyenLieu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDonViNguyenLieu.setPreferredSize(new java.awt.Dimension(160, 25));
        txtDonViNguyenLieu.setSize(new java.awt.Dimension(160, 25));

        lblLoaiNguyenLieu.setText("Loại nguyên liệu");
        lblLoaiNguyenLieu.setMaximumSize(new java.awt.Dimension(100, 25));
        lblLoaiNguyenLieu.setMinimumSize(new java.awt.Dimension(100, 25));
        lblLoaiNguyenLieu.setPreferredSize(new java.awt.Dimension(120, 25));
        lblLoaiNguyenLieu.setSize(new java.awt.Dimension(120, 25));

        lblDonViNguyenLieu.setText("Đơn Vị");
        lblDonViNguyenLieu.setPreferredSize(new java.awt.Dimension(120, 25));
        lblDonViNguyenLieu.setSize(new java.awt.Dimension(120, 25));

        lblSoLuongNguyenLieu.setText("Số lượng");
        lblSoLuongNguyenLieu.setPreferredSize(new java.awt.Dimension(120, 25));
        lblSoLuongNguyenLieu.setSize(new java.awt.Dimension(120, 25));

        cboLoaiNguyenLieu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboLoaiNguyenLieu.setPreferredSize(new java.awt.Dimension(160, 25));
        cboLoaiNguyenLieu.setSize(new java.awt.Dimension(160, 25));

        txtSoLuongNguyenLieu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSoLuongNguyenLieu.setPreferredSize(new java.awt.Dimension(160, 25));
        txtSoLuongNguyenLieu.setSize(new java.awt.Dimension(160, 25));

        txtMaNgLieu.setForeground(new java.awt.Color(51, 51, 51));
        txtMaNgLieu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtMaNgLieu.setPreferredSize(new java.awt.Dimension(160, 25));
        txtMaNgLieu.setSize(new java.awt.Dimension(160, 25));
        txtMaNgLieu.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtMaNgLieuCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout pnlFormMonAn1Layout = new javax.swing.GroupLayout(pnlFormMonAn1);
        pnlFormMonAn1.setLayout(pnlFormMonAn1Layout);
        pnlFormMonAn1Layout.setHorizontalGroup(
            pnlFormMonAn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormMonAn1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlFormMonAn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaNgLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoaiNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDonViNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoLuongNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormMonAn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDonViNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaNgLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenNgLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuongNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboLoaiNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlFormMonAn1Layout.setVerticalGroup(
            pnlFormMonAn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormMonAn1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlFormMonAn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaNgLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaNgLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormMonAn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenNgLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(pnlFormMonAn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboLoaiNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoaiNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormMonAn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDonViNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonViNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormMonAn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoLuongNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuongNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblHinhNguyenLieu.setBackground(new java.awt.Color(204, 204, 204));
        lblHinhNguyenLieu.setForeground(new java.awt.Color(255, 51, 51));
        lblHinhNguyenLieu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinhNguyenLieu.setText("Hình ảnh");
        lblHinhNguyenLieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblHinhNguyenLieu.setPreferredSize(new java.awt.Dimension(260, 227));
        lblHinhNguyenLieu.setSize(new java.awt.Dimension(260, 227));
        lblHinhNguyenLieu.setVerifyInputWhenFocusTarget(false);
        lblHinhNguyenLieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhNguyenLieuMouseClicked(evt);
            }
        });

        pnlCtrlFormMonAn1.setBackground(new java.awt.Color(255, 255, 204));

        btnAddNguyenLieu.setBackground(new java.awt.Color(51, 153, 255));
        btnAddNguyenLieu.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAddNguyenLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-list-32.png"))); // NOI18N
        btnAddNguyenLieu.setText("Thêm");
        btnAddNguyenLieu.setToolTipText("<html> <style>     div{         color:\"red\";         font-family: Verdana, Geneva, Tahoma, sans-serif;         background-color: antiquewhite;         font-size: 10px;     } </style> <div>Click To Add</div> </html>");
        btnAddNguyenLieu.setPreferredSize(new java.awt.Dimension(125, 44));
        btnAddNguyenLieu.setSize(new java.awt.Dimension(125, 44));
        btnAddNguyenLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNguyenLieuActionPerformed(evt);
            }
        });

        btnDeleteNguyenLieu.setBackground(new java.awt.Color(51, 153, 255));
        btnDeleteNguyenLieu.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnDeleteNguyenLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-32.png"))); // NOI18N
        btnDeleteNguyenLieu.setText("Xóa");
        btnDeleteNguyenLieu.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Delete</div>\n</html>");
        btnDeleteNguyenLieu.setPreferredSize(new java.awt.Dimension(125, 44));
        btnDeleteNguyenLieu.setSize(new java.awt.Dimension(125, 44));
        btnDeleteNguyenLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteNguyenLieuActionPerformed(evt);
            }
        });

        btnUpdateNguyenLieu.setBackground(new java.awt.Color(51, 153, 255));
        btnUpdateNguyenLieu.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnUpdateNguyenLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-32.png"))); // NOI18N
        btnUpdateNguyenLieu.setText("Chỉnh sửa");
        btnUpdateNguyenLieu.setToolTipText("<html> <style>     div{         color:\"red\";         font-family: Verdana, Geneva, Tahoma, sans-serif;         background-color: antiquewhite;         font-size: 10px;     } </style> <div>Click To Update</div> </html>");
        btnUpdateNguyenLieu.setSize(new java.awt.Dimension(125, 44));
        btnUpdateNguyenLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateNguyenLieuActionPerformed(evt);
            }
        });

        btnResetNguyenLieu.setBackground(new java.awt.Color(51, 153, 255));
        btnResetNguyenLieu.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnResetNguyenLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-32.png"))); // NOI18N
        btnResetNguyenLieu.setText("Làm mới");
        btnResetNguyenLieu.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To New</div>\n</html>");
        btnResetNguyenLieu.setPreferredSize(new java.awt.Dimension(125, 44));
        btnResetNguyenLieu.setSize(new java.awt.Dimension(125, 44));
        btnResetNguyenLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetNguyenLieuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCtrlFormMonAn1Layout = new javax.swing.GroupLayout(pnlCtrlFormMonAn1);
        pnlCtrlFormMonAn1.setLayout(pnlCtrlFormMonAn1Layout);
        pnlCtrlFormMonAn1Layout.setHorizontalGroup(
            pnlCtrlFormMonAn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCtrlFormMonAn1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCtrlFormMonAn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnResetNguyenLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateNguyenLieu))
                .addGap(18, 18, 18)
                .addGroup(pnlCtrlFormMonAn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddNguyenLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteNguyenLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCtrlFormMonAn1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddNguyenLieu, btnResetNguyenLieu, btnUpdateNguyenLieu});

        pnlCtrlFormMonAn1Layout.setVerticalGroup(
            pnlCtrlFormMonAn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCtrlFormMonAn1Layout.createSequentialGroup()
                .addGroup(pnlCtrlFormMonAn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCtrlFormMonAn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateNguyenLieu)))
        );

        pnlCtrlFormMonAn1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddNguyenLieu, btnDeleteNguyenLieu, btnResetNguyenLieu, btnUpdateNguyenLieu});

        pnlCtrlDieuHuong2.setBackground(new java.awt.Color(255, 255, 204));

        btnFirstNguyenLieu.setBackground(new java.awt.Color(51, 153, 255));
        btnFirstNguyenLieu.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnFirstNguyenLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/first-32.png"))); // NOI18N
        btnFirstNguyenLieu.setText("Fisrt");
        btnFirstNguyenLieu.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Fisrt</div>\n</html>");
        btnFirstNguyenLieu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFirstNguyenLieu.setPreferredSize(new java.awt.Dimension(125, 44));
        btnFirstNguyenLieu.setSize(new java.awt.Dimension(125, 44));
        btnFirstNguyenLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstNguyenLieuActionPerformed(evt);
            }
        });

        btnPreNguyenLieu.setBackground(new java.awt.Color(51, 153, 255));
        btnPreNguyenLieu.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnPreNguyenLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/previous-32.png"))); // NOI18N
        btnPreNguyenLieu.setText("Previous");
        btnPreNguyenLieu.setToolTipText("<html> <style>     div{         color:\"red\";         font-family: Verdana, Geneva, Tahoma, sans-serif;         background-color: antiquewhite;         font-size: 10px;     } </style> <div>Click To Previous</div> </html>");
        btnPreNguyenLieu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPreNguyenLieu.setPreferredSize(new java.awt.Dimension(125, 44));
        btnPreNguyenLieu.setSize(new java.awt.Dimension(125, 44));
        btnPreNguyenLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreNguyenLieuActionPerformed(evt);
            }
        });

        btnNextNguyenLieu.setBackground(new java.awt.Color(51, 153, 255));
        btnNextNguyenLieu.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnNextNguyenLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next-32.png"))); // NOI18N
        btnNextNguyenLieu.setText("Next");
        btnNextNguyenLieu.setToolTipText("<html> <style>     div{         color:\"red\";         font-family: Verdana, Geneva, Tahoma, sans-serif;         background-color: antiquewhite;         font-size: 10px;     } </style> <div>Click To Next</div> </html>");
        btnNextNguyenLieu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNextNguyenLieu.setPreferredSize(new java.awt.Dimension(125, 44));
        btnNextNguyenLieu.setSize(new java.awt.Dimension(125, 44));
        btnNextNguyenLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextNguyenLieuActionPerformed(evt);
            }
        });

        btnLastNguyenLieu.setBackground(new java.awt.Color(51, 153, 255));
        btnLastNguyenLieu.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnLastNguyenLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/last-32.png"))); // NOI18N
        btnLastNguyenLieu.setText("Last");
        btnLastNguyenLieu.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Last</div>\n</html>");
        btnLastNguyenLieu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLastNguyenLieu.setPreferredSize(new java.awt.Dimension(125, 44));
        btnLastNguyenLieu.setSize(new java.awt.Dimension(125, 44));
        btnLastNguyenLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastNguyenLieuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCtrlDieuHuong2Layout = new javax.swing.GroupLayout(pnlCtrlDieuHuong2);
        pnlCtrlDieuHuong2.setLayout(pnlCtrlDieuHuong2Layout);
        pnlCtrlDieuHuong2Layout.setHorizontalGroup(
            pnlCtrlDieuHuong2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCtrlDieuHuong2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCtrlDieuHuong2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPreNguyenLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFirstNguyenLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCtrlDieuHuong2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLastNguyenLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNextNguyenLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCtrlDieuHuong2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFirstNguyenLieu, btnLastNguyenLieu, btnNextNguyenLieu, btnPreNguyenLieu});

        pnlCtrlDieuHuong2Layout.setVerticalGroup(
            pnlCtrlDieuHuong2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCtrlDieuHuong2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlCtrlDieuHuong2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNextNguyenLieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPreNguyenLieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCtrlDieuHuong2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirstNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLastNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlCtrlDieuHuong2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnFirstNguyenLieu, btnLastNguyenLieu, btnNextNguyenLieu, btnPreNguyenLieu});

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setText("QUẢN LÝ NGUYÊN LIỆU");

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setPreferredSize(new java.awt.Dimension(600, 44));
        jPanel7.setSize(new java.awt.Dimension(600, 44));

        cboFindNguyenLieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboFindNguyenLieu.setPreferredSize(new java.awt.Dimension(225, 25));
        cboFindNguyenLieu.setSize(new java.awt.Dimension(225, 25));

        btnFindNguyenLieu.setText("Tìm Kiếm");
        btnFindNguyenLieu.setToolTipText("<html>\n<style>\n    div{\n        color:\"red\";\n        font-family: Verdana, Geneva, Tahoma, sans-serif;\n        background-color: antiquewhite;\n        font-size: 10px;\n    }\n</style>\n<div>Click To Find</div>\n</html>");
        btnFindNguyenLieu.setPreferredSize(new java.awt.Dimension(100, 30));
        btnFindNguyenLieu.setSize(new java.awt.Dimension(100, 30));
        btnFindNguyenLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindNguyenLieuActionPerformed(evt);
            }
        });

        cboFindLoaiNgLieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboFindLoaiNgLieu.setPreferredSize(new java.awt.Dimension(225, 25));
        cboFindLoaiNgLieu.setSize(new java.awt.Dimension(225, 25));
        cboFindLoaiNgLieu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboFindLoaiNgLieuItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFindNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboFindLoaiNgLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboFindNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboFindLoaiNgLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboFindNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout pnlNguyenLieuLayout = new javax.swing.GroupLayout(pnlNguyenLieu);
        pnlNguyenLieu.setLayout(pnlNguyenLieuLayout);
        pnlNguyenLieuLayout.setHorizontalGroup(
            pnlNguyenLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNguyenLieuLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pnlNguyenLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlNguyenLieuLayout.createSequentialGroup()
                        .addComponent(pnlCtrlFormMonAn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlCtrlDieuHuong2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlNguyenLieuLayout.createSequentialGroup()
                        .addComponent(pnlFormMonAn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblHinhNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNguyenLieuLayout.setVerticalGroup(
            pnlNguyenLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNguyenLieuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(pnlNguyenLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHinhNguyenLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlFormMonAn1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlNguyenLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNguyenLieuLayout.createSequentialGroup()
                        .addComponent(pnlCtrlDieuHuong2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(130, 130, 130))
                    .addGroup(pnlNguyenLieuLayout.createSequentialGroup()
                        .addComponent(pnlCtrlFormMonAn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tabs.addTab("Nguyên Liệu", pnlNguyenLieu);

        tlb.setBackground(new java.awt.Color(255, 255, 204));
        tlb.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 204, 102)));
        tlb.setFloatable(false);
        tlb.setForeground(new java.awt.Color(255, 255, 255));
        tlb.setRollover(true);
        tlb.setToolTipText("");

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
        tlb.add(btnDanhMuc);

        btnDatMon.setBackground(new java.awt.Color(255, 255, 255));
        btnDatMon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDatMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-list-32.png"))); // NOI18N
        btnDatMon.setText("Thống Kê");
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
        tlb.add(btnDatMon);

        btnHuongDan.setBackground(new java.awt.Color(255, 255, 255));
        btnHuongDan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/help-32.png"))); // NOI18N
        btnHuongDan.setText("Hướng Dẫn");
        btnHuongDan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(255, 204, 102)));
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
        tlb.add(btnHuongDan);

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 51, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close-window-32.png"))); // NOI18N
        btnExit.setText("THOÁT");
        btnExit.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(255, 204, 102)));
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setMaximumSize(new java.awt.Dimension(90, 60));
        btnExit.setMinimumSize(new java.awt.Dimension(90, 60));
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        tlb.add(btnExit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tlb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tlb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhMucActionPerformed
        // TODO add your handling code here:
        new DanhMuc().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDanhMucActionPerformed

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

    private void btnDatMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatMonActionPerformed
        // TODO add your handling code here:
        new ThongKe().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDatMonActionPerformed

    private void cboFindLoaiNgLieuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboFindLoaiNgLieuItemStateChanged
        // TODO add your handling code here:
        cboFindNguyenLieu.setEnabled(true);
        String loaiNgLieu = String.valueOf(cboFindLoaiNgLieu.getSelectedItem());
        LoaiNgLieu lnl = QLLoaiNgLieu.dao.selectByName(loaiNgLieu);
        if (lnl != null) {
            QLNguyenLieu.fillToCboByMaLoaiNgLieu(cboFindNguyenLieu, lnl.getMaLoaiNgLieu());
        }
    }//GEN-LAST:event_cboFindLoaiNgLieuItemStateChanged

    private void btnFindNguyenLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindNguyenLieuActionPerformed
        // TODO add your handling code here:
        this.findActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnFindNguyenLieuActionPerformed

    private void btnLastNguyenLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastNguyenLieuActionPerformed
        // TODO add your handling code here:
        NguyenLieu nl = QLNguyenLieu.dao.selectByName(listNguyenLieu.get(listNguyenLieu.size() - 1).getTenNgLieu());
        this.setFormNguyenLieu(nl);
    }//GEN-LAST:event_btnLastNguyenLieuActionPerformed

    private void btnNextNguyenLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextNguyenLieuActionPerformed
        // TODO add your handling code here:
        String maNL = txtMaNgLieu.getText();
        if (maNL.equals("")) {
            btnLastNguyenLieuActionPerformed(evt);
            return;
        }
        int row = -1;
        for (int i = 0; i < listNguyenLieu.size(); i++) {
            if (maNL.equals(listNguyenLieu.get(i).getMaNgLieu())) {
                if (i == listNguyenLieu.size() - 1) {
                    row = 0;
                } else {
                    row = i + 1;
                }
                NguyenLieu nl = QLNguyenLieu.dao.selectByName(listNguyenLieu.get(row).getTenNgLieu());
                this.setFormNguyenLieu(nl);
                return;
            }
        }
    }//GEN-LAST:event_btnNextNguyenLieuActionPerformed

    private void btnPreNguyenLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreNguyenLieuActionPerformed
        // TODO add your handling code here:
        String maNL = txtMaNgLieu.getText();
        if (maNL.equals("")) {
            btnFirstNguyenLieuActionPerformed(evt);
            return;
        }
        int row = -1;
        for (int i = 0; i < listNguyenLieu.size(); i++) {
            if (maNL.equals(listNguyenLieu.get(i).getMaNgLieu())) {
                if (i == 0) {
                    row = listNguyenLieu.size() - 1;
                } else {
                    row = i - 1;
                }
                NguyenLieu nl = QLNguyenLieu.dao.selectByName(listNguyenLieu.get(row).getTenNgLieu());
                this.setFormNguyenLieu(nl);
                return;
            }
        }
    }//GEN-LAST:event_btnPreNguyenLieuActionPerformed

    private void btnFirstNguyenLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstNguyenLieuActionPerformed
        // TODO add your handling code here:
        NguyenLieu nl = QLNguyenLieu.dao.selectByName(listNguyenLieu.get(0).getTenNgLieu());
        this.setFormNguyenLieu(nl);
    }//GEN-LAST:event_btnFirstNguyenLieuActionPerformed

    private void btnResetNguyenLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetNguyenLieuActionPerformed
        // TODO add your handling code here:
        this.resetActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnResetNguyenLieuActionPerformed

    private void btnUpdateNguyenLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateNguyenLieuActionPerformed
        // TODO add your handling code here:
        this.updateActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnUpdateNguyenLieuActionPerformed

    private void btnDeleteNguyenLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteNguyenLieuActionPerformed
        // TODO add your handling code here:
        this.deleteActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnDeleteNguyenLieuActionPerformed

    private void btnAddNguyenLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNguyenLieuActionPerformed
        // TODO add your handling code here:
        this.addActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnAddNguyenLieuActionPerformed

    private void lblHinhNguyenLieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhNguyenLieuMouseClicked
        // TODO add your handling code here:
        this.chonAnh(lblHinhNguyenLieu);
    }//GEN-LAST:event_lblHinhNguyenLieuMouseClicked

    private void cboFindPhieuNhapCTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboFindPhieuNhapCTItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cboFindPhieuNhapCTItemStateChanged

    private void btnFindPhieuNhapCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindPhieuNhapCTActionPerformed
        // TODO add your handling code here:
        PhieuNhapCT pnct = QLPhieuNhapCT.dao.selectById(cboFindPhieuNhapCT.getSelectedItem().toString());
        if (pnct != null) {
            this.setFormPhieuNhapCT(pnct);
        }
    }//GEN-LAST:event_btnFindPhieuNhapCTActionPerformed

    private void btnResetPhieuNhapCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPhieuNhapCTActionPerformed
        // TODO add your handling code here:
        this.resetFormPhieuNhapCT();
    }//GEN-LAST:event_btnResetPhieuNhapCTActionPerformed

    private void btnAddPhieuNhapCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPhieuNhapCTActionPerformed
        // TODO add your handling code here:
        PhieuNhapCT pn = this.getFormPhieuNhapCT();
        QLPhieuNhapCT.insert(pn);
//        QLPhieuNhapCT.fillToCboByMaPhieuNhap(cboFindPhieuNhapCT, pn.getMaPhieuNhap());
    }//GEN-LAST:event_btnAddPhieuNhapCTActionPerformed

    private void btnDeletePhieuNhapCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePhieuNhapCTActionPerformed
        // TODO add your handling code here:
        String[] ids = {txtMaPhieuNhap.getText(), cboNguyenLieu_tabPhieuNhap.getSelectedItem().toString()};
        String maPhieuNhapCT = String.valueOf(QLPhieuNhapCT.dao.selectById(ids).getMaPhieuNhapCT());
        if (QLPhieuNhapCT.detele(maPhieuNhapCT)) {
            this.resetFormPhieuNhapCT();
            QLPhieuNhapCT.fillAllToCbo(cboFindPhieuNhapCT);
        }
    }//GEN-LAST:event_btnDeletePhieuNhapCTActionPerformed

    private void btnUpdatePhieuNhapCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePhieuNhapCTActionPerformed
        // TODO add your handling code here:
        PhieuNhapCT pn = this.getFormPhieuNhapCT();
        QLPhieuNhapCT.update(pn);
        QLPhieuNhapCT.fillAllToCbo(cboFindPhieuNhapCT);
    }//GEN-LAST:event_btnUpdatePhieuNhapCTActionPerformed

    private void btnLastPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastPhieuNhapActionPerformed
        // TODO add your handling code here:
        PhieuNhap pn = QLPhieuNhap.dao.selectById(listPhieuNhap.get(listPhieuNhap.size() - 1).getMaPhieuNhap());
        this.setFormPhieuNhap(pn);
    }//GEN-LAST:event_btnLastPhieuNhapActionPerformed

    private void btnNextPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextPhieuNhapActionPerformed
        // TODO add your handling code here:
        String maPN = txtMaPhieuNhap.getText();
        if (maPN.equals("")) {
            btnLastPhieuNhapActionPerformed(evt);
            return;
        }
        int row = -1;
        for (int i = 0; i < listPhieuNhap.size(); i++) {
            if (maPN.equals(listPhieuNhap.get(i).getMaPhieuNhap())) {
                if (i == listPhieuNhap.size() - 1) {
                    row = 0;
                } else {
                    row = i + 1;
                }
                PhieuNhap pn = QLPhieuNhap.dao.selectById(listPhieuNhap.get(row).getMaPhieuNhap());
                this.setFormPhieuNhap(pn);
                return;
            }
        }
    }//GEN-LAST:event_btnNextPhieuNhapActionPerformed

    private void btnPrePhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrePhieuNhapActionPerformed
        // TODO add your handling code here:
        String maPN = txtMaPhieuNhap.getText();
        if (maPN.equals("")) {
            btnFirstPhieuNhapActionPerformed(evt);
            return;
        }
        int row = -1;
        for (int i = 0; i < listPhieuNhap.size(); i++) {
            if (maPN.equals(listPhieuNhap.get(i).getMaPhieuNhap())) {
                if (i == 0) {
                    row = listPhieuNhap.size() - 1;
                } else {
                    row = i - 1;
                }
                PhieuNhap pn = QLPhieuNhap.dao.selectById(listPhieuNhap.get(row).getMaPhieuNhap());
                this.setFormPhieuNhap(pn);
                return;
            }
        }
    }//GEN-LAST:event_btnPrePhieuNhapActionPerformed

    private void btnFirstPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstPhieuNhapActionPerformed
        // TODO add your handling code here:
        PhieuNhap pn = QLPhieuNhap.dao.selectById(listPhieuNhap.get(0).getMaPhieuNhap());
        this.setFormPhieuNhap(pn);
    }//GEN-LAST:event_btnFirstPhieuNhapActionPerformed

    private void btnFindPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindPhieuNhapActionPerformed
        // TODO add your handling code here:
        this.findActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnFindPhieuNhapActionPerformed

    private void btnResetPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPhieuNhapActionPerformed
        // TODO add your handling code here:
        this.resetActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnResetPhieuNhapActionPerformed

    private void btnAddPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPhieuNhapActionPerformed
        // TODO add your handling code here:
        this.addActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnAddPhieuNhapActionPerformed

    private void btnDeletePhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePhieuNhapActionPerformed
        // TODO add your handling code here:
        this.deleteActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnDeletePhieuNhapActionPerformed

    private void btnUpdatePhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePhieuNhapActionPerformed
        // TODO add your handling code here:
        this.updateActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnUpdatePhieuNhapActionPerformed

    private void txtMaPhieuNhapCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtMaPhieuNhapCaretUpdate
        // TODO add your handling code here:
        String maPhieuNhap = txtMaPhieuNhap.getText().trim();
        if (maPhieuNhap.equals("")) {
            updateStatusPhieuNhapCT(false, Color.GRAY);
            return;
        }
        updateStatusPhieuNhapCT(true, new Color(255, 220, 126));
        QLNguyenLieu.fillAllToCbo(cboNguyenLieu_tabPhieuNhap);
        QLPhieuNhapCT.fillAllToCboByMaPhieuNhap(cboFindPhieuNhapCT, maPhieuNhap);
        updateStatusPhieuNhap(true);
    }//GEN-LAST:event_txtMaPhieuNhapCaretUpdate

    private void cboMaMonKhuyenMaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboMaMonKhuyenMaiItemStateChanged
        // TODO add your handling code here:
        String maMon = String.valueOf(cboMaMonKhuyenMai.getSelectedItem());
        MonAn mon = QLMonAn.dao.selectById(maMon);
        if (mon != null) {
            txtTenMonKhuyenMai.setText(mon.getTenMon());
            KhuyenMaiCT kmct = QLKhuyenMaiCT.dao.selectById(maMon, txtMaKhuyenMai.getText());
            if (kmct != null) {
                txtGiaTriKMCT.setText(String.valueOf(Math.round(kmct.getGiaTriKMCT() * 100)) + "%");
            }
        }
    }//GEN-LAST:event_cboMaMonKhuyenMaiItemStateChanged

    private void btnResetKhuyenMaiCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetKhuyenMaiCTActionPerformed
        // TODO add your handling code here:
        this.resetFormKhuyenMaiCT();
    }//GEN-LAST:event_btnResetKhuyenMaiCTActionPerformed

    private void btnAddKhuyenMaiCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddKhuyenMaiCTActionPerformed
        // TODO add your handling code here:
        KhuyenMaiCT kmct = this.getFormKhuyenMaiCT();
        if (kmct != null) {
            QLKhuyenMaiCT.insert(kmct);
        }
    }//GEN-LAST:event_btnAddKhuyenMaiCTActionPerformed

    private void btnDeleteKhuyenMaiCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteKhuyenMaiCTActionPerformed
        // TODO add your handling code here:
        String maMon = String.valueOf(cboMaMonKhuyenMai.getSelectedItem());
        if (!maMon.equals("Chưa chọn")) {
            if (QLKhuyenMaiCT.detele(txtMaKhuyenMai.getText(), maMon)) {
                QLKhuyenMaiCT.fillToCboByMaKhuyenMai(cboMaMonKhuyenMai, txtMaKhuyenMai.getText());
            }
        }
    }//GEN-LAST:event_btnDeleteKhuyenMaiCTActionPerformed

    private void btnUpdateKhuyenMaiCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateKhuyenMaiCTActionPerformed
        // TODO add your handling code here:
        KhuyenMaiCT kmct = this.getFormKhuyenMaiCT();
        if (kmct != null) {
            QLKhuyenMaiCT.update(kmct);
        }
    }//GEN-LAST:event_btnUpdateKhuyenMaiCTActionPerformed

    private void cboTenLoaiMonKMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTenLoaiMonKMItemStateChanged
        // TODO add your handling code here:
        cboMaMonKhuyenMai.setEnabled(true);
        String tenLoai = String.valueOf(cboTenLoaiMonKM.getSelectedItem());
        LoaiMon lm = QLLoaiMon.dao.selectByName(tenLoai);
        if (lm != null) {
            QLMonAn.fillToCboMaMonByLoaiMon(cboMaMonKhuyenMai, lm.getMaLoaiMon());
        }
    }//GEN-LAST:event_cboTenLoaiMonKMItemStateChanged

    private void btnLastKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastKhuyenMaiActionPerformed
        // TODO add your handling code here:
        KhuyenMai km = QLKhuyenMai.dao.selectById(listKhuyenMai.get(listKhuyenMai.size() - 1).getMaKhuyenMai());
        this.setFormKhuyenMai(km);
    }//GEN-LAST:event_btnLastKhuyenMaiActionPerformed

    private void btnNextKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextKhuyenMaiActionPerformed
        // TODO add your handling code here:
        String maKM = txtMaKhuyenMai.getText();
        if (maKM.equals("")) {
            btnLastKhuyenMaiActionPerformed(evt);
            return;
        }
        int row = -1;
        for (int i = 0; i < listKhuyenMai.size(); i++) {
            if (maKM.equals(listKhuyenMai.get(i).getMaKhuyenMai())) {
                if (i == listKhuyenMai.size() - 1) {
                    row = 0;
                } else {
                    row = i + 1;
                }
                KhuyenMai km = QLKhuyenMai.dao.selectById(listKhuyenMai.get(row).getMaKhuyenMai());
                this.setFormKhuyenMai(km);
                return;
            }
        }
    }//GEN-LAST:event_btnNextKhuyenMaiActionPerformed

    private void btnPreKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreKhuyenMaiActionPerformed
        // TODO add your handling code here:
        String maKM = txtMaKhuyenMai.getText();
        if (maKM.equals("")) {
            btnFirstKhuyenMaiActionPerformed(evt);
            return;
        }
        int row = -1;
        for (int i = 0; i < listKhuyenMai.size(); i++) {
            if (maKM.equals(listKhuyenMai.get(i).getMaKhuyenMai())) {
                if (i == 0) {
                    row = listKhuyenMai.size() - 1;
                } else {
                    row = i - 1;
                }
                KhuyenMai km = QLKhuyenMai.dao.selectById(listKhuyenMai.get(row).getMaKhuyenMai());
                this.setFormKhuyenMai(km);
                return;
            }
        }
    }//GEN-LAST:event_btnPreKhuyenMaiActionPerformed

    private void btnFirstKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstKhuyenMaiActionPerformed
        // TODO add your handling code here:
        KhuyenMai km = QLKhuyenMai.dao.selectById(listKhuyenMai.get(0).getMaKhuyenMai());
        this.setFormKhuyenMai(km);
    }//GEN-LAST:event_btnFirstKhuyenMaiActionPerformed

    private void btnFindKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindKhuyenMaiActionPerformed
        // TODO add your handling code here:
        this.findActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnFindKhuyenMaiActionPerformed

    private void btnResetKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetKhuyenMaiActionPerformed
        // TODO add your handling code here:
        this.resetActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnResetKhuyenMaiActionPerformed

    private void btnAddKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddKhuyenMaiActionPerformed
        // TODO add your handling code here:
        this.addActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnAddKhuyenMaiActionPerformed

    private void btnDeleteKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteKhuyenMaiActionPerformed
        // TODO add your handling code here:
        this.deleteActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnDeleteKhuyenMaiActionPerformed

    private void btnUpdateKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateKhuyenMaiActionPerformed
        // TODO add your handling code here:
        this.updateActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnUpdateKhuyenMaiActionPerformed

    private void btnUpdateCongThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCongThucActionPerformed
        // TODO add your handling code here:
        this.updateActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnUpdateCongThucActionPerformed

    private void btnResetCongThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCongThucActionPerformed
        // TODO add your handling code here:
        this.resetActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnResetCongThucActionPerformed

    private void btnAddCongThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCongThucActionPerformed
        // TODO add your handling code here:
        this.addActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnAddCongThucActionPerformed

    private void btnDeleteCongThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCongThucActionPerformed
        // TODO add your handling code here:
        this.deleteActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnDeleteCongThucActionPerformed

    private void cboNguyenLieuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboNguyenLieuItemStateChanged
        // TODO add your handling code here:
        String nguyenLieu = String.valueOf(cboNguyenLieu.getSelectedItem());
        txtDonViAuto.setEnabled(false);
        if (cboNguyenLieu.getSelectedIndex() > 0) {
            NguyenLieu nl = QLNguyenLieu.dao.selectByName(nguyenLieu);
            txtDonViAuto.setText(nl.getDonVi());
            XImage.setHinh(nl.getHinhNL(), lblHinhNguyenLieuCT);
        }
        this.updateStatusCongThuc(true);
    }//GEN-LAST:event_cboNguyenLieuItemStateChanged

    private void cboTenMonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTenMonItemStateChanged
        // TODO add your handling code here:
        String tenMon = String.valueOf(cboTenMon.getSelectedItem());
        txtMaMonAuto.setEnabled(false);
        MonAn mon = QLMonAn.dao.selectByName(tenMon);
        if (mon != null) {
            txtMaMonAuto.setText(mon.getMaMon());
            XImage.setHinh(mon.getHinhMA(), lblHinhCongThuc);
        }
        this.updateStatusCongThuc(true);
    }//GEN-LAST:event_cboTenMonItemStateChanged

    private void cboFindLoaiMonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboFindLoaiMonItemStateChanged
        // TODO add your handling code here:
        cboFindMonAn.setEnabled(true);
        String tenLoai = String.valueOf(cboFindLoaiMon.getSelectedItem());
        LoaiMon lm = QLLoaiMon.dao.selectByName(tenLoai);
        if (lm != null) {
            QLMonAn.fillToCboTenMonByLoaiMon(cboFindMonAn, lm.getMaLoaiMon());
        }
    }//GEN-LAST:event_cboFindLoaiMonItemStateChanged

    private void btnFindMonAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindMonAnActionPerformed
        // TODO add your handling code here:
        this.findActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnFindMonAnActionPerformed

    private void btnLastMonAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastMonAnActionPerformed
        // TODO add your handling code here:
        MonAn mon = QLMonAn.dao.selectByName(listMonAn.get(listMonAn.size() - 1).getTenMon());
        this.setFormMonAn(mon);
    }//GEN-LAST:event_btnLastMonAnActionPerformed

    private void btnNextMonAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextMonAnActionPerformed
        // TODO add your handling code here:
        String maMon = txtMaMon.getText();
        if (maMon.equals("")) {
            btnLastMonAnActionPerformed(evt);
            return;
        }
        int row = -1;
        for (int i = 0; i < listMonAn.size(); i++) {
            if (maMon.equals(listMonAn.get(i).getMaMon())) {
                if (i == listMonAn.size() - 1) {
                    row = 0;
                } else {
                    row = i + 1;
                }
                MonAn mon = QLMonAn.dao.selectByName(listMonAn.get(row).getTenMon());
                this.setFormMonAn(mon);
                return;
            }
        }
    }//GEN-LAST:event_btnNextMonAnActionPerformed

    private void btnPreMonAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreMonAnActionPerformed
        // TODO add your handling code here:
        String maMon = txtMaMon.getText();
        if (maMon.equals("")) {
            btnFirstMonAnActionPerformed(evt);
            return;
        }
        int row = -1;
        for (int i = 0; i < listMonAn.size(); i++) {
            if (maMon.equals(listMonAn.get(i).getMaMon())) {
                if (i == 0) {
                    row = listMonAn.size() - 1;
                } else {
                    row = i - 1;
                }
                MonAn mon = QLMonAn.dao.selectByName(listMonAn.get(row).getTenMon());
                this.setFormMonAn(mon);
                return;
            }
        }
    }//GEN-LAST:event_btnPreMonAnActionPerformed

    private void btnFirstMonAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstMonAnActionPerformed
        // TODO add your handling code here:
        MonAn mon = QLMonAn.dao.selectByName(listMonAn.get(0).getTenMon());
        this.setFormMonAn(mon);
    }//GEN-LAST:event_btnFirstMonAnActionPerformed

    private void btnResetMonAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetMonAnActionPerformed
        // TODO add your handling code here:
        this.resetActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnResetMonAnActionPerformed

    private void btnUpdateMonAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMonAnActionPerformed
        // TODO add your handling code here:
        this.updateActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnUpdateMonAnActionPerformed

    private void btnDeleteMonAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMonAnActionPerformed
        // TODO add your handling code here:
        this.deleteActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnDeleteMonAnActionPerformed

    private void btnAddMonAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMonAnActionPerformed
        // TODO add your handling code here:
        this.addActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnAddMonAnActionPerformed

    private void lblHinhMonAnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhMonAnMouseClicked
        // TODO add your handling code here:
        this.chonAnh(lblHinhMonAn);
    }//GEN-LAST:event_lblHinhMonAnMouseClicked

    private void cboCaTrucItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCaTrucItemStateChanged
        // TODO add your handling code here:
        CaTruc ct = QLCaTruc.dao.selectById(String.valueOf(cboCaTruc.getSelectedItem()));
        if (ct != null) {
            this.setFormCaTruc(ct);
        }
    }//GEN-LAST:event_cboCaTrucItemStateChanged

    private void btnFindChiTietCaTrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindChiTietCaTrucActionPerformed
        // TODO add your handling code here:
        String tenNhanVien = String.valueOf(cboNhanVienTruc.getSelectedItem());
        NhanVien nv = QLNhanVien.dao.selectByName(tenNhanVien);
        if (nv != null) {
            Date ngayTruc = XDate.stringToDate(String.valueOf(cboFindNgayTruc.getSelectedItem()), "dd-MM-yyyy");
            dateNgayTruc.setDate(ngayTruc);
            ChiTietCaTruc ctCaTruc = QLChiTietCaTruc.dao.selectById(nv.getMaNV(), XDate.dateParseString(ngayTruc, "yyyy/MM/dd"));

            if (ctCaTruc != null) {
                if (nv != null) {
                    cboCaTruc.setSelectedItem(ctCaTruc.getMaCaTruc());
                }
            } else {
                MsgBox.alert(this, "Không tìm thấy thông tin ca trực của nhân viên " + tenNhanVien + " vào ngày " + ngayTruc + "!");
                dateNgayTruc.setCalendar(null);
                cboCaTruc.setSelectedIndex(0);
            }

        } else {
            MsgBox.alert(this, "Bạn chưa chọn nhân viên!");
        }
    }//GEN-LAST:event_btnFindChiTietCaTrucActionPerformed

    private void btnResetCTCaTrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCTCaTrucActionPerformed
        // TODO add your handling code here:
        this.resetFormChiTietCaTruc();
    }//GEN-LAST:event_btnResetCTCaTrucActionPerformed

    private void btnAddCTCaTrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCTCaTrucActionPerformed
        // TODO add your handling code here:
        ChiTietCaTruc ctCaTruc = this.getFormChiTietCaTruc();
        if (ctCaTruc != null) {
            QLChiTietCaTruc.insert(ctCaTruc);
            fillAll((JComponent) tabs.getSelectedComponent());
            setForm((JComponent) tabs.getSelectedComponent());
        }
    }//GEN-LAST:event_btnAddCTCaTrucActionPerformed

    private void btnDeleteCTCaTrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCTCaTrucActionPerformed
        // TODO add your handling code here:
        NhanVien nv = QLNhanVien.dao.selectByName(cboNhanVienTruc.getSelectedItem().toString());

        if (QLChiTietCaTruc.detele(nv.getMaNV(), XDate.dateParseString(dateNgayTruc.getDate(), "yyyy-MM-dd"))) {
            QLChiTietCaTruc.fillToCbo(cboFindNgayTruc);
            fillAll((JComponent) tabs.getSelectedComponent());
            setForm((JComponent) tabs.getSelectedComponent());
        }
    }//GEN-LAST:event_btnDeleteCTCaTrucActionPerformed

    private void btnUpdateCTCaTrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCTCaTrucActionPerformed
        // TODO add your handling code here:
        ChiTietCaTruc ctCaTruc = this.getFormChiTietCaTruc();
        if (ctCaTruc != null) {
            QLChiTietCaTruc.update(ctCaTruc);
            fillAll((JComponent) tabs.getSelectedComponent());
            setForm((JComponent) tabs.getSelectedComponent());
        }
    }//GEN-LAST:event_btnUpdateCTCaTrucActionPerformed

    private void btnFindCaTrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindCaTrucActionPerformed
        // TODO add your handling code here:
        this.findActionPerformed((JComponent) tabs.getSelectedComponent());

    }//GEN-LAST:event_btnFindCaTrucActionPerformed

    private void btnResetCaTrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCaTrucActionPerformed
        // TODO add your handling code here:
        this.resetActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnResetCaTrucActionPerformed

    private void btnAddCaTrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCaTrucActionPerformed
        // TODO add your handling code here:
        this.addActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnAddCaTrucActionPerformed

    private void btnDeleteCaTrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCaTrucActionPerformed
        // TODO add your handling code here:
        this.deleteActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnDeleteCaTrucActionPerformed

    private void btnUpdateCaTrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCaTrucActionPerformed
        // TODO add your handling code here:
        this.updateActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnUpdateCaTrucActionPerformed

    private void btnLastNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastNhanVienActionPerformed
        // TODO add your handling code here:
        NhanVien nv = QLNhanVien.dao.selectByName(listNhanVien.get(listNhanVien.size() - 1).getHoTenNV());
        this.setFormNhanVien(nv);
    }//GEN-LAST:event_btnLastNhanVienActionPerformed

    private void btnFirstNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstNhanVienActionPerformed
        // TODO add your handling code here:
        NhanVien nv = QLNhanVien.dao.selectByName(listNhanVien.get(0).getHoTenNV());
        this.setFormNhanVien(nv);
    }//GEN-LAST:event_btnFirstNhanVienActionPerformed

    private void btnNextNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextNhanVienActionPerformed
        // TODO add your handling code here:
        String maNV = txtMaNV.getText();
        if (maNV.equals("")) {
            btnLastNhanVienActionPerformed(evt);
            return;
        }
        int row = -1;
        for (int i = 0; i < listNhanVien.size(); i++) {
            if (maNV.equals(listNhanVien.get(i).getMaNV())) {
                if (i == listNhanVien.size() - 1) {
                    row = 0;
                } else {
                    row = i + 1;
                }
                NhanVien nv = QLNhanVien.dao.selectByName(listNhanVien.get(row).getHoTenNV());
                this.setFormNhanVien(nv);
                return;
            }
        }

    }//GEN-LAST:event_btnNextNhanVienActionPerformed

    private void btnPreNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreNhanVienActionPerformed
        // TODO add your handling code here:
        String maNV = txtMaNV.getText();
        if (maNV.equals("")) {
            btnFirstNhanVienActionPerformed(evt);
            return;
        }
        int row = -1;
        for (int i = 0; i < listNhanVien.size(); i++) {
            if (maNV.equals(listNhanVien.get(i).getMaNV())) {
                if (i == 0) {
                    row = listNhanVien.size() - 1;
                } else {
                    row = i - 1;
                }
                NhanVien nv = QLNhanVien.dao.selectByName(listNhanVien.get(row).getHoTenNV());
                this.setFormNhanVien(nv);
                return;
            }
        }
    }//GEN-LAST:event_btnPreNhanVienActionPerformed

    private void cboFindChucVuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboFindChucVuItemStateChanged
        // TODO add your handling code here:
        cboFindNhanVien.setEnabled(true);
        String chucVu = String.valueOf(cboFindChucVu.getSelectedItem());
        ChucVu cv = QLChucVu.dao.selectByName(chucVu);
        if (cv != null) {
            QLNhanVien.fillToCboByChucVu(cboFindNhanVien, cv.getMaCV());
        }
    }//GEN-LAST:event_cboFindChucVuItemStateChanged

    private void btnFindNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindNhanVienActionPerformed
        // TODO add your handling code here:
        this.findActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnFindNhanVienActionPerformed

    private void btnDeleteNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteNhanVienActionPerformed
        // TODO add your handling code here:
        this.deleteActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnDeleteNhanVienActionPerformed

    private void btnUpdateNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateNhanVienActionPerformed
        // TODO add your handling code here:
        this.updateActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnUpdateNhanVienActionPerformed

    private void btnAddNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNhanVienActionPerformed
        // TODO add your handling code here:
        this.addActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnAddNhanVienActionPerformed

    private void lblHinhNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhNhanVienMouseClicked
        // TODO add your handling code here:
        this.chonAnh(lblHinhNhanVien);
    }//GEN-LAST:event_lblHinhNhanVienMouseClicked

    private void btnResetNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetNhanVienActionPerformed
        // TODO add your handling code here:
        this.resetActionPerformed((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_btnResetNhanVienActionPerformed

    private void txtMaNVCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtMaNVCaretUpdate
        // TODO add your handling code here:
        if (Auth.isManager()) {
            updateStatusNhanVien(true);
        }
    }//GEN-LAST:event_txtMaNVCaretUpdate

    private void tabsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabsStateChanged
        // TODO add your handling code here:
        fillAll((JComponent) tabs.getSelectedComponent());
        setForm((JComponent) tabs.getSelectedComponent());
    }//GEN-LAST:event_tabsStateChanged

    private void txtMaNVFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaNVFocusLost
        // TODO add your handling code here:
        if (!txtMaNV.getText().equals("")) {
            if (CheckInput.checkRegex(txtMaNV.getText(), REGEX_MANV, "Mã nhân viên nhập không hợp lệ!")) {
                txtMaNV.requestFocus();
            }

        }
    }//GEN-LAST:event_txtMaNVFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        if (!txtEmail.getText().equals("")) {
            if (CheckInput.checkRegex(txtEmail.getText(), REGEX_EMAIL, "Email nhân viên nhập không hợp lệ!")) {
                txtEmail.requestFocus();
            }

        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtSoDTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSoDTFocusLost
        // TODO add your handling code here:
        if (!txtSoDT.getText().equals("")) {
            CheckInput.checkRegex(txtSoDT.getText(), REGEX_SODT, "Số điện thoại nhân viên nhập không hợp lệ!");
            txtSoDT.requestFocus();
        }
    }//GEN-LAST:event_txtSoDTFocusLost

    private void txtMaCaTrucCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtMaCaTrucCaretUpdate
        // TODO add your handling code here:
        updateStatusCaTruc(true);
    }//GEN-LAST:event_txtMaCaTrucCaretUpdate

    private void cboNhanVienTrucItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboNhanVienTrucItemStateChanged
        // TODO add your handling code here:
        updateStatusCTCaTruc(true);
    }//GEN-LAST:event_cboNhanVienTrucItemStateChanged

    private void dateNgayTrucPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateNgayTrucPropertyChange
        // TODO add your handling code here:
        updateStatusCTCaTruc(true);
    }//GEN-LAST:event_dateNgayTrucPropertyChange

    private void txtMaMonCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtMaMonCaretUpdate
        // TODO add your handling code here:
        updateStatusMonAn(true);
    }//GEN-LAST:event_txtMaMonCaretUpdate

    private void txtMaKhuyenMaiCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtMaKhuyenMaiCaretUpdate
        // TODO add your handling code here:
        this.updateStatusKhuyenMai(true);
    }//GEN-LAST:event_txtMaKhuyenMaiCaretUpdate

    private void txtMaNgLieuCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtMaNgLieuCaretUpdate
        // TODO add your handling code here:
        this.updateStatusNguyenLieu(true);
    }//GEN-LAST:event_txtMaNgLieuCaretUpdate

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (!Auth.isLogin()) {
                    new Login().setVisible(true);
                    MsgBox.alert(null, "Vui lòng đăng nhập!");
                } else {
                    new ThemMoi().setVisible(true);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCTCaTruc;
    private javax.swing.JButton btnAddCaTruc;
    private javax.swing.JButton btnAddCongThuc;
    private javax.swing.JButton btnAddKhuyenMai;
    private javax.swing.JButton btnAddKhuyenMaiCT;
    private javax.swing.JButton btnAddMonAn;
    private javax.swing.JButton btnAddNguyenLieu;
    private javax.swing.JButton btnAddNhanVien;
    private javax.swing.JButton btnAddPhieuNhap;
    private javax.swing.JButton btnAddPhieuNhapCT;
    private javax.swing.JButton btnDanhMuc;
    private javax.swing.JButton btnDatMon;
    private javax.swing.JButton btnDeleteCTCaTruc;
    private javax.swing.JButton btnDeleteCaTruc;
    private javax.swing.JButton btnDeleteCongThuc;
    private javax.swing.JButton btnDeleteKhuyenMai;
    private javax.swing.JButton btnDeleteKhuyenMaiCT;
    private javax.swing.JButton btnDeleteMonAn;
    private javax.swing.JButton btnDeleteNguyenLieu;
    private javax.swing.JButton btnDeleteNhanVien;
    private javax.swing.JButton btnDeletePhieuNhap;
    private javax.swing.JButton btnDeletePhieuNhapCT;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFindCaTruc;
    private javax.swing.JButton btnFindChiTietCaTruc;
    private javax.swing.JButton btnFindKhuyenMai;
    private javax.swing.JButton btnFindMonAn;
    private javax.swing.JButton btnFindNguyenLieu;
    private javax.swing.JButton btnFindNhanVien;
    private javax.swing.JButton btnFindPhieuNhap;
    private javax.swing.JButton btnFindPhieuNhapCT;
    private javax.swing.JButton btnFirstKhuyenMai;
    private javax.swing.JButton btnFirstMonAn;
    private javax.swing.JButton btnFirstNguyenLieu;
    private javax.swing.JButton btnFirstNhanVien;
    private javax.swing.JButton btnFirstPhieuNhap;
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnLastKhuyenMai;
    private javax.swing.JButton btnLastMonAn;
    private javax.swing.JButton btnLastNguyenLieu;
    private javax.swing.JButton btnLastNhanVien;
    private javax.swing.JButton btnLastPhieuNhap;
    private javax.swing.JButton btnNextKhuyenMai;
    private javax.swing.JButton btnNextMonAn;
    private javax.swing.JButton btnNextNguyenLieu;
    private javax.swing.JButton btnNextNhanVien;
    private javax.swing.JButton btnNextPhieuNhap;
    private javax.swing.JButton btnPreKhuyenMai;
    private javax.swing.JButton btnPreMonAn;
    private javax.swing.JButton btnPreNguyenLieu;
    private javax.swing.JButton btnPreNhanVien;
    private javax.swing.JButton btnPrePhieuNhap;
    private javax.swing.JButton btnResetCTCaTruc;
    private javax.swing.JButton btnResetCaTruc;
    private javax.swing.JButton btnResetCongThuc;
    private javax.swing.JButton btnResetKhuyenMai;
    private javax.swing.JButton btnResetKhuyenMaiCT;
    private javax.swing.JButton btnResetMonAn;
    private javax.swing.JButton btnResetNguyenLieu;
    private javax.swing.JButton btnResetNhanVien;
    private javax.swing.JButton btnResetPhieuNhap;
    private javax.swing.JButton btnResetPhieuNhapCT;
    private javax.swing.JButton btnUpdateCTCaTruc;
    private javax.swing.JButton btnUpdateCaTruc;
    private javax.swing.JButton btnUpdateCongThuc;
    private javax.swing.JButton btnUpdateKhuyenMai;
    private javax.swing.JButton btnUpdateKhuyenMaiCT;
    private javax.swing.JButton btnUpdateMonAn;
    private javax.swing.JButton btnUpdateNguyenLieu;
    private javax.swing.JButton btnUpdateNhanVien;
    private javax.swing.JButton btnUpdatePhieuNhap;
    private javax.swing.JButton btnUpdatePhieuNhapCT;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cboCaTruc;
    private javax.swing.JComboBox<String> cboChucVu;
    private javax.swing.JComboBox<String> cboFindCaTruc;
    private javax.swing.JComboBox<String> cboFindChucVu;
    private javax.swing.JComboBox<String> cboFindKhuyenMai;
    private javax.swing.JComboBox<String> cboFindLoaiMon;
    private javax.swing.JComboBox<String> cboFindLoaiNgLieu;
    private javax.swing.JComboBox<String> cboFindMonAn;
    private javax.swing.JComboBox<String> cboFindNgayTruc;
    private javax.swing.JComboBox<String> cboFindNguyenLieu;
    private javax.swing.JComboBox<String> cboFindNhanVien;
    private javax.swing.JComboBox<String> cboFindPhieuNhap;
    private javax.swing.JComboBox<String> cboFindPhieuNhapCT;
    private javax.swing.JComboBox<String> cboLoaiMon;
    private javax.swing.JComboBox<String> cboLoaiNguyenLieu;
    private javax.swing.JComboBox<String> cboMaMonKhuyenMai;
    private javax.swing.JComboBox<String> cboNguoiNhap;
    private javax.swing.JComboBox<String> cboNguyenLieu;
    private javax.swing.JComboBox<String> cboNguyenLieu_tabPhieuNhap;
    private javax.swing.JComboBox<String> cboNhaCungCap;
    private javax.swing.JComboBox<String> cboNhanVienTruc;
    private javax.swing.JComboBox<String> cboTenLoaiMonKM;
    private javax.swing.JComboBox<String> cboTenMon;
    private com.toedter.calendar.JDateChooser dateNgayBatDau;
    private com.toedter.calendar.JDateChooser dateNgayKetThuc;
    private com.toedter.calendar.JDateChooser dateNgayLapPhieu;
    private com.toedter.calendar.JDateChooser dateNgayNhap;
    private com.toedter.calendar.JDateChooser dateNgaySinh;
    private com.toedter.calendar.JDateChooser dateNgayTruc;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblDonGia;
    private javax.swing.JLabel lblDonGiaNgLieu;
    private javax.swing.JLabel lblDonVi;
    private javax.swing.JLabel lblDonViNgLieu;
    private javax.swing.JLabel lblDonViNguyenLieu;
    private javax.swing.JLabel lblGiaTriKMCT;
    private javax.swing.JLabel lblGiaTriKMHD;
    private javax.swing.JLabel lblGioBatDau;
    private javax.swing.JLabel lblGioKetThuc;
    private javax.swing.JLabel lblHinhCongThuc;
    private javax.swing.JLabel lblHinhMonAn;
    private javax.swing.JLabel lblHinhNguyenLieu;
    private javax.swing.JLabel lblHinhNguyenLieuCT;
    private javax.swing.JLabel lblHinhNhanVien;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblLoaiMon;
    private javax.swing.JLabel lblLoaiNguyenLieu;
    private javax.swing.JLabel lblLuong;
    private javax.swing.JLabel lblMaCaTruc;
    private javax.swing.JLabel lblMaKhuyenMai;
    private javax.swing.JLabel lblMaMon;
    private javax.swing.JLabel lblMaMonKhuyenMai;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMaNgLieu;
    private javax.swing.JLabel lblMaPhieuNhap;
    private javax.swing.JLabel lblNgayBatDau;
    private javax.swing.JLabel lblNgayKetThuc;
    private javax.swing.JLabel lblNgayLapPhieu;
    private javax.swing.JLabel lblNgayNhap;
    private javax.swing.JLabel lblNgayTruc;
    private javax.swing.JLabel lblNguoiNhap;
    private javax.swing.JLabel lblNhaCungCap;
    private javax.swing.JLabel lblNhanVienTruc;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblSoDT;
    private javax.swing.JLabel lblSoDT1;
    private javax.swing.JLabel lblSoDT2;
    private javax.swing.JLabel lblSoDT3;
    private javax.swing.JLabel lblSoLuongNgLieu;
    private javax.swing.JLabel lblSoLuongNguyenLieu;
    private javax.swing.JLabel lblTenKhuyenMai;
    private javax.swing.JLabel lblTenLoaiMonKM;
    private javax.swing.JLabel lblTenMon;
    private javax.swing.JLabel lblTenMonKhuyenMai;
    private javax.swing.JLabel lblTenNguyenLieu;
    private javax.swing.JLabel lblTenNguyenLieu2;
    private javax.swing.JLabel lblTenNguyenLieu4;
    private javax.swing.JLabel lblTitleCaTruc;
    private javax.swing.JLabel lblTitleNV;
    private javax.swing.JPanel pnlCaTruc;
    private javax.swing.JPanel pnlCongThuc;
    private javax.swing.JPanel pnlCtr_CTCaTruc;
    private javax.swing.JPanel pnlCtr_CTPhieuNhap;
    private javax.swing.JPanel pnlCtr_KhuyenMaiCT;
    private javax.swing.JPanel pnlCtrlDieuHuong1;
    private javax.swing.JPanel pnlCtrlDieuHuong2;
    private javax.swing.JPanel pnlCtrlFormCongThuc;
    private javax.swing.JPanel pnlCtrlFormMonAn;
    private javax.swing.JPanel pnlCtrlFormMonAn1;
    private javax.swing.JPanel pnlCtrlFormNhanVien;
    private javax.swing.JPanel pnlFormCongThuc;
    private javax.swing.JPanel pnlFormKhuyenMai;
    private javax.swing.JPanel pnlFormKhuyenMaiCT;
    private javax.swing.JPanel pnlFormMonAn;
    private javax.swing.JPanel pnlFormMonAn1;
    private javax.swing.JPanel pnlFormNhanVien;
    private javax.swing.JPanel pnlFormPhieuNhap;
    private javax.swing.JPanel pnlFormPhieuNhap2;
    private javax.swing.JPanel pnlFormPhieuNhapCT;
    private javax.swing.JPanel pnlFormPhieuNhapCT2;
    private javax.swing.JPanel pnlKhuyenMai;
    private javax.swing.JPanel pnlMonAn;
    private javax.swing.JPanel pnlNguyenLieu;
    private javax.swing.JPanel pnlNhanVien;
    private javax.swing.JPanel pnlPhieuNhap;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JToolBar tlb;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtDonGiaNgLieu;
    private javax.swing.JTextField txtDonVi;
    private javax.swing.JTextField txtDonViAuto;
    private javax.swing.JTextField txtDonViNgLieu;
    private javax.swing.JTextField txtDonViNguyenLieu;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGiaTriKMCT;
    private javax.swing.JTextField txtGiaTriKMHD;
    private javax.swing.JTextField txtGioBatDau;
    private javax.swing.JTextField txtGioKetCa;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaCaTruc;
    private javax.swing.JTextField txtMaKhuyenMai;
    private javax.swing.JTextField txtMaMon;
    private javax.swing.JTextField txtMaMonAuto;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaNgLieu;
    private javax.swing.JTextField txtMaPhieuNhap;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtSoDT;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtSoLuongNgLieu;
    private javax.swing.JTextField txtSoLuongNguyenLieu;
    private javax.swing.JTextField txtTenKhuyenMai;
    private javax.swing.JTextField txtTenMon;
    private javax.swing.JTextField txtTenMonKhuyenMai;
    private javax.swing.JTextField txtTenNgLieu;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.phanQuyen();
        tabs.setSelectedIndex(0);
        fillAll((JComponent) tabs.getSelectedComponent());
        setForm((JComponent) tabs.getSelectedComponent());
        if (QLThongKe.indexTabThemMoi > 0) {
            tabs.setSelectedIndex(QLThongKe.indexTabThemMoi);
        }
    }

    private void phanQuyen() {
        if (!Auth.isManager()) {
            tabs.remove(1); // CaTruc
            updateStatusNhanVien(false);
            if (Auth.user.getMaCV().toString().equals("CV002")) {
                tabs.remove(1); // MonAn
                tabs.remove(1); // CongThuc
//                tabs.remove(1); // KhuyenMai
//                tabs.remove(2); // NhaCungCap
                tabs.remove(2); // PhieuNhap
                tabs.remove(2); // NguyenLieu
            } else if (Auth.user.getMaCV().toString().equals("CV003")) {
                tabs.remove(3); // KhuyenMai
            }
        }
    }

    private void setForm(JComponent component) {
        if (pnlNhanVien.equals(component)) {
            if (Entity.nhanVien != null) {
                this.setFormNhanVien(Entity.nhanVien);
            } else {
                this.setFormNhanVien(Auth.user);
            }
        }
        if (pnlCaTruc.equals(component)) {
            if (Entity.ctCaTruc != null) {
                this.setFormChiTietCaTruc(Entity.ctCaTruc);
                String maCaTruc = String.valueOf(Entity.ctCaTruc.getMaCaTruc());
                CaTruc caTruc = QLCaTruc.dao.selectById(maCaTruc);
                this.setFormCaTruc(caTruc);

            }
        }
        if (pnlMonAn.equals(component)) {
            if (Entity.monAn != null) {
                this.setFormMonAn(Entity.monAn);
            }
        }
        if (pnlCongThuc.equals(component)) {
        }
        if (pnlKhuyenMai.equals(component)) {
            if (Entity.khuyenMai != null) {
                this.setFormKhuyenMai(Entity.khuyenMai);
            }
        }
        if (pnlPhieuNhap.equals(component)) {
            if (Entity.phieuNhap != null) {
                this.setFormPhieuNhap(Entity.phieuNhap);
            }
            if (Entity.phieuNhapCT != null) {
                this.setFormPhieuNhapCT(Entity.phieuNhapCT);
            }
        }
        if (pnlNguyenLieu.equals(component)) {
            if (Entity.nguyenLieu != null) {
                this.setFormNguyenLieu(Entity.nguyenLieu);
            }
        }
    }

    private void fillAll(JComponent component) {
        if (pnlNhanVien.equals(component)) {
            QLChucVu.fillToCbo(cboChucVu);
            QLChucVu.fillToCbo(cboFindChucVu);
            QLNhanVien.fillAllToCbo(cboFindNhanVien);
            cboFindNhanVien.setEnabled(false);
        }
        if (pnlCaTruc.equals(component)) {
            QLCaTruc.fillAllToCbo(cboFindCaTruc);
            QLNhanVien.fillAllToCbo(cboNhanVienTruc);
            QLChiTietCaTruc.fillToCbo(cboFindNgayTruc);
            updateStatusCaTruc(true);
            QLCaTruc.fillAllToCbo(cboCaTruc);
        }
        if (pnlMonAn.equals(component)) {
            QLLoaiMon.fillToCbo(cboLoaiMon);
            QLLoaiMon.fillToCbo(cboFindLoaiMon);
            cboFindMonAn.setEnabled(false);
        }
        if (pnlCongThuc.equals(component)) {
            QLMonAn.fillToCbo(cboTenMon);
            QLNguyenLieu.fillAllToCbo(cboNguyenLieu);
        }
        if (pnlKhuyenMai.equals(component)) {
            QLKhuyenMai.fillAllToCbo(cboFindKhuyenMai);
            this.resetFormKhuyenMaiCT();
            cboMaMonKhuyenMai.setEnabled(false);
//            QLMonAn.fillToCbo(cboMaMonKhuyenMai);
        }
        if (pnlPhieuNhap.equals(component)) {
            QLNhanVien.fillAllToCbo(cboNguoiNhap);
            QLNhaCungCap.fillToCbo(cboNhaCungCap);
            QLPhieuNhap.fillAllToCbo(cboFindPhieuNhap);
        }
        if (pnlNguyenLieu.equals(component)) {
            //        QLNguyenLieu.fillAllToCbo(cboTenNguyenLieu);
            QLLoaiNgLieu.fillToCbo(cboLoaiNguyenLieu);
            QLLoaiNgLieu.fillToCbo(cboFindLoaiNgLieu);
            cboFindNguyenLieu.setEnabled(false);
        }
    }

    private void resetActionPerformed(JComponent component) {
        if (pnlNhanVien.equals(component)) {
            this.resetFormNhanVien();
        }
        if (pnlCaTruc.equals(component)) {
            this.resetFormCaTruc();
        }
        if (pnlMonAn.equals(component)) {
            this.resetFormMonAn();
        }
        if (pnlCongThuc.equals(component)) {
            this.resetFormCongThuc();
        }
        if (pnlKhuyenMai.equals(component)) {
            this.resetFormKhuyenMai();
        }
        if (pnlPhieuNhap.equals(component)) {
            this.resetFormPhieuNhap();
        }
        if (pnlNguyenLieu.equals(component)) {
            this.resetFormNguyenLieu();
        }
    }

    private void addActionPerformed(JComponent component) {
        if (pnlNhanVien.equals(component)) {
            NhanVien nv = this.getFormNhanVien();

            if (nv != null) {
                QLNhanVien.insert(nv);
                listNhanVien.add(nv);
            }
        }
        if (pnlCaTruc.equals(component)) {
            CaTruc ct = this.getFormCaTruc();
            if (ct != null) {
                QLCaTruc.insert(ct);
            }
        }
        if (pnlMonAn.equals(component)) {
            MonAn mon = this.getFormMonAn();
            if (mon != null) {
                QLMonAn.insert(mon);
                listMonAn.add(mon);
            }
        }
        if (pnlCongThuc.equals(component)) {
            CongThuc ct = this.getFormCongThuc();
            if (ct != null) {
                QLCongThuc.insert(ct);
            }
        }
        if (pnlKhuyenMai.equals(component)) {
            KhuyenMai km = this.getFormKhuyenMai();
            if (km != null) {
                QLKhuyenMai.insert(km);
                listKhuyenMai.add(km);
            }
        }
        if (pnlPhieuNhap.equals(component)) {
            PhieuNhap pn = this.getFormPhieuNhap();
            if (pn != null) {
                QLPhieuNhap.insert(pn);
                listPhieuNhap.add(pn);
            }
        }
        if (pnlNguyenLieu.equals(component)) {
            NguyenLieu nl = this.getFormNguyenLieu();
            if (nl != null) {
                QLNguyenLieu.insert(nl);
                listNguyenLieu.add(nl);
            }
        }
        fillAll((JComponent) tabs.getSelectedComponent());
        resetActionPerformed((JComponent) tabs.getSelectedComponent());
    }

    private void updateActionPerformed(JComponent component) {
        if (pnlNhanVien.equals(component)) {
            NhanVien nv = this.getFormNhanVien();
            if (nv != null) {
                QLNhanVien.update(nv);
            }
        }
        if (pnlCaTruc.equals(component)) {
            CaTruc ct = this.getFormCaTruc();
            if (ct != null) {
                QLCaTruc.update(ct);
            }
        }
        if (pnlMonAn.equals(component)) {
            MonAn mon = this.getFormMonAn();
            if (mon != null) {
                QLMonAn.update(mon);
            }
        }
        if (pnlCongThuc.equals(component)) {
            CongThuc ct = this.getFormCongThuc();
            if (ct != null) {
                QLCongThuc.update(ct);
            }
        }
        if (pnlKhuyenMai.equals(component)) {
            KhuyenMai km = this.getFormKhuyenMai();
            System.out.println("KhuyenMai");
            if (km != null) {
                QLKhuyenMai.update(km);
                System.out.println("KhuyenMai" + km.getMaKhuyenMai());
            }
        }
        if (pnlPhieuNhap.equals(component)) {
            PhieuNhap pn = this.getFormPhieuNhap();
            if (pn != null) {
                QLPhieuNhap.update(pn);
            }
        }
        if (pnlNguyenLieu.equals(component)) {
            NguyenLieu nl = this.getFormNguyenLieu();
            if (nl != null) {
                QLNguyenLieu.update(nl);
            }
        }
        fillAll((JComponent) tabs.getSelectedComponent());
    }

    private void deleteActionPerformed(JComponent component) {
        if (pnlNhanVien.equals(component)) {
            if (QLNhanVien.detele(txtMaNV.getText())) {
                listNhanVien = QLNhanVien.dao.selectAll();
                this.resetFormNhanVien();
            }
        }
        if (pnlCaTruc.equals(component)) {
            if (QLCaTruc.detele(txtMaCaTruc.getText())) {
                this.resetFormCaTruc();
            }
        }
        if (pnlMonAn.equals(component)) {
            if (QLMonAn.detele(txtMaMon.getText())) {
                listMonAn = QLMonAn.dao.selectAll();
                this.resetFormMonAn();
            }
        }
        if (pnlCongThuc.equals(component)) {
            String[] ids = {cboTenMon.getSelectedItem().toString(), cboNguyenLieu.getSelectedItem().toString()};
            if (QLCongThuc.detele(ids)) {
                this.resetFormCongThuc();
            }
        }
        if (pnlKhuyenMai.equals(component)) {
            if (QLKhuyenMai.detele(txtMaKhuyenMai.getText())) {
                listKhuyenMai = QLKhuyenMai.dao.selectAll();
                this.resetFormKhuyenMai();
            }
        }
        if (pnlPhieuNhap.equals(component)) {
            if (QLPhieuNhap.detele(txtMaPhieuNhap.getText())) {
                listPhieuNhap = QLPhieuNhap.dao.selectAll();
                this.resetFormPhieuNhap();
            }
        }
        if (pnlNguyenLieu.equals(component)) {
            if (QLNguyenLieu.detele(txtMaNgLieu.getText())) {
                listNguyenLieu = QLNguyenLieu.dao.selectAll();
                this.resetFormNguyenLieu();
            }
        }
        fillAll((JComponent) tabs.getSelectedComponent());

    }

    private void findActionPerformed(JComponent component) {
        if (pnlNhanVien.equals(component)) {
            NhanVien nv = QLNhanVien.dao.selectByName(cboFindNhanVien.getSelectedItem().toString());
            if (nv != null) {
                this.setFormNhanVien(nv);
            }
        }
        if (pnlCaTruc.equals(component)) {
            CaTruc caTruc = QLCaTruc.dao.selectById(String.valueOf(this.cboFindCaTruc.getSelectedItem()));
            if (caTruc != null) {
                this.setFormCaTruc(caTruc);
            }
        }
        if (pnlMonAn.equals(component)) {
            MonAn mon = QLMonAn.dao.selectByName((String) cboFindMonAn.getSelectedItem());
            if (mon != null) {
                this.setFormMonAn(mon);
            }
        }
        if (pnlCongThuc.equals(component)) {
        }
        if (pnlKhuyenMai.equals(component)) {
            KhuyenMai km = QLKhuyenMai.dao.selectById(String.valueOf(this.cboFindKhuyenMai.getSelectedItem()));
            if (km != null) {
                this.setFormKhuyenMai(km);
            }
        }
        if (pnlPhieuNhap.equals(component)) {
            PhieuNhap pn = QLPhieuNhap.dao.selectById(cboFindPhieuNhap.getSelectedItem().toString());
            if (pn != null) {
                this.setFormPhieuNhap(pn);
            }
        }
        if (pnlNguyenLieu.equals(component)) {
            NguyenLieu nl = QLNguyenLieu.dao.selectByName(cboFindNguyenLieu.getSelectedItem().toString());
            if (nl != null) {
                this.setFormNguyenLieu(nl);
            }
        }
    }

    private void resetFormNhanVien() {
        txtMaNV.setText("");
        txtHoTen.setText("");
        btnGroupGender.clearSelection();
        dateNgaySinh.setCalendar(null);
        txtSoDT.setText("");
        txtEmail.setText("");
        txtDiaChi.setText("");
        cboChucVu.setSelectedIndex(0);
        txtLuong.setText("");
        txtPass.setText("");
        cboFindChucVu.setSelectedIndex(0);
        cboFindNhanVien.setSelectedIndex(0);
        cboFindNhanVien.setEnabled(false);

        lblHinhNhanVien.setText("Hình Ảnh");
        lblHinhNhanVien.setToolTipText("");
        lblHinhNhanVien.setIcon(null);
    }

    private void setFormNhanVien(NhanVien nv) {
        if (nv != null) {
            txtMaNV.setText(nv.getMaNV());
            txtHoTen.setText(nv.getHoTenNV());
            if (nv.getGioiTinh().equals("Nam")) {
                rdoNam.setSelected(true);
            } else {
                rdoNu.setSelected(true);
            }
            dateNgaySinh.setDate(nv.getNgaySinh());
            txtSoDT.setText(nv.getSoDT());
            txtEmail.setText(nv.getEmail());
            txtDiaChi.setText(nv.getDiaChi());
            ChucVu chucVu = QLChucVu.dao.selectById(nv.getMaCV());
            cboChucVu.setSelectedItem(chucVu.getChucVu());
            int luong = (int) chucVu.getLuong();
            txtLuong.setText(String.valueOf(luong));
            txtPass.setText(nv.getMatKhau());
            XImage.setHinh(nv.getHinhNV(), lblHinhNhanVien);
        } else {
            MsgBox.alert(this, "Không tìm thấy thông tin nhân viên!");
        }
    }

    private NhanVien getFormNhanVien() {
        if (CheckInput.checkTextEmpty(txtMaNV.getText(), "Chưa nhập Mã nhân viên!")
                || CheckInput.checkTextEmpty(txtHoTen.getText(), "Chưa nhập Họ tên nhân viên!")
                || CheckInput.checkDateEmpty(dateNgaySinh, "Chưa nhập Ngày sinh nhân viên!")
                || CheckInput.checkTextEmpty(txtSoDT.getText(), "Chưa nhập Số điện thoại nhân viên!")
                || CheckInput.checkTextEmpty(txtEmail.getText(), "Chưa nhập Email nhân viên!")
                || CheckInput.checkTextEmpty(txtDiaChi.getText(), "Chưa nhập Địa chỉ nhân viên!")
                || CheckInput.checkComboBoxEmpty(cboChucVu, "Chưa chọn Chức vụ nhân viên!")
                || CheckInput.checkTextEmpty(lblHinhNhanVien.getToolTipText(), "Chưa thêm hình ảnh nhân viên!")) {
            return null;
        }
        if (!rdoNam.isSelected() && !rdoNu.isSelected()) {
            MsgBox.alert(this, "Chưa chọn giới tính nhân viên!");
            return null;
        }

        NhanVien nv = QLNhanVien.dao.selectById(txtMaNV.getText());
        if (nv != null) {
            if (MsgBox.confirm(this, "Mã nhân viên này đã tồn tại! Bạn có muốn điều chỉnh lại mã nhân viên không?")) {
                txtMaNV.requestFocus();
            } else {
                this.setFormNhanVien(nv);
            }
        }
        NhanVien entity = new NhanVien();
        entity.setMaNV(txtMaNV.getText().trim());
        entity.setHoTenNV(txtHoTen.getText().trim());
        entity.setGioiTinh(rdoNam.isSelected() ? "Nam" : "Nữ");
        entity.setNgaySinh(dateNgaySinh.getDate());
        entity.setSoDT(txtSoDT.getText().trim());
        entity.setEmail(txtEmail.getText().trim());
        entity.setDiaChi(txtDiaChi.getText().trim());

        ChucVu cv = QLChucVu.dao.selectByName((String) cboChucVu.getSelectedItem());
        entity.setMaCV(String.valueOf(cv.getMaCV()));
        entity.setMatKhau(txtPass.getText().trim());
        entity.setHinhNV(lblHinhNhanVien.getToolTipText());
        return entity;
    }

    private void resetFormCaTruc() {
        txtMaCaTruc.setText("");
        txtGioBatDau.setText("");
        txtGioKetCa.setText("");
        cboFindCaTruc.setSelectedIndex(0);
        this.resetFormChiTietCaTruc();
    }

    private void setFormCaTruc(CaTruc caTruc) {
        if (caTruc != null) {
            txtMaCaTruc.setText(String.valueOf(caTruc.getMaCaTruc()));
            txtGioBatDau.setText(XDate.timeParseString(caTruc.getGioBatDau(), "hh:mm:ss"));
            txtGioKetCa.setText(XDate.timeParseString(caTruc.getGioKetCa(), "hh:mm:ss"));
        } else {
            MsgBox.alert(this, "Không tìm thấy thông tin ca trực!");
        }
    }

    private CaTruc getFormCaTruc() {
        CaTruc entity = new CaTruc();
        if (CheckInput.checkTextEmpty(txtMaCaTruc.getText(), "Chưa nhập Mã ca trực!")
                || CheckInput.checkTextEmpty(txtGioBatDau.getText(), "Chưa nhập Giờ bắt đầu ca trực!")
                || CheckInput.checkTextEmpty(txtGioKetCa.getText(), "Chưa nhập Giờ kết thúc ca trực!")) {
            return null;
        }
        entity.setMaCaTruc(Integer.parseInt(txtMaCaTruc.getText()));
        entity.setGioBatDau(XDate.toTime(txtGioBatDau.getText().trim(), "hh:mm:ss"));
        entity.setGioKetCa(XDate.toTime(txtGioKetCa.getText().trim(), "hh:mm:ss"));
        return entity;
    }

    private void resetFormChiTietCaTruc() {
        cboNhanVienTruc.setSelectedIndex(0);
        dateNgayTruc.setCalendar(null);
        cboCaTruc.setSelectedIndex(0);
        cboFindNgayTruc.setSelectedIndex(0);
    }

    private void setFormChiTietCaTruc(ChiTietCaTruc ctCaTruc) {
        cboCaTruc.setSelectedItem(ctCaTruc.getMaCaTruc());
        NhanVien nv = QLNhanVien.dao.selectById(ctCaTruc.getMaNV());
        cboNhanVienTruc.setSelectedItem(nv.getHoTenNV());
        dateNgayTruc.setDate(ctCaTruc.getNgayTruc());
    }

    private ChiTietCaTruc getFormChiTietCaTruc() {
        if (CheckInput.checkComboBoxEmpty(cboCaTruc, "Chưa chọn Mã ca trực!")
                || CheckInput.checkDateEmpty(dateNgayTruc, "Chưa nhập Ngày trực nhân viên!")
                || CheckInput.checkComboBoxEmpty(cboNhanVienTruc, "Chưa chọn Tên nhân viên!")) {
            return null;
        }
        ChiTietCaTruc entity = new ChiTietCaTruc();
        entity.setMaCaTruc(Integer.parseInt(String.valueOf(cboCaTruc.getSelectedItem())));
        String maNV = QLNhanVien.dao.selectByName(String.valueOf(cboNhanVienTruc.getSelectedItem())).getMaNV();
        entity.setMaNV(maNV);
        entity.setNgayTruc(dateNgayTruc.getDate());
        return entity;
    }

    private void resetFormMonAn() {
        txtMaMon.setText("");
        txtTenMon.setText("");
        cboLoaiMon.setSelectedIndex(0);
        txtDonVi.setText("");
        txtDonGia.setText("");
        cboFindLoaiMon.setSelectedIndex(0);
        cboFindMonAn.setSelectedIndex(0);
        cboFindMonAn.setEnabled(false);

        lblHinhMonAn.setText("Hình Ảnh");
        lblHinhMonAn.setToolTipText("");
        lblHinhMonAn.setIcon(null);
    }

    private void setFormMonAn(MonAn mon) {
        if (mon != null) {
            txtMaMon.setText(mon.getMaMon());
            txtTenMon.setText(mon.getTenMon());
            String loaiMon = QLLoaiMon.dao.selectById(mon.getMaLoaiMon()).getTenLoaiMon();
            cboLoaiMon.setSelectedItem(loaiMon);
            txtDonVi.setText(mon.getDonVi());
            txtDonGia.setText(String.valueOf(mon.getDonGia()));
            XImage.setHinh(mon.getHinhMA(), lblHinhMonAn);
        } else {
            MsgBox.alert(this, "Không tìm thấy thông tin món ăn!");
        }
    }

    private MonAn getFormMonAn() {

        if (CheckInput.checkTextEmpty(txtMaMon.getText(), "Chưa nhập Mã Món!")
                || CheckInput.checkTextEmpty(txtTenMon.getText(), "Chưa nhập Tên Món!")
                || CheckInput.checkComboBoxEmpty(cboLoaiMon, "Chưa chọn Loại Món!")
                || CheckInput.checkTextEmpty(txtDonVi.getText(), "Chưa nhập Đơn Vị!")
                || CheckInput.checkTextEmpty(txtDonGia.getText(), "Chưa nhập Đơn Giá!")
                || CheckInput.checkTextEmpty(lblHinhMonAn.getToolTipText(), "Chưa thêm hình ảnh Món Ăn!")) {
            return null;
        }
        MonAn entity = new MonAn();
        entity.setMaMon(txtMaMon.getText().trim());
        entity.setTenMon(txtTenMon.getText().trim());
        String maLoaiMon = String.valueOf(QLLoaiMon.dao.selectByName(String.valueOf(cboLoaiMon.getSelectedItem())).getMaLoaiMon());
        entity.setMaLoaiMon(maLoaiMon);
        entity.setDonVi(txtDonVi.getText().trim());
        entity.setDonGia(CheckInput.checkInputFloat(txtDonGia.getText().trim(), "Lỗi nhập liệu đơn giá món ăn!"));
        entity.setHinhMA(lblHinhMonAn.getToolTipText());
        return entity;
    }

    private void resetFormPhieuNhap() {
        this.txtMaPhieuNhap.setText("");
        this.dateNgayLapPhieu.setCalendar(null);
        this.dateNgayNhap.setCalendar(null);
        this.cboNguoiNhap.setSelectedIndex(0);
        this.cboNhaCungCap.setSelectedIndex(0);
        cboFindPhieuNhap.setSelectedIndex(0);
    }

    private void setFormPhieuNhap(PhieuNhap pn) {
        if (pn != null) {
            this.txtMaPhieuNhap.setText(pn.getMaPhieuNhap());
            this.dateNgayLapPhieu.setDate(pn.getNgayLapPhieu());
            this.dateNgayNhap.setDate(pn.getNgayNhap());
            String hoTenNV = QLNhanVien.dao.selectById(pn.getMaNV()).getHoTenNV();
            this.cboNguoiNhap.setSelectedItem(hoTenNV);
            String tenCC = QLNhaCungCap.dao.selectById(pn.getMaCC()).getTenCC();
            this.cboNhaCungCap.setSelectedItem(tenCC);
        } else {
            MsgBox.alert(this, "Không tìm thấy thông tin phiếu nhập!");
        }
    }

    private PhieuNhap getFormPhieuNhap() {
        if (CheckInput.checkTextEmpty(txtMaPhieuNhap.getText(), "Chưa nhập Mã Phiếu Nhập!")
                || CheckInput.checkDateEmpty(dateNgayLapPhieu, "Chưa nhập Ngày lập phiếu!")
                || CheckInput.checkDateEmpty(dateNgayNhap, "Chưa nhập Ngày nhập!")
                || CheckInput.checkComboBoxEmpty(cboNguoiNhap, "Chưa chọn Tên nhân viên nhập phiếu!")
                || CheckInput.checkComboBoxEmpty(cboNhaCungCap, "Chưa chọn Tên Nhà Cung Cấp!")) {
            return null;
        }
        PhieuNhap entity = new PhieuNhap();
        entity.setMaPhieuNhap(txtMaPhieuNhap.getText().trim());
        entity.setNgayLapPhieu(dateNgayLapPhieu.getDate());
        entity.setNgayNhap(dateNgayNhap.getDate());
        String maNV = QLNhanVien.dao.selectByName(String.valueOf(cboNguoiNhap.getSelectedItem())).getMaNV();
        entity.setMaNV(maNV);
        String maCC = QLNhaCungCap.dao.selectByName(String.valueOf(cboNhaCungCap.getSelectedItem())).getMaCC();
        entity.setMaCC(maCC);
        return entity;
    }

    private void resetFormPhieuNhapCT() {
//        this.cboMaPhieuNhap.setSelectedIndex(0);
        this.cboNguyenLieu_tabPhieuNhap.setSelectedIndex(0);
        this.txtDonGiaNgLieu.setText("");
        this.txtDonViNgLieu.setText("");
        this.txtSoLuongNgLieu.setText("");
        cboFindPhieuNhapCT.setSelectedIndex(0);
    }

    private void setFormPhieuNhapCT(PhieuNhapCT pnct) {
        if (pnct != null) {
            String tenNgLieu = QLNguyenLieu.dao.selectById(pnct.getMaNgLieu()).getTenNgLieu();
            this.cboNguyenLieu_tabPhieuNhap.setSelectedItem(tenNgLieu);
            this.txtDonGiaNgLieu.setText(String.valueOf(pnct.getDonGia()));
            this.txtDonViNgLieu.setText(pnct.getDonVi());
            this.txtSoLuongNgLieu.setText(String.valueOf(pnct.getSoLuong()));
        } else {
            MsgBox.alert(this, "Không tìm thấy thông tin phiếu nhập chi tiết!");
        }
    }

    private PhieuNhapCT getFormPhieuNhapCT() {
        if (CheckInput.checkComboBoxEmpty(cboFindPhieuNhapCT, "Chưa chọn Mã Phiếu Nhập Chi Tiết!")
                || CheckInput.checkTextEmpty(txtMaPhieuNhap.getText(), "Chưa nhập Mã Phiếu Nhập!")
                || CheckInput.checkComboBoxEmpty(cboNguyenLieu_tabPhieuNhap, "Chưa chọn Tên nguyên liệu!")
                || CheckInput.checkTextEmpty(txtDonGiaNgLieu.getText(), "Chưa nhập Đơn giá nguyên liệu!")
                || CheckInput.checkTextEmpty(txtDonViNgLieu.getText(), "Chưa nhập Đơn vị nguyên liệu!")
                || CheckInput.checkTextEmpty(txtSoLuongNgLieu.getText(), "Chưa nhập Số lượng nguyên liệu!")) {
            return null;
        }
        PhieuNhapCT entity = new PhieuNhapCT();
        String maPhieuNhapCT = String.valueOf(cboFindPhieuNhapCT.getSelectedItem());
        entity.setMaPhieuNhapCT(Integer.parseInt(maPhieuNhapCT));
        entity.setMaPhieuNhap(txtMaPhieuNhap.getText().trim());
        NguyenLieu nguyenLieu = QLNguyenLieu.dao.selectByName(String.valueOf(cboNguyenLieu_tabPhieuNhap.getSelectedItem()));
        entity.setMaNgLieu(nguyenLieu.getMaNgLieu());
        entity.setDonGia(CheckInput.checkInputFloat(txtDonGiaNgLieu.getText().trim(), "Lỗi nhập liệu đơn giá nguyên liệu!"));
        entity.setDonVi(txtDonViNgLieu.getText().trim());
        entity.setSoLuong(CheckInput.checkInputFloat(txtSoLuongNgLieu.getText().trim(), "Lỗi nhập liệu số lượng nguyên liệu!"));
        return entity;
    }

    private void resetFormKhuyenMai() {
        txtMaKhuyenMai.setText("");
        txtTenKhuyenMai.setText("");
        dateNgayBatDau.setCalendar(null);
        dateNgayKetThuc.setCalendar(null);
        txtGiaTriKMHD.setText("");
        cboFindKhuyenMai.setSelectedIndex(0);
        this.updateStatusKhuyenMaiCT(true, new Color(255, 220, 126));
    }

    private void setFormKhuyenMai(KhuyenMai km) {
        txtMaKhuyenMai.setText(km.getMaKhuyenMai());
        txtTenKhuyenMai.setText(km.getTenKhuyenMai());
        dateNgayBatDau.setDate(km.getNgayBatDau());
        dateNgayKetThuc.setDate(km.getNgayKetThuc());

        if (km.getGiaTriKMHD() > 0) {
            txtGiaTriKMHD.setText(String.valueOf(Math.round(km.getGiaTriKMHD() * 100)) + "%");
            updateStatusKhuyenMaiCT(false, Color.GRAY);
        } else {
            txtGiaTriKMHD.setText("");
            updateStatusKhuyenMaiCT(true, new Color(255, 220, 126));
            txtTenMonKhuyenMai.setEnabled(false);
            QLKhuyenMaiCT.fillToCboByMaKhuyenMai(cboMaMonKhuyenMai, km.getMaKhuyenMai());
        }
    }

    private KhuyenMai getFormKhuyenMai() {
        if (CheckInput.checkTextEmpty(txtMaKhuyenMai.getText(), "Chưa nhập Mã khuyến mãi!")
                || CheckInput.checkTextEmpty(txtTenKhuyenMai.getText(), "Chưa nhập Tên khuyến mãi!")
                || CheckInput.checkDateEmpty(dateNgayBatDau, "Chưa nhập ngày bắt đầu khuyến mãi!")
                || CheckInput.checkDateEmpty(dateNgayBatDau, "Chưa nhập ngày kết thúc khuyến mãi!")) {
            return null;
        }
//        if (txtGiaTriKMCT.getText().equals("")) {
//            CheckInput.checkTextEmpty(txtGiaTriKMHD.getText(), "Chưa nhập giá trị khuyến mãi trên tổng hóa đơn!");
//            return null;
//        }
        KhuyenMai entity = new KhuyenMai();
        entity.setMaKhuyenMai(txtMaKhuyenMai.getText());
        entity.setTenKhuyenMai(txtTenKhuyenMai.getText());
        entity.setNgayBatDau(dateNgayBatDau.getDate());
        entity.setNgayKetThuc(dateNgayKetThuc.getDate());
        String giaTri = txtGiaTriKMHD.getText();
        float giaTriKhuyenMai = CheckInput.checkInputFloat(giaTri.substring(0, 1), "Lỗi nhập liệu giá trị khuyến mãi trên tổng hóa đơn!") / 100;
        entity.setGiaTriKMHD(giaTriKhuyenMai);
        System.out.println("" + giaTriKhuyenMai);
        return entity;
    }

    private void resetFormKhuyenMaiCT() {
        QLLoaiMon.fillToCbo(cboTenLoaiMonKM);
        cboTenLoaiMonKM.setSelectedIndex(0);
        cboMaMonKhuyenMai.setSelectedIndex(0);
        cboMaMonKhuyenMai.setEnabled(false);
        txtTenMonKhuyenMai.setText("");
        txtGiaTriKMCT.setText("");
    }

    private KhuyenMaiCT getFormKhuyenMaiCT() {
        if (CheckInput.checkTextEmpty(txtMaKhuyenMai.getText(), "Chưa nhập Mã khuyến mãi!")
                || CheckInput.checkComboBoxEmpty(cboMaMonKhuyenMai, "Chưa chọn Mã món cần khuyến mãi!")
                || CheckInput.checkTextEmpty(txtGiaTriKMCT.getText(), "Chưa nhập giá trị khuyến mãi của món ăn!")) {
            return null;
        }
        KhuyenMaiCT entity = new KhuyenMaiCT();
        entity.setMaKhuyenMai(txtMaKhuyenMai.getText());
        entity.setMaMon(String.valueOf(cboMaMonKhuyenMai.getSelectedItem()));
        String giaTri = txtGiaTriKMCT.getText();
        float giaTriKhuyenMai = CheckInput.checkInputFloat(giaTri.substring(0, 1), "Lỗi nhập liệu giá trị khuyến mãi của món ăn!") / 100;
        entity.setGiaTriKMCT(giaTriKhuyenMai);
        return entity;
    }

    private void resetFormNguyenLieu() {
        this.txtMaNgLieu.setText("");
        this.txtTenNgLieu.setText("");
        this.cboLoaiNguyenLieu.setSelectedIndex(0);
        this.txtDonViNguyenLieu.setText("");
        this.txtSoLuongNguyenLieu.setText("");
        cboFindLoaiNgLieu.setSelectedIndex(0);
        cboFindNguyenLieu.setSelectedIndex(0);
        cboFindNguyenLieu.setEnabled(false);

        lblHinhNguyenLieu.setText("Hình Ảnh");
        lblHinhNguyenLieu.setToolTipText("");
        lblHinhNguyenLieu.setIcon(null);
    }

    private void setFormNguyenLieu(NguyenLieu nl) {
        if (nl != null) {
            this.txtMaNgLieu.setText(nl.getMaNgLieu());
            this.txtTenNgLieu.setText(nl.getTenNgLieu());
            String loaiNguyenLieu = QLLoaiNgLieu.dao.selectById(nl.getMaLoaiNgLieu()).getTenLoaiNgLieu();
            this.cboLoaiNguyenLieu.setSelectedItem(loaiNguyenLieu);
            this.txtDonViNguyenLieu.setText(nl.getDonVi());
            this.txtSoLuongNguyenLieu.setText(String.valueOf(nl.getSoLuong()));
            XImage.setHinh(nl.getHinhNL(), lblHinhNguyenLieu);
        } else {
            MsgBox.alert(this, "Không tìm thấy thông tin nguyên liệu!");
        }
    }

    private NguyenLieu getFormNguyenLieu() {
        if (CheckInput.checkTextEmpty(txtMaNgLieu.getText(), "Chưa nhập Mã nguyên liệu!")
                || CheckInput.checkTextEmpty(txtTenNgLieu.getText(), "Chưa nhập tên nguyên liệu!")
                || CheckInput.checkComboBoxEmpty(cboLoaiNguyenLieu, "Chưa chọn loại nguyên liệu!")
                || CheckInput.checkTextEmpty(txtDonViNguyenLieu.getText(), "Chưa nhập đơn vị nguyên liệu!")
                || CheckInput.checkTextEmpty(txtSoLuongNguyenLieu.getText(), "Chưa nhập số lượng nguyên liệu!")
                || CheckInput.checkTextEmpty(lblHinhNguyenLieu.getToolTipText(), "Chưa thêm hình ảnh nguyên liệu!")) {
            return null;
        }
        NguyenLieu entity = new NguyenLieu();
        entity.setMaNgLieu(txtMaNgLieu.getText().trim());
        entity.setTenNgLieu(txtTenNgLieu.getText().trim());
        String maLoaiNgLieu = QLLoaiNgLieu.dao.selectByName(String.valueOf(cboLoaiNguyenLieu.getSelectedItem())).getMaLoaiNgLieu();
        entity.setMaLoaiNgLieu(maLoaiNgLieu);
        entity.setDonVi(txtDonViNguyenLieu.getText().trim());

        entity.setSoLuong(CheckInput.checkInputFloat(txtSoLuongNguyenLieu.getText().trim(), "Lỗi nhập liệu số lượng nguyên liệu!"));
        entity.setHinhNL(lblHinhNguyenLieu.getToolTipText());
        return entity;
    }

    private void resetFormCongThuc() {
        txtMaMonAuto.setText("");
        cboTenMon.setSelectedIndex(0);
        cboNguyenLieu.setSelectedIndex(0);
        txtDonViAuto.setText("");
        txtSoLuong.setText("");
        lblHinhCongThuc.setText("Hình Ảnh");
        lblHinhCongThuc.setToolTipText("");
        lblHinhCongThuc.setIcon(null);
    }

    private CongThuc getFormCongThuc() {
        if (CheckInput.checkComboBoxEmpty(cboTenMon, "Chưa chọn tên món!")
                || CheckInput.checkComboBoxEmpty(cboNguyenLieu, "Chưa chọn nguyên liệu!")
                || CheckInput.checkTextEmpty(txtSoLuong.getText(), "Chưa nhập Số lượng nguyên liệu!")) {
            return null;
        }
        CongThuc entity = new CongThuc();
        entity.setMaMon(txtMaMonAuto.getText().trim());
        String maNgLieu = QLNguyenLieu.dao.selectByName(cboNguyenLieu.getSelectedItem().toString()).getMaLoaiNgLieu();
        entity.setMaNgLieu(maNgLieu);
        entity.setDonVi(txtDonViAuto.getText().trim());
        entity.setSoLuong(CheckInput.checkInputFloat(txtSoLuong.getText().trim(), "Lỗi nhập liệu số lượng nguyên liệu!"));
        return entity;
    }

    private void setFormCongThuc(String[] id) {
        CongThuc ct = QLCongThuc.dao.selectById(id);
        if (ct != null) {
            txtMaMonAuto.setText(ct.getMaMon());
            String tenMon = QLMonAn.dao.selectById(id).getTenMon();
            cboTenMon.setSelectedItem(tenMon);
            String tenNguyenLieu = QLNguyenLieu.dao.selectById(id).getTenNgLieu();
            cboNguyenLieu.setSelectedItem(tenNguyenLieu);
            txtDonViAuto.setText(ct.getDonVi());
            txtSoLuong.setText(String.valueOf(ct.getSoLuong()));
        }
    }

    private void chonAnh(JLabel lblHinh) {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            XImage.save(file); // luu hinh vao thu muc logos
            ImageIcon icon = XImage.readImage(lblHinh, file.getName()); // doc hinh tu logos
            lblHinh.setIcon(icon);
            lblHinh.setToolTipText(file.getName()); // giu ten hinh trong tooltip
            lblHinh.setText("");
        }
    }

    private void updateStatusNhanVien(boolean edit) {
        btnResetNhanVien.setEnabled(edit);
        if (QLNhanVien.dao.selectById(txtMaNV.getText()) != null) {
            btnAddNhanVien.setEnabled(!edit);
            btnUpdateNhanVien.setEnabled(edit);
        } else {
            btnAddNhanVien.setEnabled(edit);
            btnUpdateNhanVien.setEnabled(!edit);
        }

        if (txtMaNV.getText().equals(Auth.user.getMaNV())) {
            btnDeleteNhanVien.setEnabled(false);
        } else {
            btnDeleteNhanVien.setEnabled(edit);
        }
        btnFindNhanVien.setEnabled(edit);
        cboFindChucVu.setEnabled(edit);

        btnPreNhanVien.setEnabled(edit);
        btnNextNhanVien.setEnabled(edit);
        btnFirstNhanVien.setEnabled(edit);
        btnLastNhanVien.setEnabled(edit);

        txtMaNV.setEnabled(edit);
        cboChucVu.setEnabled(edit);
        txtLuong.setEnabled(edit);
        txtPass.setEnabled(edit);
    }

    private void updateStatusCaTruc(boolean edit) {
        btnResetCaTruc.setEnabled(edit);
        if (QLCaTruc.dao.selectById(txtMaCaTruc.getText()) != null) {
            btnAddCaTruc.setEnabled(!edit);
            btnUpdateCaTruc.setEnabled(edit);
            btnDeleteCaTruc.setEnabled(edit);
        } else {
            btnAddCaTruc.setEnabled(edit);
            btnUpdateCaTruc.setEnabled(!edit);
            btnDeleteCaTruc.setEnabled(!edit);
        }
    }

    private void updateStatusCTCaTruc(boolean edit) {
        btnResetCTCaTruc.setEnabled(edit);
        String tenNhanVien = String.valueOf(cboNhanVienTruc.getSelectedItem());
        NhanVien nv = QLNhanVien.dao.selectByName(tenNhanVien);
        Date ngayTruc = dateNgayTruc.getDate();
        if (nv != null && ngayTruc != null) {
            ChiTietCaTruc ctCaTruc = QLChiTietCaTruc.dao.selectById(nv.getMaNV(), XDate.dateParseString(ngayTruc, "yyyy/MM/dd"));
            if (ctCaTruc != null) {
                cboCaTruc.setSelectedItem(ctCaTruc.getMaCaTruc());
                btnAddCTCaTruc.setEnabled(!edit);
                btnUpdateCTCaTruc.setEnabled(edit);
                btnDeleteCTCaTruc.setEnabled(edit);
            }
        } else {
            btnAddCTCaTruc.setEnabled(edit);
            btnUpdateCTCaTruc.setEnabled(!edit);
            btnDeleteCTCaTruc.setEnabled(!edit);
        }
    }

    private void updateStatusCongThuc(boolean edit) {
        btnResetCongThuc.setEnabled(edit);
        String maMon = txtMaMonAuto.getText();

        NguyenLieu nguyenLieu = QLNguyenLieu.dao.selectByName(String.valueOf(cboNguyenLieu.getSelectedItem()));
        if (!maMon.equals("") && nguyenLieu != null) {
            CongThuc ct = QLCongThuc.dao.selectById(nguyenLieu.getMaNgLieu(), maMon);
            if (ct != null) {
                txtSoLuong.setText(String.valueOf(ct.getSoLuong()));
                btnAddCongThuc.setEnabled(!edit);
                btnUpdateCongThuc.setEnabled(edit);
                btnDeleteCongThuc.setEnabled(edit);
            }
        } else {
            btnAddCongThuc.setEnabled(edit);
            btnUpdateCongThuc.setEnabled(!edit);
            btnDeleteCongThuc.setEnabled(!edit);
        }
    }

    private void updateStatusPhieuNhapCT(Boolean edit, Color backgroundColor) {
        pnlFormPhieuNhapCT.setEnabled(edit);
        pnlFormPhieuNhapCT.setBackground(backgroundColor);
        pnlCtr_CTPhieuNhap.setEnabled(edit);
        pnlCtr_CTPhieuNhap.setBackground(backgroundColor);

        cboNguyenLieu_tabPhieuNhap.setEnabled(edit);
        txtDonGiaNgLieu.setEnabled(edit);
        txtDonViNgLieu.setEnabled(edit);
        txtSoLuongNgLieu.setEnabled(edit);
        btnFindPhieuNhapCT.setEnabled(edit);
        cboFindPhieuNhapCT.setEnabled(edit);

        btnResetPhieuNhapCT.setEnabled(edit);
        btnAddPhieuNhapCT.setEnabled(edit);
        btnUpdatePhieuNhapCT.setEnabled(edit);
        btnDeletePhieuNhapCT.setEnabled(edit);

    }

    private void updateStatusKhuyenMaiCT(Boolean edit, Color backgroundColor) {
        pnlFormKhuyenMaiCT.setEnabled(edit);
        pnlFormKhuyenMaiCT.setBackground(backgroundColor);
        pnlCtr_KhuyenMaiCT.setEnabled(edit);
        pnlCtr_KhuyenMaiCT.setBackground(backgroundColor);

        cboTenLoaiMonKM.setEnabled(edit);
        cboMaMonKhuyenMai.setEnabled(edit);
        txtGiaTriKMCT.setEnabled(edit);
        txtTenMonKhuyenMai.setEnabled(edit);

        btnResetKhuyenMaiCT.setEnabled(edit);

        String maMon = cboMaMonKhuyenMai.getSelectedItem().toString();
        if (!maMon.equals("") && !txtMaKhuyenMai.getText().equals("")) {
            KhuyenMaiCT kmct = QLKhuyenMaiCT.dao.selectById(maMon, txtMaKhuyenMai.getText());
            if (kmct != null) {
                txtGiaTriKMCT.setText((kmct.getGiaTriKMCT() * 100) + "%");
                btnAddKhuyenMaiCT.setEnabled(!edit);
                btnUpdateKhuyenMaiCT.setEnabled(edit);
                btnDeleteKhuyenMaiCT.setEnabled(edit);
            }
        } else {
            btnAddKhuyenMaiCT.setEnabled(edit);
            btnUpdateKhuyenMaiCT.setEnabled(!edit);
            btnDeleteKhuyenMaiCT.setEnabled(!edit);
        }

    }

    private void updateStatusMonAn(boolean edit) {
        btnResetMonAn.setEnabled(edit);
        if (QLMonAn.dao.selectById(txtMaMon.getText()) != null) {
            btnAddMonAn.setEnabled(!edit);
            btnUpdateMonAn.setEnabled(edit);
            btnDeleteMonAn.setEnabled(edit);
        } else {
            btnAddMonAn.setEnabled(edit);
            btnUpdateMonAn.setEnabled(!edit);
            btnDeleteMonAn.setEnabled(!edit);
        }
    }

    private void updateStatusKhuyenMai(boolean edit) {
        btnResetKhuyenMai.setEnabled(edit);
        if (QLKhuyenMai.dao.selectById(txtMaKhuyenMai.getText()) != null) {
            btnAddKhuyenMai.setEnabled(!edit);
            btnUpdateKhuyenMai.setEnabled(edit);
            btnDeleteKhuyenMai.setEnabled(edit);
        } else {
            btnAddKhuyenMai.setEnabled(edit);
            btnUpdateKhuyenMai.setEnabled(!edit);
            btnDeleteKhuyenMai.setEnabled(!edit);
        }
    }

    private void updateStatusPhieuNhap(boolean edit) {
        btnResetPhieuNhap.setEnabled(edit);
        if (QLPhieuNhap.dao.selectById(txtMaPhieuNhap.getText()) != null) {
            btnAddPhieuNhap.setEnabled(!edit);
            btnUpdatePhieuNhap.setEnabled(edit);
            btnDeletePhieuNhap.setEnabled(edit);
        } else {
            btnAddPhieuNhap.setEnabled(edit);
            btnUpdatePhieuNhap.setEnabled(!edit);
            btnDeletePhieuNhap.setEnabled(!edit);
        }
    }

    private void updateStatusNguyenLieu(boolean edit) {
        btnResetNguyenLieu.setEnabled(edit);
        if (QLNguyenLieu.dao.selectById(txtMaNgLieu.getText()) != null) {
            btnAddNguyenLieu.setEnabled(!edit);
            btnUpdateNguyenLieu.setEnabled(edit);
            btnDeleteNguyenLieu.setEnabled(edit);
        } else {
            btnAddNguyenLieu.setEnabled(edit);
            btnUpdateNguyenLieu.setEnabled(!edit);
            btnDeleteNguyenLieu.setEnabled(!edit);
        }
    }
}
