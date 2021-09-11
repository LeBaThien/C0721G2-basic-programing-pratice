package b7_abstract_class_and_interface.practice.interface_comparable;

import b6_inheritance_polymorphism.practice.shape_object.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    //Comparable<ComparableCircle>???
    //method comparable<parameter>
    public ComparableCircle(){

    }
    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius() > o.getRadius())
        return 1;
        else if (getRadius() < o.getRadius())
        return -1;
        else return 1;
    }

}
