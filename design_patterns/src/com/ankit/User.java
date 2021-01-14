package com.ankit;

public class User {
    public String name;
    public String fav_book;

    // Constructor function => Name is same as class name and we don't specify what it returns
    public User(String string){
        this.name = string;
    }

    // Regular method on any instance of this class
    public void sayHello(Number age){
        System.out.println("Hi ! my name is " + this.name);
        System.out.println("My favourite book is " + this.fav_book);
        System.out.println("My age is " + age);
    }
}
