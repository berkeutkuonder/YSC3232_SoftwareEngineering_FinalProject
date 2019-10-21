
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
        float balance;
        for (Transaction t :transaction_list){
            if (t.payer = pov_user) {
                balance += t.splitBill();
            }
            else if (t.payer = other_user && t.paybackers.contains(t.payer)){
                balance -= t.splitBill();
            }
        }
        return balance;
    }
    public HashMap<User, Float>displayBalanceEveryone (ArrayList<User> userlist){
        HashMap<User, Float> balanceDictionary = new HashMap<User, Float>();
        userlist.remove(this.pov_user);
        for (User u : userlist){
           float balance = displayBalance(this.pov_user, u); 
           balanceDictionary.put(u, balance);
        }
        return balanceDictionary;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
