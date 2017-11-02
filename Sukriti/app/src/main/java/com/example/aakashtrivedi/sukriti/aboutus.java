package com.example.aakashtrivedi.sukriti;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class aboutus extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.aboutus);
            TextView tv =(TextView)findViewById(R.id.textView_care);
            ImageView iv= (ImageView)findViewById(R.id.imageView_care);

        }
    }


