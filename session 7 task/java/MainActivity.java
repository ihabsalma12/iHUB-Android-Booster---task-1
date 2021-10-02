package com.example.activityswitch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText ed_email, ed_pass, ed_phone, ed_dob;
    AppCompatButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        ed_email=findViewById(R.id.editEmailAddress);
        ed_pass=findViewById(R.id.editPassword);
        ed_phone= findViewById(R.id.editPhone);
        ed_dob= findViewById(R.id.editDate);

        btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button){
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("email", ed_email.getText().toString());
            intent.putExtra("password", ed_pass.getText().toString());
            intent.putExtra("phone", ed_phone.getText().toString());
            intent.putExtra("dob", ed_dob.getText().toString());

            startActivity(intent);
        }
    }
}