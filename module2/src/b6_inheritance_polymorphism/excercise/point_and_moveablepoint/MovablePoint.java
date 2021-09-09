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

    public float[] move() {
        float[] array1 = new float[2];
        array1[0] = getX() + getxSpeed();
        array1[1] = getY() + getySpeed();
        return array1;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + getX() + "," + getY() +
                '}' + ", (x speed: " + getxSpeed() + ", y speed: " + getySpeed() +
                ") = " + Arrays.toString(move());
    }
}
