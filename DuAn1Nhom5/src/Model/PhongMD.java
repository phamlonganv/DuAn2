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
public class PhongMD {
  private  String maPhong,loaiPhong;
  private  boolean tinhTrang;
   private float giaPhong;
   private String image;

    public PhongMD(String maPhong, String loaiPhong, boolean tinhTrang, float giaPhong,String image) {
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
        this.tinhTrang = tinhTrang;
        this.giaPhong = giaPhong;
        this.image = image;
    }

    public PhongMD() {
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public float getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(float giaPhong) {
        this.giaPhong = giaPhong;
    }

    @Override
    public String toString() {
        return "Phong{" + "maPhong=" + maPhong + ", loaiPhong=" + loaiPhong + ", tinhTrang=" + tinhTrang + ", giaPhong=" + giaPhong + '}';
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
            
    
}
