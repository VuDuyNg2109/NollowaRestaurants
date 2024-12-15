
-- Drop Database QLNHAHANG;

CREATE DATABASE QLNHAHANG;
USE QLNHAHANG;

-- TẠO BẢNG & LIÊN KẾT BẢNG
Create Table ChucVu (	
	MaCV Varchar(5) Primary Key NOT NULL,
	ChucVu NVarchar(50) NOT NULL,
	Luong Decimal(12,2) NOT NULL
);	
	
Create Table CaTruc (	
	-- MaCaTruc Int IDENTITY(1,1) Primary Key NOT NULL,
	GioBatDau Time NOT NULL,
	GioKetCa Time NOT NULL,
	MaCaTruc Int AUTO_INCREMENT Primary Key NOT NULL
);	
	
Create Table NhanVien (	
	MaNV Varchar(5) Primary Key NOT NULL,
	MatKhau Varchar(8) NULL,
	HoTenNV NVarchar(50) NOT NULL,
	GioiTinh NVarchar(5) NOT NULL,
	NgaySinh Date NOT NULL,
	SoDT Varchar(12) NOT NULL,
	Email NVarchar(50) NOT NULL,
	DiaChi NVarchar(255) NOT NULL,
	HinhNV NVarchar(50) NOT NULL,
	MaCV Varchar(5) NULL,
	Constraint FK_ChucVu_NhanVien foreign key (MaCV) references ChucVu(MaCV) ON DELETE SET NULL ON UPDATE CASCADE
);	
	
Create Table KhachHang (	
	SoDT Varchar(12) Primary Key NOT NULL,
	HoTenKH NVarchar(50) NULL,
	GioiTinh NVarchar(5) NULL,
	NgaySinh Date NULL,
	Email NVarchar(50) NULL,
	DiaChi NVarchar(255) NULL
);	
	
	
Create Table LoaiNgLieu (	
	MaLoaiNgLieu Varchar(5) Primary Key NOT NULL,
	TenLoaiNgLieu NVarchar(100) NOT NULL
);	
	
Create Table NguyenLieu (	
	MaNgLieu Varchar(5) Primary Key NOT NULL,
	TenNgLieu NVarchar(50) NOT NULL,
	DonVi NVarchar(10) NOT NULL,
	SoLuong Float NOT NULL,
	HinhNL NVarchar(50) NOT NULL,
	MaLoaiNgLieu Varchar(5) NULL,
	Constraint FK_LoaiNgLieu_NguyenLieu foreign key (MaLoaiNgLieu) references LoaiNgLieu(MaLoaiNgLieu) ON DELETE SET NULL ON UPDATE CASCADE
);	
	
Create Table NhaCungCap (	
	MaCC Varchar(5) Primary Key NOT NULL,
	TenCC NVarchar(100) NOT NULL,
	MaSoThue Varchar(12) NOT NULL,
	NguoiLienHe NVarchar(100) NOT NULL,
	SoDT Varchar(12) NOT NULL,
	Email NVarchar(50) NOT NULL,
	DiaChi NVarchar(255) NOT NULL
);	
	
Create Table PhieuNhap (	
	MaPhieuNhap Varchar(5) Primary Key NOT NULL,
	MaCC Varchar(5) NOT NULL,
	MaNV Varchar(5) NOT NULL,
	NgayLapPhieu Date NOT NULL,
	NgayNhap Date NOT NULL,
	Constraint FK_NhaCungCap_PhieuNhap foreign key (MaCC) references NhaCungCap(MaCC) ON DELETE NO ACTION ON UPDATE CASCADE,
	Constraint FK_NhanVien_PhieuNhap foreign key (MaNV) references NhanVien(MaNV) ON DELETE NO ACTION ON UPDATE CASCADE
);	
	
Create Table PhieuNhapCT (	
	-- MaPhieuNhapCT Int IDENTITY(1,1) Primary Key NOT NULL,
	MaPhieuNhap Varchar(5) NOT NULL,
	MaNgLieu Varchar(5) NOT NULL,
	SoLuong Float NOT NULL,
	DonVi NVarchar(10) NOT NULL,
	DonGia Decimal(12,2) NOT NULL,
	MaPhieuNhapCT Int AUTO_INCREMENT Primary Key NOT NULL,
	Constraint FK_PhieuNhap_PhieuNhapCT foreign key (MaPhieuNhap) references PhieuNhap(MaPhieuNhap)ON DELETE NO ACTION ON UPDATE CASCADE,
	Constraint FK_NguyenLieu_PhieuNhapCT foreign key (MaNgLieu) references NguyenLieu(MaNgLieu)ON DELETE NO ACTION ON UPDATE CASCADE
);	
	
Create Table LoaiMon (	
	MaLoaiMon Varchar(5) Primary Key NOT NULL,
	TenLoaiMon NVarchar(100) NOT NULL
);	
	
Create Table MonAn (	
	MaMon Varchar(5) Primary Key NOT NULL,
	TenMon NVarchar(100) NOT NULL,
	DonGia Decimal(12,2) NOT NULL,
	DonVi NVarchar(10) NOT NULL,
	HinhMA NVarchar(50) NOT NULL,
	MaLoaiMon Varchar(5) NULL,
	Constraint FK_LoaiMon_MonAn foreign key (MaLoaiMon) references LoaiMon(MaLoaiMon) ON DELETE SET NULL ON UPDATE CASCADE
);	
	
Create Table CongThuc (	
	MaMon Varchar(5) NOT NULL,
	MaNgLieu Varchar(5) NOT NULL,
	DonVi NVarchar(10) NOT NULL,
	SoLuong Float NOT NULL,
	Primary Key (MaMon, MaNgLieu),
	Constraint FK_NguyenLieu_CongThuc foreign key (MaNgLieu) references NguyenLieu(MaNgLieu) ON DELETE CASCADE ON UPDATE CASCADE,
	Constraint FK_MonAn_CongThuc foreign key (MaMon) references MonAn(MaMon) ON DELETE CASCADE ON UPDATE CASCADE
);	
	
Create Table KhuyenMai (	
	MaKhuyenMai Varchar(20) Primary Key NOT NULL,
	TenKhuyenMai Varchar(50) NOT NULL,
	NgayBatDau Datetime NOT NULL,
	NgayKetThuc Datetime NOT NULL,
	GiaTriKMHD Decimal (5,2) NULL
);	
	
Create Table KhuyenMaiCT (	
	MaKhuyenMai Varchar(20) NOT NULL,
	MaMon Varchar(5) NOT NULL,
	GiaTriKMCT Decimal (5,2) NOT NULL,
	Primary Key (MaKhuyenMai, MaMon),
	Constraint FK_KhuyenMai_KhuyenMaiCT foreign key (MaKhuyenMai) references KhuyenMai(MaKhuyenMai) ON DELETE NO ACTION ON UPDATE CASCADE,
	Constraint FK_MonAn_KhuyenMaiCT foreign key (MaMon) references MonAn(MaMon) ON DELETE NO ACTION ON UPDATE CASCADE
);	
	
Create Table HoaDon (	
	-- MaHoaDon Int IDENTITY(1,1) Primary Key NOT NULL,
	NgayLapHD DateTime NOT NULL,
	HinhThucTT NVarchar(50) NOT NULL,
	NhanVienLap Varchar(5) NOT NULL,
	NhanVienTT Varchar(5) NOT NULL,
	MaKH Varchar(12) NOT NULL,
	MaKhuyenMai Varchar(20) NULL,
	MaHoaDon Int AUTO_INCREMENT Primary Key NOT NULL,
	Constraint FK_NhanVienLap_HoaDon foreign key (NhanVienLap) references NhanVien(MaNV) ON DELETE NO ACTION ON UPDATE CASCADE,
	Constraint FK_NhanVienTT_HoaDon foreign key (NhanVienTT) references NhanVien(MaNV) ON DELETE NO ACTION ON UPDATE NO ACTION,
	Constraint FK_KhachHang_HoaDon foreign key (MaKH) references KhachHang(SoDT) ON DELETE NO ACTION ON UPDATE CASCADE,
	Constraint FK_KhuyenMai_HoaDon foreign key (MaKhuyenMai) references KhuyenMai(MaKhuyenMai) ON DELETE SET NULL ON UPDATE CASCADE
);	
Create Table DatBan (	
	MaBan Int Primary Key NOT NULL,
	MaHoaDon Int NULL,
    TinhTrang boolean NOT NULL
);	
-- Kiểm tra xem nếu tinh trang là false thì xóa dữ liệu

