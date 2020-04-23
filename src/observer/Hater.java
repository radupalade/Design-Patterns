package observer;

public class Hater extends Person {
    public Hater(String name) {
        super(name);
    }

    @Override
    public void update(Subject subjectWhoTriggered) {
        System.out.println("i am " + this.name
                + " and i received an update from "
                + subjectWhoTriggered.getName() + ": " + subjectWhoTriggered.getLatestPost() + " - i hate this!!");
    }
}
