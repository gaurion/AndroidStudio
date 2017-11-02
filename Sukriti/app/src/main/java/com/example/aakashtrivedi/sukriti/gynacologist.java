package com.example.aakashtrivedi.sukriti;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.view.View;
import android.widget.TextView;


/**
 * Created by dell on 06-May-17.
 */

public class gynacologist extends AppCompatActivity {
    String [] titles={"Dr. Vidya V.",
            "Dr Anita K Sharma",
            "Dr. Pallavi Dhawan",
            "Dr Rekha Gupta",
            "Dr. Manjula Lakhanpal",
            "Dr. Anjali Kumar "};
    String [] descriptions={
            "New B-21, 2nd Avenue, Annanagar East, Chennai, Tamil Nadu 600102, India\n" + "\n+91 93810 01033\n",
            "E-146, Sector 20,Noida, Uttar Pradesh 201301, India\n" + "+\n91 98712 99276\n",
            "A-535, Block A, Indira Nagar, Lucknow, Uttar Pradesh 226016, India\n" + "\n+91 94154 34199\n",
            "Genesis Hospital Khatena Road, Lohamandi, Agra, Uttar Pradesh 282002, India\n" + "\n+91 562 400 5294\n",
            "Hapur Rd, Nauchandi, Meerut, Uttar Pradesh 250002, India\n" + "\n+91 9884205421\n",
            "Block C2, DLF Garden Villas, Sector 43, Gurugram, Haryana 122009, India\n" + "\n+91 98181 53475\n"};
    int [] images={R.drawable.pic,R.drawable.pic,R.drawable.pic,R.drawable.pic,R.drawable.pic,R.drawable.pic};
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gynae1);
        lv = (ListView) findViewById(R.id.idListView);
        MyAdapter adapter = new MyAdapter(this,titles,descriptions,images);
        lv.setAdapter(adapter);
    }

}
class MyAdapter extends ArrayAdapter {
    int[] imageArray;
    String[] titleArray;
    String[] descArray;
    public MyAdapter(Context context, String[] titles1, String[] descriptions1, int [] img1) {
        //Overriding Default Constructor off ArratAdapter
        super(context, R.layout.gynae2,R.id.idTitle,titles1);
        this.imageArray=img1;
        this.titleArray=titles1;
        this.descArray=descriptions1;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Inflating the layout
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.gynae2,parent,false);

        //Get the reference to the view objects
        ImageView myImage = (ImageView) row.findViewById(R.id.idPic);
        TextView myTitle = (TextView) row.findViewById(R.id.idTitle);
        TextView myDescription = (TextView) row.findViewById(R.id.idDescription);

        //Providing the element of an array by specifying its position
        myImage.setImageResource(imageArray[position]);
        myTitle.setText(titleArray[position]);
        myDescription.setText(descArray[position]);
        return row;
    }
}