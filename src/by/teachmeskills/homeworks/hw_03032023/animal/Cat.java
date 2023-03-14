package by.teachmeskills.homeworks.hw_03032023.animal;

public class Cat extends Feeline {

    public Cat(String picture, String food, boolean hunger, Boundaries boundaries, Location location) {
        super(picture, food, hunger, boundaries, location);
    }

    @Override
    protected void eat() {
        System.out.println("The Cat eat " + food);
    }

    @Override
    public void makeNoise() {
        System.out.println("The cat meows");
    }

    @Override
    protected void roam() {
        System.out.println("The cat wanders alon");
    }

}
