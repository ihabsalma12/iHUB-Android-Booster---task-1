package com.example.activityswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String email_msg = getIntent().getStringExtra("email");
        String password_msg = getIntent().getStringExtra("password");
        String phone_msg = getIntent().getStringExtra("phone");
        String dob_msg = getIntent().getStringExtra("dob");

        TextView email_label = findViewById(R.id.email_user);
        email_label.setText(email_msg);

        TextView password_label = findViewById(R.id.password_user);
        password_label.setText(password_msg);

        TextView phone_label = findViewById(R.id.phone_user);
        phone_label.setText(phone_msg);

        TextView dob_label = findViewById(R.id.dob_user);
        dob_label.setText(dob_msg);
    }
}