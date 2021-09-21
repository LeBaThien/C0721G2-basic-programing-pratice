package case_study.models;

public class Employee extends Person {
    private int idEmployee;
    private String academicLevel;
    private double salaryStaff;

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

    public Employee(String name, int dateBirth, String sex, int identification, int phoneNumber,
                    String email, int idEmployee, String academicLevel, double salaryStaff) {
        super(name, dateBirth, sex, identification, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.academicLevel = academicLevel;
        this.salaryStaff = salaryStaff;
    }
}
