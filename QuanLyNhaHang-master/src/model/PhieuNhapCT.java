
package model;

import java.util.ArrayList;
import java.util.List;

public class PhieuNhapCT {
       
    int maPhieuNhapCT;
    String maPhieuNhap;
    String maNgLieu;
    float soLuong;
    String donVi;
    float donGia;

    public int getMaPhieuNhapCT() {
        return maPhieuNhapCT;
    }

    public void setMaPhieuNhapCT(int maPhieuNhapCT) {
        this.maPhieuNhapCT = maPhieuNhapCT;
    }

    public String getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(String maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    public String getMaNgLieu() {
        return maNgLieu;
    }

    public void setMaNgLieu(String maNgLieu) {
        this.maNgLieu = maNgLieu;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    
    public List<String> getEntity(){
        List<String> list = new ArrayList<>();
        list.add("MaPhieuNhapCT");
        list.add("MaPhieuNhap");
        list.add("MaNgLieu");
        list.add("SoLuong");
        list.add("DonVi");
        list.add("DonGia");
        return list;
    }
}
