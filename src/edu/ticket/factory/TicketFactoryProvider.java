package edu.ticket.factory;

public class TicketFactoryProvider {
    public static TicketFactory getFactory(String type) {
        if (type.equalsIgnoreCase("BUG")) {
            return new BugTicketFactory();
        } else {
            return new GenericTicketFactory();
        }
    }
}
