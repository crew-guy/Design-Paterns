package com.ankit.command.compositeCommand;

import com.ankit.command.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    public List<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }

    @Override
    public void execute() {
        for(Command command : commands){
            command.execute();
        }
    }
}
