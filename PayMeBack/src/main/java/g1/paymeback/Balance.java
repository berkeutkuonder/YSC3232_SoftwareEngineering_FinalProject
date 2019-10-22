package g1.paymeback;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wayne
 */
public class Balance {
    
    private User pov_user;
    private User other_user;
    private ArrayList<Transaction> transaction_list;
    private Currency currency;
    
    Balance (User pov_user, User other_user, ArrayList<Transaction> transaction_list, Currency currency){
        this.pov_user = pov_user;
        this.other_user = other_user;
        this.transaction_list = transaction_list;
        this.currency = currency;
    }
    
    public float displayBalance (User pov_user, User other_user){
        float balance = 0;
        for (Transaction t :transaction_list){
            if (t.getPayer() == pov_user) {
                balance += t.getAmountPerson();
            }
            else if (t.getPayer() == other_user && t.getPaybackers().contains(t.getPayer())){
                balance -= t.getAmountPerson();
            }
        }
        return balance;
    }
    public HashMap<User, Float>displayBalanceEveryone (ArrayList<User> userlist){
        HashMap<User, Float> balanceDictionary = new HashMap<>();
        userlist.remove(this.pov_user);
        for (User u : userlist){
           float balance = displayBalance(this.pov_user, u); 
           balanceDictionary.put(u, balance);
        }
        return balanceDictionary;
    }
    
    public User getPOVuser () {
        return this.pov_user;
    }
    public User getOtheruser() {
        return this.other_user;
    }
    public ArrayList<Transaction> getTransactionlist() {
        return this.transaction_list;
    }
    public Currency getCurrency() {
        return this.currency;
    }
    public void setPOVuser (User pov) {
        this.pov_user = pov;
    }
    public void setOtheruser(User other) {
        this.other_user = other;
    }
    public void setTransactionlist(ArrayList<Transaction> transactionlist) {
        this.transaction_list = transactionlist;
    }
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }   
       
}