Create Table HoaDonCT (	
	-- MaHoaDonCT Int IDENTITY(1,1) Primary Key NOT NULL,
	MaHoaDon Int NOT NULL,
	MaMon Varchar(5) NOT NULL,
	SoLuong Float NOT NULL,
	DonVi NVarchar(10) NOT NULL,
	MaHoaDonCT Int AUTO_INCREMENT Primary Key NOT NULL,
	Constraint FK_HoaDon_HoaDonCT foreign key (MaHoaDon) references HoaDon(MaHoaDon) ON DELETE NO ACTION ON UPDATE CASCADE,
	Constraint FK_MonAn_HoaDonCT foreign key (MaMon) references MonAn(MaMon) ON DELETE NO ACTION ON UPDATE CASCADE
);	

Create Table ChiTietCaTruc (	
	NgayTruc Date NOT NULL,
	MaNV Varchar(5) NOT NULL,
	MaCaTruc Int NOT NULL,
	Primary Key (NgayTruc, MaNV),
	Constraint FK_CaTruc_CTCaTruc foreign key (MaCaTruc) references CaTruc(MaCaTruc) ON DELETE CASCADE ON UPDATE CASCADE,
	Constraint FK_NhanVien_CTCaTruc foreign key (MaNV) references NhanVien(MaNV) ON DELETE CASCADE ON UPDATE CASCADE
);	

Insert into ChucVu values
('CV001', N'Quản Lý', 20000000),
('CV002', N'Thu Ngân', 12000000),
('CV003', N'Đầu Bếp', 10000000),
('CV004', N'Phục Vụ', 6000000);

Insert into CaTruc (GioBatDau ,GioKetCa) values 
('06:00:00','14:00:00'),
('14:00:00','22:00:00'),
('08:00:00','17:00:00');

Insert into NhanVien values
('NV001', 'Maiyeuem', N'Ngụy Miêu Thức', N'Nam', '1991/4/12', '0354492271', 'thucNV001@gmail.com', N'37/8 C1', 'MieuThuc.jpg', 'CV001'),
('NV002', 'BuffBan', N'Nguyễn Trọng Hiếu', N'Nam', '1993/5/25', '0949687938', 'hieuNV002@gmail.com', N'60 Thiên Đàng', 'TrongHieu.jpg', 'CV002'),
('NV003', 'ChiDai', N'Lê Nguyễn Ngọc Hân', N'Nữ', '1996/7/18', '0939906709', 'hanNV003@gmail.com', N'42 Tô Kí', 'NgocHan.jpg', 'CV002'),
('NV004', 'kiet6mui', N'Võ Tuấn Kiệt', N'Nam', '1992/5/22', '0937795772', 'kietNV004@gmail.com', N'98 Nguyễn Đình Khiêm', 'TuanKiet.jpg', 'CV003'),
('NV005', 'Kocamxuc', N'Huỳnh Nhật Cường', N'Nam', '1991/11/8', '0981234485', 'cuongNV005@gmail.com', N'76A Diêm Vương', 'NhatCuong.jpg', 'CV003'),
('NV006', '123yo', N'Trịnh Mỹ Hà', N'Nữ', '1992/7/5', '0351234985', 'hanNV006@gmail.com', N'89/12 Trần Quốc Tuấn', 'MyHa.jpg', 'CV004'),
('NV007', 'boyah', N'Bùi Mẫn Nhi', N'Nữ', '1992/3/28', '0987124583', 'nhiNV007@gmail.com', N'102 Bùi Viện', 'ManNhi.jpg', 'CV004'),
('NV008', '321yo', N'Huỳnh Ngọc Sáng', N'Nam', '1995/5/26', '0919887205', 'sangNV008@gmail.com', N'87/33 Quang Trung', 'NgocSang.jpg', 'CV004'),
('NV009', 'Muc1', N'Lâm Khánh An', N'Nữ', '1998/5/27', '0919886502', 'anNV009@gmail.com', N'123 3 tháng 2', 'KhanhAn.jpg', 'CV004'),
('NV010', 'depvadoc', N'Nguyễn Lâm Duy Anh', N'Nam', '1991/4/12', '0875789634', 'anhNV010@gmail.com', N'23 Nguyễn Hữu Tiến', 'DuyAnh.jpg', 'CV004'),
('NV011', 'phucvu', N'Nguyễn Thị Mỹ Tâm', N'Nữ', '1993/5/25', '0934602358', 'tamNV011@gmail.com', N'54 Trường Chinh', 'MyTam.jpg', 'CV004'),
('NV012', 'songlong', N'Lê Thị Thùy Dung', N'Nữ', '1996/7/18', '0956534574', 'dungNV012@gmail.com', N'108 Lương Sơn Bạc', 'ThuyDung.jpg', 'CV004'),
('NV013', '123456', N'Nguyễn Minh Đức', N'Nam', '1991/4/12', '0923563723', 'ducNV013@gmail.com', N'22 Lý Thường Kiệt', 'MinhDuc.jpg', 'CV004'),
('NV014', '654321', N'Vũ Bá Đạt', N'Nam', '1993/5/25', '0957453478', 'datNV014@gmail.com', N'77 Tôn Thất Thuyết', 'BaDat.jpg', 'CV004'),
('NV015', 'chaonha', N'Nguyễn Thu Hương', N'Nữ', '1996/7/18', '0968659345', 'huongNV015@gmail.com', N'29 Sơn La', 'ThuHuong.jpg ', 'CV004'),
('NV016', 'matkhau', N'Hồ Thị Thu Hiền', N'Nữ', '1992/5/22', '0923645723', 'hienNV016@gmail.com', N'38 Tây Thạnh', 'ThuHien.jpg', 'CV004'),
('NV017', 'password', N'Đinh Nguyên Hải', N'Nam', '1991/11/8', '0946445742', 'haiNV017@gmail.com', N'44 Cầu Giấy', 'NguyenHai.jpg', 'CV004'),
('NV018', '987654', N'Nguyễn Trọng Tân', N'Nam', '1992/7/5', '0923546456', 'tanNV018@gmail.com', N'98 Nguyễn Văn Trỗi', 'TrongTan.jpg', 'CV004'),
('NV019', '456789', N'Lâm Mỹ Thoa', N'Nữ', '1992/3/28', '0391409341', 'thoaNV019@gmail.com', N'299 Xuân Diệu', 'MyThoa.jpg', 'CV004'),
('NV020', '123abc', N'Châu Minh Mẫn', N'Nam', '1995/5/26', '0989420419', 'manNV020@gmail.com', N'83 Lý Thái Tổ', 'MinhMan.jpg', 'CV004'),
('NV021', '123cba', N'Đào Minh Đức', N'Nam', '1998/5/27', '0938149102', 'ducNV021@gmail.com', N'182 Cống Quỳnh', 'MinhDuc1.jpg', 'CV004');


Insert into KhachHang values
('0881385771', N'Nguyễn Linh An', N'Nữ', '2000/12/10', 'annguyen2000@gmail.com', N'41 Đội Cung'),
('0385665555', N'Nguyễn Thu Ngân', N'Nữ', '1990/8/22', 'ngannguyen1990@gmail.com', N'65 Nguyễn Bỉnh Khiêm'),
('0973481249', N'Lâm Tính Toán', N'Nam', '1989/7/6', 'toanlam1989@gmail.com', N'Hẻm 10 Âu Dương Lân'),
('0973485559', N'Phan Chung Tình', N'Nam', '1996/9/15', 'tinhphan1996@gmail.com', N'98 Nguyễn Chí Thanh'),
('0821374783', N'Nhâm Mạnh Dũng', N'Nam', '1991/4/24', 'dungnham1991@gmail.com', N'378 Điện Biên Phủ'),
('0924712628', N'Nguyễn Công Phượng', N'Nam', '1993/11/18', 'phuongnguyen1993@gmail.com', N'122 Lý Thái Tổ'),
('0871238787', N'Đoàn Văn Hậu', N'Nam', '1999/9/9', 'hauhaihuoc@gmail.com', N'87 Cao Lỗ'),
('0987189040', N'Nguyễn Quang Hải', N'Nam', '1997/4/16', 'haihunghang@gmail.com', N'27 Tây Hồ'),
('0987189065', N'Cristiano Ronaldo', N'Nam', '1985/2/5', 'siro@gmail.com', N'45 Trường Chinh'),
('0987189123', N'Cristiano Ronaldo', N'Nam', '1985/1/5', 'thucnmps21124@gmail.com', N'45 Trường Chinh');
Insert into LoaiNgLieu values
('LNL01', N'Rau củ'),
('LNL02', N'Thịt đỏ'),
('LNL03', N'Thịt Trắng'),
('LNL04', N'Hải Sản'),
('LNL05', N'Gia vị thông dụng'),
('LNL06', N'Khác');

