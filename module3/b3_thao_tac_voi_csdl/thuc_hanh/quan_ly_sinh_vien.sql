drop database if exists quan_ly_sinh_vien;
create database quan_ly_sinh_vien;
use quan_ly_sinh_vien;

create table class (
class_id int not null auto_increment primary key,
class_name varchar(60) not null,
start_date datetime,
`status` bit
);

create table student (
student_id int not null auto_increment primary key,
student_name varchar(30) not null,
address varchar(50),
phone varchar(20),
`status` bit,
class_id int not null,
foreign key (class_id) references class (class_id)
);

create table `subject` (
sub_id int not null auto_increment primary key,
sub_name varchar(30) not null,
credict tinyint not null default 1 check (credict >= 1),
`status` bit default 1
);

create table mark (
mark_id int not null auto_increment primary key,
-- sub_id int not null unique,
sub_id int not null,
student_id int not null,
-- mark float default 0 check (mark > 0 & mark < 100),
mark float default 0 check ( mark between 0  and 100),
exams tinyint default 1,
unique(sub_id, student_id),
foreign key (sub_id) references `subject` (sub_id),
foreign key (student_id) references student (student_id)
);
insert into class 
values (1,"A1","2008-12-20",1);
insert into class
values (2,"A2","2008-12-20",1);
insert into class
values (3,"A3",current_date,0);

insert into student (student_name, address, phone, `status`, class_id)
values ('Hung', 'Ha Noi', '0912113113', 1, 1);
insert into student (student_name, address, phone, `status`, class_id)
value ("Tu", "Sai gon","01281024012",1,1);
insert into student (student_name, address, phone, `status`, class_id)
values ("Manh", "Da nang", "0936272412", 0,2);

insert into subject 
values (1,"CF",5,1),
(2,"C",6,1),
(3,'HDJ', 5,1),
(4,'RDBMS',10,1);

insert into mark (sub_id, student_id, mark, exams)
values (1,1,8,1),
(1,2,10,2),
(2,1,12,1);