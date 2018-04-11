package com.example.adityakumar.recipe;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView textView,textView2,textView5,textView6;
    public void adi(){
        textView=(TextView)findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Veg.class);
                startActivity(i);
            }
        });
    }
    public void adi1(){
        textView2=(TextView)findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Nonveg.class);
                startActivity(i);
            }
        });
    }
    public void adi2(){
        textView5=(TextView)findViewById(R.id.textView5);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,About.class);
                startActivity(i);
            }
        });
    }
    public void adi3(){
        textView6=(TextView)findViewById(R.id.textView6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Feedback.class);
                startActivity(i);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adi();
        adi1();
        adi2();
        adi3();
    }


}