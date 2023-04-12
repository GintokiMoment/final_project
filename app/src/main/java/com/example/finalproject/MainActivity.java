package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  buttonPressed (View v){
        int idNumber = v.getId();
        String idName = getResources().getResourceEntryName(idNumber);
        Intent i;

        switch(idName){
            case"btnStores":
                i = new Intent(this, StoreActivity.class);
                startActivity(i);
                break;
        }
        switch(idName){
            case"btnProducts":
                i = new Intent(this, ProductActivity.class);
                startActivity(i, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
        }


    }

}