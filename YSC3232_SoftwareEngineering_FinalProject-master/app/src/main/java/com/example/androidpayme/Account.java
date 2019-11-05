package com.example.androidpayme;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Account extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private EditText FirstName;
    private EditText LastName;
    private EditText Email;
    private Button AddAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        Username = (EditText)findViewById(R.id.username);
        FirstName = (EditText)findViewById(R.id.firstName);
        LastName = (EditText)findViewById(R.id.lastName);
        Email = (EditText)findViewById(R.id.email);
        Password = (EditText)findViewById(R.id.password);

        AddAccount = (Button)findViewById(R.id.btnaddAccount);


        AddAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User();
                user.firstName = FirstName.getText().toString();
                user.lastName = LastName.getText().toString();
                user.id = 1;
                user.userName = Username.getText().toString();
                user.password = Password.getText().toString();
                user.email = Email.getText().toString();

                Intent intent = new Intent(Account.this, InCase.class);
                startActivity(intent);
                //add account to data base

            }
        });
    }

}