/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helper.JDBC;
import Model.DichVuMD;
import Model.PhongMD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author long
 */
public class PhongDao {

    public static List<PhongMD> getListPhong() throws SQLException {
        String sql = "select * from Phong";
        List<PhongMD> phong = new ArrayList();
        ResultSet rs = JDBC.excuteQuery(sql);

        while (rs.next()) {
            PhongMD p = new PhongMD();
            p.setMaPhong(rs.getString(1));
            p.setLoaiPhong(rs.getString(2));
            p.setTinhTrang(rs.getBoolean(3));
            p.setGiaPhong(rs.getFloat(4));
            p.setImage(rs.getString(5));
            phong.add(p);

        }

        return phong;
    }

    public static void insertPhong(PhongMD model) {
        String sql = "Insert into Phong values(?,?,?,?,?)";
        JDBC.excuteUpdate(sql,
                model.getMaPhong(),
                model.getLoaiPhong(),
                model.isTinhTrang(),
                model.getGiaPhong(),
                model.getImage()
        );

    }

    public static void upDatePhong(PhongMD model) {
        String sql = "Update  Phong set LoaiPhong=?,TinhTrang=?,GiaPhong=? ,HinhAnh=? Where MaPhong=? ";
        JDBC.excuteUpdate(sql,
                model.getLoaiPhong(),
                model.isTinhTrang(),
                model.getGiaPhong(),
                model.getImage(),
                model.getMaPhong()
        );

    }

    public static void deletePhong(String maPhong) {

        String sql = "Delete  Phong Where MaPhong=? ";
        JDBC.excuteUpdate(sql, maPhong);

    }

    public static List<PhongMD> getByStt() {
        List<PhongMD> list = new ArrayList();
        String sql = "select * from Phong where TinhTrang=1";
        ResultSet rs = JDBC.excuteQuery(sql);
        try {
            while (rs.next()) {
                list.add(new PhongMD(rs.getString(1),
                        rs.getString(2),
                        rs.getBoolean(3),
                        rs.getFloat(4),
                        rs.getString(5)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhongDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public static List<PhongMD> getListPhongById(String Ma) throws SQLException {
        String sql = "select * from Phong where MaPhong=?";
        List<PhongMD> phong = new ArrayList();

        ResultSet rs = JDBC.excuteQuery(sql, Ma);

        while (rs.next()) {

            PhongMD p = new PhongMD();
            p.setMaPhong(rs.getString(1));
            p.setLoaiPhong(rs.getString(2));
            p.setTinhTrang(rs.getBoolean(3));
            p.setGiaPhong(rs.getFloat(4));
            p.setImage(rs.getString(5));
            phong.add(p);

        }

        return phong;
    }

    public static void SetPhongOffId(String maPhong) {
        String sql = "Update  Phong set TinhTrang=0 where MaPhong=? ";
        JDBC.excuteUpdate(sql, maPhong);

    }
    public static void SetPhongOnId(String maPhong) {
        String sql = "Update  Phong set TinhTrang=1 where MaPhong=? ";
        JDBC.excuteUpdate(sql, maPhong);

    }
}
