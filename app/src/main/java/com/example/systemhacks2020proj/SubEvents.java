package com.example.systemhacks2020proj;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.systemhacks2020proj.CoreObjects.Event;
import com.example.systemhacks2020proj.CoreObjects.EventManager;
import com.example.systemhacks2020proj.CoreObjects.SubEventManager;
import com.example.systemhacks2020proj.CoreObjects.SubEventTextUI;

import java.util.ArrayList;
import java.util.Iterator;

public class SubEvents extends AppCompatActivity {
    ArrayList<Event> subEventList = new ArrayList<>();
    int get_global_int = MainActivity.Global_Position;
    private SubEventManager event;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_events);
        event = SubEventManager.getInstance();
        new SubEventTextUI(event);
        populateListView(event);
    }


    public static Intent addSubEvent(Context context){
        return new Intent(context, AddEventActivity.class);
    }
    public static Intent addSubEvent(){
        return new Intent();
    }



    private void populateListView(SubEventManager subevent){
        ArrayList<Event> subEventlist = new ArrayList<>();

        // Load list into separate list using getIndex.
        for (int i = 0; i < subevent.subEventSize(); i++) {
            subEventlist.add(subevent.getIndex(i));
        }

        ArrayAdapter<Event> adapter = new ArrayAdapter<Event>(
                this,
                R.layout.subeventlistview,
                subEventlist);
        ListView list = findViewById(R.id.SubEventListView);
        list.setAdapter(adapter);
    }

}

    /*
// Toolbar functions.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_delete:
                event.remove(get_global_int);
                Intent returnIntent = new Intent();
                setResult(Activity.RESULT_CANCELED, returnIntent);
                finish();
                return true;
            case R.id.action_Edit:
                Intent intents = AddEventActivity.addEvent(SubEvents.this);
                intents.putExtra("edit", 1);
                startActivityForResult(intents, 1);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
*/

