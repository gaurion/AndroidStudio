package com.example.aakashtrivedi.sukriti;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class whatsapp  extends AppCompatActivity
    {
        Button btn;

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.homescreen);
            btn = (Button) findViewById(R.id.idbtn);
        }

        public void btnClick(View v)
        {
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(Intent.EXTRA_TEXT,"Hey,I am a bit unwell,plz help me out.Thank you"); sharingIntent.setPackage("com.whatsapp"); startActivity(sharingIntent); }



    }

