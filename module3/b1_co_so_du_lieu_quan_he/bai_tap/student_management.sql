DROP DATABASE IF EXISTS student_management;
CREATE DATABASE student_management;
USE student_management;
CREATE TABLE student(
`id` INT NOT NULL,
`name` VARCHAR(45) NULL,
`age` INT NULL,
`country` VARCHAR(45) NULL,
PRIMARY KEY (`id`)); 

CREATE TABLE teacher(
`id` INT NOT NULL,
`name` VARCHAR(45) NULL,
`age` INT NULL,
`country` VARCHAR(45) NULL,
primary key(`id`)); 
