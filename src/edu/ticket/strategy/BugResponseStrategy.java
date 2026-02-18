package edu.ticket.strategy;

public class BugResponseStrategy implements ResponseStrategy {
    @Override
    public void respond() {
        System.out.println("Sending bug response");
    }
}
