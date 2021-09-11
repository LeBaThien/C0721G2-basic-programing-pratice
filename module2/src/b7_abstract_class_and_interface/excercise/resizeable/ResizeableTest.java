package b7_abstract_class_and_interface.excercise.resizeable;

import com.codegym.Circle;
import com.codegym.Rectangle;
import com.codegym.Shape;
import com.codegym.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        System.out.println("Pre-resized:");
        for (com.codegym.Shape shapeObject : shapes){
            System.out.println(shapeObject);
        }

        System.out.println("After-resized:");
        for (com.codegym.Shape shapeObject : shapes){
           double percent = (Math.random()*100);
            if(shapeObject instanceof Circle) {
                System.out.println("Circle Area: "+ ((Circle) shapeObject).resize(percent));
            } else if (shapeObject instanceof Rectangle){
                System.out.println("Rectangle Area: " + ((Rectangle) shapeObject).resize(percent));
            } else if (shapeObject instanceof Square){
                System.out.println("Square Area: " + ((Square) shapeObject).resize(percent));
            }
        }

//        Circle [] circles = new Circle[1];
//        circles[0] = new Circle();
//
//        Rectangle[] rectangles = new Rectangle[1];
//        rectangles[0] = new Rectangle();
//
//        Square[] squares = new Square[1];
//        squares[0] = new Square();
//
//        for (com.codegym.Circle circleObject : circles){
//            System.out.println("Pre-resized:");
//            System.out.println(circleObject);
//            System.out.println("after-resized:");
//            circleObject.resize(50);
//            System.out.println(circleObject);
////        }

//        System.out.println(Arrays.toString(circles));
    }
}
