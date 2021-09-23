package com.example.slideshow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button text_btn;
    private Button image_btn;
    private ImageView iv;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = findViewById(R.id.fishes_img);
        tv = findViewById(R.id.fishes_text);
        text_btn = findViewById(R.id.chg_text);
        image_btn = findViewById(R.id.chg_img);

        text_btn.setOnClickListener(this);
        image_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.getId()==R.id.chg_text){
            tv.setText("Jellyfish");

        }
        else if(v.getId() == R.id.chg_img){
            iv.setImageResource(R.drawable.jellyfish);
        }
    }
}