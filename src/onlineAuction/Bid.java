package onlineAuction;

public class Bid {
    private int value;
    private Item item;
    private Participant owner;

    public Bid(int value, Item item, Participant owner) {
        this.value = value;
        this.item = item;
        this.owner = owner;
    }

    public int getValue() {
        return value;
    }

    public Item getItem() {
        return item;
    }

    public Participant getOwner() {
        return owner;
    }

    public String getItemName() {
        return item.getName();
    }
}
