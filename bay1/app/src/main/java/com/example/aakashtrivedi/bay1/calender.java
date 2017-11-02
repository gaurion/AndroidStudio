/*

package com.example.aakashtrivedi.bay1;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.icu.text.SimpleDateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker ;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Calendar;
import java.util.Locale;

public class calender extends AppCompatActivity implements View.OnClickListener {

        DatePicker datePicker;
        EditText editText;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.datepicker);
            datePicker = (DatePicker) findViewById(R.id.datePicker);
            Calendar calendar = Calendar.getInstance();


        }
    Calendar myCalendar = Calendar.getInstance();

    DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            // TODO Auto-generated method stub
            myCalendar.set(Calendar.YEAR, year);
            myCalendar.set(Calendar.MONTH, monthOfYear);
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            updateLabel();
        }

    };

    private void updateLabel() {

        String myFormat = "MM/dd/yy"; //In which you need put here
        SimpleDateFormat sdf;
        sdf=new SimpleDateFormat(myFormat,Locale.US);

        editText.setText(sdf.format(myCalendar.getTime()));
    }

    @Override
    public void onClick(View view) {
        // TODO Auto-generated method stub
        new DatePickerDialog(calender.this, date, myCalendar
                .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                myCalendar.get(Calendar.DAY_OF_MONTH)).show();
    }
}

*/