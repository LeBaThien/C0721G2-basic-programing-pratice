package b6_inheritance_polymorphism.excercise.circle_and_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("red");
        System.out.println("Area : " + circle.getArea());
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder(10, "blue", 5);
        cylinder.setRadius(12);
        cylinder.setColor("pink");
        System.out.println("Volume: " + cylinder.getVolume());
        System.out.println(cylinder);//ko dùng .toString vẫn đc, vì bên kia đã ghi đè toString rồi


    }

}
