package com.example.bumblebee.buttontest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /** Called when the activity is first created. */
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // broadcast a custom intent.

    public void broadcastIntent(View view){
        Intent intent = new Intent();
        intent.setAction("CUSTOM_INTENT"); sendBroadcast(intent);
    }

    public void broadcastIntent2(View view){
        Intent intent = new Intent();
        intent.setAction("CUSTOM_INTENT2"); sendBroadcast(intent);
    }
}
