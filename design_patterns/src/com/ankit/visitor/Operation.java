package com.ankit.visitor;

public interface Operation {
    void apply(HeadingNode headingNode);
    void apply(AnchorTagNode anchorTagNode);
}
