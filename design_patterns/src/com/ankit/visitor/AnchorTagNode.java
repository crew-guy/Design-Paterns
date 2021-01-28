package com.ankit.visitor;

public class AnchorTagNode implements HtmlNode{
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
