package decorator;

public class Main {
    public static void main(String[] args) {
        Pizza margherita = new Margherita();

        Pizza myCustomPizza = new WithParmezan(margherita);
        System.out.println("\n" + myCustomPizza.getCost());

        Pizza myCustomPizza2 = new WithJalapeno(myCustomPizza);
        System.out.println("\nTotal cost: " + myCustomPizza2.getCost());

        Pizza extremePizza = new WithParmezan(new WithJalapeno(new WithParmezan(myCustomPizza2)));
        System.out.println("\n" + extremePizza.getCost());
    }
}
