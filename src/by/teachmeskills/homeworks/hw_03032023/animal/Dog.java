package by.teachmeskills.homeworks.hw_03032023.animal;

public class Dog extends Canine {
    public Dog(String picture, String food, boolean hunger, Boundaries boundaries, Location location) {
        super(picture, food, hunger, boundaries, location);
    }

    @Override
    protected void eat() {
        System.out.println("The dog eat "+food);
    }

    @Override
    public void makeNoise() {
        System.out.println("The dog barks");
    }
}
