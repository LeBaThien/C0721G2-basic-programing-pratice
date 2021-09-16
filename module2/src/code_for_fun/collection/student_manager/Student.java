package code_for_fun.collection.student_manager;

public class Student  {
    private int idStudent;
    private String fullName;
    private int dateBirth;
    private float averageScore;

    public Student(int idStudent, String fullName, int dateBirth, float averageScore) {
        this.idStudent = idStudent;
        this.fullName = fullName;
        this.dateBirth = dateBirth;
        this.averageScore = averageScore;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(int dateBirth) {
        this.dateBirth = dateBirth;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent='" + idStudent + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateBirth=" + dateBirth +
                ", averageScore=" + averageScore +
                '}';
    }

}
