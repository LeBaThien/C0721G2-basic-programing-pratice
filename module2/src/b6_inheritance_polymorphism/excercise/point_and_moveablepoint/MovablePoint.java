package b6_inheritance_polymorphism.excercise.point_and_moveablepoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed += getX();
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed += getY();
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MovablePoint move(){
        System.out.println("(" + getX() + ", " + getY() + ") = (" + getxSpeed() + ", " + getySpeed()+ ")");
        return this;
    }


//    @Override
//    public String toString() {
//        return "MovablePoint{" + getX() + "," + getY() +
//                '}' + ", (x speed: " + getxSpeed() + ", y speed: " + getySpeed() +
//                ") = " + Arrays.toString(move());
//    }
}