Insert into NguyenLieu values
('NL001', N'Thịt jambon', N'Kg', 10,'ThitJambon.jpg', 'LNL02'),
('NL002', N'Thịt giò bì', N'Kg', 10,'ThitGioBi.jpg', 'LNL02'),
('NL003', N'Thịt gà', N'Kg', 15,'ThitGa.jpg', 'LNL03'),
('NL004', N'Thịt heo', N'Kg', 20,'ThitHeo.jpg', 'LNL02'),
('NL005', N'Thịt bò nạm sườn', N'Kg', 10,'ThitBoNamSuon.jpg', 'LNL02'),
('NL006', N'Beef steak thăn lưng ', N'Kg', 5,'BeefsteakThanLung.jpg', 'LNL02'),
('NL007', N'Thịt bò', N'Kg', 10,'ThitBo.jpg', 'LNL02'),
('NL008', N'Bơ nhạt', N'Kg', 7,'BoNhat.jpg', 'LNL05'),
('NL009', N'Dầu thực vật ', N'Kg', 5,'DauThucVat.jpg', 'LNL05'),
('NL010', N'Sốt cà chua ', N'Kg', 8,'SotCaChua.jpg', 'LNL05'),
('NL011', N'Rượu vang đỏ', N'Lít', 15,'RuouVangDo.jpg', 'LNL06'),
('NL012', N'Hương thảo khô', N'Kg', 1,'HuongThaoKho.jpg', 'LNL01'),
('NL013', N'Bắp cải trắng', N'Kg', 3,'BapCaiTrang.jpg', 'LNL01'),
('NL014', N'Bắp Mỹ', N'Kg', 4,'BapMy.jpg', 'LNL01'),
('NL015', N'Bí đỏ', N'Kg', 6,'BiDo.jpg', 'LNL01'),
('NL016', N'Bạc hà ', N'Kg', 2,'BacHa.jpg', 'LNL01'),
('NL017', N'Bột năng', N'Kg', 4,'BotNang.jpg', 'LNL05'),
('NL018', N'Bơ ', N'Kg', 4,'Bo.jpg', 'LNL05'),
('NL019', N'Bơ lạt', N'Kg', 6,'Bolat.jpg', 'LNL05'),
('NL020', N'Bột cà ri', N'Kg', 2,'BotCaRi.jpg', 'LNL05'),
('NL021', N'Bông cải xanh', N'Kg', 6,'BongCaiXanh.jpg', 'LNL01'),
('NL022', N'Bột chiên xù', N'Kg', 9,'BotChienXu.jpg', 'LNL05'),
('NL023', N'Bột sắn dây', N'Kg', 3,'BotSanDay.jpg', 'LNL05'),
('NL024', N'Cá hồi', N'Kg', 20,'CaHoi.jpg', 'LNL04'),
('NL025', N'Xà lách', N'Kg', 1,'XaLach.jpg', 'LNL01'),
('NL026', N'Cà chua bi', N'Kg', 4,'CaChuaBi.jpg', 'LNL01'),
('NL027', N'Cà chua', N'Kg', 4,'CaChua.jpg', 'LNL01'),
('NL028', N'Cá basa', N'Kg', 10,'CaBaSa.jpg', 'LNL04'),
('NL029', N'Bột ớt', N'Kg', 2,'BotOt.jpg', 'LNL05'),
('NL030', N'Bột nghệ', N'Kg', 3,'BotNghe..jpg', 'LNL05'),
('NL031', N'Chanh', N'Kg', 10,'Chanh.jpg', 'LNL01'),
('NL032', N'Cà rốt', N'Kg', 20,'CaRot.jpg', 'LNL01'),
('NL033', N'Giò sống', N'Kg', 3,'GioSong.jpg', 'LNL02'),
('NL034', N'Cá mú', N'Kg', 8,'CaMu.jpg', 'LNL04'),
('NL035', N'Chả lụa', N'Kg', 5,'ChaLua.jpg', 'LNL03'),
('NL036', N'Cải thìa', N'Kg', 8,'CaiThia.jpg', 'LNL01'),
('NL037', N'Đậu bắp', N'Kg', 1,'DauBap.jpg', 'LNL01'),
('NL038', N'Đậu hũ non', N'Kg', 4,'DauHuNon.jpg', 'LNL06'),
('NL039', N'Đậu hũ', N'Kg', 6,'DauHu.jpg', 'LNL06'),
('NL040', N'Dầu mè', N'Kg', 3,'DauMe.jpg', 'LNL01'),
('NL041', N'Cua biển', N'Kg', 20,'CuaBien.jpg', 'LNL04'),
('NL042', N'Củ hủ dừa', N'Kg', 3,'CuHuDua.jpg', 'LNL01'),
('NL043', N'Đậu phộng', N'Kg', 5,'DauPhong.jpg', 'LNL01'),
('NL044', N'Củ cải đỏ', N'Kg', 1,'CuCaiDo.jpg', 'LNL01'),
('NL045', N'Gia vị thông dụng', N'Kg', 40,'GiaViThongDung.jpg', 'LNL05'),
('NL046', N'Dầu hào', N'Kg', 5,'DauHao.jpg', 'LNL05'),
('NL047', N'Hành lá', N'Kg', 6,'HanhLa.jpg', 'LNL01'),
('NL048', N'Gói gia vị lẩu thái', N'Kg', 2,'GoiGiaViLau.jpg', 'LNL05'),
('NL049', N'Đường thốt nốt', N'Kg', 5,'DuongthotNot.jpg', 'LNL05'),
('NL050', N'Hành khô', N'Kg', 8,'HanhKho.jpg', 'LNL01'),
('NL051', N'Hành tây', N'Kg', 13,'HanhTay.jpg', 'LNL01'),
('NL052', N'Dưa leo', N'Kg', 3,'DuaLeo.jpg', 'LNL01'),
('NL053', N'Me', N'Kg', 2,'Me.jpg', 'LNL01'),
('NL054', N'Hành tím', N'Kg', 9,'HanhTim.jpg', 'LNL01'),
('NL055', N'Măng khô', N'Kg', 2,'MangKho.jpg', 'LNL01'),
('NL056', N'Lá giang', N'Kg', 6,'LaGiang.jpg', 'LNL01'),
('NL057', N'Khoai tây', N'Kg', 2,'KhoaiTay.jpg', 'LNL01'),
('NL058', N'Nấm hương', N'Kg', 1,'NamHuong..jpg', 'LNL01'),
('NL059', N'Nấm kim châm', N'Kg', 7,'NamKimCham.jpg', 'LNL01'),
('NL060', N'Kem tươi', N'Kg', 5,'KemTuoi.jpg', 'LNL05'),
('NL061', N'Mực', N'Kg', 9,'Muc.jpg', 'LNL04'),
('NL062', N'Ngao', N'Kg', 3,'Ngao.jpg', 'LNL04'),
('NL063', N'Nấm đông cô', N'Kg', 7,'NamDongCo.jpg', 'LNL01'),
('NL064', N'Nấm tuyết', N'Kg', 2,'NamTuyet.jpg', 'LNL01'),
('NL065', N'Mùi tàu', N'Kg', 5,'MuiTau.jpg', 'LNL01'),
('NL066', N'Ngò gai', N'Kg', 8,'NgoGai.jpg', 'LNL01'),
('NL068', N'Ngò rí', N'Kg', 2,'NgoRi.jpg', 'LNL01'),
('NL071', N'Tôm càng', N'Kg', 30,'TomCang.jpg', 'LNL04'),
('NL073', N'Ngũ vị hương', N'Kg', 3,'NguViHuong.jpg', 'LNL05'),
('NL074', N'Ốc hương', N'Kg', 7,'OcHuong..jpg', 'LNL04'),
('NL075', N'Ngó sen', N'Kg', 2,'NgoSen.jpg', 'LNL01'),
('NL076', N'Ớt', N'Kg', 4,'Ot.jpg', 'LNL01'),
('NL077', N'Phô mai', N'Kg', 7,'PhoMai.jpg', 'LNL05'),
('NL078', N'Rau lang', N'Kg', 2,'RauLang.jpg', 'LNL01'),
('NL079', N'Rau mồng tơi', N'Kg', 2,'RauMongToi.jpg', 'LNL01'),
('NL080', N'Rau cải thảo', N'Kg', 6,'RauCaiThia.jpg', 'LNL01'),
('NL081', N'Quế', N'Kg', 8,'Que.jpg', 'LNL01'),
('NL082', N'Rau mầm', N'Kg', 1,'RauMam.jpg', 'LNL01'),
('NL083', N'Rau răng cưa', N'Kg', 7,'RauRangCua.jpg', 'LNL01'),
('NL084', N'Rau răm', N'Kg', 8,'RauRam.jpg', 'LNL01'),
('NL085', N'Tôm sú', N'Kg', 30,'TomSu.jpg', 'LNL04'),
('NL086', N'Tôm hùm', N'Kg', 23,'TomHum.jpg', 'LNL04'),
('NL087', N'Tôm khô', N'Kg', 6,'TomKho.jpg', 'LNL04'),
('NL088', N'Trứng gà', N'Kg', 12,'TruongGa.jpg', 'LNL03'),
('NL089', N'Trứng muối', N'Kg', 10,'TrungMuoi.jpg', 'LNL03'),
('NL090', N'Sữa tươi không đường', N'Lít', 20,'SuaTuoiKhongDuong.jpg', 'LNL05'),
('NL091', N'Sữa chua không đường', N'Lít', 25,'SuaChuaKhongDuong.jpg', 'LNL05'),
('NL092', N'Sốt mayonnaise', N'Kg', 1,'SotMayonaise.jpg', 'LNL05'),
('NL093', N'Táo xanh', N'Kg', 5,'TaoXanh.jpg', 'LNL01'),
('NL094', N'Sả, gừng', N'Kg', 7,'SaGung.jpg', 'LNL01'),
('NL095', N'Riềng', N'Kg', 9,'Rieng.jpg', 'LNL01'),
('NL096', N'Tỏi', N'Kg', 2,'Toi.jpg', 'LNL01'),
('NL097', N'Sa tế', N'Kg', 5,'SaTe.jpg', 'LNL05'),
('NL098', N'Thơm', N'Kg', 8,'Thom.jpg', 'LNL01'),
('NL099', N'Xương heo', N'Kg', 9,'Xuongheo.jpg', 'LNL02'),
('NL100', N'Xương ống', N'Kg', 7,'Xuongong.jpg', 'LNL02'),
('NL101', N'Tương ớt', N'Kg', 8,'Tuongot.jpg', 'LNL05'),
('NL102', N'Càng cua', N'Kg', 9,'CangCua.jpg', 'LNL04');

