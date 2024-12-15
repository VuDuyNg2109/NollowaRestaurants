package controllers;

import dao.ThongKeDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import utils.XInit;
import javax.swing.JTable;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import utils.MsgBox;

public class QLThongKe {

    public static ThongKeDAO thongke = new ThongKeDAO();
    public static int indexTabThemMoi = -1;
    public static int indexTabThongKe = -1;

    public static String[] colsNhanVien = {"Mã NV", "Họ Tên NV", "Giới Tính", "Số ĐT", "Địa Chỉ", "Chức Vụ", "Lương", "Mật Khẩu"};
    public static String[] colsCaTruc = {"Ngày Trực", "Nhân Viên", "Mã Ca Trực", "Thời Gian Bắt Đầu", "Thời Gian Kết Thúc"};
    public static String[] colsHoaDon = {"Mã Hóa Đơn", "Ngày Lập", "Người Lập", "Người TT", "Tổng Tiền", "Thanh Toán"};
    public static String[] colsPhieuNhap = {"Mã Phiếu Nhập", "Ngày Nhập", "Người Nhập", "Tổng Chi"};
    public static String[] colsPhieuNhapCT = {"Mã Phiếu Nhập CT", "Mã Phiếu Nhập", "Nguyên Liệu", "Số Lượng", "Đơn Vị", "Đơn Giá"};
    public static String[] colsNguyenLieu = {"Mã Nguyên Liệu", "Loại Nguyên Liệu", "Tên Nguyên Liệu", "Đơn Vị", "Số Lượng"};
    public static String[] colsKhachHang = {"Tên KH", "Giới tính", "Ngày sinh", "Số ĐT", "Email", "Địa chỉ"};
    public static String[] colsKhuyenMai = {"MaKhuyenMai", "TenKhuyenMai", "NgayBatDau", "NgayKetThuc", "GiaTriKMHD"};

    public static void setColsForNhanVien(JTable tblNhanVien) {
        int[] widthCols = {60, 180, 80, 120, 200, 95, 120, 100};
        XInit.setCols(tblNhanVien, colsNhanVien, widthCols);
    }

    public static void setColsForHoaDon(JTable tblHoaDon) {
        int[] widthCols = {30, 100, 100, 100, 60, 100};
        XInit.setCols(tblHoaDon, colsHoaDon, widthCols);
    }

    public static void setColsForPhieuNhap(JTable tblPhieuNhap) {
        int[] widthCols = {10, 100, 100, 60};
        XInit.setCols(tblPhieuNhap, colsPhieuNhap, widthCols);
    }

    public static void setColsForPhieuNhapCT(JTable tblPhieuNhapCT) {
        int[] widthCols = {80, 60, 100, 50, 50, 160};
        XInit.setCols(tblPhieuNhapCT, colsPhieuNhapCT, widthCols);
    }

    public static void setColsForNguyenLieu(JTable tblNguyenLieu) {
        int[] widthCols = {50, 50, 100, 50, 100};
        XInit.setCols(tblNguyenLieu, colsNguyenLieu, widthCols);
    }

    public static void setColsForKhachHang(JTable tblKhachHang) {
        int[] widthCols = {180, 50, 120, 120, 230, 200};
        XInit.setCols(tblKhachHang, colsKhachHang, widthCols);
    }

    public static void setColsForCaTruc(JTable tblCaTruc) {
        int[] widthCols = {100, 180, 50, 100, 100};
        XInit.setCols(tblCaTruc, colsCaTruc, widthCols);
    }

    public static void setColsForKhuyenMai(JTable tblKhuyenMai) {
        int[] widthCols = {100, 200, 200, 200, 80};
        XInit.setCols(tblKhuyenMai, colsKhuyenMai, widthCols);
    }

    // fill dữ liệu lên bảng từ list Object[]
    public static void fillToTbl(JTable tbl, List<Object[]> list) {
        DefaultTableModel tblModel = (DefaultTableModel) tbl.getModel();
        tblModel.setRowCount(0);
        if (list != null) {
            for (Object[] obj : list) {
                Object[] rows = new Object[obj.length];
                for (int i = 0; i < obj.length; i++) {
                    rows[i] = obj[i];
                }
                tblModel.addRow(rows);
            }
        } else {
            MsgBox.alert(tbl, "Không tìm thấy thông tin!");
        }
    }

    public static List<Object[]> listCaTruc = QLThongKe.thongke.getThongKeCaTruc();
    public static void fillToCaTrucTblById(JTable tbl) {
        QLThongKe.fillToTbl(tbl, listCaTruc);
    }

    // "Mã Hóa Đơn", "Ngày Lập", "Người Lập", "Tổng Tiền", "Thanh Toán"
    public static List<Object[]> listHoaDon = QLThongKe.thongke.getThongKeHoaDon();
    public static void fillToBillsTblById(JTable tbl) {
        QLThongKe.fillToTbl(tbl, listHoaDon);
    }

    // "Mã Phiếu Nhập", "Ngày Nhập", "Người Nhập", "Tổng Chi"
    public static List<Object[]> listPhieuNhap = QLThongKe.thongke.getThongKePhieuNhap();
    public static void fillToPhieuNhapTblById(JTable tbl) {
        QLThongKe.fillToTbl(tbl, listPhieuNhap);
    }
    
    public static List<Object[]> listNguyenLieu = QLThongKe.thongke.getThongKeNguyenLieu();
    public static void fillToNguyenLieuTblById(JTable tbl) {
        QLThongKe.fillToTbl(tbl, listNguyenLieu);
    }

    public static void fillAllToCbo(JComboBox cbo, List<String> cols) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbo.getModel();
        model.removeAllElements();
        model.addElement("Chưa chọn cột");
        for (String col : cols) {
            model.addElement(col);
        }
    }
    
    public static void setModelSpinner(JSpinner spnTu, JSpinner spnDen, int[] values) {
        SpinnerModel spnTuModel = new SpinnerNumberModel(values[0], values[1], values[2], values[3]);
        spnTu.setModel(spnTuModel);
        SpinnerModel spnDenModel = new SpinnerNumberModel(values[0], values[1], values[2], values[3]);
        spnDen.setModel(spnDenModel);
    }
    
    public static int getIndex(JTable tbl) {
        int index = Integer.parseInt(String.valueOf(tbl.getSelectedRow()));
        if (index < 0) {
            MsgBox.alert(null, "Vui lòng chọn hàng!");
            return -1;
        }
        return index;
    }
    
    
}
