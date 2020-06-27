/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author long
 */
public class KhachHangMD {
   private String maKhachHang,tenKhachHang,diaChi,cmnd,sdt,quocTich;
   private int tuoi;
   private boolean gioiTinh,isDangki;

    public KhachHangMD(String maKhachHang, String tenKhachHang, String diaChi, String cmnd, String sdt, String quocTich, int tuoi, boolean gioiTinh,boolean isDangKi) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.cmnd = cmnd;
        this.sdt = sdt;
        this.quocTich = quocTich;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.isDangki=isDangKi;
    }

    public boolean isIsDangki() {
        return isDangki;
    }

    public void setIsDangki(boolean isDangki) {
        this.isDangki = isDangki;
    }
    
   public KhachHangMD(){}

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKhachHang=" + maKhachHang + ", tenKhachHang=" + tenKhachHang + ", diaChi=" + diaChi + ", cmnd=" + cmnd + ", sdt=" + sdt + ", quocTich=" + quocTich + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + '}';
    }

   
    
   
       
       
        
    
   
   
   
    
    
}
