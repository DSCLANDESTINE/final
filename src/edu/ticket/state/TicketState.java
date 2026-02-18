package edu.ticket.state;

import edu.ticket.Ticket;

public interface TicketState {
    void handle(Ticket ticket);
    String getStateName();
}
