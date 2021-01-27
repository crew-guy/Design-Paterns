package com.ankit.chainOfResponsibility;

public class Authenticator extends Handler{
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Authenticating...");
        if(request.getUsername() == "admin" && request.getPassword() == "admin1234"){
            System.out.println("Authentication passed ✔");
            return false;
        }
        else
            System.out.println("Authentication failed ❌");
            return true;
    }
}
