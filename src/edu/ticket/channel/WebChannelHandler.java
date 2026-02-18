package edu.ticket.channel;

public class WebChannelHandler implements ChannelHandler {
    @Override
    public void handle() {
        System.out.println("Received from web");
    }
}
