use quan_ly_sinh_vien;

select s.student_id, s.student_name, c.class_name
from student s join class c on s.student_id = c.class_id
where c.class_name = "A3";

select * from student
where student_name = "Tien" or student_name = "Toan";

-- select class_name, count(student_id) as 'số lượng học viên theo lop'
-- from class
-- group by class_name;

select count(student_id)
from student
group by class_name;
-- select * from student
-- order by student_name; 