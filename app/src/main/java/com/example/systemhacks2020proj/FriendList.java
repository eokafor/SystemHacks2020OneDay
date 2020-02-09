package com.example.systemhacks2020proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;
public class FriendList extends AppCompatActivity {

    Dialog myDialog;

    private Button friendbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_list);
        myDialog = new Dialog(this);

        friendbutton = findViewById(R.id.addfriendbutton);

        friendbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToAddFriend();
            }
        });

    }

    private void moveToAddFriend() {

        Intent intent = new Intent(FriendList.this, add_friend.class);
        startActivity(intent);
    }


    public void ShowPopup(View v) {
        TextView txtclose;

        myDialog.setContentView(R.layout.custompopup);
        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);


        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });


        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
    public static Intent addFriend(Context context){
        return new Intent(context, FriendList.class);
    }
    public static Intent addFriend(){
        return new Intent();
    }
}

