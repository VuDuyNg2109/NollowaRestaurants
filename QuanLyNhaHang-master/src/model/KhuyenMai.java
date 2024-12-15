package model;

import java.util.Date;

public class KhuyenMai {

    String maKhuyenMai;
    String tenKhuyenMai;
    Date ngayBatDau;
    Date ngayKetThuc;
    float giaTriKMHD;

    public String getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaKhuyenMai(String maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public String getTenKhuyenMai() {
        return tenKhuyenMai;
    }

    public void setTenKhuyenMai(String tenKhuyenMai) {
        this.tenKhuyenMai = tenKhuyenMai;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public float getGiaTriKMHD() {
        return giaTriKMHD;
    }

    public void setGiaTriKMHD(float giaTriKMHD) {
        this.giaTriKMHD = giaTriKMHD;
    }
    
    
}
