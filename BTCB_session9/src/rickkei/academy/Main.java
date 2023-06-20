package rickkei.academy;

import rickkei.academy.animals.Animal;
import rickkei.academy.animals.Chicken;
import rickkei.academy.animals.Tiger;
import rickkei.academy.edible.IEdible;
import rickkei.academy.fruit.Apple;
import rickkei.academy.fruit.Fruit;
import rickkei.academy.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                IEdible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
