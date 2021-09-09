package b6_inheritance_polymorphism.excercise.point2d_and_point3d;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point2d point2d = new Point2d(2, 3);
        System.out.println("Point 2d: " + point2d);
        System.out.println(Arrays.toString(point2d.getXY()));
        Point3d point3d = new Point3d(3, 4, 6);
//        point3d.setX(6);
//        point3d.setY(8);
        System.out.println("Point 3d: " + point3d);
        System.out.println(Arrays.toString(point3d.getXYZ()));
    }

}
