/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author long
 */
public class PhieuDangKiMD {
  private  String maPhieuDangKi,maKhachHang,maNhanVien,maPhong;
  private  Date ngayLap ;

    public PhieuDangKiMD() {
    }

    public PhieuDangKiMD(String maPhieuDangKi, String maKhachHang, String maNhanVien, String maPhong, Date ngayLap) {
        this.maPhieuDangKi = maPhieuDangKi;
        this.maKhachHang = maKhachHang;
        this.maNhanVien = maNhanVien;
        this.maPhong = maPhong;
        
        this.ngayLap = ngayLap;
        
    }

    public String getMaPhieuDangKi() {
        return maPhieuDangKi;
    }

    public void setMaPhieuDangKi(String maPhieuDangKi) {
        this.maPhieuDangKi = maPhieuDangKi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

 

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }


    
}
