package com.example.aakashtrivedi.sukriti;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.DatePicker ;
import android.widget.TextView;
import java.util.Calendar;
import android.widget.Button;
import android.content.Intent;


public class calender extends AppCompatActivity{

    DatePicker datePicker;
    TextView tv1,tv2;
    Button rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datepicker);
        rate=(Button)findViewById(R.id.dfragbutton);

        tv1=(TextView)findViewById(R.id.textView_startdate);
        tv2=(TextView)findViewById(R.id.textView_enddate);

        datePicker = (DatePicker) findViewById(R.id.datePicker);
        Calendar calendar = Calendar.getInstance();

        datePicker.init(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH),new DatePicker.OnDateChangedListener(){
            @Override
            public void onDateChanged(DatePicker datePicker,int i,int i1, int i2){
                //Toast.makeText(getApplicationContext(),datePicker.getDayOfMonth()+"-"+datePicker.getMonth()+"-"+datePicker.getYear(),Toast.LENGTH_SHORT).show();
                tv1.setText(datePicker.getDayOfMonth()+"-"+datePicker.getMonth()+"-"+datePicker.getYear());
                tv2.setText(datePicker.getDayOfMonth()+5+"-"+datePicker.getMonth()+"-"+datePicker.getYear());
            }
        });
    }
    public void rate(View v){
        Intent i=new Intent(this,Rating.class);
        startActivity(i);
    }
}