package b4_class_and_object_java.exercise;

public class Fan {
    public static final int SLOW = 1;
    public static int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean status = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString (){
        if(isStatus()) {
            return " speed " + this.speed + ", color " + this.color + ", radius " + this.radius + " fan is on";
        } else {
            return "fan is off";
        }

    }
    public Fan (int speed, boolean status, double radius, String color){
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;

    }




}
