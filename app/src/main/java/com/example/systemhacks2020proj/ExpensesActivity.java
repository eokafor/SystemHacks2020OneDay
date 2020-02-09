package com.example.systemhacks2020proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.systemhacks2020proj.CoreObjects.SubEvent;
import com.example.systemhacks2020proj.CoreObjects.SubEventManager;
import com.example.systemhacks2020proj.R;

public class ExpensesActivity extends AppCompatActivity {
    int get_global_int = SubEvents.Global_Position_Sub;
    SubEventManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expenses);
        manager = SubEventManager.getInstance();
        setTextViews();
    }
    public static Intent addExpenses(Context context){
        return new Intent(context, ExpensesActivity.class);
    }
    public static Intent addExpenses(){
        return new Intent();
    }

    private void setTextViews(){
        TextView textview = findViewById(R.id.CreatedByPerson);
        textview.setText(manager.getIndex(get_global_int).getCreator());

    }
}
