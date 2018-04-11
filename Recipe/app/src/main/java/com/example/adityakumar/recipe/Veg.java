package com.example.adityakumar.recipe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Veg extends AppCompatActivity {
    TextView textView4,textView5,textView6,textView10,textView9;
    public void abhi4(){
        textView4=(TextView)findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Veg.this,Lemonrice.class);
                startActivity(i);
            }
        });
    }
    public void abhi5(){
        textView5=(TextView)findViewById(R.id.textView5);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Veg.this,Paneerbhoorji.class);
                startActivity(i);
            }
        });
    }
    public void abhi6(){
        textView6=(TextView)findViewById(R.id.textView6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Veg.this,Rawadhokla.class);
                startActivity(i);
            }
        });
    }
    public void abhi8(){
        textView10=(TextView)findViewById(R.id.textView10);
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Veg.this,Bhindimasala.class);
                startActivity(i);
            }
        });
    }
    public void abhi9(){
        textView9=(TextView)findViewById(R.id.textView9);
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Veg.this,Mushroommanchurian.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.veg);
        abhi4();
        abhi5();
        abhi6();
        abhi8();
        abhi9();


    }

}
