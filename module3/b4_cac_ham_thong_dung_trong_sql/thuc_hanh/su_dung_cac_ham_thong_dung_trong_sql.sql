use quan_ly_sinh_vien;
select address, count(student_id) as 'số lượng học viên'
from student
group by address;

select s.student_id, s.student_name, AVG(Mark)
from student s join Mark m on S.student_id = m.student_id
group by s.student_id, s.student_name;

select s.student_id, s.student_name, AVG(mark)
from student s join Mark m on s.student_id = m.student_id
group by s.student_id, s.student_name
having AVG(mark) > 15;

select s.student_id, s.student_name, AVG(mark)
from student s join Mark m on s.student_id = m.student_id
group by s.student_id, s.student_name
having AVG(mark) >= all (select AVG(mark) from mark group by mark.student_id);