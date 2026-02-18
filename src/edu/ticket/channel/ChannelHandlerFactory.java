package edu.ticket.channel;

public class ChannelHandlerFactory {
    public static ChannelHandler getHandler(String channel) {
        if (channel.equalsIgnoreCase("WEB")) {
            return new WebChannelHandler();
        } else if (channel.equalsIgnoreCase("EMAIL")) {
            return new EmailChannelHandler();
        }
        return null;
    }
}
