package onlineAuction;

public class Auction {


    public void start() {
        Participant jack = new Participant("jack");
        Participant john = new Participant("john");

        Item bike = new Item("bike", 12);
        jack.follow(bike);
        john.follow(bike);

        Bid firstBid = new Bid(10, bike, jack);
        Bid anotherBid = new Bid(15, bike, john);
        bike.newBid(firstBid);
        bike.newBid(anotherBid);


    }
}
