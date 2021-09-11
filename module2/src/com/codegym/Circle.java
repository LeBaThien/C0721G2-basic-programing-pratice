package com.codegym;

import b7_abstract_class_and_interface.excercise.resizeable.InterfaceResizeable;

public class Circle extends Shape implements InterfaceResizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with Area = "
                + getArea()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public double resize(double percent) {
        return getArea() + getArea() * percent * 0.01;
    }
}
