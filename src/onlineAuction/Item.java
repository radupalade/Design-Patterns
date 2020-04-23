package onlineAuction;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private String name;
    private int startingPrice;
    private Bid latestBid;
    private List<Observator> observatorList;

    public Item(String name, int startingPrice) {
        this.name = name;
        this.startingPrice = startingPrice;
        observatorList = new ArrayList<>();
    }

    public void addFollower(Observator observator) {
        observatorList.add(observator);
    }

    public void newBid(Bid bid) {
        if (latestBid == null) {
            int bidValue = bid.getValue();
            if (bidValue >= startingPrice) {
                updateBid(bid);
            }
        } else {
            //bid already exist
            int bidValue = bid.getValue();
            int currentValue = latestBid.getValue();
            if (bidValue > currentValue) {
                updateBid(bid);
            }
        }

    }

    private void updateBid(Bid bid) {
        latestBid = bid;
        updateParticipants(bid);
    }

    private void updateParticipants(Bid bid) {
        for (Observator each : observatorList) {
            each.update(bid);
        }
    }

    public String getName() {
        return name;
    }
}
