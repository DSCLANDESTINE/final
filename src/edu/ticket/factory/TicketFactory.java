package edu.ticket.factory;

import edu.ticket.Ticket;

public interface TicketFactory {
    Ticket createTicket(int id, String channel);
}
