package repository.impl;

import bean.Student;
import repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StudentRepository implements IStudentRepository {

    static Map<Integer, Student> studentMap;

    static {
        studentMap = new TreeMap<>();
        studentMap.put(432, new Student(432, "Nguyen Van Hung",
                "2000-10-27", 1, 4.0));
        studentMap.put(984, new Student(984, "Le Thi B",
                "2000-07-28", 0, 7.0));
        studentMap.put(322, new Student(322, "Nguyen Thi D",
                "2000-10-21", 0, 9.0));
        studentMap.put(233, new Student(233, "Nguyen Van C",
                "2000-04-09", 1, 6.0));
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(studentMap.values());
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }
}
