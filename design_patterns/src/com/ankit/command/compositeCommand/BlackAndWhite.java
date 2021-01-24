package com.ankit.command.compositeCommand;

import com.ankit.command.fx.Command;

public class BlackAndWhite implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white filter applied !");
    }
}
