package com.example.androidpayme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InCase extends AppCompatActivity {

    public TextView textView;
    public TextView textView2;
    public TextView textView3;
    public EditText Email;
    public EditText Answer;
    public Button AddF;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_case);

        Email = (EditText) findViewById(R.id.email);
        Answer = (EditText)findViewById(R.id.answer);
        AddF = (Button)findViewById(R.id.buttonAdd);
        textView = (TextView)findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);

        AddF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InCase.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
