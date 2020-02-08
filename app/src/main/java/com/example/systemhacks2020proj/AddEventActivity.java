package com.example.systemhacks2020proj;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.systemhacks2020proj.CoreObjects.Event;
import com.example.systemhacks2020proj.CoreObjects.EventManager;

public class AddEventActivity extends AppCompatActivity {

    String eventName;
    String creator;
    String date;
    double moneyOwed;

    EditText eventNameInput;
    EditText creatorInput;
    EditText dateInput;
    EditText moneyOwedInput;

    private EventManager events;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);
        setupCancelButton();
        setupSaveButton();
    }

    private void setupCancelButton() {
        Button btn = findViewById(R.id.cancelButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AddEventActivity.this, "Cancelled", Toast.LENGTH_SHORT)
                        .show();
                finish();
            }
        });
    }

    private void setupSaveButton() {
        events = EventManager.getInstance();
        eventNameInput = findViewById(R.id.eventNameInput);
        creatorInput = findViewById(R.id.creatorInput);
        dateInput = findViewById(R.id.dateInput);
        moneyOwedInput = findViewById(R.id.moneyOwedInput);

        Button saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eventName = eventNameInput.getText().toString();
                creator = creatorInput.getText().toString();
                date = dateInput.getText().toString();
                moneyOwed = Double.parseDouble(moneyOwedInput.getText().toString());
                events.add(new Event(eventName, creator, date, moneyOwed));
                //Intent returnIntent = new Intent();
                Intent returnIntent = addEvent();
                setResult(Activity.RESULT_CANCELED, returnIntent);
                finish();
            }
        });

    }
    public static Intent addEvent(Context context){
        return new Intent(context, AddEventActivity.class);
    }
    public static Intent addEvent(){
        return new Intent();
    }
}
