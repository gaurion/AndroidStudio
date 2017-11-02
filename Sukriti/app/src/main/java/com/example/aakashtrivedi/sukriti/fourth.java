package com.example.aakashtrivedi.sukriti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class fourth extends Activity implements View.OnClickListener {

    Button b;
    EditText et;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourthpage);
        TextView tv = (TextView) findViewById(R.id.textView_Name4);
        EditText et = (EditText) findViewById(R.id.editText_Name4);
        Button b = (Button) findViewById(R.id.button_enter4);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent in = new Intent(fourth.this,MainActivity.class);
        startActivity(in);
    }
}

