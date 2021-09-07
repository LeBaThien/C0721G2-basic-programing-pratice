package b4_class_and_object_java.exercise;

public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = slow;
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
    public String Fan (){
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


    public static void main(String[] args) {
        Fan f1 = new Fan(3,true,10,"yellow");
        Fan f2 = new Fan(2,false,5,"blue");
        System.out.println("Fan 1 status is: " + f1.Fan());
        System.out.println("Fan 2 status is: "+ f2.Fan());
    }


}
