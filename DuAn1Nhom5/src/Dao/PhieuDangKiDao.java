/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helper.DateHelper;
import Helper.JDBC;
import Model.DichVuMD;
import Model.PhieuDangKiMD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author long
 */
public class PhieuDangKiDao {

    public static List<PhieuDangKiMD> getListPhieuDangKy() throws SQLException {
        String sql = "select * from PhieuDangKy";
        List<PhieuDangKiMD> pdk = new ArrayList();
        ResultSet rs = JDBC.excuteQuery(sql);

        while (rs.next()) {
            PhieuDangKiMD pdk1 = new PhieuDangKiMD();
            pdk1.setMaPhieuDangKi(rs.getString(1));
            pdk1.setMaKhachHang(rs.getString(2));
            pdk1.setMaNhanVien(rs.getString(3));
            pdk1.setNgayLap(rs.getDate(4));

            pdk1.setMaPhong(rs.getString(5));

            pdk.add(pdk1);

        }

        return pdk;
    }

    public static void insertPhieuDangKy(PhieuDangKiMD model) {
        String sql = "Insert into PhieuDangKy values(?,?,?,?)";
        JDBC.excuteUpdate(sql,
                model.getMaKhachHang(),
                model.getMaNhanVien(),
                model.getNgayLap(),
                model.getMaPhong()
        );

    }

    public static void upDatePhieuDangKy(PhieuDangKiMD model) {
        String sql = "Update  PhieuDangKy set MaKhachHang=?,MaNhanVien=?,NgayLap=?,MaPhong=? Where MaPhieuDangKy=? ";
        JDBC.excuteUpdate(sql,
                model.getMaKhachHang(),
                model.getMaNhanVien(),
                model.getNgayLap(),
                model.getMaPhong(),
                model.getMaPhieuDangKi()
        );

    }

    public static void deletePhieuDangKy(String maKhachHang) {

        String sql = "Delete  PhieuDangKy Where MaKhachHang=? ";
        JDBC.excuteUpdate(sql, maKhachHang);

    }
     public static void deletePhieuDangKybyID(int maPhieu) {

        String sql = "Delete  PhieuDangKy Where MaPhieuDangKy=? ";
        JDBC.excuteUpdate(sql, maPhieu);

    }

    public static List<PhieuDangKiMD> getListPhieuDangKiById(String Ma) throws SQLException {
        String sql = "select * from PhieuDangKy where MaPhieuDangKy=?";
        List<PhieuDangKiMD> pdk = new ArrayList();

        ResultSet rs = JDBC.excuteQuery(sql, Ma);

        while (rs.next()) {
            PhieuDangKiMD pdk1 = new PhieuDangKiMD();
            pdk1.setMaPhieuDangKi(rs.getString(1));
            pdk1.setMaKhachHang(rs.getString(2));
            pdk1.setMaNhanVien(rs.getString(3));
            pdk1.setNgayLap(rs.getDate(4));

            pdk1.setMaPhong(rs.getString(5));

            pdk.add(pdk1);

        }

        return pdk;
    }

    public static List<Object[]> getPhieu(String maKH) {
        List<Object[]> row = new ArrayList();
        String sql = "select  KhachHang.TenKhachHang ,KhachHang.MaKhachHang, PhieuDangKy.MaPhong, PhieuDangKy.NgayLap,Phong.GiaPhong from KhachHang , PhieuDangKy,Phong where Phong.MaPhong = PhieuDangKy.MaPhong and KhachHang.MaKhachHang=PhieuDangKy.MaKhachHang and KhachHang.MaKhachHang=?";
        ResultSet rs = JDBC.excuteQuery(sql, maKH);
        try {
            while (rs.next()) {
                Object[] row1 = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getDate(4),
                    rs.getFloat(5)

                };
                row.add(row1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhieuDangKiDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }
     public static boolean  getKH(String Ma) throws SQLException {
        String sql = "select * from PhieuDangKy where MaKhachHang=?";
        ResultSet rs = JDBC.excuteQuery(sql, Ma);

        if(rs.next())
        {
            return true;
        }

        return false;
    }
    public static void main(String[] args) throws SQLException {
        boolean a  = getKH("KH04");
        System.out.println(a);
    }

}
