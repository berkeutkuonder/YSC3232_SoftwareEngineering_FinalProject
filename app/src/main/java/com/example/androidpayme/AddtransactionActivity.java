package com.example.androidpayme;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class AddtransactionActivity extends AppCompatActivity {
    private Button addMember;
    private LinearLayout addMemberLayout;
    private Button addTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtransaction);
        addMember = findViewById(R.id.addmember2);
        addMemberLayout= findViewById(R.id.addmemberview);
        addTransaction = findViewById(R.id.addtransaction);
        addMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nametitle = new EditText(AddtransactionActivity.this);
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
                addMemberLayout.addView(nametitle);
            }
        });
    }
}
