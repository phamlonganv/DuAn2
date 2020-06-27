/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helper.JDBC;
import Model.DangKy;
import Model.DichVuMD;
import java.lang.reflect.Array;
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
public class DangKyDao {

    public static List<DangKy> getListDichVu() throws SQLException {
        String sql = "select * from DkDichVu";
        List<DangKy> dv = new ArrayList();

        ResultSet rs = JDBC.excuteQuery(sql);

        while (rs.next()) {
            DangKy dk = new DangKy();
            dk.setMaDk(rs.getString(1));
            dk.setMaDichVu(rs.getString(2));
            dk.setMaKhachHang(rs.getString(3));
            dk.setSoLuong(rs.getInt(4));

            dv.add(dk);

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

    public static void insertDichVu(DangKy model) {
        String sql = "Insert into DkDichVu values(?,?,?)";
        JDBC.excuteUpdate(sql,
                
                model.getMaDichVu(),
                model.getMaKhachHang(),
                model.getSoLuong()
        );

    }

    public static void upDateDichVu(DangKy model) {
        String sql = "Update  DkDichVu set MaDichVu=?,MaKhachHang=?,SoLuong=? Where MaDK=? ";
        JDBC.excuteUpdate(sql,
                model.getMaDichVu(),
                model.getMaKhachHang(),
                model.getSoLuong(),
                model.getMaDk()
        );

    }

    public static void deleteDichVu(String maDichVu) {

        String sql = "Delete  DkDichVu Where MaDK=? ";
        JDBC.excuteUpdate(sql, maDichVu);

    }
    
    
    public static List<DangKy> getListbyMa(String maKH) throws SQLException
        {
            List<DangKy> list = new ArrayList();
            String sql = " select MaDichVu from DkDichVu where MaKhachHang=?";
            ResultSet rs= JDBC.excuteQuery(sql, maKH);
            while(rs.next())
            {
                DangKy dk = new DangKy();
                dk.setMaDichVu(rs.getString("MaDichVu"));
                list.add(dk);
            
            }
            return list;
    
    }
    public static void deleteDichVubyKH(String maKh) {

        String sql = "Delete  DkDichVu Where MaKhachHang=? ";
        JDBC.excuteUpdate(sql, maKh);

    }
    
    
    
    
  
    

}
