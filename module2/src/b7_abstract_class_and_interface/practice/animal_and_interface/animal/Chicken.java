package b7_abstract_class_and_interface.practice.animal_and_interface.animal;

import b7_abstract_class_and_interface.practice.animal_and_interface.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
