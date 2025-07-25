
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Infinix
 */
public class menuPengembalian extends javax.swing.JPanel {

    private final Connection conn;

    public menuPengembalian() {
        initComponents();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        txtTanggal.setText(sdf.format(new Date()));
        
        conn= koneksi.getKoneksi();
        setTableModel();
        loadData();   
        actionButton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        panelMain = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnTambah = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle3 = new rojerusan.RSMaterialButtonRectangle();
        txtSearch = new javax.swing.JTextField();
        panelAdd = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        rSMaterialButtonRectangle7 = new rojerusan.RSMaterialButtonRectangle();
        txtId = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtTanggal = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtIdPeminjaman = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtTglPinjam = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtTglKembali = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtIdAnggota = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtIdBuku = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtJudulBuku = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtPengarangBuku = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtDenda = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        btnGetPeminjaman = new javax.swing.JButton();
        btnSave2 = new rojerusan.RSMaterialButtonRectangle();
        txtNamaAnggota = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        lbInfoDenda = new javax.swing.JLabel();

        dateChooser1.setTextRefernce(txtTanggal);

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1141, 676));
        setLayout(new java.awt.CardLayout());

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setLayout(new java.awt.CardLayout());

        panelView.setBackground(new java.awt.Color(255, 255, 255));
        panelView.setPreferredSize(new java.awt.Dimension(1141, 676));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\image\\icons8-book-64.png")); // NOI18N
        jLabel13.setText("Data Pengembalian Buku Perpustakaan");

        jLabel14.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Transaksi - Pengembalian");

        btnTambah.setIcon(new javax.swing.ImageIcon("C:\\image\\icons8-refuse-32.png")); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        rSMaterialButtonRectangle2.setBackground(new java.awt.Color(255, 0, 102));
        rSMaterialButtonRectangle2.setText("Hapus");
        rSMaterialButtonRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle2ActionPerformed(evt);
            }
        });

        rSMaterialButtonRectangle3.setBackground(new java.awt.Color(255, 153, 102));
        rSMaterialButtonRectangle3.setText("Batal");
        rSMaterialButtonRectangle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle3ActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Rockwell", 2, 12)); // NOI18N
        txtSearch.setText("Search");
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1097, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(panelViewLayout.createSequentialGroup()
                                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rSMaterialButtonRectangle2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rSMaterialButtonRectangle3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13))
                    .addComponent(jLabel14))
                .addGap(31, 31, 31)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSMaterialButtonRectangle2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSMaterialButtonRectangle3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMain.add(panelView, "card2");

        panelAdd.setBackground(new java.awt.Color(255, 255, 255));
        panelAdd.setPreferredSize(new java.awt.Dimension(1141, 676));

        jLabel15.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\image\\icons8-people-32.png")); // NOI18N
        jLabel15.setText("Tambah Data Peminjaman Buku Perpustakaan");

        jLabel16.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Transaksi - Pengembalian");

        rSMaterialButtonRectangle7.setBackground(new java.awt.Color(255, 153, 102));
        rSMaterialButtonRectangle7.setText("Batal");
        rSMaterialButtonRectangle7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle7ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel19.setText("ID");

        jLabel20.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel20.setText("Tanggal");

        txtIdPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPeminjamanActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel25.setText("Tanggal Kembali");

        jLabel26.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel26.setText("Tanggal Pinjam");

        txtTglKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTglKembaliActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel27.setText("Peminjaman");

        jLabel28.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel28.setText("ID Anggota");

        jLabel29.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel29.setText("Buku");

        jLabel30.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel30.setText("Judul");

        jLabel31.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel31.setText("Pengarang");

        jLabel32.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel32.setText("Denda");

        btnGetPeminjaman.setText("...");
        btnGetPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetPeminjamanActionPerformed(evt);
            }
        });

        btnSave2.setIcon(new javax.swing.ImageIcon("C:\\image\\icons8-refuse-32.png")); // NOI18N
        btnSave2.setText("SIMPAN");
        btnSave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave2ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel33.setText("Nama Anggota");

        lbInfoDenda.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lbInfoDenda.setText("Denda");

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAddLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(btnSave2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rSMaterialButtonRectangle7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel28)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTglKembali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdAnggota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaAnggota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAddLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(106, 106, 106)
                        .addComponent(txtIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGetPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel30))
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAddLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPengarangBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtJudulBuku, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbInfoDenda)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTanggal))
                            .addComponent(jLabel32))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(31, 31, 31)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSMaterialButtonRectangle7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGetPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(txtTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel30))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel26)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPengarangBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)))
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(19, 19, 19)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbInfoDenda)
                        .addContainerGap(169, Short.MAX_VALUE))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addGap(18, 18, 18)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNamaAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed

    private void rSMaterialButtonRectangle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonRectangle3ActionPerformed

    private void rSMaterialButtonRectangle7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle7ActionPerformed
        // TODO add your handling code here:
        panelMain.removeAll();
        panelMain.add(panelView);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_rSMaterialButtonRectangle7ActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        panelMain.removeAll();
        panelMain.add(panelAdd);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        // TODO add your handling code here:\

    }//GEN-LAST:event_txtSearchKeyTyped

    private void btnGetPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetPeminjamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGetPeminjamanActionPerformed

    private void btnSave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave2ActionPerformed
        // TODO add your handling code here
 
            insertData();
            insertDataDetail();
            
     
        
        
        
    }//GEN-LAST:event_btnSave2ActionPerformed

    private void txtTglKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTglKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTglKembaliActionPerformed

    private void txtIdPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPeminjamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPeminjamanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetPeminjaman;
    private rojerusan.RSMaterialButtonRectangle btnSave2;
    private rojerusan.RSMaterialButtonRectangle btnTambah;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbInfoDenda;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle3;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle7;
    private javax.swing.JTextField txtDenda;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdAnggota;
    private javax.swing.JTextField txtIdBuku;
    private javax.swing.JTextField txtIdPeminjaman;
    private javax.swing.JTextField txtJudulBuku;
    private javax.swing.JTextField txtNamaAnggota;
    private javax.swing.JTextField txtPengarangBuku;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtTglKembali;
    private javax.swing.JTextField txtTglPinjam;
    // End of variables declaration//GEN-END:variables

    
    
    
    private void loadData() {
      getData((DefaultTableModel) jTable1.getModel());

    }
    
  
    

    private void setTableModel() {
        DefaultTableModel model = new DefaultTableModel(
        new Object[]{"ID Pengembalian","Tanggal DiKembalikan","ID Peminjaman"},
                0
        );
        
        jTable1.setModel(model);
    }
    

    


    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try{
            String sql = "SELECT * FROM pengembalian";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet  rs = st.executeQuery();
                
                while (rs.next()){
                    String idPengembalian = rs.getString("id_pengembalian");
                    String tanggalPengembalian = rs.getString("tgl_pengembalian");
                    String idPeminjaman = rs.getString("id_peminjaman");

                    
                    Object[] rowData = {idPengembalian, tanggalPengembalian, idPeminjaman};
                    model.addRow(rowData);
                    
                }
            }
        }catch (SQLException e) {
            Logger.getLogger(menuPengembalian.class.getName()).log(Level.SEVERE, null, e);
            
        }
            }
    
 
        

    
    
    private void getPeminjaman(){
        boolean closable = true;
        dataPeminjaman pmj = new dataPeminjaman(null, closable);
        pmj.setVisible(true);
        
        txtIdPeminjaman.setText(pmj.getIdPeminjaman());
        txtTglPinjam.setText(pmj.getTanggalPinjam());
        txtTglKembali.setText(pmj.getTanggalKembali());
        txtIdAnggota.setText(pmj.getIdAnggota());
        txtNamaAnggota.setText(pmj.getNamaAnggota());
        txtIdBuku.setText(pmj.getIdBuku());
        txtJudulBuku.setText(pmj.getJudulBuku());
        txtPengarangBuku.setText(pmj.getPengarangBuku());
        
        
        txtIdPeminjaman.setEnabled(false);
        txtTglPinjam.setEnabled(false);
        txtTglKembali.setEnabled(false);
        txtIdAnggota.setEnabled(false);
        txtNamaAnggota.setEnabled(false);
        txtIdBuku.setEnabled(false);
        txtJudulBuku.setEnabled(false);
        txtPengarangBuku.setEnabled(false);
    }
    
    private void hitungDenda(){
        int dendaPerhari = 500;
        String tanggalKembaliAktual = txtTanggal.getText();
        String tanggalKembali = txtTglKembali.getText();
        
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            
            Date tanggalAktual = dateFormat.parse(tanggalKembaliAktual);
            Date tanggalDikembalikan = dateFormat.parse(tanggalKembali);
            
            long selisihHari = (tanggalAktual.getTime() - tanggalDikembalikan.getTime()) / (1000 * 60 * 60 * 24);
            int denda = (int) (selisihHari * dendaPerhari);
            
            
            txtDenda.setText(Integer.toString(denda));
            
            if (denda > 0){
                lbInfoDenda.setVisible(true);
                lbInfoDenda.setText("TELAT : "+selisihHari+"Hari");
            } else {
                lbInfoDenda.setText("Tidak ada denda");
            }
        } catch(ParseException e){
            e.printStackTrace();
        }
}

    private void setTableModelDetail(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
    }
    


    
 
    
    private void insertData() {
        String idPengembalian = txtId.getText();
        String idPeminjaman = txtIdPeminjaman.getText();

    
    String tanggalAktual;
    try {
        SimpleDateFormat fromUser = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat toDb = new SimpleDateFormat("yyyy-MM-dd");

        tanggalAktual = toDb.format(fromUser.parse(txtTanggal.getText()));

    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Format tanggal salah!");
        return;
    }
        if(idPeminjaman.isEmpty() || tanggalAktual.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua kolom harus di isi !");
            return;
        }
        
        try {
            String sql = "INSERT INTO pengembalian (id_pengembalian, tgl_pengembalian, id_peminjaman) VALUES (?,?,?)";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, idPeminjaman);
                st.setString(2, tanggalAktual);
                st.setString(3, idPeminjaman);

                
                int rowInserted = st.executeUpdate();
                if(rowInserted > 0 ) {
                    JOptionPane.showMessageDialog(this, "Data berhasil di tambahkan");
                }
            }
            } catch (SQLException e){
                Logger.getLogger(menuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
            }

}

        
    

    private void updateData() {
        
    }

    private void resetForm() {
        txtId.setText("");
        txtTanggal.setText("");
        txtIdPeminjaman.setText("");
        txtTglPinjam.setText("");
        txtTglKembali.setText("");
        txtIdAnggota.setText("");
        txtNamaAnggota.setText("");
        txtIdBuku.setText("");
        txtJudulBuku.setText("");
        txtPengarangBuku.setText("");
        txtDenda.setText("");
        

    }

    



   private void actionButton() {
    btnGetPeminjaman.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            getPeminjaman();
            hitungDenda();
        }
    });


    

}

    private void insertDataDetail() {
        String idPengembalian = txtId.getText();
        String idBuku = txtIdBuku.getText();
        String jumlahDenda = txtDenda.getText();
  
        
        
        try {
            String sql = "INSERT INTO detail_pengembalian (id_pengembalian, id_buku, jumlah_denda) VALUES (?,?,?)";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, idPengembalian);
                st.setString(2, idBuku);
                st.setString(3, jumlahDenda);

                st.executeUpdate();

                
            }
            } catch (SQLException e){
                Logger.getLogger(menuPengembalian.class.getName()).log(Level.SEVERE, null, e);
            }

}
    
    private void updateStatus(){
        String idPeminjaman = txtIdPeminjaman.getText();
        String idBuku = txtIdBuku.getText();
        String statusPeminjaman = "Sudah dikembalikan";
        
        try{
            String sql = "UPDATE detail_peminjaman SET status_peminjaman=? WHERE id_peminjaman=? AND id_buku";
            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, statusPeminjaman);
                st.setString(2, idPeminjaman);
                st.setString(3, idBuku);
                st.executeUpdate();
            }
        
            
        }catch (SQLException e) {
            Logger.getLogger(menuPengembalian.class.getName()).log(Level.SEVERE, null, e);
    }
} }
        

