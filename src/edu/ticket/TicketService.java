package edu.ticket;

import edu.ticket.channel.ChannelHandler;
import edu.ticket.channel.ChannelHandlerFactory;
import edu.ticket.state.*;

public class TicketService {
    public void processTicket(Ticket ticket) {
        // Handle channel
        ChannelHandler channelHandler = ChannelHandlerFactory.getHandler(ticket.getChannel());
        if (channelHandler != null) {
            channelHandler.handle();
        }

        // Process through states
        ticket.handle(); // NEW
        
        String team = ticket.getType().equalsIgnoreCase("BUG") ? "engineering" : "support";
        ticket.setState(new AssignedState(team));
        ticket.handle(); // ASSIGNED
        
        ticket.setState(new InProgressState());
        ticket.handle(); // IN_PROGRESS
        
        ticket.respond(); // Send response
        
        ticket.setState(new ResolvedState());
        ticket.handle(); // RESOLVED
        
        ticket.setState(new ClosedState());
        
        // Log
        System.out.println("Logging ticket handling : " + ticket.getId() + " -> " + ticket.getState());
    }
}
