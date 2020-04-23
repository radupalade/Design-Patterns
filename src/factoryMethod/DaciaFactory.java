package factoryMethod;

public class DaciaFactory {

    private Car logan = new Logan(1600);

    public Car createCar(Integer engineSize) {
        switch (engineSize) {
            case 1200:
                return new Sandero(engineSize);
            case 1600:
                return logan; //obiectul a fost creat mai sus //eager method
            case 2000:
                return new Duster(engineSize);
            default:
                return null;
        }
    }
}
