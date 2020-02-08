package com.example.systemhacks2020proj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.systemhacks2020proj.CoreObjects.Event;
import com.example.systemhacks2020proj.CoreObjects.EventManager;
import com.example.systemhacks2020proj.CoreObjects.EventTextUI;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static int Global_Position;
    private EventManager event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.MyToolbar);
        setSupportActionBar(toolbar);
        event = EventManager.getInstance();
        new EventTextUI(event);
        //event.add(new Event("fuck", "this", "shit", 23));
        populateListView(event);
        registerClickCallback();
        setupAddBtn();

    }
    //to remember which lens was selected
    private void registerClickCallback(){
        ListView list = findViewById(R.id.EventListView);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {
                Global_Position = position;

                // Start Activity
                Intent intent = SubEvents.addSubEvent(MainActivity.this);
                startActivityForResult(intent, 1);
                Global_Position = position;
            }
        });

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

    private void populateListView(EventManager event){
        ArrayList<Event> eventlist = new ArrayList<>();

        // Load list into separate list using getIndex.
        for (int i = 0; i < event.eventSize(); i++) {
            eventlist.add(event.getIndex(i));
        }

        //eventlist.add(new Event("C", "A", "r", 20.10));
        ArrayAdapter<Event> adapter = new ArrayAdapter<>(
                this,
                R.layout.eventlistview,
                eventlist);
        ListView list = findViewById(R.id.EventListView);
        list.setAdapter(adapter);
    }


}
