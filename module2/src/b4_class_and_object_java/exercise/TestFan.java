package b4_class_and_object_java.exercise;

public class TestFan {
    public static void main(String[] args) {

        Fan f1 = new Fan(Fan.FAST,true,10,"yellow");
        Fan f2 = new Fan(Fan.MEDIUM,false,5,"blue");

        System.out.println("Fan 1 status is: " + f1.toString());
        System.out.println("Fan 2 status is: "+ f2.toString());
    }
}
