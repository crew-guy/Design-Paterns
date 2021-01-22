package com.ankit.command;

import com.ankit.command.fx.Command;

public class BlackAndWhite implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white filter applied !");
    }
}
