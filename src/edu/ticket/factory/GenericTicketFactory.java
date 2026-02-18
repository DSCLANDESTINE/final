package edu.ticket.factory;

import edu.ticket.Ticket;
import edu.ticket.strategy.GenericResponseStrategy;

public class GenericTicketFactory implements TicketFactory {
    @Override
    public Ticket createTicket(int id, String channel) {
        Ticket ticket = new Ticket(id, "GENERIC", channel);
        ticket.setResponseStrategy(new GenericResponseStrategy());
        return ticket;
    }
}
