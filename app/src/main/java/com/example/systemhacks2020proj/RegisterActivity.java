package com.example.systemhacks2020proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    private EditText semail;
    private EditText hasname;
    private Button creamed;
    private EditText pass;
    private TextView mask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        semail = (EditText) findViewById(R.id.editText3);
        hasname = (EditText) findViewById(R.id.editText);
        pass = (EditText) findViewById(R.id.editText2);
        creamed = (Button) findViewById(R.id.button);
        mask = (TextView) findViewById(R.id.textView2);


        creamed.setEnabled(true);

        creamed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
