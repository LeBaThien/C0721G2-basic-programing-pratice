use quan_ly_sinh_vien;

select `subject`.sub_id, `subject`.sub_name, max(credict) as max_credict 
from `subject`;

select `subject`.sub_id, `subject`.sub_name, max(`mark`.mark) as max_mark
from `subject` join `mark`
on `subject`.sub_id = mark.sub_id;

select student.student_id, student.student_name, student.address, student.phone,
AVG(mark.mark) as average_mark
from student join mark
on student.student_id = mark.student_id
order by Avg(mark.mark) DESC;