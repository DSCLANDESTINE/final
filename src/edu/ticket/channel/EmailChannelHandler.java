package edu.ticket.channel;

public class EmailChannelHandler implements ChannelHandler {
    @Override
    public void handle() {
        System.out.println("Received from email");
    }
}
