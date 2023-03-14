package by.teachmeskills.homeworks.hw_03032023.animal;

public class Lion extends Feeline {

    public Lion(String picture, String food, boolean hunger, Boundaries boundaries, Location location) {
        super(picture, food, hunger, boundaries, location);
    }

    @Override
    protected void eat() {
        System.out.println("The lion eat " + food);
    }

    @Override
    public void makeNoise() {
        System.out.println("The lion riors");
    }

    @Override
    public void roam() {
        System.out.println("A lion roams the savannah");
    }
}
