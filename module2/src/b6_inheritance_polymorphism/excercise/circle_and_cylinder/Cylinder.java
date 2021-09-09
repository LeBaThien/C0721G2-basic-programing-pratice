package b6_inheritance_polymorphism.excercise.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        double volume;
        return volume = super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}


