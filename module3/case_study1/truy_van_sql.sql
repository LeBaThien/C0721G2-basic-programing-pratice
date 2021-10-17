use furama_dbms;

-- Hiển thị thông tin của tất cả nhân viên có trong hệ thống 
-- có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
select id_nhan_vien, ho_va_ten, ngay_sinh, so_cmnd, so_dien_thoai, email, dia_chi
from nhan_vien
where ((ho_va_ten like 'N%') or (ho_va_ten like 'T%') 
or (ho_va_ten like 'K%')) and (char_length(ho_va_ten) <= 15);

-- Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” 
-- hoặc “Quảng Trị”.

select  id_khach_hang, ngay_sinh, ho_va_ten, so_cmnd, so_dien_thoai, email, dia_chi 
from khach_hang
where (datediff(current_date(),ngay_sinh)/365 > 18
	and datediff(current_date(),ngay_sinh)/365 < 50)
    and (dia_chi like 'Đà Nẵng' or dia_chi like 'Quảng trị');
 
--  select * from khach_hang
-- where  YEAR(current_date()) -YEAR(ngay_sinh)  >18 and YEAR(current_date()) -YEAR(ngay_sinh)<50 
-- and dia_chi like 'Da Nang' or dia_chi like 'Quang Tri' ;
-- cách khác lấy theo năm

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần.
--  Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select hop_dong.id_hop_dong, khach_hang.id_khach_hang, khach_hang.ho_va_ten, 
loai_khach_hang.ten_loai_khach,
count(id_hop_dong) 'Số lượng đặt phòng'
	from khach_hang join hop_dong
	on khach_hang.id_khach_hang = hop_dong.id_khach_hang
    join loai_khach_hang
    on khach_hang.id_khach_hang = loai_khach_hang.id_loai_khach
    where loai_khach_hang.ten_loai_khach = 'Diamond'
group by(khach_hang.id_khach_hang)
order by (hop_dong.id_hop_dong); 

-- 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien
--  (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem)
--  cho tất cả các Khách hàng đã từng đặt phỏng.
--  (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

select khach_hang.id_khach_hang, khach_hang.ho_va_ten, loai_khach_hang.ten_loai_khach,
hop_dong.id_hop_dong, dich_vu.ten_dich_vu, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc_hop_dong,
(dich_vu.chi_phi_thue + sum(hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia_dich_vu)) as tong_tien

	from khach_hang left join loai_khach_hang on khach_hang.id_loai_khach = loai_khach_hang.id_loai_khach
	left join hop_dong on hop_dong.id_khach_hang = khach_hang.id_khach_hang
	left join dich_vu on hop_dong.id_dich_vu = dich_vu.id_dich_vu
	left join loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
	left join hop_dong_chi_tiet on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
	left join dich_vu_di_kem on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
group by (khach_hang.id_khach_hang);


-- 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ
--  chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).



select hop_dong.id_dich_vu, hop_dong.id_hop_dong, loai_dich_vu.id_loai_dich_vu, loai_dich_vu.ten_loai_dich_vu,
 dich_vu.ten_dich_vu, dich_vu.dien_tich, dich_vu.chi_phi_thue
from dich_vu left join hop_dong
on dich_vu.id_dich_vu = hop_dong.id_dich_vu
right join loai_dich_vu
on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
where hop_dong.id_hop_dong is null 
and ( year( hop_dong.ngay_lam_hop_dong) = '2019' and (
 month ( hop_dong.ngay_lam_hop_dong) = '1' or
 month ( hop_dong.ngay_lam_hop_dong) = '2' or
 month ( hop_dong.ngay_lam_hop_dong) = '3'))
 ;

-- 7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của tất cả các loại dịch vụ
--  đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.

select dich_vu.id_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, dich_vu.so_nguoi_toi_da, dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu, hop_dong.ngay_lam_hop_dong
from dich_vu join loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
left join hop_dong on dich_vu.id_dich_vu = hop_dong.id_dich_vu
where year( hop_dong.ngay_lam_hop_dong) = 2018;
-- where year( hop_dong.ngay_lam_hop_dong) = 2010;

-- 8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên
select distinct ho_va_ten 
from khach_hang;

select ho_va_ten
from khach_hang
group by(ho_va_ten);

-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.

select (dich_vu.chi_phi_thue + sum(hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia_dich_vu)) as tong_tien, month(hop_dong.ngay_lam_hop_dong) 'month', year(hop_dong.ngay_lam_hop_dong) 'year'
from dich_vu left join hop_dong on dich_vu.id_dich_vu = hop_dong.id_dich_vu
left join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
left join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
where year(hop_dong.ngay_lam_hop_dong) = 2019
-- where year(hop_dong.ngay_lam_hop_dong) = 2021
group by  month(hop_dong.ngay_lam_hop_dong);
-- having year(hop_dong.ngay_lam_hop_dong) = 2021 and month(hop_dong.ngay_lam_hop_dong);


-- 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).

select hop_dong.id_hop_dong, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc_hop_dong, hop_dong.tien_dat_coc,
   count(hop_dong_chi_tiet.id_hop_dong_chi_tiet) 'So_luong_dich_vu_di_kem'
   from hop_dong join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
   group by(hop_dong.id_hop_dong);
   
-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.

select khach_hang.id_khach_hang , khach_hang.ho_va_ten, dich_vu_di_kem.ten_dich_vu_di_kem
from khach_hang join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang
join loai_khach_hang on khach_hang.id_loai_khach = loai_khach_hang.id_loai_khach
join hop_dong_chi_tiet on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
join dich_vu_di_kem on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
-- where loai_khach_hang.id_loai_khach = 'Diamond' and (khach_hang.dia_chi = 'Vinh' or khach_hang.dia_chi = 'Quảng Ngãi)'
where loai_khach_hang.ten_loai_khach = 'Diamond'  and (khach_hang.dia_chi = 'Đà Nẵng' or khach_hang.dia_chi = 'Quảng Nam');

-- 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ 
-- đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.

select hop_dong.id_hop_dong, nhan_vien.ho_va_ten as 'ten nhan vien', khach_hang.ho_va_ten as 'ten khach hang', khach_hang.so_dien_thoai, loai_dich_vu.ten_loai_dich_vu,
sum(hop_dong_chi_tiet.id_dich_vu_di_kem * hop_dong_chi_tiet.so_luong) 'So kuong dich vu di kem', sum(hop_dong.tien_dat_coc) 'tien dat coc'
 from hop_dong join nhan_vien on hop_dong.id_nhan_vien = nhan_vien.id_nhan_vien
 join khach_hang on khach_hang.id_khach_hang = hop_dong.id_khach_hang
 join dich_vu on hop_dong.id_dich_vu = dich_vu.id_dich_vu
 join loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
 join hop_dong_chi_tiet on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
 where quarter(hop_dong.ngay_lam_hop_dong) = 4 and not (quarter(hop_dong.ngay_lam_hop_dong) = 1 or quarter(hop_dong.ngay_lam_hop_dong) = 2)
 and year (hop_dong.ngay_lam_hop_dong) = 2019
--  where quarter(hop_dong.ngay_lam_hop_dong) = 2 and not (quarter(hop_dong.ngay_lam_hop_dong) = 1 or quarter(hop_dong.ngay_lam_hop_dong) = 3)
--  and year (hop_dong.ngay_lam_hop_dong) = 2010
 group by (id_hop_dong);
 -- --Tiền đặt cọc chưa truyền vào

-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

