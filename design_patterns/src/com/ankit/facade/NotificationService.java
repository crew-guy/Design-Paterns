package com.ankit.facade;

public class NotificationService {
    public void send(String message, String targetIp){
        var server = new NotificationServer();
        var connection = server.connect(targetIp);
        var token = server.authenticate("239rjd1309r2","#@!FCH)HCHNCA");
        server.send(new Message(message), token, targetIp);;
        connection.disconnect();
    }
}
