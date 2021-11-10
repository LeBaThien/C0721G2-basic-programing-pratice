use furama_database_management;



SELECT *FROM customer join customer_type on customer_type.customer_type_id = customer.customer_type_id
order by  customer_id asc , customer_type_name desc  ;

insert into customer (customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone,
customer_address, customer_type_id)
values(customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone,
customer_address);

insert into customer_type(customer_type)
values(customer_type);

SELECT * FROM customer join customer_type on customer_type.customer_type_id = customer.customer_type_id
where customer_id = 1;

delete from customer 
where customer_id = 2; 

Update customer set customer_type_id = ?, customer_name = ?,
customer_birthday = ?, customer_gender = ?, customer_id_card = ?, 
customer_phone = ?, customer_address = ?
where customer_id = ?;

SELECT * FROM customer join customer_type on customer_type.customer_type_id = customer.customer_type_id
where customer_phone = 90561821;

ALTER TABLE tbl_name ADD UNIQUE index_name (column 1, column 2,..)