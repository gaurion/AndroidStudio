package com.example.aakashtrivedi.sukriti;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class dietplan extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dietplan);
        TextView tv = (TextView) findViewById(R.id.plan1);
    }
}