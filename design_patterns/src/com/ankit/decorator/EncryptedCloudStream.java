package com.ankit.decorator;

public class EncryptedCloudStream implements Stream{
    private Stream stream;

    public EncryptedCloudStream(Stream stream){
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        System.out.println("Storing '&*@#&*$@*&$'");
    }
}
