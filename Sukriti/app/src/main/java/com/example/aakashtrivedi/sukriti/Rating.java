package com.example.aakashtrivedi.sukriti;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.DatePicker ;
import android.widget.RatingBar;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

import java.util.Calendar;

public class Rating extends AppCompatActivity {
    Button btn;
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rating);
        btn = (Button) findViewById(R.id.button);
        ratingBar = (RatingBar) findViewById(R.id.idratingBar);
    }
    public void onBtnClick(View v){
        float ratingvalue=ratingBar.getRating();

    }
    public void rate(View v){
        Intent i=new Intent(this,Graph.class);
        startActivity(i);
    }
}