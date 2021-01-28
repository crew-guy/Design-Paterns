package com.ankit.visitor;

public class HighlightOperation implements Operation{
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("highlight-heading");
    }

    @Override
    public void apply(AnchorTagNode anchorTagNode) {
        System.out.println("highlight-anchor");
    }
}
