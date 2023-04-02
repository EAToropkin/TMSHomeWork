package by.teachmeskills.homeworks.hw_03032023.animal;

public abstract class Feeline extends Animal {
    public Feeline(String picture, String food, boolean hunger, Boundaries boundaries, Location location) {
        super(picture, food, hunger, boundaries, location);
    }
    @Override
    protected void roam() {
        System.out.println(this.getClass().getSimpleName() + " roam");
    }
}
