package b7_abstract_class_and_interface.practice.interface_comparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5,"indigo",false);

        System.out.println("Pre-sorted:");
        //duyệt phần tử mảng
        for (ComparableCircle circle: circles){
            System.out.println(circle);
        }

        Arrays.sort(circles);//sắp xếp bán kính lớn dần
        System.out.println("After-sorted");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }
    }
}
