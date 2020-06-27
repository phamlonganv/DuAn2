/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author long
 */
public class DangKy {
    String maDichVu;
    int soLuong;
    String maKhachHang;
    String maDk;

    public DangKy(String maDichVu, int soLuong, String maKhachHang,String maDK) {
        this.maDichVu = maDichVu;
        this.soLuong = soLuong;
        this.maKhachHang = maKhachHang;
        this.maDk=maDK;
    }

    public DangKy() {
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaDk() {
        return maDk;
    }

    public void setMaDk(String maDk) {
        this.maDk = maDk;
    }
    
    
    
}
