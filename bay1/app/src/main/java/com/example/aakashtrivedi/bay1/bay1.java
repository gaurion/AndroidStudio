package com.example.aakashtrivedi.bay1;

import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class bay1 extends Activity{
    ListView ls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.custommenu);
        ls=(ListView)findViewById(R.id.listView1);
        String cls[]={"doctor 1\n address\n contact no" , "doctor 2\n address\n contact no","doctor 3\n address\n contact no"};
        ArrayAdapter<String> list= new ArrayAdapter<String>(bay1.this, R.layout.list_text,cls);
        ls.setAdapter(list);

        ls.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adpt, View view,
                                    int position, long arg3) {
                TextView tv=(TextView)view;
                String str=tv.getText().toString();
                /*
                if(str.equalsIgnoreCase(getResources().getString(R.string.first)))
                {
                    Intent in= new Intent(custommenu.this,first.class);
                    startActivity(in);
                }
                else if(str.equalsIgnoreCase(getResources().getString(R.string.sec)))
                {
                    Intent in= new Intent(custommenu.this,sec.class);
                    startActivity(in);
                }
                else if(str.equalsIgnoreCase(getResources().getString(R.string.sec)))
                {
                    Intent in= new Intent(custommenu.this,test1.class);
                    startActivity(in);
                }*/
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater mn=new MenuInflater(getApplicationContext());
        mn.inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       /* switch (item.getItemId()) {
            case R.id.aboutus:
                Intent in=new Intent(custommenu.this, aboutus.class);
                startActivity(in);
                break;
            case R.id.pref:
                Intent in2=new Intent(custommenu.this, pref.class);
                startActivity(in2);
                break;
            case R.id.exit:
                finish();
                break;
            default:
                break;
        }*/
        return false;
    }


}


