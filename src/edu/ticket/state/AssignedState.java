package edu.ticket.state;

import edu.ticket.Ticket;

public class AssignedState implements TicketState {
    private String team;
    
    public AssignedState(String team) {
        this.team = team;
    }
    
    @Override
    public void handle(Ticket ticket) {
        System.out.println("Assigned to " + team);
    }
    
    @Override
    public String getStateName() {
        return "ASSIGNED";
    }
}
