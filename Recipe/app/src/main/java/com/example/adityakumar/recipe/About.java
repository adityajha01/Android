package com.example.adityakumar.recipe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class About extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        final String to="adityanmamit@gmail.com";
        TextView contactme=(TextView) findViewById(R.id.textView100);
        contactme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email =new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL,new String[] {to});
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email,"choose app to send mail"));
            }
        });
    }
}
