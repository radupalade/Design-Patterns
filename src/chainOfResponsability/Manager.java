package chainOfResponsability;

public class Manager extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.REIMBURSEMENT) {
            //manager area of approval
            if (request.getAmount() > 100) {
                System.out.println("manager can approve but rejects it ");
            } else {
                System.out.println("Manager can approve and signs the request");
            }
        } else {
            succesor.handleRequest(request);

        }
    }
}
