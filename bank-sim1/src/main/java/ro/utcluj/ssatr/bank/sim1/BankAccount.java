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
public class BankAccount {
    private String owner;
    int balance;
    
    BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
        }
    
    public String getowner() {
        return owner;
    }

    int getbalance() {
        return balance;
    }
}
