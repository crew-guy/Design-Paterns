package com.ankit.facade;

public class NotificationServer {
    // connection(targetIp)
    // authToken (targetIp)
    // send(message, authToken,targetIp)
    // connection.disconnect

    public Connection connect(String targetIp){
        System.out.println("New connection being created with" + targetIp + ".....");
        return new Connection();
    }

    public AuthToken authenticate(String appId, String key){
        System.out.println("Authenticating created connection.....");
        return new AuthToken();
    }

    public void send(Message message, AuthToken token, String targetIp){
        System.out.println("Sending " + message.content +" to target...");
    }
}
