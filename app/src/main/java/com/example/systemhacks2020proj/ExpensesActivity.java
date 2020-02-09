package com.example.systemhacks2020proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.systemhacks2020proj.R;

public class ExpensesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expenses);
    }
    public static Intent addExpenses(Context context){
        return new Intent(context, ExpensesActivity.class);
    }
    public static Intent addExpenses(){
        return new Intent();
    }
}
