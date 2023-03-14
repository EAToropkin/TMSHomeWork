package by.teachmeskills.homeworks.hw_03032023.animal;

import java.util.Arrays;

public class Main {

    public static void viewAnimal(Animal[] animalArray) {
        for (Animal animal : animalArray) {
            animal.makeNoise();
            animal.roam();
            animal.eat();
            animal.sleep();
        }
    }

    public static void main(String[] args) {
        System.out.println("------ All array ----- ");
        Animal cat = new Cat("Cat", "mouse", false, new Animal.Boundaries(10, 10), new Animal.Location(1, 2));
        Animal dog = new Dog("Dog", "dog food", false, new Animal.Boundaries(10, 10), new Animal.Location(3, 4));
        Animal wolf = new Wolf("Wolf", "rabbit", true, new Animal.Boundaries(10, 10), new Animal.Location(3, 4));
        Animal lion = new Lion("Lion", "antelope", true, new Animal.Boundaries(100, 100), new Animal.Location(30, 40));
        Animal tiger = new Tiger("Tiger", "hog", true, new Animal.Boundaries(100, 100), new Animal.Location(40, 50));
        Animal hippo = new Hippo("Hippo", "grass", false, new Animal.Boundaries(30, 30), new Animal.Location(60, 70));

        Animal[] animals = {cat, lion, tiger, dog, wolf, hippo};
        viewAnimal(animals);

        System.out.println("------ Feeline array ----- ");
        Feeline[] feelines = {(Feeline) cat, (Feeline) lion, (Feeline) tiger};
        viewAnimal(feelines);

        System.out.println("------ Canine array ----- ");
        Canine[] canines = {(Canine) dog, (Canine) wolf};
        viewAnimal(canines);
    }
}