Insert into NhaCungCap values
('CC001', N'Cửa Hàng Gia Cầm', '1011121314', N'Giang', '0345678945 ','GiangCC001@gmail.com', N'198 Nguyễn Chí Thanh'),
('CC002', N'Cửa Hàng Bò Heo', '1011121315', N'Thành', '0987664447 ','ThànhCC002@gmail.com', N'12 Điện Biên Phủ'),
('CC003', N'Cửa Hàng Hải Sản', '1011121316', N'Trúc', '0346678450 ','TrúcCC003@gmail.com', N'2 Lý Thái Tổ'),
('CC004', N'Cửa Hàng Rau Củ', '1011121317', N'An', '0876543588 ','AnCC004@gmail.com', N'200 Nguyễn Bỉnh Khiêm'),
('CC005', N'Của Hàng Tạp Hóa', '1011121318', N'Lan', '0365478484 ','LanCC005@gmail.com', N'Hẻm 20 Âu Dương Lân');

Insert into PhieuNhap values
('PN001', 'CC002', 'NV004', '2021/8/29', '2020/11/6'),
('PN002', 'CC002', 'NV005', '2021/8/29', '2020/11/14'),
('PN004', 'CC002', 'NV005', '2021/8/30', '2020/11/15'),
('PN003', 'CC001', 'NV004', '2021/8/30', '2020/11/20'),
('PN014', 'CC001', 'NV005', '2021/8/30', '2020/11/3'),
('PN010', 'CC003', 'NV005', '2021/8/30', '2020/11/27'),
('PN011', 'CC003', 'NV005', '2021/8/29', '2020/11/1'),
('PN012', 'CC003', 'NV005', '2021/8/29', '2020/11/20'),
('PN007', 'CC004', 'NV004', '2021/8/30', '2020/11/30'),
('PN009', 'CC004', 'NV005', '2021/8/30', '2020/11/30'),
('PN013', 'CC004', 'NV004', '2021/8/29', '2020/11/2'),
('PN005', 'CC005', 'NV005', '2021/8/30', '2020/11/22'),
('PN006', 'CC005', 'NV004', '2021/8/29', '2020/11/2'),
('PN008', 'CC005', 'NV005', '2021/8/30', '2020/11/19');

Insert into PhieuNhapCT(MaPhieuNhap,MaNgLieu,SoLuong,DonVi,DonGia) values
('PN001', 'NL035', 78, 'Kg', 51000),
('PN001', 'NL006', 3, 'Kg', 76000),
('PN001', 'NL004', 75, 'Kg', 106000),
('PN001', 'NL100', 86, 'Kg', 59000),
('PN002', 'NL033', 8, 'Kg', 34000),
('PN002', 'NL005', 93, 'Kg', 19000),
('PN002', 'NL001', 13, 'Kg', 34000),
('PN003', 'NL003', 14, 'Kg', 107000),
('PN003', 'NL089', 34, 'Lít', 96000),
('PN004', 'NL007', 41, 'Kg', 70000),
('PN004', 'NL002', 70, 'Kg', 76000),
('PN004', 'NL099', 74, 'Kg', 37000),
('PN005', 'NL018', 16, 'Kg', 90000),
('PN005', 'NL040', 66, 'Kg', 106000),
('PN005', 'NL019', 35, 'Kg', 35000),
('PN005', 'NL043', 25, 'Kg', 102000),
('PN005', 'NL010', 31, 'Kg', 63000),
('PN005', 'NL008', 55, 'Kg', 102000),
('PN005', 'NL009', 26, 'Kg', 70000),
('PN005', 'NL092', 66, 'Kg', 60000),
('PN006', 'NL022', 88, 'Kg', 60000),
('PN006', 'NL049', 15, 'Kg', 93000),
('PN006', 'NL097', 57, 'Kg', 18000),
('PN006', 'NL020', 8, 'Kg', 10000),
('PN006', 'NL045', 58, 'Kg', 100000),
('PN006', 'NL090', 73, 'Kg', 50000),
('PN006', 'NL017', 91, 'Kg', 55000),
('PN006', 'NL048', 5, 'Kg', 29000),
('PN006', 'NL101', 42, 'Kg', 105000),
('PN007', 'NL016', 14, 'Kg', 16000),
('PN007', 'NL044', 61, 'Kg', 51000),
('PN007', 'NL047', 75, 'Kg', 12000),
('PN007', 'NL063', 65, 'Kg', 92000),
('PN007', 'NL076', 60, 'Kg', 41000),
('PN007', 'NL013', 88, 'Kg', 97000),
('PN007', 'NL042', 38, 'Kg', 27000),
('PN007', 'NL051', 28, 'Kg', 68000),
('PN007', 'NL058', 38, 'Kg', 49000),
('PN007', 'NL077', 20, 'Kg', 74000),
('PN007', 'NL094', 36, 'Kg', 92000),
('PN007', 'NL014', 49, 'Kg', 92000),
('PN007', 'NL039', 75, 'Kg', 99000),
('PN007', 'NL056', 19, 'Kg', 77000),
('PN007', 'NL068', 36, 'Lít', 65000),
('PN007', 'NL082', 90, 'Kg', 70000),
('PN008', 'NL030', 68, 'Kg', 32000),
('PN008', 'NL060', 34, 'Kg', 23000),
('PN008', 'NL091', 82, 'Kg', 59000),
('PN008', 'NL029', 22, 'Kg', 65000),
('PN008', 'NL073', 89, 'Kg', 56000),
('PN008', 'NL023', 19, 'Kg', 85000),
('PN008', 'NL011', 49, 'Lít', 73000),
('PN009', 'NL015', 57, 'Kg', 66000),
('PN009', 'NL037', 10, 'Kg', 66000),
('PN009', 'NL012', 21, 'Kg', 67000),
('PN009', 'NL064', 97, 'Kg', 39000),
('PN009', 'NL080', 60, 'Kg', 81000),
('PN009', 'NL025', 4, 'Kg', 18000),
('PN009', 'NL046', 23, 'Kg', 84000),
('PN009', 'NL057', 20, 'Kg', 54000),
('PN009', 'NL066', 75, 'Kg', 49000),
('PN009', 'NL078', 24, 'Kg', 23000),
('PN009', 'NL021', 66, 'Kg', 102000),
('PN009', 'NL050', 75, 'Kg', 108000),
('PN009', 'NL065', 11, 'Kg', 71000),
('PN009', 'NL075', 28, 'Kg', 96000),
('PN009', 'NL083', 43, 'Kg', 63000),
('PN010', 'NL028', 78, 'Kg', 51000),
('PN010', 'NL024', 78, 'Kg', 77000),
('PN010', 'NL062', 84, 'Kg', 64000),
('PN010', 'NL086', 83, 'Kg', 93000),
('PN011', 'NL027', 28, 'Kg', 77000),
('PN011', 'NL034', 17, 'Kg', 16000),
('PN011', 'NL074', 74, 'Kg', 50000),
('PN011', 'NL087', 36, 'Kg', 16000),
('PN012', 'NL026', 74, 'Kg', 90000),
('PN012', 'NL061', 41, 'Kg', 73000),
('PN012', 'NL102', 4, 'Kg', 45000),
('PN012', 'NL085', 63, 'Kg', 69000),
('PN012', 'NL041', 31, 'Kg', 72000),
('PN013', 'NL032', 69, 'Kg', 61000),
('PN013', 'NL038', 0, 'Kg', 101000),
('PN013', 'NL055', 23, 'Kg', 28000),
('PN013', 'NL068', 63, 'Kg', 103000),
('PN013', 'NL079', 87, 'Kg', 29000),
('PN013', 'NL095', 98, 'Kg', 57000),
('PN013', 'NL036', 96, 'Kg', 86000),
('PN013', 'NL052', 35, 'Kg', 54000),
('PN013', 'NL053', 9, 'Kg', 56000),
('PN013', 'NL068', 25, 'Lít', 103000),
('PN013', 'NL084', 97, 'Kg', 40000),
('PN013', 'NL031', 20, 'Kg', 47000),
('PN013', 'NL054', 30, 'Kg', 88000),
('PN013', 'NL059', 79, 'Kg', 38000),
('PN013', 'NL081', 93, 'Kg', 35000),
('PN013', 'NL093', 23, 'Kg', 73000),
('PN013', 'NL098', 38, 'Kg', 61000),
('PN013', 'NL096', 56, 'Kg', 93000),
('PN014', 'NL088', 18, 'Lít', 34000);

