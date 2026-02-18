package edu.ticket.factory;

import edu.ticket.Ticket;
import edu.ticket.strategy.BugResponseStrategy;

public class BugTicketFactory implements TicketFactory {
    @Override
    public Ticket createTicket(int id, String channel) {
        Ticket ticket = new Ticket(id, "BUG", channel);
        ticket.setResponseStrategy(new BugResponseStrategy());
        return ticket;
    }
}
