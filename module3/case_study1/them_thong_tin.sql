use furama_dbms;

-- delete from bo_phan
-- where bo_phan.id_bo_phan <6;

insert into bo_phan(ten_bo_phan)
values ('Sale - Marketing'),
('Hanh chinh'),
('phuc vu'),
('quan ly');

-- delete from trinh_do
-- where trinh_do.id_trinh_do <5;
insert into trinh_do (trinh_do)
values ( 'trung cap'),
('cao dang'),
('dai hoc'),
('sau dai hoc');



insert into vi_tri ( ten_vi_tri)
values ('le tan'),
('phuc vu'),
('chuyen vien'),
('giam sat'),
('quan ly'),
('giam doc');

insert into loai_khach_hang (ten_loai_khach)
values ('Diamond'),
('Platinium'),
('Gold'),
('Silver'),
('Member');

-- delete from kieu_thue
-- where kieu_thue.id_kieu_thue <5;

insert into kieu_thue (ten_kieu_thue, gia_thue)
values ('nam',100000000),
('thang',65000000),
('ngay',300000),
('gio',200000);

insert into loai_dich_vu (ten_loai_dich_vu)
values('Villa'),
('House'),
('Room');

insert into dich_vu_di_kem ( ten_dich_vu_di_kem,gia_dich_vu, don_vi, trang_thai_kha_dung)
values('massege',2000000,1,1),
('karaoke',1000000,1,1),
('thuc an',500000,2,1),
('nuoc uong',230000,2,1),
('thue xe',350000,2,0);

insert into dich_vu (id_kieu_thue ,id_loai_dich_vu, ten_dich_vu, dien_tich, so_tang,
 so_nguoi_toi_da, chi_phi_thue, trang_thai)
 values (1,2,'rental', 200, 2, 4, 2000000,'co'),
 (2,3,'rental', 400, 3, 5, 6000000,'khong'),
 (1,2,'rental', 400, 3, 5, 6000000,'khong'),
 (2,3,'rental', 400, 3, 5, 6000000,'khong');
 
 insert into khach_hang(id_loai_khach, ho_va_ten, ngay_sinh, so_cmnd, so_dien_thoai,email, dia_chi)
 values (1,'Nguyễn thị Phương','1995-03-20',12375,091361821,'phuong@gmail.com','Quảng Nam'),
 (4,'Trần Hoa Phước Thịnh','1990-09-21',14235,090561821,'thinh@gmail.com','Hải Phòng'),
 (5,'Nguyễn Công Tâm','1991-01-26',14975,093461821,'tam@gmail.com','Đà Nẵng'),
 (2,'Lê Quang Huy','1980-07-24',52475,091461821,'huy@gmail.com','Hồ Chí Minh');
 
 
  insert into nhan_vien( id_vi_tri, id_trinh_do, id_bo_phan, ho_va_ten, ngay_sinh,
 so_cmnd, so_dien_thoai, email, dia_chi)
 values (1,2,2,'Nguyễn Hoài Nam', '1995-05-28',12412,090713942,'nam@gmail.com','Đà Nẵng'),
 (2,3,4,'Phạm Ngọc Thạch', '1997-07-12',41412,09013412942,'thach@gmail.com','Quảng Trị'),
 (3,2,1,'Nguyễn Thị Lan Anh', '1980-03-25',41212,0902318212,'anh@gmail.com','Cà Mau');

SET FOREIGN_KEY_CHECKS=0;
-- SET GLOBAL FOREIGN_KEY_CHECKS=0;
insert into hop_dong_chi_tiet (id_hop_dong, id_dich_vu_di_kem, so_luong)
values (1,1,2),
(2,1,2),
(3,2,1);

 SET FOREIGN_KEY_CHECKS=0;
insert into hop_dong (id_nhan_vien, id_khach_hang, id_dich_vu,
ngay_lam_hop_dong, ngay_ket_thuc_hop_dong, tien_dat_coc, tong_tien_thanh_toan)
 values(1,1,1,'2010-04-13','2010-05-14',1500000,2000000),
 (1,2,1,'2020-05-20','2020-06-25',1500000,12000000),
 (2,3,3,'2021-04-10','2021-05-14',3000000,60000000);
 

 
