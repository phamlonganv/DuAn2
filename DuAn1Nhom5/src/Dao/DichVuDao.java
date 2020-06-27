/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helper.DateHelper;
import Helper.JDBC;
import Model.DichVuMD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author long
 */
public class DichVuDao {

    public static List<DichVuMD> getListDichVu() throws SQLException {
        String sql = "select * from DichVu";
        List<DichVuMD> dv = new ArrayList();

        ResultSet rs = JDBC.excuteQuery(sql);

        while (rs.next()) {
            DichVuMD dichvu = new DichVuMD();
            dichvu.setMaDichVu(rs.getString(1));
            dichvu.setTenDichVu(rs.getString(2));
            dichvu.setGiaDichVu(rs.getFloat(3));
            dv.add(dichvu);

        }

        return dv;
    }

    public static List<DichVuMD> getListDichVuById(String Ma) throws SQLException {
        String sql = "select * from DichVu where MaDichVu=?";
        List<DichVuMD> dv = new ArrayList();

        ResultSet rs = JDBC.excuteQuery(sql, Ma);

        while (rs.next()) {
            DichVuMD dichvu = new DichVuMD();
            dichvu.setMaDichVu(rs.getString(1));
            dichvu.setTenDichVu(rs.getString(2));
            dichvu.setGiaDichVu(rs.getFloat(3));
            dv.add(dichvu);

        }

        return dv;
    }

    public static void insertDichVu(DichVuMD model) {
        String sql = "Insert into DichVu values(?,?,?)";
        JDBC.excuteUpdate(sql,
                model.getMaDichVu(),
                model.getTenDichVu(),
                model.getGiaDichVu()
        );

    }

    public static void upDateDichVu(DichVuMD model) {
        String sql = "Update  DichVu set TenDichVu=?,GiaDichVu=? Where MaDichVu=? ";
        JDBC.excuteUpdate(sql,
                model.getTenDichVu(),
                model.getGiaDichVu(),
                model.getMaDichVu()
        );

    }

    public static void deleteDichVu(String maDichVu) {

        String sql = "Delete  DichVu Where MaDichVu=? ";
        JDBC.excuteUpdate(sql, maDichVu);

    }

    public static List<Object[]> getPrice(String maKh) throws SQLException {
        List<Object[]> list = new ArrayList<>();
        String sql = "select  DichVu.MaDichVu,  DichVu.TenDichVu , DichVu.GiaDichVu , DkDichVu.SoLuong  from DkDichVu,DichVu where DichVu.MaDichVu=DkDichVu.MaDichVu and DkDichVu.MaKhachHang =? ";
        ResultSet rs = JDBC.excuteQuery(sql, maKh);
        while (rs.next()) {
            Object[] row1 = {
                rs.getString(1),
                rs.getString(2),
                rs.getFloat(3),
                rs.getInt(4)

            };
            list.add(row1);
        }
        return list;
    }

    public static void XuatHoaDon(int MaHoaDon) {
        try {

            Hashtable map = new Hashtable();
            JasperReport report = JasperCompileManager.compileReport("src/View/newReport.jrxml");

            map.put("MaHoaDon", MaHoaDon);

            JasperPrint p = JasperFillManager.fillReport(report, map, JDBC.getConnection());
            JasperViewer.viewReport(p, false);
           
            
            
            JasperExportManager.exportReportToPdfFile(p, "test.pdf");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void XuatDichVu(String MaDichVu) {
        try {

            Hashtable map = new Hashtable();
            JasperReport report = JasperCompileManager.compileReport("src/View/In Dich Vu.jrxml");

            map.put("MaHoaDon", MaDichVu);

            JasperPrint p = JasperFillManager.fillReport(report, map, JDBC.getConnection());
            JasperViewer.viewReport(p, false);
            JasperExportManager.exportReportToPdfFile(p, "test.pdf");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void XuatHoaDonTrongThang(Date NgayBatDau , Date NgayKetThuc) {
        try {

            Hashtable map = new Hashtable();
            JasperReport report = JasperCompileManager.compileReport("src/View/InDanhSachHoaDonTrongThang.jrxml");

            map.put("NgayBatDau",NgayBatDau );
            map.put("NgayKetThuc",NgayKetThuc );

            JasperPrint p = JasperFillManager.fillReport(report, map, JDBC.getConnection());
            JasperViewer.viewReport(p, false);
            JasperExportManager.exportReportToPdfFile(p, "test.pdf");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static int CheckHoaDon(String cmnd , Date Ngay) throws SQLException
    {
        String sql = "Select * from HoaDon where SoCmnd=? and NgayLapHoaDon=?";
          ResultSet rs = JDBC.excuteQuery(sql, cmnd,Ngay);
          if(rs.next())
          {
              return -1;
          }
         return 1;
             
    
    }
   

   

}
