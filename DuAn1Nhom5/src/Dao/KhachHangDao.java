/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helper.DateHelper;
import Helper.JDBC;
import Model.DichVuMD;
import Model.KhachHangMD;
import Model.NhanVienMD;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author long
 */
public class KhachHangDao {

    public static List<KhachHangMD> getListKhachHang() throws SQLException {
        String sql = "select * from KhachHang";
        List<KhachHangMD> kh = new ArrayList();
        ResultSet rs = JDBC.excuteQuery(sql);

        while (rs.next()) {
            KhachHangMD kh1 = new KhachHangMD();
            kh1.setMaKhachHang(rs.getString(1));
            kh1.setTenKhachHang(rs.getString(2));
            kh1.setDiaChi(rs.getString(3));
            kh1.setGioiTinh(rs.getBoolean(4));
            kh1.setCmnd(rs.getString(5));
            kh1.setSdt(rs.getString(6));
            kh1.setQuocTich(rs.getString(7));
            kh1.setTuoi(rs.getInt(8));
            kh1.setIsDangki(rs.getBoolean(9));
            kh.add(kh1);

        }

        return kh;
    }

    public static void insertKhachHang(KhachHangMD model) {
        String sql = "Insert into KhachHang values(?,?,?,?,?,?,?,?,?)";
        JDBC.excuteUpdate(sql,
                model.getMaKhachHang(),
                model.getTenKhachHang(),
                model.getDiaChi(),
                model.isGioiTinh(),
                model.getCmnd(),
                model.getSdt(),
                model.getQuocTich(),
                model.getTuoi(),
                model.isIsDangki()
        );

    }

    public static void upDateKhachHang(KhachHangMD model) {
        String sql = "Update  KhachHang set TenKhachHang=?,DiaChi=?,GioiTinh=?,Cmnd=?,Sdt=?,Quoctich=?,Tuoi=? where MaKhachHang=?";
        JDBC.excuteUpdate(sql,
                model.getTenKhachHang(),
                model.getDiaChi(),
                model.isGioiTinh(),
                model.getCmnd(),
                model.getSdt(),
                model.getQuocTich(),
                model.getTuoi(),
                model.getMaKhachHang()
        );

    }

    public static void deleteKhachHang(String maKhachHang) {
       
        
        String sql = "Delete  KhachHang Where MaKhachHang=? ";
        JDBC.excuteUpdate(sql, maKhachHang);
        

    }
    public static List<KhachHangMD> getListKhachHangById(String Ma) throws SQLException {
        String sql = "select * from KhachHang where MaKhachHang=?";
        List<KhachHangMD> kh = new ArrayList();

        ResultSet rs = JDBC.excuteQuery(sql, Ma);

        while (rs.next()) {
           KhachHangMD kh1 = new KhachHangMD();
            kh1.setMaKhachHang(rs.getString(1));
            kh1.setTenKhachHang(rs.getString(2));
            kh1.setDiaChi(rs.getString(3));
            kh1.setGioiTinh(rs.getBoolean(4));
            kh1.setCmnd(rs.getString(5));
            kh1.setSdt(rs.getString(6));
            kh1.setQuocTich(rs.getString(7));
            kh1.setTuoi(rs.getInt(8));
            kh1.setIsDangki(rs.getBoolean(9));
            kh.add(kh1);

        }

        return kh;
    }
    public static List<KhachHangMD> getIsDk() throws SQLException
    {
        List<KhachHangMD> list = new ArrayList();
        String sql =  " Select * from KhachHang where isDangKi =0";
        ResultSet rs = JDBC.excuteQuery(sql);
        while(rs.next())
        {
            KhachHangMD kh = new KhachHangMD();
            kh.setMaKhachHang(rs.getString(1));
            list.add(kh);
        }
        return list;
    
    }
    public static void IsOnDk(String maKh)
    {
        String sql = "Update KhachHang set isDangKi=1 where MaKhachHang=?";
        JDBC.excuteUpdate(sql,maKh);
        
    }
    public static void IsOffDk(String maKh)
    {
        String sql = "Update KhachHang set isDangKi=0 where MaKhachHang=?";
        JDBC.excuteUpdate(sql,maKh);
        
    }
    public static int getHdbyMa(String maKh,String cmd,String datetl) throws SQLException
    {
        String sql = "Select  MaHoaDon from HoaDon where HoaDon.MaKhachHang=? and HoaDon.Socmnd=? and NgayLapHoaDon=? ";
        ResultSet rs = JDBC.excuteQuery(sql, maKh.trim(),cmd.trim(),datetl);
        if(rs.next())
        {
            return rs.getInt(1);
        }
        return -1;
    }
    public static void main(String[] args) throws SQLException {
       
    }


}
