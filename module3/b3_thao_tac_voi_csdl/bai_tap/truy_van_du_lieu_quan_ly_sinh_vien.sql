use quan_ly_sinh_vien;

select * from student
where student_name like 'h%';

select * from class
where (select month (start_date) = 12);

select * from `subject`
where credict between 3 and 5;

-- select student_id,student.student_name, class.class_id
-- from student inner join class
-- on student.student_id = class.class_id
SET SQL_SAFE_UPDATES = 0;	
update student
set class_id = 2
where  student_name = "Hung";

-- Hiển thị các thông tin: StudentName, SubName, Mark.
--  Dữ liệu sắp xếp theo điểm thi (mark) giảm dần.
--  nếu trùng sắp theo tên tăng dần.

select student.student_id, student.student_name, `subject`.sub_name, mark.mark
from student join mark
on student.student_id = mark.student_id
join `subject`
on mark.sub_id = `subject`.sub_id
order by mark.mark DESC , student.student_name;
