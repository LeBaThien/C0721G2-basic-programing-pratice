drop database if exists product_manager;
create database product_manager;
use product_manager;

create table products (
id int not null auto_increment primary key,
product_code int,
product_name varchar(45),
product_price int,
product_amount int,
product_description varchar(45),
product_status varchar(45)
);

insert into products (product_code, product_name, product_price, product_amount, product_description, product_status)
values (1, 'iphone 13', 1300, 7, 'iphone 13 99%', 'Con hang'),
(2, 'samsung galaxy 21', 2605, 4, 'samsung galaxy 21 99%', 'Con hang'),
(3, 'note 20', 3209, 1, 'note 20 99%', 'Con hang'),
(5, 'iphone 12', 2350, 3, 'iphone 12 99%', 'Con hang'),
(4, 'sony Z', 2300, 0, 'sony Z 99%', 'Het hang'),
(6, 'blackbery M3', 4300, 2, 'blackbeyry M3 99%', 'Con hang'),
(8, 'xiaomi P20', 1300, 0, 'xiaomi P20 99%', 'Het hang');

select *from products;
-- --tạo index cho 1 cột 
alter table products add index idx_product_code (product_code);
explain select * from products where product_name = 'sony Z';
-- --tạo index cho 2 cột 
alter table products add index idx_product (product_name, product_price);
explain select * from products where product_name = 'Sony Z' or product_price = 2300;


create  view products_view as
select product_code, product_name, product_price, product_status
from products;
select * from products_view; 

create or replace view products_view as
select product_code, product_name, product_price, product_status
from products;
select * from products_view; 

drop view products_view;


-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product

DELIMITER //

CREATE PROCEDURE find_product_infor()

BEGIN

  SELECT * FROM products;

END //

DELIMITER ;

call find_product_infor();

-- Tạo store procedure thêm một sản phẩm mới

DELIMITER //

CREATE PROCEDURE insert_new_product(product_code int,product_name varchar(20),product_price int, 
product_amount int,product_description varchar(45), product_status varchar(45))
BEGIN

  insert into products (product_code,product_name, product_price, product_amount,product_description, product_status)
  values (product_code,product_name, product_price, product_amount,product_description, product_status);

END //

DELIMITER ;
call insert_new_product (2,'macbook pro', 3000,10,'macbook pro M1 full box', 'con hang');

-- Tạo store procedure sửa thông tin sản phẩm theo id

DELIMITER //
CREATE PROCEDURE set_product_infor (id_find int, new_product_description varchar(45))
BEGIN
update products
set product_description = new_product_description
where id = id_find;
END //
DELIMITER ;

call set_product_infor(8,'macbook pro M1 100%');


-- Tạo store procedure xoá sản phẩm theo id

DELIMITER //
CREATE PROCEDURE delete_product (id_find int)
BEGIN
delete from products
where id = id_find;
END //
DELIMITER ;
call delete_product(8);


