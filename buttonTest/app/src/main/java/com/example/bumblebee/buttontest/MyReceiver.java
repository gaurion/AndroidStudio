package com.example.bumblebee.buttontest;

/**
 * Created by bumblebee on 2/11/17.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Click Detected.", Toast.LENGTH_LONG).show();
        String a="Click Detected";
    }
}