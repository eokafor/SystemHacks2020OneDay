package com.example.systemhacks2020proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signIn extends AppCompatActivity {


    private EditText email;
    private EditText password;
    private Button login;
    private TextView info;
    private int count = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        info = (TextView) findViewById(R.id.textView);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(email.getText().toString(), password.getText().toString());
            }
        });


    }


    private void validate (String myEmail, String myPassword )
    {
        if((myEmail .equals("Agnes")) && (myPassword .equals("1234")))
        {
            Intent intent = new Intent(signIn.this, MainActivity.class);
            startActivity(intent);
        }
        else
        {
            count--;

            info.setText("Incorrect password/email:" + String.valueOf(count));

            if(count == 0)
            {
                login.setEnabled(false);
            }
        }
    }




}
