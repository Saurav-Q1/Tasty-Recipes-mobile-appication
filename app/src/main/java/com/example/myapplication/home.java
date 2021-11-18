package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        button1=(Button)findViewById(R.id.btn25);
        button2=(Button)findViewById(R.id.btn26);
        button3=(Button)findViewById(R.id.btn27);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityOne();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityTow();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivitythree();
            }
        });
    }
    public void moveToActivityOne(){
        Intent intent1=new Intent(this,asian.class);
        startActivity(intent1);
    }
    public void moveToActivityTow(){
        Intent intent2=new Intent(this,japenis.class);
        startActivity(intent2);
    }
    public void moveToActivitythree(){
        Intent intent3=new Intent(this,othercountry.class);
        startActivity(intent3);
    }
}
