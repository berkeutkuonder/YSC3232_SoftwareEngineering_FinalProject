package com.example.androidpayme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity  {
    private Button addMember;
    private LinearLayout main;
    private Button confirmGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creategroup);
        addMember = findViewById(R.id.button2);
        main = findViewById(R.id.buttonlayout);
        confirmGroup = findViewById(R.id.confirmgroup);
        addMember.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v){
                EditText nametitle = new EditText(MainActivity.this);
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                params.setMargins(20, 10, 20, 10);
                //  params.weight = 1.0f;
                params.gravity = Gravity.CENTER_HORIZONTAL;  /// this is layout gravity of textview
                nametitle.setLayoutParams(params);
                nametitle.setBackgroundColor(Color.parseColor("#3F51B5"));
                nametitle.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
                nametitle.setTextColor(Color.parseColor("#ffffff"));
                nametitle.setTypeface(null, Typeface.BOLD);
                nametitle.setTextSize(18);
                nametitle.setHint("Enter Member Name");
                nametitle.setMinimumWidth(140);
                main.addView(nametitle);


            }


        });
        confirmGroup.setOnClickListener(new OnClickListener() {
           @Override
            public void onClick(View v) {
              Intent intent = new Intent (MainActivity.this, AddtransactionActivity.class);
               startActivity(intent);
            }
        });




    }
}
