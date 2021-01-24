package com.ankit.command.undo;

public interface UndoableCommand extends Command{
    void unexecute();
}
