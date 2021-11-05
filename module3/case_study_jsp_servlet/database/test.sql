use furama_database_management;



SELECT *FROM customer join customer_type on customer_type.customer_type_id = customer.customer_type_id;

insert into customer (customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone,
customer_address, customer_type_id)
values(customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone,
customer_address);

insert into customer_type(customer_type)
values(customer_type);

SELECT * FROM customer join customer_type on customer_type.customer_type_id = customer.customer_type_id
where customer_id = 1;