package com.ankit.templateMethod;

public class GenerateReportTask extends Task{
    @Override
    protected void doExecute() {
        System.out.println("Your report has been successfully generated !");
    }
}
