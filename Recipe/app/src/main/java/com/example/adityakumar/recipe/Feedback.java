package com.example.adityakumar.recipe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Feedback extends AppCompatActivity {

    String name,mail,fdb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);
        //final EditText to=(EditText)findViewById(R.id.sendTo);
       final String to="adityanmamit@gmail.com";
        //final EditText subject=(EditText)findViewById(R.id.subject);
        final String subject="Feedback On Recipe App";
        final EditText message=(EditText)findViewById(R.id.EmailText);

        Button sendE=(Button)findViewById(R.id.sendEmail);
        sendE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // String toS= to.getText().toString();
                //String subS=subject.getText().toString();
                String mesS=message.getText().toString();

                Intent email =new Intent(Intent.ACTION_SEND);

                //email.putExtra(Intent.EXTRA_EMAIL,toS);
                //email.putExtra(Intent.EXTRA_EMAIL,new String[] {tos});
                email.putExtra(Intent.EXTRA_EMAIL,new String[] {to});
                //email.putExtra(Intent.EXTRA_SUBJECT,subS);
                email.putExtra(Intent.EXTRA_SUBJECT,subject);
                email.putExtra(Intent.EXTRA_TEXT,mesS);

                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email,"choose app to send mail"));
            }
        });
    }
}
