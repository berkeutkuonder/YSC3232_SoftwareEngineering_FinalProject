package com.example.androidpayme;

import java.util.ArrayList;

/**
 *
 * @author Anna
 */

public class Transaction {
    /**
     * ID of the transaction.
     */
    private int id;
    /**
     * Keep track on the number of transactions, for the transactionID.
     */
    public static int nb=0;
    /**
     * The payer is the one who paid for the members of the group.
     */
    private User payer;
    /**
     * Paybackers are the people who have to pay back the payer.
     */
    private ArrayList<User> paybackers = new ArrayList <User>();
    /**
     * The total amount of the transaction.
     */
    private float amount;
    /**
     * The amount per person, after splitting the bill.
     */
    private float amountPerson;
    /**
     * The currency in which the transaction is made. 
     * @see Currency
    */
    private Currency currency;
    
    /**
     * Constructor with the payer and the pay
     * @param payer
     * @param paybackers
     * @param amount
     * @param currency 
     */
    public Transaction(User payer, ArrayList<User> paybackers, float amount, Currency currency){
        this.id=++nb;
        this.payer = payer;
        this.paybackers = paybackers;
        this.amount = amount;
        this.currency = currency;
    }
    /**
     * Add a user who has to payback.
     * @param member 
     */
    public void addMember(User member){
        paybackers.add(member);
    }
    /**
     * Delete a member who has already paid.
     * @param member 
     */
    public void deleteMember(User member){
        for(int i=0; i<paybackers.size();i++){
           if(paybackers.get(i).getID() == member.getID()) {
               paybackers.remove(i);
           }        
        } 
    }
    /**
     * Split equally the amount of the bill between the paybackers and the payer.
     */
    public void splitBill(){
        this.amountPerson = (float) this.amount/(paybackers.size()+1);
    }
    
    public User getPayer(){
        return this.payer;
    }
    
    public float getAmountPerson() {
        return this.amountPerson;
    }
    
    public ArrayList<User> getPaybackers() {
        return this.paybackers;
    }
    public void setPayer(User payer){
        this.payer = payer;
    }
}
