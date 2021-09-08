package b5_access_modifer_static_method_static_property.pratice.static_method;

public class test {
    public static void main(String args[]) {
        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(111, "Thien");
        Student s2 = new Student(222, "joseph");
        Student s3 = new Student(333, "peter");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
