package decorator;

public class VeganPizza implements Pizza {
    @Override
    public double getCost() {
        System.out.println("vegan pizza: 20 ron");
        return 20;
    }
}
