package com.example.systemhacks2020proj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
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

    EventManager events = EventManager.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.MyToolbar);
        setSupportActionBar(toolbar);
        //events.add(new Event("fuck", "this", "shit", 23));
        populateListView(events);
        setupAddBtn();

    }


    private void setupAddBtn(){
        FloatingActionButton FBtn = findViewById(R.id.add_button);
        FBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = AddEventActivity.addEvent(MainActivity.this);
                startActivityForResult(intent, 1);
            }
        });


    }

    //displays list on current lenses in main screen
    private void populateListView(EventManager events) {
        ArrayList<Event> eventlist = new ArrayList<>();

        // Load list into separate list using getIndex.
        for (int i = 0; i < events.eventSize(); i++) {
            eventlist.add(events.getIndex(i));
        }

        ArrayAdapter<Event> adapter = new ArrayAdapter<Event>(
                this,
                R.layout.eventlistview,
                eventlist);
        ListView list = findViewById(R.id.EventListView);
        list.setAdapter(adapter);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                String result = data.getStringExtra("result");
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                recreate();
            }
        }
    }
}
