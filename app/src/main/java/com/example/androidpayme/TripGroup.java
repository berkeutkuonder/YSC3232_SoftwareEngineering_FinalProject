package com.example.androidpayme;

import java.util.ArrayList;

/**
 *
 * @author Berke
 */
public class TripGroup {
    /**
     * Name of the trip group.
     */
    private String name;
    
    private ArrayList<User> members;
    
    private ArrayList<Transaction> transactions;
    
    TripGroup(String name) {
        this.name = name;
        this.members = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public void change_name(String name) {
        this.name = name;
    }
    
    public void addMember(User user){
        members.add(user);
    }
    
    public void deleteMember(User user){
        if (this.members.contains(user)) {
            this.members.remove(user);
        }
        else {
            System.out.print("The user is not a member of this group!");
        }
    }
    
    public void addTransaction (Transaction transaction){
        transactions.add(transaction);
    }
    
    public void deleteTransaction(Transaction transaction){
        if (this.transactions.contains(transaction)) {
            this.transactions.remove(transaction);
        }
        else {
            System.out.print("The transaction is not within the transaction list!");
        }
    }
}
