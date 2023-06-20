package rickkei.academy.fruit;

import rickkei.academy.edible.IEdible;

public abstract class Fruit implements IEdible {
    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}
