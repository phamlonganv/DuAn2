/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helper.Confimr;
import Helper.JDBC;
import Model.DichVuMD;
import Model.KhachHangMD;
import Model.NhanVienMD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author long
 */
public class NhanVienDao {

    public static List<NhanVienMD> getListNhanVien() throws SQLException {
        String sql = "select * from NhanVien";
        List<NhanVienMD> nv = new ArrayList();
        ResultSet rs = JDBC.excuteQuery(sql);

        while (rs.next()) {
            NhanVienMD nv1 = new NhanVienMD();
            nv1.setMaNhanVien(rs.getString(1));
            nv1.setTenNhanVien(rs.getString(2));
            nv1.setChucVu(rs.getString(3));
            nv1.setGioiTinh(rs.getBoolean(4));
            nv1.setTuoi(rs.getInt(5));
            nv1.setSdt(rs.getString(6));
            nv1.setCmnd(rs.getString(7));
            nv.add(nv1);

        }

        return nv;
    }

    public static void insertNhanVien(NhanVienMD model) {
        String sql = "Insert into NhanVien values(?,?,?,?,?,?,?)";
        JDBC.excuteUpdate(sql,
                model.getMaNhanVien(),
                model.getTenNhanVien(),
                model.getChucVu(),
                model.isGioiTinh(),
                model.getTuoi(),
                model.getSdt(),
                model.getCmnd()
        );

    }

    public static void upDateNhanVien(NhanVienMD model) {
        String sql = "Update  NhanVien set TenNhanVien=?,ChucVu=?,GioiTinh=?,Tuoi=?,SDt=?,Cmnd=? where MaNhanVien=? ";
        JDBC.excuteUpdate(sql,
                model.getTenNhanVien(),
                model.getChucVu(),
                model.isGioiTinh(),
                model.getTuoi(),
                model.getSdt(),
                model.getCmnd(),
                model.getMaNhanVien()
        );

    }

    public static void deleteNhanVien(String maNhanVien) {
       
        String sql = "Delete  NhanVien Where MaNhanVien=? ";
        JDBC.excuteUpdate(sql, maNhanVien);
        

    }

    public static String getRole(String Manv, String pass) throws SQLException {
        String sql = "Select * from Account where MaNhanVien = ? and pass = ? ";
        ResultSet rs = JDBC.excuteQuery(sql, Manv, pass);
        while (rs.next()) {

            return rs.getString("Role");

        }

        return null;

    }
   

    public static List<NhanVienMD> getListNhanVienById(String Ma) throws SQLException {
        String sql = "select * from NhanVien where MaNhanVien=?";
        List<NhanVienMD> nv = new ArrayList();

        ResultSet rs = JDBC.excuteQuery(sql, Ma);

        while (rs.next()) {
            NhanVienMD nv1 = new NhanVienMD();
            nv1.setMaNhanVien(rs.getString(1));
            nv1.setTenNhanVien(rs.getString(2));
            nv1.setChucVu(rs.getString(3));
            nv1.setGioiTinh(rs.getBoolean(4));
            nv1.setTuoi(rs.getInt(5));
            nv1.setSdt(rs.getString(6));
            nv1.setCmnd(rs.getString(7));
            nv.add(nv1);

        }

        return nv;
    }

}
