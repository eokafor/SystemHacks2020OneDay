package com.example.systemhacks2020proj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class add_friend extends AppCompatActivity {

    Button addfriend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_friend);

        addfriend = (Button)findViewById(R.id.addfriendbutton);

        addfriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Friend Added!", Toast.LENGTH_LONG).show();
            }
        });

    }
}
