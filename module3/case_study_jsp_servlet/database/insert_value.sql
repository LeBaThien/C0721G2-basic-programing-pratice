use furama_database_management;

insert into customer_type (customer_type_name)
values("Diamond"),("Platinium"),("Gold"),("Silver"),("Member");

insert into customer (customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address)
values (1,'Trần Hoa Phước Thịnh','1990-09-21',1,14235,090561821,'thinh@gmail.com','Hải Phòng'),
 (1,'Nguyễn Công Tâm','1991-01-26',1,34975,093461821,'tam@gmail.com','Đà Nẵng'),
 (2,'Lê Quang Huy','1980-07-24',0,52475,091461821,'huy@gmail.com','Hồ Chí Minh'),
 (3,'Huỳnh Thị Mỹ Nhung','1997-04-15',1,124475,0241461821,'nhung@gmail.com','Hà Nội');
 
insert into position (position_name)
values ('Lễ tân'),
('Phục vụ'),
('Chuyên viên'),
('Giám sát'),
('Quản lý'),
('Giám đốc');

insert into education_degree(education_degree_name)
values ( 'Trung cấp'),
('Cao đẳng'),
('Đại học'),
('Sau đại học');

insert into division (division_name)
values ('Sale - Marketing'),
('Hành Chính'),
('Phục vụ'),
('Quản lý');

-- insert into `user`();


insert into employee(employee_name, employee_birthday, employee_id_card, employee_salary,
employee_phone, employee_email, employee_address, position_id, education_degree_id, division_id, user_name)
values ('Nguyễn Hoài Nam', '1995-05-28',"124", 4000, 090713942,'nam@gmail.com','Đà Nẵng',2,1,4, null),
 ('Phạm Ngọc Thạch', '1997-07-12',"414", 3500, 09013412942,'thach@gmail.com','Quảng Trị',3,2,3,null),
 ('Nguyễn Thị Lan Anh', '1980-03-25',"317", 5500, 0902318212,'anh@gmail.com','Cà Mau',4,2,2,null),
 ('Lê Thị Bích', '1989-03-20',"152",3200, 090131526,'bich@gmail.com','Vũng tàu',5,4,4,null),
 ('Nguyễn Ngọc Hiếu', '1985-07-30',"124", 4700, 012318212,'hieu@gmail.com','Khánh Hóa',1,3,2,null);

insert into service_type (service_type_name)
values("Villa"),
("House"),
("Room");

insert into rent_type(rent_type_name, rent_type_cost)
values("Năm",36000000),
("Tháng", 5000000),
("Ngày",150000),
("Giờ", 100000);

insert into service (service_name, service_area, service_cost, service_max_people, 
standard_room, description_other_convenience, pool_area, number_of_floors, rent_type_id, 
service_type_id)
values("rental", 200, 5000000, 2, "A", "View bien", 50, 5, 2,1),
("rental", 250, 3000000, 3, "B", "View nui", 100, 7, 1,2),
("rental", 100, 2000000, 2, "A", "View song", 220, 10, 3,2),
("rental", 150, 2000000, 1, "C", "View nui", 100, 12, 1,1),
("rental", 200, 1000000, 2, "B", "View bien", 50, 4, 2,3),
("rental", 250, 4000000, 3, "C", "View cau", 220, 3, 3,3);

insert into attach_service (attach_service_name, attach_service_cost, attach_service_unit,
attach_service_status)
values("massage", 500000, 1, 1),
('Karaoke',1000000,1,1),
('Thức ăn',500000,2,1),
('Nước uống',230000,2,1),
('Thuê xe',350000,2,0);

insert into contract ( contract_start_date, contract_end_date, contract_deposit,
contract_total_money, employee_id, customer_id, service_id)
values ("2020-03-02","2020-03-07",1200000, 5000000,1,2,1),
("2020-05-12","2020-05-20",1200000, 4000000,3,1,2),
("2020-03-02","2020-03-07",1200000, 5000000,4,3,3),
("2020-03-02","2020-03-07",1200000, 5000000,1,2,2),
("2020-03-02","2020-03-07",1200000, 5000000,3,1,3),
("2020-03-02","2020-03-07",1200000, 5000000,4,2,3),
("2020-03-02","2020-03-07",1200000, 5000000,5,1,1),
("2020-03-02","2020-03-07",1200000, 5000000,4,3,3);

insert into contract_detail (contract_id, attach_service_id, quantity)
values(1,1,1),
(2,2,1),
(4,1,2),
(3,3,1),
(5,5,3),
(6,4,2),
(7,2,3);