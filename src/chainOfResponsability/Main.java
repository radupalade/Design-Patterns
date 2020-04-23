package chainOfResponsability;

public class Main {
    public static void main(String[] args) {
        Request reimbursementRequest = new Request(RequestType.REIMBURSEMENT, 20);
        Manager manager = new Manager();
        manager.handleRequest(reimbursementRequest);

        Director director = new Director();
        manager.setSuccesor(director);

        VP vp = new VP();
        director.setSuccesor(vp);

        CEO ceo = new CEO();
        vp.setSuccesor(ceo);

        Request conferrenceRequest = new Request(RequestType.CONFERENCE, 400);
        manager.handleRequest(conferrenceRequest);

        Request purchaseRequest = new Request(RequestType.PURCHASE, 700);
        manager.handleRequest(purchaseRequest);

        Request bigPurchaseRequest = new Request(RequestType.PURCHASE, 7000);
        manager.handleRequest(bigPurchaseRequest);
    }
}
