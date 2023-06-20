package rickkei.academy.animals;

import rickkei.academy.edible.IEdible;

public class Chicken extends Animal implements IEdible {

    @Override
    public String makeSound() {
        return "Chicken : Cluck-Cluck";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
