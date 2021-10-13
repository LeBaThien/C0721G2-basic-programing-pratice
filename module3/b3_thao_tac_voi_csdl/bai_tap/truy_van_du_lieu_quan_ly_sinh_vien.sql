use quan_ly_sinh_vien;

select * from student
where student_name like 'h%';

select * from class
where start_date like '[0-9]{4}+[-][12][-][0-9]{2}%';
-- chưa ra  

select * from `subject`
where credict between 3 and 5;



-- update student
-- set class_id = 2
-- where  student_name = "Hung";
-- SELECT S.StudentId, S.StudentName, Sub.SubName, M.Mark
-- FROM Student S join Mark M on S.StudentId = M.StudentId join Subject Sub on M.SubId = Sub.SubId
-- WHERE Sub.SubName = 'CF';
select s.student_id, s.student_name, m.mark
from student s join mark m on
