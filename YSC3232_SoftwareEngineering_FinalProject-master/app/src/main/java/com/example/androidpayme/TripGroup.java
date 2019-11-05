package com.example.androidpayme;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Berke
 */
@SuppressWarnings("serial") //With this annotation we are going to hide compiler warnings
public class TripGroup implements Serializable {
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

    public ArrayList<User> getMembers() {
        return this.members;
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

    public ArrayList<Transaction> getTransactionList(User u1, User u2) {
        ArrayList<Transaction> res = new ArrayList<>();
        for(Transaction transaction: transactions) {
            if (transaction.isPayer(u1) && transaction.isPaybacker(u2)) {
                res.add(transaction);
            }
            else if (transaction.isPayer(u2) && transaction.isPaybacker(u1)) {
                res.add(transaction);
            }
        }
        return res;
    }
}
