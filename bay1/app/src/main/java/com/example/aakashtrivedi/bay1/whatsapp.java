package com.example.aakashtrivedi.bay1;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
            sharingIntent.putExtra(Intent.EXTRA_TEXT,"Hey,"); sharingIntent.setPackage("com.whatsapp"); startActivity(sharingIntent); }



    }

