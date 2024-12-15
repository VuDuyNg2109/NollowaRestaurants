package ui;

import java.util.HashMap;
import java.util.List;
import javax.swing.JButton;
import utils.MsgBox;
import utils.XDate;
import model.LoaiMon;
import dao.LoaiMonDAO;
import utils.XInit;
import controllers.QLDatMon;
import controllers.QLMonAn;
import controllers.QLThongKe;

import utils.Auth;
import utils.Entity;

public class ThucDon extends javax.swing.JFrame {

    HashMap<JButton, String> listButtonName;

    public ThucDon() {
        initComponents();
        XInit.init(this);
        createListBtn();
        loadDataToTableThucDon(btnKhaiVi);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThucDon = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnXem = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btnDanhMuc = new javax.swing.JButton();
        btnHuongDan = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("QUẢN LÝ NHÀ HÀNG - THỰC ĐƠN");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnKhaiVi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/Potatos-icon.png"))); // NOI18N
        btnKhaiVi.setText("Khai Vị");
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMonRau, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(btnMonBo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(btnKhaiVi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnGoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMonGa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMonSup, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHaiSan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMonLau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMonHeo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMonSup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKhaiVi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHaiSan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMonGa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMonBo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMonHeo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMonLau)
                    .addComponent(btnMonRau)
                    .addComponent(btnGoi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Món Ăn", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 204, 102));

        btnSinhTo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/SinhTo-icon.png"))); // NOI18N
        btnSinhTo.setText("Sinh Tố");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNuocEp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBia, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSinhTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuocNgot, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
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

        jTabbedPane1.addTab("Thức Uống", jPanel5);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAdd.setBackground(new java.awt.Color(51, 153, 255));
        btnAdd.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-list-32.png"))); // NOI18N
        btnAdd.setText("Thêm món");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnXem.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnXem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/info-2-32.png"))); // NOI18N
        btnXem.setText("Chi Tiết");
        btnXem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnXem))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKhaiViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhaiViActionPerformed
        loadDataToTableThucDon(btnKhaiVi);
    }//GEN-LAST:event_btnKhaiViActionPerformed

    private void btnMonSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonSupActionPerformed
        loadDataToTableThucDon(btnMonSup);
    }//GEN-LAST:event_btnMonSupActionPerformed

    private void btnHaiSanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHaiSanActionPerformed
        loadDataToTableThucDon(btnHaiSan);
    }//GEN-LAST:event_btnHaiSanActionPerformed

    private void btnMonHeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonHeoActionPerformed
        loadDataToTableThucDon(btnMonHeo);
    }//GEN-LAST:event_btnMonHeoActionPerformed

    private void btnMonGaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonGaActionPerformed
        loadDataToTableThucDon(btnMonGa);
    }//GEN-LAST:event_btnMonGaActionPerformed

    private void btnMonBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonBoActionPerformed
        loadDataToTableThucDon(btnMonBo);
    }//GEN-LAST:event_btnMonBoActionPerformed

    private void btnMonRauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonRauActionPerformed
        loadDataToTableThucDon(btnMonRau);
    }//GEN-LAST:event_btnMonRauActionPerformed

    private void btnGoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoiActionPerformed
        loadDataToTableThucDon(btnGoi);
    }//GEN-LAST:event_btnGoiActionPerformed

    private void btnMonLauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonLauActionPerformed
        loadDataToTableThucDon(btnMonLau);
    }//GEN-LAST:event_btnMonLauActionPerformed

    private void btnSinhToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinhToActionPerformed
        loadDataToTableThucDon(btnSinhTo);
    }//GEN-LAST:event_btnSinhToActionPerformed

    private void btnBiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiaActionPerformed
        loadDataToTableThucDon(btnBia);
    }//GEN-LAST:event_btnBiaActionPerformed

    private void btnNuocNgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuocNgotActionPerformed
        loadDataToTableThucDon(btnNuocNgot);
    }//GEN-LAST:event_btnNuocNgotActionPerformed

    private void btnNuocEpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuocEpActionPerformed
        loadDataToTableThucDon(btnNuocEp);
    }//GEN-LAST:event_btnNuocEpActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        Entity.setNull();
        if (!Auth.isManager()) {
            this.openThemMoi(1);
        } else {
            this.openThemMoi(2);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemActionPerformed
        Entity.monAn = QLMonAn.dao.selectByName((String) tblThucDon.getValueAt(QLThongKe.getIndex(tblThucDon), 0));
        if (!Auth.isManager()) {
            this.openThemMoi(1);
        } else {
            this.openThemMoi(2);
        }
    }//GEN-LAST:event_btnXemActionPerformed

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

    void openThemMoi(int tab) {
        QLThongKe.indexTabThemMoi = tab;
        new ThemMoi().setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (!Auth.isLogin()) {
                    new Login().setVisible(true);
                    MsgBox.alert(null, "Vui lòng đăng nhập!");
                } else {
                    new ThucDon().setVisible(true);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBia;
    private javax.swing.JButton btnDanhMuc;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGoi;
    private javax.swing.JButton btnHaiSan;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnKhaiVi;
    private javax.swing.JButton btnMonBo;
    private javax.swing.JButton btnMonGa;
    private javax.swing.JButton btnMonHeo;
    private javax.swing.JButton btnMonLau;
    private javax.swing.JButton btnMonRau;
    private javax.swing.JButton btnMonSup;
    private javax.swing.JButton btnNuocEp;
    private javax.swing.JButton btnNuocNgot;
    private javax.swing.JButton btnSinhTo;
    private javax.swing.JButton btnXem;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblThucDon;
    // End of variables declaration//GEN-END:variables

    private void setColsForThucDon() {
        String[] cols = {"Tên Món", "ĐV", "Đơn Giá"};
        int[] widthCols = {220, 30, 100};
        XInit.setCols(tblThucDon, cols, widthCols);
    }

    void createListBtn() {
        listButtonName = new HashMap<>();
        JButton[] btn
                = {
                    btnKhaiVi, btnMonSup, btnMonRau, btnGoi,
                    btnMonBo, btnMonGa, btnMonHeo, btnHaiSan, btnMonLau,
                    btnBia, btnNuocNgot, btnSinhTo, btnNuocEp
                };
        LoaiMonDAO dao = new LoaiMonDAO();
        List<LoaiMon> loaiMon = dao.selectAll();
        if (btn.length == loaiMon.size()) {
            for (int i = 0; i < btn.length; i++) {
                listButtonName.put(btn[i], loaiMon.get(i).getMaLoaiMon());
            }
        } else {
            MsgBox.alert(this, "Số lượng loại món và nút nhấn khác nhau! Vui lòng kiểm tra lại!");
        }
    }

    void loadDataToTableThucDon(JButton btn) {
        String maLoaiMon = listButtonName.get(btn);
        QLDatMon.fillToMenuTblById(maLoaiMon, tblThucDon);
    }
}
