package utils;

import model.CaTruc;
import model.ChiTietCaTruc;
import model.CongThuc;
import model.HoaDon;
import model.KhachHang;
import model.KhuyenMai;
import model.MonAn;
import model.NguyenLieu;
import model.NhanVien;
import model.PhieuNhap;
import model.PhieuNhapCT;

public class Entity {
    public static NhanVien nhanVien = null;
    public static ChiTietCaTruc ctCaTruc = null;
    public static KhachHang khachHang = null;
    public static MonAn monAn = null;
    public static HoaDon hoaDon = null;
    public static CongThuc congThuc = null;
    public static KhuyenMai khuyenMai = null;
    public static NguyenLieu nguyenLieu = null;
    public static PhieuNhap phieuNhap = null;
    public static PhieuNhapCT phieuNhapCT = null;
    
    public static void setNull(){
        Entity.nhanVien = null;
        Entity.congThuc = null;
        Entity.ctCaTruc = null;
        Entity.khuyenMai = null;
        Entity.monAn = null;
        Entity.nguyenLieu = null;
        Entity.phieuNhap = null;
        Entity.phieuNhapCT = null;
        Entity.hoaDon = null;
        khachHang = null;
    }
    
    
}
