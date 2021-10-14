use furama_dbms;

-- delete from bo_phan
-- where bo_phan.id_bo_phan <6;

insert into bo_phan(id_bo_phan,ten_bo_phan)
values (1,'Sale - Marketing'),
(2,'Hanh chinh'),
(3,'phuc vu'),
(4,'quan ly');

-- delete from trinh_do
-- where trinh_do.id_trinh_do <5;
insert into trinh_do (id_trinh_do,trinh_do)
values (1, 'trung cap'),
(2,'cao dang'),
(3,'dai hoc'),
(4,'sau dai hoc');



insert into vi_tri (id_vi_tri, ten_vi_tri)
values (1,'le tan'),
(2,'phuc vu'),
(3,'chuyen vien'),
(4,'giam sat'),
(5,'quan ly'),
(6,'giam doc');

insert into loai_khach_hang (id_loai_khach, ten_loai_khach)
values (1,'Diamond'),
(2,'Platinium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');

-- delete from kieu_thue
-- where kieu_thue.id_kieu_thue <5;

insert into kieu_thue (id_kieu_thue, ten_kieu_thue, gia_thue)
values (1,'nam',100000000),
(2,'thang',65000000),
(3,'ngay',300000),
(4,'gio',200000);

insert into loai_dich_vu (id_loai_dich_vu,ten_loai_dich_vu)
values(1,'Villa'),
(2,'House'),
(3,'Room');

insert into dich_vu_di_kem (id_dich_vu_di_kem, ten_dich_vu_di_kem,gia_dich_vu, don_vi, trang_thai_kha_dung)
values(1,'massege',2000000,1,1),
(2,'karaoke',1000000,1,1),
(3,'thuc an',500000,2,1),
(4,'nuoc uong',230000,2,1),
(5,'thue xe',350000,2,0);

SET FOREIGN_KEY_CHECKS=0;
-- SET GLOBAL FOREIGN_KEY_CHECKS=0;
insert into hop_dong_chi_tiet (id_hop_dong_chi_tiet, id_hop_dong, id_dich_vu_di_kem,so_luong)
values (1,1,1,1);

 SET FOREIGN_KEY_CHECKS=0;
insert into hop_dong (id_hop_dong, id_nhan_vien, id_khach_hang, id_dich_vu,
 ngay_lam_hop_dong, ngay_ket_thuc_hop_dong, tien_dat_coc, tong_tien)
 values(1,1,1,1,'2010-04-13','2010-05-14',1500000,2000000);
 
  insert into dich_vu(id_dich_vu, id_kieu_thue, id_loai_dich_vu, ten_dich_vu, dien_tich, so_tang,
 so_nguoi_toi_da, chi_phi_thue, trang_thai)
 values (1,2,2,'rental', 200, 2, 4, 2000000,'co'),
 (2,1,3,'rental', 400, 3, 5, 6000000,'khong');
 
 insert into khach_hang(id_khach_hang, id_loai_khach, ho_va_ten, ngay_sinh, so_cmnd, so_dt,email,dia_chi)
 values (1,1,'Nguyen Thi Phuong','1995-03-20',12375,091361821,'phuong@gmail.com','Quang Nam');
 
 
  insert into nhan_vien(id_nhan_vien, id_vi_tri, id_trinh_do, id_bo_phan, ho_va_ten, ngay_sinh,
 so_cmnd, so_dien_thoai, email,dia_chi)
 values (1,1,2,3,'Nguyen Hoai Nam', '1990-03-28',12412,0902382942,'nam@gmail.com','Da Nang');
