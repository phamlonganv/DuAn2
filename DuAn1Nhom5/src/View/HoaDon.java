/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.KhachHangDao;
import Dao.PhieuDangKiDao;
import Dao.PhongDao;
import Helper.Confimr;
import Helper.DateHelper;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author long
 */
public class HoaDon extends JDialog {

    /**
     * Creates new form HoaDon
     */
    private final String maKH;
    private final String maCmnd;
    public HoaDon(String maKh,String maCmnd) throws ParseException {
        this.maKH = maKh;
        this.maCmnd=maCmnd;

        try {

            initComponents();
            jPanel5.setVisible(false);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            loadDV(maKh);
            loadPhieu(maKh);
            setHoaDon();

            jPanel2.setBorder(new TitledBorder("Hoa Don " + maKh));

        } catch (SQLException ex) {
            Logger.getLogger(HoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMaKhachHang = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblTenKhachHang = new javax.swing.JLabel();
        lblPhongO = new javax.swing.JLabel();
        lblGiaPhong = new javax.swing.JLabel();
        lblSoNgay = new javax.swing.JLabel();
        lblTongDichVu = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblAll = new javax.swing.JLabel();
        btnThanhToan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblSoNgayO = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblNgayLap = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDichVu = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPhong = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TongPhong = new javax.swing.JTable();

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(555, 500));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setText("Mã Khách Hàng");

        lblMaKhachHang.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMaKhachHang.setText("jLabel2");

        jLabel3.setText("Tên Khách Hàng");

        jLabel4.setText("Phòng Ở");

        jLabel5.setText("Tổng Tien dịch vụ: ");

        jLabel6.setText("Tong tien ngay o");

        jLabel7.setText("Giá Phòng");

        lblTenKhachHang.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTenKhachHang.setText("jLabel8");

        lblPhongO.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPhongO.setText("jLabel9");

        lblGiaPhong.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblGiaPhong.setText("jLabel10");

        lblSoNgay.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblSoNgay.setText("jLabel11");

        lblTongDichVu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTongDichVu.setText("jLabel12");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Tổng Tiền");

        lblAll.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAll.setForeground(new java.awt.Color(51, 204, 255));
        lblAll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAll.setText("jLabel14");

        btnThanhToan.setText("Thanh Toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        jLabel2.setText("Tong so Ngay");

        lblSoNgayO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSoNgayO.setText("jLabel8");

        jLabel8.setText("Ngày Lập");

        lblNgayLap.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNgayLap.setText("jLabel9");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(lblNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTenKhachHang)
                            .addComponent(lblTongDichVu)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblPhongO, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGiaPhong, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSoNgay, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(123, 123, 123)
                                .addComponent(lblAll, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblSoNgayO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMaKhachHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnThanhToan)))
                        .addGap(59, 59, 59))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblNgayLap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblMaKhachHang))
                .addGap(12, 12, 12)
                .addComponent(jLabel13)
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblTenKhachHang))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblPhongO))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblGiaPhong)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblAll, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSoNgayO)
                        .addComponent(btnThanhToan)))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblSoNgay))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTongDichVu))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Hóa Đon Chi Tiết", jPanel3);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma dich vu", "Ten dich vu", "Gia dich vu", "So Luong"
            }
        ));
        jScrollPane1.setViewportView(tblDichVu);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Khách Hàng", "Mã Khách Hàng", "Mã Phòng", "Ngày Lập", "Giá Phòng"
            }
        ));
        jScrollPane2.setViewportView(tblPhong);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        TongPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "TenKH", "MaKH", "Phong O", "Gia Phong", "So Ngay O", "Tong Tien Ngay", "Tong Tien dich vu"
            }
        ));
        jScrollPane3.setViewportView(TongPhong);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thống Kê Dịch Vụ Sử Dụng", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed

        LoadHoadon();
        if (kt == false) {
            Confimr.alert(this, "that bai");
        } else {
           
            PhongDao.SetPhongOnId(lblPhongO.getText());
            Dao.KhachHangDao.IsOffDk(maKH);
            Dao.PhongDao.SetPhongOnId(lblPhongO.getText());
            Confimr.alert(this, "thanh cong");
            
             Dao.DangKyDao.deleteDichVubyKH(maKH);
            dispose();
         
           
            
        }


    }//GEN-LAST:event_btnThanhToanActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TongPhong;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAll;
    private javax.swing.JLabel lblGiaPhong;
    private javax.swing.JLabel lblMaKhachHang;
    private javax.swing.JLabel lblNgayLap;
    private javax.swing.JLabel lblPhongO;
    private javax.swing.JLabel lblSoNgay;
    private javax.swing.JLabel lblSoNgayO;
    private javax.swing.JLabel lblTenKhachHang;
    private javax.swing.JLabel lblTongDichVu;
    private javax.swing.JTable tblDichVu;
    private javax.swing.JTable tblPhong;
    // End of variables declaration//GEN-END:variables
    boolean kt = true;

    private void loadDV(String maKH) throws SQLException {
        DefaultTableModel dbt = (DefaultTableModel) tblDichVu.getModel();
        dbt.setRowCount(0);
        List<Object[]> row = Dao.DichVuDao.getPrice(maKH);
        for (Object[] row1 : row) {
            dbt.addRow(row1);
        }

    }

    private void loadPhieu(String maKH) throws SQLException, ParseException {
        DefaultTableModel dbt = (DefaultTableModel) tblPhong.getModel();
        dbt.setRowCount(0);
        List<Object[]> row = Dao.PhieuDangKiDao.getPhieu(maKH);
        for (Object[] row1 : row) {
            dbt.addRow(row1);
        }

    }

    private void setHoaDon() throws ParseException {
        lblMaKhachHang.setText(maKH);
        lblPhongO.setText((String) tblPhong.getValueAt(0, 2));
        int day = (DateHelper.Getdate(DateHelper.toString(DateHelper.now()), DateHelper.toString((Date) tblPhong.getValueAt(0, 3))));
        float giatien = 250;
        if (day == 0) {
            day = 1;
            lblSoNgay.setText(giatien + "");
        } else {
            giatien = (float) tblPhong.getValueAt(0, 4) * day;
            lblSoNgay.setText(((giatien) + ""));

        }
        lblSoNgayO.setText(day + "");
        lblTenKhachHang.setText((String) tblPhong.getValueAt(0, 0));
        float tongtiendv = 0;
        for (int i = 0; i < tblDichVu.getRowCount(); i++) {
            tongtiendv += ((float) tblDichVu.getValueAt(i, 2)) * ((int) tblDichVu.getValueAt(i, 3));
        }
        lblTongDichVu.setText(tongtiendv + "");
        lblGiaPhong.setText((tblPhong.getValueAt(0, 4) + ""));
        lblAll.setText((tongtiendv + giatien) + "");
        lblNgayLap.setText(DateHelper.toString(DateHelper.now()));

    }

    private void LoadHoadon() {
        try {

            String sql = "insert into HoaDon values(?,?,?,?,?,?,?,?,?)";
            Helper.JDBC.excuteUpdate(sql,
                    lblTenKhachHang.getText(),
                    lblSoNgayO.getText(),
                    lblPhongO.getText(),
                    lblSoNgay.getText(),
                    lblTongDichVu.getText(),
                    lblAll.getText(),
                    maKH,
                    DateHelper.toDate(lblNgayLap.getText().trim()),
                    maCmnd
            );

        } catch (Exception e) {
            e.printStackTrace();
            kt = false;
        }

    }

   

}
