package com.example.androidpayme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PersonInGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_in_group);


        Intent intent = getIntent();
        User user = (User) intent.getSerializableExtra("user");
        String tname = intent.getStringExtra("gname");
        String bal = String.valueOf(15.42);

        String mname = user.getFirstName() + " " + user.getLastName();

        TextView group_name = findViewById(R.id.GroupName);
        group_name.setText(tname);

        TextView member_name = findViewById(R.id.name_payee);
        member_name.setText(mname);

        TextView balance = findViewById(R.id.balance);
        balance.setText(bal);
    }
}
