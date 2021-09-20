package code_f4.oop.student_highschool;

public class Student {
    private int idStudent;
    private int age;
    private String hometown;
    private int classStudent;

    public Student (){

    }

    public Student(int idStudent, int age, String hometown, int classStudent) {
        this.idStudent = idStudent;
        this.age = age;
        this.hometown = hometown;
        this.classStudent = classStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public int getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(int classStudent) {
        this.classStudent = classStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", age=" + age +
                ", hometown='" + hometown + '\'' +
                ", classStudent=" + classStudent +
                '}';
    }
}
