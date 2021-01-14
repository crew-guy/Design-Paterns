package com.ankit;

public class MailService {
    public void getEmail(){
        this.connect();
        this.authenticate();
        this.disconnect();
    }

    private void connect(){
        System.out.println("connect");
    }

    private void authenticate(){
        System.out.println("authenticate");
    }

    private void disconnect(){
        System.out.println("disconnect");
    }
}
