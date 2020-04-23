package onlineAuction;

import java.util.ArrayList;
import java.util.List;

public abstract class Observator {
    protected String name;
    protected List<Item> observedItemList;

    public Observator(String name) {
        this.name = name;
        observedItemList = new ArrayList<>();
    }

    public abstract void update(Bid bid);

    public void follow(Item item) {
        observedItemList.add(item);
        item.addFollower(this);
    }
}
