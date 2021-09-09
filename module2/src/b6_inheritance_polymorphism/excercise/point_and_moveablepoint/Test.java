package b6_inheritance_polymorphism.excercise.point_and_moveablepoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(3, 4);
        movablePoint.setX(2);
        movablePoint.setY(2);
        movablePoint.setxSpeed(2);
        movablePoint.setySpeed(3);
        System.out.println(movablePoint.move().move());
    }

}
