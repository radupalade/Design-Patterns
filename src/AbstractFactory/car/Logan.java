package AbstractFactory.car;

public class Logan extends Car {

    public Logan(Integer engineSize) {
        super(engineSize);
        System.out.println("Logan created");
    }
}
