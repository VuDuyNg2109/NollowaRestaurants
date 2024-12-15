
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhieuNhap {
    
    String maPhieuNhap;
    String maCC;
    String maNV;
    Date ngayLapPhieu;
    Date ngayNhap;

    public String getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(String maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    public String getMaCC() {
        return maCC;
    }

    public void setMaCC(String maCC) {
        this.maCC = maCC;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayLapPhieu() {
        return ngayLapPhieu;
    }

    public void setNgayLapPhieu(Date ngayLapPhieu) {
        this.ngayLapPhieu = ngayLapPhieu;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    
    public List<String> getEntity()
    {
        List<String> list = new ArrayList<>();
        list.add("MaPhieuNhap");
        list.add("MaCC");
        list.add("MaNV");
        list.add("NgayLapPhieu");
        list.add("NgayNhap");
        return list;
    }

}
