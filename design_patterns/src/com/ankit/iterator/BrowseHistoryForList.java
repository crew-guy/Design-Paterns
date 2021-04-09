package com.ankit.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistoryForList {
    private List<String> urls = new ArrayList<>();
    private int index = 0;

    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        var lastIndex = urls.size() -1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }

    public List<String> getUrls(){return urls;}

    public void setUrls(List<String>urls){this.urls = urls;}

    public Iterator createIterator(){
        return new ListIterator(this);
    }


    public class ListIterator implements Iterator{
        public BrowseHistoryForList history;

        public ListIterator(BrowseHistoryForList history){
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.getUrls().size());
        }

        @Override
        public String current() {
            return history.getUrls().get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }

}

