package com.example.bumblebee.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DietPlan extends AppCompatActivity {

     TextView mTextMessage;
     //TextView mTextMessage1;

      ImageView background;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
//                    mTextMessage.setTextSize(50);
//                    mTextMessage.setText("BREAKFAST:");
                    mTextMessage.setTextSize(50);
                    mTextMessage.setText("Avocado toast or sliced banana on toast");
                    return true;
                case R.id.navigation_dashboard:
//                    mTextMessage.setTextSize(50);
//                    mTextMessage.setText("LUNCH:");
                    mTextMessage.setTextSize(50);
                    mTextMessage.setText("Falafel salad with lettuce, hot pepper, tahini, and hummus");
                    return true;
                case R.id.navigation_notifications:
//                    mTextMessage.setTextSize(50);
//                    mTextMessage.setText("DINNER:");
                    mTextMessage.setTextSize(50);
                    mTextMessage.setText("Salmon with broccoli, tomatoes, and potatoes");
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_plan);

        mTextMessage = (TextView) findViewById(R.id.message_matter);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