Insert into LoaiMon values
('LM01', N'Khai Vị'),
('LM02', N'Súp các loại'),
('LM03', N'Rau theo mùa'),
('LM04', N'Gỏi & Salad'),
('LM05', N'Món Thịt Bò'),
('LM06', N'Món Gà'),
('LM07', N'Món Thịt Heo'),
('LM08', N'Hải Sản'),
('LM09', N'Món Nước'),
('LN01', N'Các loại bia và rượu'),
('LN02', N'Các loại nước ngọt'),
('LN03', N'Sinh tố'),
('LN04', N'Nước ép');

Insert into MonAn values
('KV01', N'Thịt nguội bát bửu', 120000, N'Dĩa', 'ThitNguoiBatBuu.jpg', 'LM01'),
('KV02', N'Càng cua bách hoa', 100000, N'Dĩa', 'CangCuaBachHoa.jpg', 'LM08'),
('KV03', N'Đậu Hủ Non Sốt Trứng Muối', 80000, N'Dĩa', 'DauHuNonSotTM.jpg', 'LM01'),
('SU01', N'Súp cua', 120000, N'Tô', 'SupCua.jpg', 'LM02'),
('SU02', N'Súp thịt gà', 100000, N'Tô', 'SupThitGa.jpg', 'LM02'),
('SU03', N'Súp bí đỏ', 80000, N'Tô', 'SupBiDo.jpg', 'LM02'),
('GO01', N'Gỏi củ hủ dừa', 80000, N'Dĩa', 'GoiCuHuDua.jpg', 'LM04'),
('GO02', N'Gỏi gó sen tôm thịt', 150000, N'Dĩa', 'GoiGoSen.jpg', 'LM04'),
('GO03', N'Salad cá hồi', 100000, N'Dĩa', 'SaladCaHoi.jpg', 'LM04'),
('BO01', N'Bò sốt vang', 200000, N'Tô', 'BoSotVang.jpg', 'LM05'),
('BO02', N'Bò kho', 70000, N'Nồi', 'BoKho.jpg', 'LM05'),
('BO03', N'Beefsteak', 250000, N'Dĩa', 'Beefsteak.jpg', 'LM05'),
('HS01', N'Tôm hùm nướng phô mai', 250000, N'Con', 'TomHumNPM.jpg', 'LM08'),
('HS02', N'Cá mú hấp xì dầu', 120000, N'Con', 'CaMuHapXiDau.jpg', 'LM08'),
('HS03', N'Ốc hương sốt me', 80000, N'Dĩa', 'OcHuongSotMe.jpg', 'LM08'),
('RA01', N'Rau lang xào tỏi', 50000, N'Dĩa', 'RauLangXaoToi.jpg', 'LM03'),
('RA02', N'Cải thìa xào dầu hào', 50000, N'Dĩa', 'CaiThiaXaoDauHao.jpg', 'LM03'),
('RA03', N'Rau luộc chấm kho quẹt', 50000, N'Dĩa', 'RauLuocChamKQ.jpg', 'LM03'),
('GA01', N'Gà kho sả ớt', 100000, N'Nồi', 'GaKhoSaOt.jpg', 'LM06'),
('GA02', N'Gà chiên giòn', 80000, N'Dĩa', 'GaChienGion.jgp', 'LM06'),
('GA03', N'Gà tiềm ớt hiểm', 250000, N'Nồi', 'GaTiemOtHiem.jpg', 'LM06'),
('TH01', N'Thịt heo nướng củ riềng', 100000, N'Dĩa', 'ThitHeoNuongCR.jgp', 'LM07'),
('TH02', N'Thịt heo nướng ngũ vị', 150000, N'Dĩa', 'ThitHeoNuongNV.jpg', 'LM07'),
('TH03', N'Thịt heo xào măng', 120000, N'Dĩa', 'ThitHeoXaoMang.jpg', 'LM07'),
('LA01', N'Lẩu thái', 200000, N'Nồi', 'LauThai.jpg', 'LM09'),
('LA02', N'Lẩu gà lá giang', 180000, N'Nồi', 'LauGaLaGiang.jpg', 'LM09'),
('LA03', N'Lẩu cá ba sa', 250000, N'Nồi', 'LauCaBaSa.jpg', 'LM09'),
('BI01', N'Bia Tiger', 15000, N'Lon', 'BiaTiger.jpg', 'LN01'),
('BI02', N'Bia sài gòn đỏ', 18000, N'Lon', 'BiaSaiGonDo.jpg', 'LN01'),
('BI03', N'Bia sài gòn xanh', 20000, N'Lon', 'BiaSaiGonXanh.jpg', 'LN01'),
('BI04', N'Bia 333', 10000, N'Lon', 'Bia333.jpg', 'LN01'),
('BI05', N'Bia Heineken', 20000, N'Lon', 'BiaHeineken.jpg', 'LN01'),
('RU01', N'Rượu nếp Long An', 35000, N'Chai', 'RuouNepLongAn.jpg', 'LN01'),
('RU02', N'Rượu nho', 70000, N'Chai', 'RuouNho.jpg', 'LN01'),
('RU03', N'Rượu mix trái cây', 100000, N'Chai', 'RuouMixTraiCay.jpg', 'LN01'),
('NN01', N'Sting', 15000, N'Chai', 'Sting.jpg', 'LN02'),
('NN02', N'Pepsi', 15000, N'Chai', 'Pepsi.jpg', 'LN02'),
('NN03', N'Coca-cola', 15000, N'Chai', 'CoCa.jpg', 'LN02'),
('NN04', N'7up', 15000, N'Chai', '7Up.jpg', 'LN02'),
('ST01', N'Sinh tố Bơ', 20000, N'Ly', 'SinhToBo.jpg', 'LN03'),
('ST02', N'Sinh tố Sầu Riêng', 20000, N'Ly', 'SinhToSauRieng.jpg', 'LN03'),
('ST03', N'Sinh tố Cà Rốt', 20000, N'Ly', 'SinhToCaRot.jpg', 'LN03'),
('NE01', N'Nước ép Cam', 20000, N'Ly', 'NuocEpCam.jpg', 'LN04'),
('NE02', N'Nước ép Ổi', 20000, N'Ly', 'NuocEpOi.jpg', 'LN04'),
('NE03', N'Nước ép Táo', 20000, N'Ly', 'NuocEpTao.jpg', 'LN04');

