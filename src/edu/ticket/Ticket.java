package edu.ticket;

import edu.ticket.state.*;
import edu.ticket.strategy.ResponseStrategy;

public class Ticket {
    private int id;
    private String type;
    private String channel;
    private TicketState state;
    private ResponseStrategy responseStrategy;

    public Ticket(int id, String type, String channel) {
        this.id = id;
        this.type = type;
        this.channel = channel;
        this.state = new NewState();
    }

    public void setState(TicketState state) {
        this.state = state;
    }

    public void setResponseStrategy(ResponseStrategy responseStrategy) {
        this.responseStrategy = responseStrategy;
    }

    public void handle() {
        state.handle(this);
    }

    public void respond() {
        if (responseStrategy != null) {
            responseStrategy.respond();
        }
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getChannel() {
        return channel;
    }

    public String getState() {
        return state.getStateName();
    }
}
