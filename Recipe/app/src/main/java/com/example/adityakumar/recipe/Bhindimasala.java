package com.example.adityakumar.recipe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Bhindimasala extends AppCompatActivity {
    Button btn4;
    public void init1(){
        btn4=(Button)findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Bhindimasala.this,Bhindiplay.class);
                startActivity(i);
            }
        });

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhindimasala);
        init1();
    }

}