drop database if exists quan_ly_ban_hang;
create database quan_ly_ban_hang;
use quan_ly_ban_hang;

create table customer(
customer_id int not null auto_increment primary key,
customer_name varchar (30),
-- customer_age int default 0 check ( customer_age between 0 and 100)
customer_age int
);

create table product_order(
order_id int not null auto_increment primary key,
customer_id int,
order_date date,
order_total_price int,
foreign key (customer_id) references customer (customer_id)
);

create table product(
product_id int not null auto_increment primary key,
product_name varchar(50),
product_price int
);

create table order_details(
order_id int,
product_id int,
order_quantity int,
primary key(order_id, product_id),
foreign key (order_id) references product_order (order_id),
foreign key (product_id) references product (product_id)
);