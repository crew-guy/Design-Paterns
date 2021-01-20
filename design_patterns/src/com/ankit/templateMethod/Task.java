package com.ankit.templateMethod;

public abstract class Task {
    public AuditTrail auditTrail;

    public Task(){
        this.auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail){
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();
        System.out.println("Starting execution of transaction......");

        doExecute();
    }

    protected abstract void doExecute();
}


