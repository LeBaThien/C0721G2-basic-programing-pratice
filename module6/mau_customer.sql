SELECT * FROM real_estate_news.customers;
use real_estate_news;
update customers set deleted = true where id='KH-0008';
select customers.id as id, customers.address as address, customers.date_of_birth as dateOfBirth,
 customers.deleted as deleted,  customers.email as email,  customers.gender as gender,
 customers.`name` as `name`, customers.phone_number as phoneNumber,  customers.app_user_id, 
 images.url
from customers join images on customers.image_id = images.id
join app_users on customers.app_user_id = app_users.id
where customers.deleted = false;

-- cau ni moi dúng

select customers.id, customers.address, customers.date_of_birth,customers.deleted,  
customers.email,  customers.gender, customers.`name`, customers.phone_number, 
 customers.app_user_id, images.url, customers.image_id from customers 
 join images on customers.image_id = images.id 
 join app_users on customers.app_user_id = app_users.id 
 where customers.deleted = 0 and customers.phone_number = 0907123456;
 
 
 select customers.id, customers.address, customers.date_of_birth, customers.deleted, 
 customers.email,  customers.gender, 
 customers.`name`, customers.phone_number,  customers.app_user_id,
 images.url, customers.image_id 
 from customers join images on customers.image_id = images.id
 join app_users on customers.app_user_id = app_users.id 
 where customers.deleted = 0 
 and customers.`name` like concat('%','vo','%') 
 and customers.phone_number like concat('%',0907123123,'%')
 and customers.email like concat('%','ngocnhat','%') ;
 select * from customers where customers.deleted = 0 and (customers.`name` like concat('%','','%') )
 and (customers.phone_number like concat('%','','%')) and (customers.email like concat('%','','%'));

insert into customers ( customers.id,customers.address, customers.date_of_birth, customers.deleted, 
customers.email, customers.gender, customers.`name`, customers.phone_number, customers.app_user_id, customers.image_id)
values("KH-0012","Đà Nẵng", "1997-02-12", 0, "quoctung@gmail.com", "0", "Lê Quốc Tùng", "0905123321", '484700e8-56da-4e4f-b904-82cc23c4bd93', 1),
("KH-0013","Quảng Nam", "2000-02-04", 0, "dat@gmail.com", "0", "Nguyễn Văn Đạt", "0907123456", '484700e8-56da-4e4f-b904-82cc23c4bd93', 1),
("KH-0014","Hồ Chí Minh", "1990-04-11", 0, "thanhtruc@gmail.com", "1", "Hoàng Thanh Trúc", "0902345263", '484700e8-56da-4e4f-b904-82cc23c4bd93', 1),
("KH-0015","Hà Nội", "1994-09-16", 0, "ngocnhat@gmail.com", "0", "Võ Ngọc Nhật", "0907123123", '484700e8-56da-4e4f-b904-82cc23c4bd93', 1),
("KH-0016","Cần Thơ", "1996-12-12", 0, "phuocduc@gmail.com", "0", "Phan Phước Đức", "0902312221", '484700e8-56da-4e4f-b904-82cc23c4bd93', 1),
("KH-0017","Huế", "1889-05-10", 0, "hoangthien@gmail.com", "0", "Mai Hoàng Thiện", "0909123897", '484700e8-56da-4e4f-b904-82cc23c4bd93', 1),
("KH-0018","Quảng Trị", "2002-02-28", 0, "thaovi@gmail.com", "1", "Nguyễn Thị Thảo Vi", "0907129873", '484700e8-56da-4e4f-b904-82cc23c4bd93', 1),
("KH-0019","Quảng Bình", "1987-07-24", 0, "tuanhuynh@gmail.com", "0", "Huỳnh Tuấn", "0934123987", '484700e8-56da-4e4f-b904-82cc23c4bd93', 1),
("KH-0020","Bình Định", "1995-03-12", 0, "bichtram@gmail.com", "1", "Ngô Thị Bích Trâm", "0923876982", '484700e8-56da-4e4f-b904-82cc23c4bd93', 1),
("KH-0021","Phú Yên", "1993-09-09", 0, "nhatminh@gmail.com", "0", "Phan Nhật Minh", "0905888999", '484700e8-56da-4e4f-b904-82cc23c4bd93', 1);