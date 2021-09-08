package b5_access_modifer_static_method_static_property.exercise.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    protected double getRadius() {
        return radius;
    }
    // Nếu dùng private thì TestCircle gọi ra bị lỗi,
    //nếu dùng protected thì đc, or public

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle (){

    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

}
