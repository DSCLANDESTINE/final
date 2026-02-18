import edu.ticket.Ticket;
import edu.ticket.TicketService;
import edu.ticket.factory.TicketFactory;
import edu.ticket.factory.TicketFactoryProvider;

public class Main {
    public static void main(String[] args) {
        TicketService service = new TicketService();

        System.out.println("=== Processing Bug Ticket from Web ===");
        TicketFactory bugFactory = TicketFactoryProvider.getFactory("BUG");
        Ticket bugTicket = bugFactory.createTicket(1, "WEB");
        service.processTicket(bugTicket);

        System.out.println("\n=== Processing Generic Ticket from Email ===");
        TicketFactory genericFactory = TicketFactoryProvider.getFactory("GENERIC");
        Ticket genericTicket = genericFactory.createTicket(2, "EMAIL");
        service.processTicket(genericTicket);
    }
}
