package decorator;

public class Margherita implements Pizza {
    @Override
    public double getCost() {
        System.out.print("margherita pizza: 15ron");
        return 15;
    }
}
