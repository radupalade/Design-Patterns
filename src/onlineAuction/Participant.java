package onlineAuction;

public class Participant extends Observator {

    private int budget;

    public Participant(String name) {
        super(name);
    }

    @Override
    public void update(Bid bid) {
        //this should be called when subjects change their state
        System.out.println(name + ": New bid for " + bid.getItemName() + " with value: " + bid.getValue());
    }

    //implement budget method

}
