package com.ankit.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistoryForArray {
    private String[] urls = new String[10];
    private int index = 0;
    private int count = 0;

    public void push(String url){
        urls[count] = url;
        count++;
    }

    public String pop(){
        --count;
        return urls[count];
    }

    public String[] getUrls() {
        return urls;
    }

    public void setUrls(String[] urls) {
        this.urls = urls;
    }

    public Iterator createIterator(){
        return new ArrayIterator(this);
    }


    public class ArrayIterator implements Iterator{
        public BrowseHistoryForArray history;

        public ArrayIterator(BrowseHistoryForArray history){
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }

}
