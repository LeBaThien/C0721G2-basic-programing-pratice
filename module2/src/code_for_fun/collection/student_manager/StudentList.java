package code_for_fun.collection.student_manager;

import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> studentArrayList;

    public StudentList(){
        this.studentArrayList = new ArrayList<Student>();

    }

    public StudentList(ArrayList<Student> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }
    //Student là kiểu dữ liệu đối tượng
    // student là tên biến
    public void addStudent(Student student){
        this.studentArrayList.add(student);
    }
    public void printList(){
        for(Student sv : studentArrayList){
            System.out.println(studentArrayList);
        }
    }

    public boolean checkNull(){
       return this.studentArrayList.isEmpty();
    }

    public int numberOfStudent(){
        return this.studentArrayList.size();
    }

    public void removeList (){
        this.studentArrayList.removeAll(studentArrayList);
    }
    public boolean checkStudent(){
        return this.studentArrayList.contains(studentArrayList);
    }
    public boolean removeStudent(){
        return this.studentArrayList.removeAll(studentArrayList);
    }

    public void findStudent(){
//        for(Student sv: studentArrayList){
//            if(sv.getFullName().indexOf();
//        }
    }


}
