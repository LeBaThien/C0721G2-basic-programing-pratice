package b7_abstract_class_and_interface.excercise.colorable;

import com.codegym.Circle;
import com.codegym.Rectangle;
import com.codegym.Shape;
import com.codegym.Square;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        String str = "Color all four sides";
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                System.out.println(
                        "A Square with Area: " + ((Square) shape).getArea()
                                + ", has method howToColor, "
                                + ((Square) shape).howToColor(str));
            } else {
                System.out.println(shape);
            }
        }

    }
}
