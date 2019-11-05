package com.example.androidpayme;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private Button Login;
    private Button ForgetPassword;
    private Button AddAccount;
    private int numberoftries = 5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = (EditText)findViewById(R.id.username);
        Password = (EditText)findViewById(R.id.password);
        Login = (Button)findViewById(R.id.btnlogin);
        ForgetPassword = (Button)findViewById(R.id.btnforgetpassword);
        AddAccount = (Button)findViewById(R.id.btnaddAccount);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Username.getText().toString(), Password.getText().toString());
                //System.out.println(Username.getText().toString());
                //System.out.println(Password.getText().toString());
            }
        });

        AddAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Account.class);
                startActivity(intent);
            }
        });
        ForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ForgetPassword.class);
                startActivity(intent);
            }
        });
    }

    private void validate(String username, String password)
    {
        if(username.equals("Admin") && password.equals("1234"))
        {
            Intent intent = new Intent(MainActivity.this, AnnaGroups.class);
            startActivity(intent);
        }
        else
        {   numberoftries --;
            if(numberoftries == 0){

                Login.setEnabled(false);
            }

        }


    }

}