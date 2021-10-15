drop database if exists furama_dbms;
create database furama_dbms;
use furama_dbms;


create table vi_tri(
id_vi_tri int not null auto_increment primary key,
ten_vi_tri varchar (45)
);
create table trinh_do(
id_trinh_do int not null auto_increment primary key,
trinh_do varchar(45)
);
create table bo_phan(
id_bo_phan int not null auto_increment primary key,
ten_bo_phan varchar(45)
);
create table loai_khach_hang(
id_loai_khach int not null auto_increment primary key,
ten_loai_khach varchar(45)
);
create table dich_vu_di_kem(
id_dich_vu_di_kem int not null auto_increment primary key,
ten_dich_vu_di_kem varchar(45),
gia_dich_vu int,
don_vi int,
trang_thai_kha_dung varchar(45)	
);
create table kieu_thue(
id_kieu_thue int not null auto_increment primary key,
ten_kieu_thue varchar(45),
gia_thue int
);
create table loai_dich_vu(
id_loai_dich_vu int not null auto_increment primary key,
ten_loai_dich_vu varchar(45)
);

create table nhan_vien(
id_nhan_vien int not null auto_increment primary key,
id_vi_tri int,
id_trinh_do int,
id_bo_phan int,
ho_va_ten varchar(45),
ngay_sinh date,
so_cmnd varchar (45),
so_dien_thoai varchar (45),
email varchar (45),
trinh_do varchar(45),
vi_tri varchar (45),
luong int,
dia_chi varchar(45), 
foreign key (id_vi_tri) references vi_tri (id_vi_tri),
foreign key (id_trinh_do) references trinh_do (id_trinh_do),
foreign key (id_bo_phan) references bo_phan (id_bo_phan)
);

create table dich_vu(
id_dich_vu int not null auto_increment primary key,
id_kieu_thue int,
id_loai_dich_vu int,
ten_dich_vu varchar(45),
dien_tich int,
so_tang int,
so_nguoi_toi_da int,
chi_phi_thue int,
trang_thai varchar(45),
foreign key (id_kieu_thue) references kieu_thue (id_kieu_thue),
foreign key (id_loai_dich_vu) references loai_dich_vu (id_loai_dich_vu)

);

create table khach_hang(
id_khach_hang int not null auto_increment primary key,
id_loai_khach int,
ho_va_ten varchar(45),
ngay_sinh date,
so_cmnd varchar(45),
so_dien_thoai varchar(45),
email varchar(45),
loai_khach varchar(45),
dia_chi varchar(45),	
foreign key (id_loai_khach) references loai_khach_hang (id_loai_khach)
);

create table hop_dong(
id_hop_dong int not null auto_increment primary key,
id_nhan_vien int,
id_khach_hang int,
id_dich_vu int,
ngay_lam_hop_dong date,
ngay_ket_thuc_hop_dong date,
tien_dat_coc int,
tong_tien_thanh_toan int,
foreign key (id_nhan_vien) references nhan_vien (id_nhan_vien),
foreign key (id_dich_vu) references dich_vu (id_dich_vu),
foreign key (id_khach_hang) references khach_hang (id_khach_hang)
);

create table hop_dong_chi_tiet(
id_hop_dong_chi_tiet int not null auto_increment primary key,
-- hop_dong_chi_tiet có khóa chính rồi, thì ko cần thêm
id_hop_dong int,
id_dich_vu_di_kem int,
so_luong int,
foreign key (id_hop_dong) references hop_dong (id_hop_dong),
foreign key (id_dich_vu_di_kem) references dich_vu_di_kem (id_dich_vu_di_kem)

)