Insert into CongThuc values
('KV01', 'NL001', 'kg', 0.2),
('KV01', 'NL002', 'kg', 0.2),
('KV01', 'NL035', 'kg', 0.2),
('KV01', 'NL025', 'kg', 0.5),
('KV01', 'NL013', 'búp', 1),
('KV01', 'NL014', 'trái', 1),
('KV01', 'NL092', 'ml', 50),
('KV01', 'NL031', 'trái', 1),
('KV02', 'NL085', 'kg', 0.15),
('KV02', 'NL033', 'kg', 0.05),
('KV02', 'NL102', 'cái', 4),
('KV02', 'NL088', 'quả', 1),
('KV03', 'NL038', 'miếng', 4),
('KV03', 'NL089', 'lòng đỏ', 2),
('KV03', 'NL047', 'kg', 0.01),
('KV03', 'NL045', 'thìa cafe', 0.5),
('SU01', 'NL041', 'kg', 0.35),
('SU01', 'NL099', 'kg', 1),
('SU01', 'NL088', 'quả', 1),
('SU01', 'NL094', 'kg', 0.01),
('SU01', 'NL014', 'trái', 0.5),
('SU01', 'NL058', 'cái', 4),
('SU01', 'NL032', 'củ', 0.5),
('SU01', 'NL059', 'túi', 0.5),
('SU01', 'NL023', 'kg', 0.1),
('SU01', 'NL050', 'củ', 5),
('SU01', 'NL068', 'kg', 0.01),
('SU01', 'NL045', 'thìa cafe', 1),
('SU02', 'NL003', 'kg', 0.4),
('SU02', 'NL014', 'trái', 2),
('SU02', 'NL088', 'quả', 2),
('SU02', 'NL058', 'kg', 0.2),
('SU02', 'NL017', 'thìa cafe', 2),
('SU02', 'NL050', 'củ', 2),
('SU02', 'NL045', 'thìa cafe', 0.5),
('SU03', 'NL015', 'kg', 1),
('SU03', 'NL003', 'kg', 0.3),
('SU03', 'NL051', 'củ', 1),
('SU03', 'NL018', 'kg', 0.02),
('SU03', 'NL060', 'ml', 100),
('SU03', 'NL096', 'tép', 2),
('SU03', 'NL077', 'kg', 0.05),
('GO01', 'NL042', 'kg', 0.7),
('GO01', 'NL004', 'kg', 0.4),
('GO01', 'NL085', 'kg', 0.3),
('GO01', 'NL032', 'củ', 2),
('GO01', 'NL051', 'củ', 1),
('GO01', 'NL096', 'tép', 2),
('GO01', 'NL076', 'trái', 1),
('GO01', 'NL031', 'trái', 1),
('GO01', 'NL084', 'kg', 0.01),
('GO01', 'NL066', 'kg', 0.01),
('GO01', 'NL045', 'thìa cafe', 0.5),
('GO02', 'NL085', 'kg', 0.2),
('GO02', 'NL004', 'kg', 0.2),
('GO02', 'NL075', 'kg', 0.1),
('GO02', 'NL032', 'củ', 2),
('GO02', 'NL051', 'củ', 1),
('GO02', 'NL043', 'kg', 0.1),
('GO02', 'NL068', 'kg', 0.01),
('GO02', 'NL084', 'kg', 0.01),
('GO02', 'NL045', 'thìa cafe', 0.5),
('GO03', 'NL024', 'kg', 0.2),
('GO03', 'NL025', 'kg', 0.1),
('GO03', 'NL052', 'kg', 0.08),
('GO03', 'NL093', 'kg', 0.08),
('GO03', 'NL026', 'kg', 0.08),
('GO03', 'NL044', 'củ', 2),
('GO03', 'NL082', 'kg', 0.05),
('GO03', 'NL091', 'kg', 0.05),
('GO03', 'NL092', 'ml', 30),
('GO03', 'NL045', 'thìa cafe', 0.5),
('BO01', 'NL005', 'kg', 0.7),
('BO01', 'NL057', 'củ', 2),
('BO01', 'NL032', 'củ', 2),
('BO01', 'NL051', 'củ', 1),
('BO01', 'NL027', 'quả', 2),
('BO01', 'NL065', 'bó', 0.25),
('BO01', 'NL094', 'kg', 0.01),
('BO01', 'NL010', 'thìa cafe', 2),
('BO01', 'NL019', 'thìa cafe', 0.5),
('BO01', 'NL011', 'ml', 20),
('BO01', 'NL045', 'thìa cafe', 0.5),
('BO02', 'NL007', 'kg', 0.8),
('BO02', 'NL051', 'củ', 2),
('BO02', 'NL094', 'kg', 0.01),
('BO02', 'NL029', 'thìa cafe', 0.5),
('BO02', 'NL073', 'thìa cafe', 0.5),
('BO02', 'NL030', 'thìa cafe', 0.5),
('BO02', 'NL020', 'thìa cafe', 0.5),
('BO03', 'NL006', 'kg', 0.5),
('BO03', 'NL009', 'thìa cafe', 1),
('BO03', 'NL008', 'thìa cafe', 0.5),
('BO03', 'NL096', 'tép', 4),
('BO03', 'NL012', 'nhánh', 1),
('BO03', 'NL045', 'thìa cafe', 0.5),
('HS01', 'NL086', 'con', 1),
('HS01', 'NL077', 'kg', 0.2),
('HS01', 'NL096', 'tép', 5),
('HS01', 'NL068', 'kg', 0.01),
('HS01', 'NL045', 'thìa cafe', 0.25),
('HS02', 'NL034', 'con', 1),
('HS02', 'NL051', 'củ', 1),
('HS02', 'NL047', 'kg', 0.01),
('HS02', 'NL076', 'trái', 1),
('HS02', 'NL045', 'thìa cafe', 0.5),
('HS03', 'NL074', 'kg', 0.5),
('HS03', 'NL053', 'kg', 0.1),
('HS03', 'NL076', 'trái', 1),
('HS03', 'NL050', 'củ', 2),
('HS03', 'NL101', 'thìa cafe', 2),
('HS03', 'NL045', 'thìa cafe', 0.5),
('RA01', 'NL078', 'bó', 0.5),
('RA01', 'NL096', 'tép', 5),
('RA01', 'NL045', 'thìa cafe', 0.5),
('RA02', 'NL036', 'bó', 0.5),
('RA02', 'NL046', 'ml', 50),
('RA02', 'NL054', 'củ', 0.5),
('RA02', 'NL096', 'tép', 3),
('RA02', 'NL045', 'thìa cafe', 0.5),
('RA03', 'NL004', 'kg', 0.2),
('RA03', 'NL087', 'kg', 0.002),
('RA03', 'NL021', 'kg', 0.5),
('RA03', 'NL032', 'củ', 1),
('RA03', 'NL076', 'trái', 1),
('RA03', 'NL047', 'kg', 0.01),
('RA03', 'NL054', 'củ', 0.5),
('RA03', 'NL096', 'tép', 4),
('RA03', 'NL029', 'thìa cafe', 1),
('GA01', 'NL003', 'kg', 0.5),
('GA01', 'NL094', 'kg', 0.01),
('GA01', 'NL045', 'thìa cafe', 0.5),
('GA02', 'NL003', 'kg', 0.4),
('GA02', 'NL088', 'quả', 2),
('GA02', 'NL090', 'ml', 50),
('GA02', 'NL022', 'kg', 0.1),
('GA02', 'NL045', 'thìa cafe', 0.25),
('GA03', 'NL003', 'kg', 0.5),
('GA03', 'NL064', 'cái', 3),
('GA03', 'NL063', 'cái', 10),
('GA03', 'NL079', 'bó', 0.5),
('GA03', 'NL076', 'trái', 10),
('GA03', 'NL054', 'củ', 2),
('GA03', 'NL045', 'thìa cafe', 1),
('TH01', 'NL004', 'kg', 0.5),
('TH01', 'NL095', 'kg', 0.2),
('TH01', 'NL045', 'thìa cafe', 0.5),
('TH02', 'NL004', 'kg', 0.5),
('TH02', 'NL049', 'kg', 0.02),
('TH02', 'NL096', 'tép', 2),
('TH02', 'NL046', 'thìa cafe', 0.5),
('TH02', 'NL073', 'thìa cafe', 0.25),
('TH02', 'NL040', 'ml', 10),
('TH02', 'NL045', 'thìa cafe', 0.5),
('TH03', 'NL004', 'kg', 0.5),
('TH03', 'NL055', 'kg', 0.1),
('TH03', 'NL045', 'thìa cafe', 0.25),
('LA01', 'NL100', 'kg', 1),
('LA01', 'NL062', 'kg', 1),
('LA01', 'NL061', 'kg', 1),
('LA01', 'NL007', 'kg', 1),
('LA01', 'NL039', 'kg', 0.5),
('LA01', 'NL080', 'cây', 1),
('LA01', 'NL059', 'túi', 1),
('LA01', 'NL094', 'kg', 0.01),
('LA01', 'NL076', 'trái', 4),
('LA01', 'NL027', 'quả', 3),
('LA01', 'NL047', 'kg', 0.01),
('LA01', 'NL096', 'tép', 3),
('LA01', 'NL097', 'hũ', 0.5),
('LA01', 'NL081', 'kg', 0.01),
('LA01', 'NL048', 'gói', 1),
('LA02', 'NL003', 'kg', 0.5),
('LA02', 'NL056', 'bó', 1),
('LA02', 'NL047', 'kg', 0.01),
('LA02', 'NL096', 'tép', 2),
('LA02', 'NL076', 'trái', 2),
('LA02', 'NL053', 'thìa cafe', 4),
('LA02', 'NL045', 'thìa cafe', 0.5),
('LA03', 'NL028', 'kg', 0.5),
('LA03', 'NL071', 'ml', 1000),
('LA03', 'NL016', 'cây', 1),
('LA03', 'NL037', 'kg', 0.1),
('LA03', 'NL098', 'trái', 0.25),
('LA03', 'NL053', 'thìa cafe', 2),
('LA03', 'NL083', 'kg', 0.02),
('LA03', 'NL076', 'trái', 3),
('LA03', 'NL045', 'thìa cafe', 0.5);

