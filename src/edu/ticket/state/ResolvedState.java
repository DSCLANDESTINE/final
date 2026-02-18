package edu.ticket.state;

import edu.ticket.Ticket;

public class ResolvedState implements TicketState {
    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket resolved");
    }
    
    @Override
    public String getStateName() {
        return "RESOLVED";
    }
}
