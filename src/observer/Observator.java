package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Observator {
    protected String name;
    protected List<Subject> observedSubjectList;
    protected Map<Subject, String> latestMessages;

    public Observator(String name) {
        this.name = name;
        observedSubjectList = new ArrayList<>();
        latestMessages = new HashMap<>();
    }

    public void update(Subject subjectWhoTriggered) {
        if (observedSubjectList.contains(subjectWhoTriggered)) {
            String previousMessage = latestMessages.get(subjectWhoTriggered);
            String currentMessage = subjectWhoTriggered.getLatestPost();
            if (previousMessage == null ||
                    previousMessage.compareTo(currentMessage) != 0) {

                System.out.println("i am " + this.name
                        + " and i received an update from "
                        + subjectWhoTriggered.getName() + ": " + subjectWhoTriggered.getLatestPost());
                latestMessages.put(subjectWhoTriggered, currentMessage);
            }
        }
    }

    public void follow(Subject subject) {
        observedSubjectList.add(subject);
        subject.addFollower(this);
    }

    public void unFollow(Subject subject) {
        observedSubjectList.remove(subject);
        subject.removeFollower(this);
    }
}
