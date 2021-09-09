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
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MovablePoint move(){
//        System.out.println("(" + getX() + ", " + getY() + ") = (" + getxSpeed() + ", " + getySpeed()+ ")");
        setX(getX() + getxSpeed());
        setY(getY() + getySpeed());
        return this;
    }

    @Override
    public String toString() {
        return " x speed: " + getxSpeed() + ", y speed: " + getySpeed() +
                " = " + "MovablePoint" + Arrays.toString(getXY()) ;
    }
}
