/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.DangKyDao;
import Dao.KhachHangDao;
import Dao.NhanVienDao;
import Dao.PhieuDangKiDao;
import Dao.PhongDao;
import Helper.Confimr;
import Helper.DateHelper;
import Model.KhachHangMD;
import Model.NhanVienMD;
import Model.PhieuDangKiMD;
import Model.PhongMD;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TAN QUANG
 */
public class PhieuDangKy extends javax.swing.JFrame {

    /**
     * Creates new form PhieuDangKy
     *
     * @param maPhong
     */
    String maKH;
    public PhieuDangKy(String maKH) {
        this.maKH=maKH;
        init();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoaPhieu = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblNgayLap = new javax.swing.JLabel();
        lblNhanVien = new javax.swing.JLabel();
        cbMaPhongTrong = new javax.swing.JComboBox();
        lblMakhachHang = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhieu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Khach San Ngan Sao");
        setPreferredSize(new java.awt.Dimension(900, 700));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 25, 10));

        btnFirst.setText("<");
        btnFirst.setPreferredSize(new java.awt.Dimension(80, 39));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel3.add(btnFirst);

        btnBack.setText("<<");
        btnBack.setPreferredSize(new java.awt.Dimension(80, 39));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack);

        btnNext.setText(">>");
        btnNext.setPreferredSize(new java.awt.Dimension(80, 39));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel3.add(btnNext);

        btnLast.setText(">");
        btnLast.setPreferredSize(new java.awt.Dimension(80, 39));
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel3.add(btnLast);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phiếu Đăng Ký", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconfinder_Add_132335.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel4.add(btnThem);

        btnXoaPhieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconfinder_Delete_132192.png"))); // NOI18N
        btnXoaPhieu.setText("Xóa Phiếu");
        btnXoaPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaPhieuActionPerformed(evt);
            }
        });
        jPanel4.add(btnXoaPhieu);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Mã Khách Hàng:");

        jLabel6.setText("Mã Nhân Viên:");

        jLabel7.setText("Ngày Lập:");

        jLabel9.setText("Mã Phòng:");

        lblNgayLap.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        lblNhanVien.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        cbMaPhongTrong.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblMakhachHang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNgayLap, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(lblNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(cbMaPhongTrong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMakhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblMakhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblNhanVien))
                .addGap(86, 86, 86)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblNgayLap))
                .addGap(110, 110, 110)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbMaPhongTrong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tblPhieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma Phieu ĐK", "Ma KH", "Ma NV", "Ngay Lap", "Ma Phong"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPhieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhieuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhieu);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel1.setText("PHIẾU ĐĂNG KÝ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(312, 312, 312)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPhieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuMouseClicked
        index = tblPhieu.getSelectedRow();

    }//GEN-LAST:event_tblPhieuMouseClicked

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        index = 0;
        tblPhieu.setRowSelectionInterval(index, index);

    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if (tblPhieu.getSelectedRow() > 0) {
            index--;
            tblPhieu.setRowSelectionInterval(index, index);

        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (tblPhieu.getSelectedRow() < tblPhieu.getRowCount() - 1) {
            index++;
            tblPhieu.setRowSelectionInterval(index, index);

        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        index = tblPhieu.getRowCount() - 1;
        tblPhieu.setRowSelectionInterval(index, index);

    }//GEN-LAST:event_btnLastActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if(checkTrung(lblMakhachHang.getText())==true)
        {
            this.ThemPhieu();
        KhachHangDao.IsOnDk(lblMakhachHang.getText());
        Dao.PhongDao.SetPhongOffId((String) cbMaPhongTrong.getSelectedItem());
        dispose();
        }
        else
        {
            Confimr.alert(this, "Khách Hàng Này đã tồn tại phiếu Vui lòng xóa và đăng kí lại");
        }   
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaPhieuActionPerformed
       if(tblPhieu.getSelectedRow()<0)
       {
        Confimr.alert(this, "vui long chon");
       }
       else
       {
        int ma =  Integer.parseInt((String) tblPhieu.getValueAt(tblPhieu.getSelectedRow(), 0));
        PhieuDangKiDao.deletePhieuDangKybyID(ma);
        dispose();
       }
    }//GEN-LAST:event_btnXoaPhieuActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoaPhieu;
    private javax.swing.JComboBox cbMaPhongTrong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMakhachHang;
    private javax.swing.JLabel lblNgayLap;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JTable tblPhieu;
    // End of variables declaration//GEN-END:variables
    int index = -1;

    private void init() {
        initComponents();
        this.setResizable(false);
        setLocationRelativeTo(null);
        this.load("");
        this.setResizable(false);

        
        lblNgayLap.setText(DateHelper.toString(DateHelper.now()));
        lblNhanVien.setText(Confimr.MaNhanVien);
        lblMakhachHang.setText(maKH);

        try {
            
            loadcbp();
            
        } catch (SQLException ex) {
            Logger.getLogger(PhieuDangKy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void load(String ma) {
        index = -1;

        try {
            DefaultTableModel model = (DefaultTableModel) tblPhieu.getModel();
            model.setRowCount(0);
            List<PhieuDangKiMD> list = PhieuDangKiDao.getListPhieuDangKiById(ma);
            if (ma.length() == 0) {
                list = PhieuDangKiDao.getListPhieuDangKy();

            }

            for (PhieuDangKiMD list1 : list) {
                Object row[] = {
                    list1.getMaPhieuDangKi(),
                    list1.getMaKhachHang(),
                    list1.getMaNhanVien(),
                    list1.getNgayLap(),
                    list1.getMaPhong(),};
                model.addRow(row);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private PhieuDangKiMD getModel() {
        PhieuDangKiMD pdk = new PhieuDangKiMD();
        pdk.setMaKhachHang(lblMakhachHang.getText());
        pdk.setMaNhanVien(Confimr.MaNhanVien);
        pdk.setNgayLap(DateHelper.toDate(lblNgayLap.getText().trim()));
        pdk.setMaPhong((String) cbMaPhongTrong.getSelectedItem());
        return pdk;

    }

    private void ThemPhieu() {
        PhieuDangKiMD pdk = getModel();
        try {
            PhieuDangKiDao.insertPhieuDangKy(pdk);
            Confimr.alert(this, "thanh cong");
            this.load("");

        } catch (Exception e) {
            e.printStackTrace();
            Confimr.alert(this, " co loi khi them");
        }

    }

   

    

    private void loadcbp() throws SQLException {

        DefaultComboBoxModel cbkh = (DefaultComboBoxModel) cbMaPhongTrong.getModel();
        cbkh.removeAllElements();
        List<PhongMD> p = Dao.PhongDao.getByStt();
        for (PhongMD p1 : p) {
            cbkh.addElement(p1.getMaPhong());
        }

    }
    private boolean checkTrung(String maKH)
    {
        for (int i = 0; i < tblPhieu.getRowCount(); i++) {
                if(maKH.equalsIgnoreCase((String) tblPhieu.getValueAt(i, 1)))
                {
                    return false;
                }
        }
        return true;
    }

}