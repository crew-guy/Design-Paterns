package com.ankit.command.undo;

public class BoldCommand implements UndoableCommand {
    public HtmlDoc document;
    public String prevContent;
    public History history;

    public BoldCommand(HtmlDoc document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }
}
