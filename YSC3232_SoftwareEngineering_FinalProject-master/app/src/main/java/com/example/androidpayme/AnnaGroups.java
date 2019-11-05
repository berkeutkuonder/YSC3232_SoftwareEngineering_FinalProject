package com.example.androidpayme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class AnnaGroups extends AppCompatActivity {

    TripGroup g1 = new TripGroup("Group1");
    TripGroup g2 = new TripGroup("Group2");

    public void demo() {
        User u1 = new User("Berke", "Onder", "e1", "u1", "p1","r", 1);
        User u2 = new User("Hasan", "Ekinci", "e2", "u2", "p2", "r", 2);
        User u3 = new User("Oyku", "Yilmaz", "e3", "u3", "p1", "r", 3);
        User u4 = new User("f4", "s4", "e2", "u2", "p2", "r", 4);
        User u5 = new User("f5", "s5", "e1", "u1", "p1", "r", 5);
        User u6 = new User("f6", "s6", "e2", "u2", "p2", "r", 6);
        User u7 = new User("f7", "s7", "e2", "u2", "p2", "r", 7);
        User u8 = new User("f8", "s8", "e1", "u1", "p1", "r", 8);
        User u9 = new User("f9", "s9", "e2", "u2", "p2", "r", 9);
        g1.addMember(u1);g1.addMember(u2);g1.addMember(u3);g1.addMember(u4);g1.addMember(u5);
        g1.addMember(u6);g1.addMember(u7);g1.addMember(u8);g1.addMember(u9);
        g2.addMember(u6);g2.addMember(u7);g2.addMember(u8);g2.addMember(u9);
        ArrayList<User> p1 = new ArrayList<User>(); p1.add(u2); p1.add(u3);
        Transaction t1 = new Transaction(u1, p1, 15, Currency.SGD);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        demo();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anna_groups);
    }

    public void openGroup(View view) {
        Intent intent = new Intent(this, GroupView.class);
        intent.putExtra("Group",g1);
        startActivity(intent);
    }

    public void openGroup2(View view) {
        Intent intent = new Intent(this, GroupView.class);
        intent.putExtra("Group",g2);
        startActivity(intent);
    }
}