Insert into KhuyenMai values
('SINHNHAT', N'Chúc mừng sinh nhật', '2022/1/1 0:0:0', '2022/12/31 23:59:59', 0.2),
('KMT7', N'Thứ 7 Hàng Tuần', '2022/1/1 0:0:0', '2022/12/31 23:59:59', 0.15),
('KMTET', N'Tết 2023', '2023/1/1 0:0:0', '2023/1/31 23:59:59', NULL),
('KM8T3', N'Quốc Tế Phụ Nữ', '2022/3/8 0:0:0', '2022/3/8 23:59:59', 0.1),
('KM30T4', N'Giải Phóng Miền Nam', '2022/4/30 0:0:0', '2022/5/1 23:59:59', NULL),
('KM1T5', N'Quốc Tế Lao Động', '2022/5/1 0:0:0', '2022/5/1 23:59:59', 0.15),
('KM1T6', N'Quốc Tế Thiếu Nhi', '2022/6/1 0:0:0', '2022/6/1 23:59:59', 0.1),
('KM2T9', N'Lễ Quốc Khánh ', '2022/9/2 0:0:0', '2022/9/2 23:59:59', 0.1),
('KM20T10', N'Hội Phụ Nữ Việt Nam', '2022/10/20 0:0:0', '2022/10/20 23:59:59', NULL),
('KM20T11', N'Nhà Giáo Việt Nam', '2022/11/20 0:0:0', '2022/11/21 23:59:59', NULL),
('KMNOEL', N'Lễ Giáng Sinh', '2022/12/25 0:0:0', '2022/12/25 23:59:59', 0.2),
('KMGIOTO', N'Giỗ Tổ Hùng Vương', '2022/4/10 0:0:0', '2022/4/10 23:59:59', 0.2),
('KMVULAN', N'Lễ Vu Lan', '2022/8/12 0:0:0', '2022/8/12 23:59:59', NULL),
('KMTRUNGTHU', N'Lễ Trung Thu', '2022/9/10 0:0:0', '2022/9/10 23:59:59', NULL),
('KMT4', N'Thứ 4 Hàng Tuần', '2022/1/1 0:0:0', '2022/12/31 23:59:59', 0.1),
('KMCBGA', N'Combo Gà', '2022/10/10 0:0:0', '2022/10/15 23:59:59', 0.2),
('KMBOT8', N'Giảm Món Bò Tháng 8', '2022/8/1 0:0:0', '2022/8/31 23:59:59', NULL),
('KM10PT', N'Hóa Đơn Từ 500000', '2022/1/1 0:0:0', '2022/12/31 23:59:59', 0.1),
('KM15PT', N'Hóa Đơn Từ 1000000', '2022/1/1 0:0:0', '2022/12/31 23:59:59', 0.15),
('KM10MON', N'Hóa Đơn Từ 10 Món', '2022/7/15 0:0:0', '2022/7/20 23:59:59', 0.1);

Insert into KhuyenMaiCT values
('KMTET', 'KV01', 0.1),
('KMTET', 'KV02', 0.15),
('KMTET', 'SU01', 0.15),
('KMTET', 'SU03', 0.2),
('KMTET', 'GO01', 0.2),
('KMTET', 'GO03', 0.1),
('KMTET', 'TH03', 0.15),
('KMTET', 'GA01', 0.1),
('KMTET', 'HS01', 0.1),
('KMTET', 'HS02', 0.2),
('KMTET', 'HS03', 0.15),
('KMTET', 'GA02', 0.15),
('KMTET', 'NE01', 0.1),
('KMTET', 'NE02', 0.1),
('KMTET', 'NE03', 0.1),
('KMTET', 'BI01', 0.1),
('KMTET', 'BI02', 0.1),
('KMTET', 'BI03', 0.1),
('KMTET', 'BI04', 0.1),
('KMTET', 'BI05', 0.1),
('KMTET', 'RU01', 0.1),
('KMTET', 'RU02', 0.1),
('KMTET', 'RU03', 0.1),
('KM30T4', 'KV01', 0.1),
('KM30T4', 'KV02', 0.15),
('KM30T4', 'KV03', 0.2),
('KM30T4', 'SU01', 0.1),
('KM30T4', 'SU02', 0.15),
('KM30T4', 'SU03', 0.2),
('KM30T4', 'GO01', 0.1),
('KM30T4', 'HS03', 0.2),
('KM30T4', 'RA01', 0.1),
('KM30T4', 'RA02', 0.1),
('KM30T4', 'RA03', 0.15),
('KM30T4', 'GA01', 0.2),
('KM20T10', 'GA01', 0.1),
('KM20T10', 'GA02', 0.15),
('KM20T10', 'GA03', 0.2),
('KM20T10', 'TH01', 0.15),
('KM20T10', 'TH02', 0.1),
('KM20T10', 'TH03', 0.2),
('KM20T10', 'LA01', 0.1),
('KM20T10', 'LA02', 0.15),
('KM20T10', 'LA03', 0.2),
('KM20T10', 'BI01', 0.1),
('KM20T10', 'BI02', 0.1),
('KM20T10', 'BI03', 0.2),
('KM20T10', 'BI04', 0.2),
('KM20T10', 'BI05', 0.2),
('KM20T10', 'RU01', 0.2),
('KM20T10', 'RU02', 0.2),
('KM20T10', 'RU03', 0.15),
('KM20T11', 'KV01', 0.2),
('KM20T11', 'KV02', 0.1),
('KM20T11', 'KV03', 0.1),
('KM20T11', 'SU01', 0.1),
('KM20T11', 'SU02', 0.1),
('KM20T11', 'SU03', 0.1),
('KM20T11', 'GO01', 0.1),
('KM20T11', 'GO02', 0.1),
('KM20T11', 'GO03', 0.15),
('KM20T11', 'BO01', 0.15),
('KM20T11', 'NE01', 0.2),
('KM20T11', 'NE02', 0.2),
('KMVULAN', 'RA01', 0.2),
('KMVULAN', 'RA02', 0.2),
('KMVULAN', 'SU03', 0.2),
('KMVULAN', 'ST01', 0.15),
('KMVULAN', 'ST02', 0.15),
('KMVULAN', 'ST03', 0.2),
('KMTRUNGTHU', 'KV02', 0.15),
('KMTRUNGTHU', 'KV03', 0.2),
('KMTRUNGTHU', 'SU01', 0.2),
('KMTRUNGTHU', 'SU02', 0.2),
('KMTRUNGTHU', 'SU03', 0.2),
('KMTRUNGTHU', 'BO02', 0.2),
('KMTRUNGTHU', 'BO03', 0.15),
('KMTRUNGTHU', 'HS01', 0.1),
('KMTRUNGTHU', 'HS02', 0.1),
('KMTRUNGTHU', 'HS03', 0.1),
('KMTRUNGTHU', 'RA01', 0.15),
('KMTRUNGTHU', 'RA02', 0.2),
('KMTRUNGTHU', 'RA03', 0.1),
('KMTRUNGTHU', 'NN01', 0.2),
('KMTRUNGTHU', 'NN02', 0.2),
('KMTRUNGTHU', 'NN03', 0.2),
('KMTRUNGTHU', 'NN04', 0.2),
('KMBOT8', 'BO01', 0.1),
('KMBOT8', 'BO03', 0.1);

Insert into HoaDon(NgayLapHD, HinhThucTT, NhanVienLap, NhanVienTT, MaKH, MaKhuyenMai) values
('2022/10/3 15:23:47', N'Tiền mặt','NV003', 'NV003', '0881385771', NULL),
('2022/9/27 6:30:25', N'Chuyển Khoản','NV002', 'NV002', '0385665555', NULL),
('2022/6/15 11:18:10', N'Cà Thẻ','NV002', 'NV003', '0973481249', NULL),
('2022/11/29 20:13:57', N'Tiền mặt','NV003', 'NV003', '0924712628', NULL),
('2022/12/25 18:14:28', N'Cà Thẻ','NV003', 'NV003', '0973485559', 'KMNOEL'),
('2022/10/20 8:2:14', N'Tiền mặt','NV002', 'NV002', '0881385771', 'KM20T10'),
('2022/9/2 15:14:45', N'Chuyển Khoản','NV003', 'NV003', '0973481249', 'KM2T9'),
('2022/4/19 17:3:57', N'Tiền mặt','NV002', 'NV003', '0871238787', NULL),
('2022/7/12 9:6:9', N'Tiền mặt','NV002', 'NV002', '0987189040', 'KMT4'),
('2022/4/10 10:6:42', N'Cà Thẻ','NV003', 'NV003', '0987189065', 'KMGIOTO'),
('2022/7/22 19:55:4', N'Chuyển Khoản','NV003', 'NV003', '0924712628', NULL);

