package com.example.systemhacks2020proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class AddEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);
    }

    public static Intent addEvent(Context context){
        return new Intent(context, AddEventActivity.class);
    }
    public static Intent addEvent(){
        return new Intent();
    }
}
