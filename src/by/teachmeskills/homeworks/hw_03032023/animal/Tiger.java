package by.teachmeskills.homeworks.hw_03032023.animal;

public class Tiger extends Feeline {
    public Tiger(String picture, String food, boolean hunger, Boundaries boundaries, Location location) {
        super(picture, food, hunger, boundaries, location);
    }

    @Override
    protected void makeNoise() {
        System.out.println("The tiger roars");
        ;
    }

    @Override
    protected void eat() {
        System.out.println("The tiger eat "+food);
    }

    @Override
    public void roam() {
        System.out.println("A tiger roams the taiga");
    }
}
