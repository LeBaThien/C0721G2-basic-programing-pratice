package b7_abstract_class_and_interface.practice.interface_comparator;

import b6_inheritance_polymorphism.practice.shape_object.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius())
        return 1;
        else if (o1.getRadius() < o2.getRadius())
            return -1;
        else return 0;
    }
}
