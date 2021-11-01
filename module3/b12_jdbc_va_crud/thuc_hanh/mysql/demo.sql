CREATE DATABASE demo;
USE demo;

create table users (
 id  int(3) NOT NULL AUTO_INCREMENT,
 name varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);

insert into users(name, email, country) 
values('Minh','minh@codegym.vn','Viet Nam');
insert into users(name, email, country) 
values('Kante','kante@che.uk','Kenia');

select * from users; 

use demo;
DELIMITER $$
CREATE PROCEDURE get_user_by_id(IN user_id INT)
BEGIN
    SELECT users.id,users.name, users.email, users.country
    FROM users
    where users.id = user_id;
    END$$
DELIMITER ;

 

DELIMITER $$
CREATE PROCEDURE insert_user(
IN user_name varchar(50),
IN user_email varchar(50),
IN user_country varchar(50)
)
BEGIN
    INSERT INTO users(name, email, country) VALUES(user_name, user_email, user_country);
    END$$
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE show_user()
BEGIN
    SELECT id,users.name, users.email, users.country
    FROM users;
    END$$
DELIMITER ;

call show_user(); 

DELIMITER $$
CREATE PROCEDURE delete_user(IN user_id INT)
BEGIN
    DELETE FROM users
    where users.id = user_id;
    END$$
DELIMITER ;
call delete_user(1);
drop procedure delete_user;
-- Sua thong tin 
update users set `name` = ?,email= ?, country =? where id = ?;

DELIMITER $$
CREATE PROCEDURE update_user(IN user_id INT, new_name varchar(45), new_email varchar(45),
new_country varchar(45))
BEGIN
    Update users
    set users.`name` = new_name, users.email = new_name, users.country = new_country
    where users.id = user_id;
    END$$
DELIMITER ;

call update_user(1);
drop procedure update_user;

create table Permission(
id int(11) primary key,
name varchar(50)
);

create table User_Permission(
permission_id int(11),
user_id int(11)
);

insert into Permission(id, name) values(1, 'add');
insert into Permission(id, name) values(2, 'edit');
insert into Permission(id, name) values(3, 'delete');
insert into Permission(id, name) values(4, 'view');

select*from Permission;
select*from User_Permission;

select id,`name`,email,country from users where `name` =?;
select * from users order by `name`;