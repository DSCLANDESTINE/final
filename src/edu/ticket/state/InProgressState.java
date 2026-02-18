package edu.ticket.state;

import edu.ticket.Ticket;

public class InProgressState implements TicketState {
    @Override
    public void handle(Ticket ticket) {
        System.out.println("Working on ticket");
    }
    
    @Override
    public String getStateName() {
        return "IN_PROGRESS";
    }
}
