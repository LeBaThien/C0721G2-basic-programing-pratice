package com.codegym;

import b7_abstract_class_and_interface.excercise.colorable.InterfaceColorable;
import b7_abstract_class_and_interface.excercise.resizeable.InterfaceResizeable;

public class Square extends Shape implements InterfaceResizeable, InterfaceColorable {
    private double side = 1.0;

    public Square (){

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea (){
        return  this.side * this.side;
    }
    public double getPerimeter (){
        return this.side * 4;
    }

    @Override
    public String toString() {
        return "A Square with side = "
                + getSide()
                + ",with Area = "
                + getArea()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public double resize(double percent) {
        return getArea() + getArea() * percent * 0.01;
    }

    @Override
    public String howToColor(String str) {
        return "Color all four sides";
    }
}
