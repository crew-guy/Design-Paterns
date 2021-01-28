package com.ankit.visitor;

public class PlainTextOperation implements Operation{
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("Plain text from heading node");
    }

    @Override
    public void apply(AnchorTagNode anchorTagNode) {
        System.out.println("Plain text from anchor node");
    }
}
