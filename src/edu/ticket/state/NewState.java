package edu.ticket.state;

import edu.ticket.Ticket;

public class NewState implements TicketState {
    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket created");
    }
    
    @Override
    public String getStateName() {
        return "NEW";
    }
}
