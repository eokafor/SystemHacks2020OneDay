package com.example.systemhacks2020proj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.systemhacks2020proj.CoreObjects.Event;
import com.example.systemhacks2020proj.CoreObjects.EventManager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EventManager event = EventManager.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.MyToolbar);
        setSupportActionBar(toolbar);
        populateListView();
        setupAddBtn();

    }


    private void setupAddBtn(){
        FloatingActionButton FBtn = findViewById(R.id.add_button);
        FBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = AddEventActivity.addEvent(MainActivity.this);
                startActivity(intent);
            }
        });


    }

    private void populateListView(){
        ArrayList<Event> eventList = new ArrayList<>();

        // Load list into separate list using getIndex.
        for (int i = 0; i < event.eventSize(); i++) {
            eventList.add(event.getIndex(i));
        }

        ArrayAdapter<Event> adapter = new ArrayAdapter<Event>(
                this,
                R.layout.eventlistview,
                eventList);
        ListView list = findViewById(R.id.EventListView);
        list.setAdapter(adapter);


    }

}
