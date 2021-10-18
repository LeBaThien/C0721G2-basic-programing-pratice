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




DELIMITER //

CREATE PROCEDURE findAllCustomers()

BEGIN

  SELECT * FROM customers;

END //

DELIMITER ;
