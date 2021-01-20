package com.ankit.templateMethod;

public class TransferMoneyTask extends Task{
//     public TransferMoneyTask(AuditTrail auditTrail){
//         super(auditTrail);
//     }
    @Override
    protected void doExecute() {
        System.out.println("Your money has been successfully transferred !");
    }
}
