package com.example.adityakumar.recipe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Nonveg extends AppCompatActivity {
    public TextView textView4,textView5,textView6,textView8,textView9,textView10;

    public void abhi4(){
        textView4=(TextView)findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Nonveg.this,Eggpuff.class);
                startActivity(i);
            }
        });
    }
    public void abhi5(){
        textView5=(TextView)findViewById(R.id.textView5);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Nonveg.this,Eggtikkis.class);
                startActivity(i);
            }
        });
    }
    public void abhi6(){
        textView6=(TextView)findViewById(R.id.textView6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Nonveg.this,Muttonbriyaani.class);
                startActivity(i);
            }
        });
    }
    public void abhi8(){
        textView8=(TextView)findViewById(R.id.textView8);
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Nonveg.this,Tandooritikka.class);
                startActivity(i);
            }
        });
    }
    public void abhi9(){
        textView9=(TextView)findViewById(R.id.textView9);
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Nonveg.this,Malabarfish.class);
                startActivity(i);
            }
        });
    }
    public void abhi10(){
        textView10=(TextView)findViewById(R.id.textView10);
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Nonveg.this,KeemaMethiMatar.class);
                startActivity(i);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nonveg);

        abhi4();
        abhi5();
        abhi6();
        abhi8();
        abhi9();
        abhi10();
    }


}
