package case_study.models;

public class Employee extends Person {
    private int idEmployee;
    private String academicLevel;
    private double salaryStaff;
    private String position;


    public final static String INTERMEDIATE = "Intermediate";
    public final static String COLLEGE = "College";
    public final static String UNIVERSITY = "University";
    public final static String MASTER = "Master";

    public final static String RECEPTIONIST = "Receptionist";
    public final static String WAITER = "Waiter";
    public final static String SPECIALIST = "Specialist";
    public final static String SUPERVISOR = "Supervisor";
    public final static String MANAGER = "Manager";
    public final static String DIRECTOR = "Director";


    public Employee(String name, String dateBirth, String sex, int identification, int phoneNumber, String email, int idEmployee, String academicLevel, double salaryStaff, String position) {
        super(name, dateBirth, sex, identification, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.academicLevel = academicLevel;
        this.salaryStaff = salaryStaff;
        this.position = position;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public double getSalaryStaff() {
        return salaryStaff;
    }

    public void setSalaryStaff(double salaryStaff) {
        this.salaryStaff = salaryStaff;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() + //Phải ghi thêm dòng này thì mới kế thừa lại kiểu in của thèn cha,
                // vì sao khi bấm toString của thèn con, nó ko hiện ra toString của thèn cha luôn,
                // mà mình phải dùng super để override lại ?
                "idEmployee=" + idEmployee +
                ", academicLevel='" + academicLevel + '\'' +
                ", salaryStaff=" + salaryStaff +
                ", position='" + position + '\'' +
                '}';
    }

    public String getInformationEmployee (){
        return getName() + "," + getDateBirth() + "," + getSex()+ ","
                + getIdentification() + "," + getPhoneNumber() + ","
                + getEmail() + "," + getIdEmployee() +","
                + getAcademicLevel() + "," + getSalaryStaff() +"," + getPosition();

    }
}
