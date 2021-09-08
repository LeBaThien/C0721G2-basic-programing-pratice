package b5_access_modifer_static_method_static_property.exercise.student;


public class TestStudent {
    public static void main(String[] args) {
//        Student student = new Student();
        Student student1 = new Student();
        System.out.println("Name: " + student1.getName() + ", class: " +student1.getClasses());
    }
}
