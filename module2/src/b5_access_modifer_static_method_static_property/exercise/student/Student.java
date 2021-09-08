package b5_access_modifer_static_method_static_property.exercise.student;

public class Student {
    private String name = "John";
    private String classes = "C02";
//    public String name = "John";
//    public String classes = "C02";
    public Student (){

    }

//    public Student(String name, String classes){
//        this.name = name;
//        this.classes = classes;
//    }
     String getName() {
        return name;
    }
//    private String getName() {
//        return name;
//    }
//  Sửa thành private, lớp khác gọi thì sẽ bị lỗi, vì private chỉ dùng trong class, kể cả các class cùng package, cũng ko đc
    // không bỏ từ khóa nào, mặc định default thì khác lớp, hoặc cùng lớp, và phải ở cùng trong package là được
    //  Sửa thành protected thì lại đươc, khác lớp cùng package là được, khác package thì ko
    //Và public thì ở đâu cũng đc

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
