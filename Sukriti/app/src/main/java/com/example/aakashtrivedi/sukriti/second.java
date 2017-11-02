package com.example.aakashtrivedi.sukriti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.view.menu.ActionMenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class second extends Activity implements View.OnClickListener {

    Button b;
    EditText et;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondpage);
        TextView tv = (TextView) findViewById(R.id.textView_Name2);
        EditText et = (EditText) findViewById(R.id.editText_Name2);
        Button b = (Button) findViewById(R.id.button_enter2);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent in = new Intent(second.this, third.class);
        startActivity(in);
    }
}
