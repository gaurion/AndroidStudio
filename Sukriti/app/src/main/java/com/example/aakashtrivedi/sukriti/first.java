package com.example.aakashtrivedi.sukriti;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class first extends Activity implements OnClickListener{
    //static String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstpage);
        TextView tv = (TextView) findViewById(R.id.textView_Name1);
        EditText et = (EditText) findViewById(R.id.editText_Name1);
        Button b = (Button) findViewById(R.id.button_enter1);
        b.setOnClickListener(this);
       // name = et.getText().toString();

    }

    @Override
    public void onClick(View view) {
        Intent in = new Intent(first.this, second.class);
        startActivity(in);
    }
}