Insert into HoaDonCT(MaHoaDon,MaMon,SoLuong,DonVi) values
( 1, 'GA01', 2, N'nồi'),
( 2, 'KV01', 1, N'dĩa'),
( 3, 'LA01', 1, N'nồi'),
( 4, 'BI01', 12, N'lon'),
( 1, 'KV03', 2, N'dĩa'),
( 2, 'SU01', 3, N'tô'),
( 3, 'HS03', 2, N'dĩa'),
( 4, 'LA02', 2, N'nồi'),
( 1, 'RU02', 2, N'chai'),
( 2, 'NN02', 5, N'chai'),
( 3, 'KV02', 1, N'dĩa'),
( 4, 'SU02', 2, N'tô'),
( 1, 'TH02', 1, N'dĩa'),
( 2, 'RA02', 2, N'dĩa'),
( 3, 'LA03', 1, N'nồi'),
( 4, 'RU03', 1, N'chai'),
( 1, 'GO02', 2, N'dĩa'),
( 2, 'BO01', 1, N'tô'),
( 3, 'RA01', 2, N'dĩa'),
( 4, 'LA02', 1, N'nồi'),
( 1, 'BI04', 10, N'lon'),
( 5, 'KV01', 1, N'dĩa'),
( 5, 'LA03', 2, N'nồi'),
( 5, 'BI03', 24, N'lon'),
( 5, 'HS01', 2, N'con'),
( 5, 'GO01', 2, N'dĩa'),
( 6, 'KV03', 2, N'dĩa'),
( 6, 'LA01', 2, N'nồi'),
( 6, 'GO03', 1, N'dĩa'),
( 6, 'RA03', 1, N'dĩa'),
( 6, 'BI05', 5, N'lon');

Insert into ChiTietCaTruc values 
('2022/4/12','NV001','1'),
('2022/4/13','NV002','2'),
('2022/4/14','NV003','3');

-- Tạo PROCEDURE
DELIMITER $$
DROP PROCEDURE IF EXISTS sp_ThucDon $$
CREATE PROCEDURE sp_ThucDon(IN LoaiMon Varchar(5))
BEGIN
	SELECT 
		TenMon, 
        DonVi, 
        DonGia
	FROM MonAn
	WHERE MaLoaiMon = LoaiMon;
END$$
DELIMITER ;

DELIMITER $$
DROP PROCEDURE IF EXISTS sp_SoHoaDon $$
CREATE PROCEDURE sp_SoHoaDon()
BEGIN
	SELECT 
		Max(MaHoaDon)
	FROM HoaDon;
END $$
DELIMITER ;

-- // "Tên Món", "Số Lượng", "Đơn Vị", "Đơn Giá", "Giảm Giá", "Thành Tiền"
DELIMITER $$
DROP PROCEDURE IF EXISTS sp_HoaDonCT; $$
CREATE PROCEDURE sp_HoaDonCT(IN MaHD int)
BEGIN
	If (Select MaKhuyenMai From HoaDon where MaHoaDon = MaHD) is null
	THEN
    	SELECT
			c.TenMon,
			b.SoLuong,
			b.DonVi,
			c.DonGia,
			0.0 as 'GiamGia',
			convert(b.SoLuong * c.DonGia, float) as 'ThanhTien'
		FROM HoaDon a
			JOIN HoaDonCT b ON a.MaHoaDon = b.MaHoaDon
			JOIN MonAn c ON b.MaMon = c.MaMon       
		WHERE a.MaHoaDon = MaHD;
    
    ELSEIF 
		(Select GiaTriKMHD From KhuyenMai km 
							Join HoaDon hd On km.MaKhuyenMai = hd.MaKhuyenMai 
							where hd.MaHoaDon = MaHD) is not null
    THEN
		SELECT
			c.TenMon,
			b.SoLuong,
			b.DonVi,
			c.DonGia,
			convert(c.DonGia * d.GiaTriKMHD, float) as 'GiamGia',
			convert(b.SoLuong * (c.DonGia - (c.DonGia * d.GiaTriKMHD)), float) as 'ThanhTien'
		FROM HoaDon a
			JOIN HoaDonCT b ON a.MaHoaDon = b.MaHoaDon
			JOIN MonAn c ON b.MaMon = c.MaMon
			JOIN KhuyenMai d ON a.MaKhuyenMai = d.MaKhuyenMai
		WHERE a.MaHoaDon = MaHD;
	
    ELSE 
		SELECT
			ma.TenMon,
			hdct.SoLuong,
			ma.DonVi,
			ma.DonGia,
			convert(
					IF((Select kmct.GiaTriKMCT From KhuyenMaiCT kmct 
					WHERE kmct.MaKhuyenMai = km.MaKhuyenMai And kmct.MaMon = ma.MaMon) is null, 0,
					(Select kmct.GiaTriKMCT From KhuyenMaiCT kmct 
					WHERE kmct.MaKhuyenMai = km.MaKhuyenMai And kmct.MaMon = ma.MaMon)) * ma.DonGia
            , float) as 'GiamGia',
            
            convert(
					(hdct.SoLuong * 
					IF((Select kmct.GiaTriKMCT From KhuyenMaiCT kmct 
					WHERE kmct.MaKhuyenMai = km.MaKhuyenMai And kmct.MaMon = ma.MaMon) is null, 1,
					(Select kmct.GiaTriKMCT From KhuyenMaiCT kmct 
					WHERE kmct.MaKhuyenMai = km.MaKhuyenMai And kmct.MaMon = ma.MaMon)) * ma.DonGia)
            , float) as 'ThanhTien'
		FROM HoaDon hd
			JOIN HoaDonCT hdct ON hd.MaHoaDon = hdct.MaHoaDon
			JOIN MonAn ma ON hdct.MaMon = ma.MaMon
			JOIN KhuyenMai km ON hd.MaKhuyenMai = km.MaKhuyenMai
		WHERE hd.MaHoaDon = MaHD;
	END IF;
END $$
DELIMITER ;

-- CALL sp_HoaDonCT(4);
-- CALL sp_HoaDonCT(5);
-- CALL sp_HoaDonCT(6);

-- {"Mã Hóa Đơn", "Ngày Lập", "Người Lập", "Người TT", "Tổng Tiền", "Thanh Toán"};
DELIMITER $$
DROP PROCEDURE IF EXISTS spThongkeHoaDon $$
CREATE PROCEDURE spThongkeHoaDon()
BEGIN
		SELECT
			a.MaHoaDon,
            convert(a.NgayLapHD, char) as NgayLapHD,
            (Select HoTenNV From NhanVien Where MaNV = a.NhanVienLap) as NhanVienLap,
            (Select HoTenNV From NhanVien Where MaNV = a.NhanVienTT) as NhanVienTT,
            convert(sum(b.SoLuong * c.DonGia), char) as 'TongTien',
            a.HinhThucTT
        FROM HoaDon a
		JOIN HoaDonCT b ON a.MaHoaDon = b.MaHoaDon
        JOIN MonAn c ON b.MaMon = c.MaMon
        
        group by a.MaHoaDon;
END $$
DELIMITER ;

-- Select * From NhanVien;
-- CALL spThongkeHoaDon();

-- "Mã Phiếu Nhập", "Ngày Nhập", "Người Nhập", "Tổng Chi"
DELIMITER $$
DROP PROCEDURE IF EXISTS spThongkePhieuNhap $$
CREATE PROCEDURE spThongkePhieuNhap()
BEGIN
		SELECT
			a.MaPhieuNhap,
            a.NgayNhap,
            c.HoTenNV,
            convert(sum(b.SoLuong * b.DonGia), char) as 'TongTien'
        FROM PhieuNhap a
		JOIN PhieuNhapCT b ON a.MaPhieuNhap = b.MaPhieuNhap
        JOIN NhanVien c ON a.MaNV = c.MaNV
        group by a.MaPhieuNhap;
END $$
DELIMITER ;

-- {"Mã Nguyên Liệu", "Mã Loại", "Tên Nguyên Liệu", "Đơn Vị Tính", "Số Lượng"};
DELIMITER $$
DROP PROCEDURE IF EXISTS spThongkeNguyenLieu $$
CREATE PROCEDURE spThongkeNguyenLieu()
BEGIN
		SELECT
			a.MaNgLieu,
            b.TenLoaiNgLieu,
            a.TenNgLieu,
            a.DonVi,
            a.SoLuong
        FROM NguyenLieu a
		JOIN LoaiNgLieu b ON a.MaLoaiNgLieu = b.MaLoaiNgLieu;
END $$
DELIMITER ;

-- {"NgayTruc", "MaNV", "MaCaTruc", "GioBatDau", "GioKetCa"};
DELIMITER $$
DROP PROCEDURE IF EXISTS spThongkeCaTruc $$
CREATE PROCEDURE spThongkeCaTruc()
BEGIN
		Select 
        a.NgayTruc,
        c.HoTenNV,
        a.MaCaTruc,
        b.GioBatDau,
        b.GioKetCa
        From ChiTietCaTruc a 
        Join CaTruc b On a.MaCaTruc = b.MaCaTruc
        Join NhanVien c On a.MaNV = c.MaNV;
END $$
DELIMITER ;
