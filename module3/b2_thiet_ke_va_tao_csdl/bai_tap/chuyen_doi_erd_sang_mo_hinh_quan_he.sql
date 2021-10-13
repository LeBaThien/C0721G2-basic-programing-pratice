drop database if exists quan_ly_dh;
create database quan_ly_dh;
use quan_ly_dh;

create table phieu_nhap(
ma_so_phieu_nhap int not null auto_increment primary key,
ngay_nhap date
);

create table phieu_xuat(
ma_so_phieu_xuat int not null auto_increment primary key,
ngay_xuat date
);

create table don_dat_hang(
ma_so_don_hang int not null auto_increment primary key,
ngay_dat_hang date
);

create table vat_tu(
ma_so_vat_tu int not null auto_increment primary key,
ten_vat_tu varchar(50)
);

create table nha_cung_cap(
ma_nha_cung_cap int not null auto_increment primary key,
ma_so_don_hang int,
ten_nha_cung_cap varchar(30),
dia_chi varchar(40),
foreign key (ma_so_don_hang) references don_dat_hang (ma_so_don_hang) 
);

create table dien_thoai(
so_dien_thoai varchar(20),
ma_nha_cung_cap int,
primary key (ma_nha_cung_cap)
);

create table chi_tiet_phieu_nhap(
don_gia_nhap int,
so_luong_nhap int,
ma_so_phieu_nhap int,
ma_so_vat_tu int,
primary key(ma_so_phieu_nhap, ma_so_vat_tu),
foreign key (ma_so_vat_tu) references vat_tu (ma_so_vat_tu),
foreign key (ma_so_phieu_nhap) references phieu_nhap (ma_so_phieu_nhap)
);

create table chi_tiet_phieu_xuat(
don_gia_xuat int,
so_luong_xuat int,
ma_so_phieu_xuat int,
ma_so_vat_tu int,
primary key(ma_so_phieu_xuat,ma_so_vat_tu),
foreign key (ma_so_phieu_xuat) references phieu_xuat (ma_so_phieu_xuat),
foreign key (ma_so_vat_tu) references vat_tu (ma_so_vat_tu)
);

create table chi_tiet_don_dat_hang (
ma_so_vat_tu int,
ma_so_don_hang int,
primary key (ma_so_vat_tu,ma_so_don_hang),
foreign key (ma_so_vat_tu) references vat_tu (ma_so_vat_tu),
foreign key (ma_so_don_hang) references don_dat_hang (ma_so_don_hang)
);



