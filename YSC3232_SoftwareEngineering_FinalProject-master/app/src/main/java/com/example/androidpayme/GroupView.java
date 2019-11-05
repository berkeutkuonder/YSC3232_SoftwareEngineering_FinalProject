package com.example.androidpayme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class GroupView extends AppCompatActivity{

    public TripGroup group;
    public ArrayList<User> users;
    public String tname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_view);

        Intent intent = getIntent();
        group = (TripGroup) intent.getSerializableExtra("Group");
        users = group.getMembers();
        tname = group.getName();

        TextView group_name = findViewById(R.id.GroupName);
        group_name.setText(tname);

        LinearLayout mainLinear = (LinearLayout) findViewById(R.id.HolderLayout);
        for (int i = 0; i < users.size(); i++) {
            final User u = users.get(i);
            String name = u.getFirstName() + " " + u.getLastName();
            Button newbutton = new Button(GroupView.this);
            newbutton.setText(name);
            newbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(GroupView.this, PersonInGroup.class);
                    intent.putExtra("user",u);
                    intent.putExtra("gname",tname);
                    startActivity(intent);
                }
            });
            mainLinear.addView(newbutton);
        }

    }

    public void addExpense(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("Group",group);
        startActivity(intent);
    }

}
