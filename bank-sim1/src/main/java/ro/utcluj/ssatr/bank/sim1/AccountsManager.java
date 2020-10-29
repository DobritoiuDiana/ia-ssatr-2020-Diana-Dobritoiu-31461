/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.bank.sim1;

/**
 *
 * @author DoubleD
 */
public class AccountsManager {
    BankAccount[] account = new BankAccount[10];
        
    void addAccount(BankAccount a){
        
        for(int i=0;i<account.length;i++){
           if(account[i]==null){
               account[i] = a;
               System.out.println("New account added on account Manager.");
               return;
           }           
       }
       System.out.println("No empty position found on account Manager.");
    }
    int getTotalBalance(){
        int totalBalance = 0;
        for (int i = 0; i<account.length;i++){
            totalBalance += account[i].getbalance();
            
        }
        System.out.println("Total Balance is:" + totalBalance);
               return totalBalance;
    }
}