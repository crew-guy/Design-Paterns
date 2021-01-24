package com.ankit.command.undo;

public class HtmlDoc {
    public String content;

    public void makeBold(){
        this.content = "<b>" + this.content + "</b>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
