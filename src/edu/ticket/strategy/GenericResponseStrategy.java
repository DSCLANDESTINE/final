package edu.ticket.strategy;

public class GenericResponseStrategy implements ResponseStrategy {
    @Override
    public void respond() {
        System.out.println("Sending generic response");
    }
}
