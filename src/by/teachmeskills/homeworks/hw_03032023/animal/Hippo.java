package by.teachmeskills.homeworks.hw_03032023.animal;

public class Hippo extends Animal {
    public Hippo(String picture, String food, boolean hunger, Boundaries boundaries, Location location) {
        super(picture, food, hunger, boundaries, location);
    }

    @Override
    protected void eat() {
        System.out.println("The hippo eat "+food);
    }

    @Override
    public void makeNoise() {
        System.out.println("The hippo grunts");
    }
}
