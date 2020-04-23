package chainOfResponsability;

public class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.CONFERENCE) {
            System.out.println("director can approve conferences , approved");
        } else {
            succesor.handleRequest(request);
        }
    }
}
