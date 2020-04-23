package decorator;

public class WithParmezan extends PizzaDecorator {
    double parmezanPrice = 3;

    public WithParmezan(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        double initialPrice = pizza.getCost();
        System.out.print(", with parmezan: 3ron");
        return initialPrice + parmezanPrice;
    }
}
