package code_f4.oop.student_highschool;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class School {
    private final List<Student> students;

    public School(){
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student){
        this.students.add(student);
    }
    public List<Student> getStudents20YearsOld (){
        return this.students.stream().filter(student -> student.getAge() == 20)
                .collect(Collectors.toList());
    }
    public long countStudent23YearsOldInDn(){
        return this.students.stream()
                .filter(student -> student.getAge() == 23 && student.getHometown().equals("DN"))
                .count();
    }

}
