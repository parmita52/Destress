package com.example.hshack.destress;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.*;
import android.view.*;
import android.util.*;
import android.content.*;

public class Breather extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breather);

        ImageButton button1= (ImageButton) findViewById(R.id.imageButton1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("clicks", "button 1 has been clicked");
                startActivity(new Intent(Breather.this, BreatherFocus1.class));
            }
        });

        ImageButton button2= (ImageButton) findViewById(R.id.imageButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("clicks", "button 2 has been clicked");
                startActivity(new Intent(Breather.this, BreatherFocus2.class));
            }
        });

        ImageButton button3= (ImageButton) findViewById(R.id.imageButton3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("clicks", "button 3 has been clicked");
                startActivity(new Intent(Breather.this, BreatherFocus3.class));
            }
        });

        ImageButton button4= (ImageButton) findViewById(R.id.imageButton4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("clicks", "button 4 has been clicked");
                startActivity(new Intent(Breather.this, BreatherFocus4.class));
            }
        });

        ImageButton button5= (ImageButton) findViewById(R.id.imageButton5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("clicks", "button 5 has been clicked");
                startActivity(new Intent(Breather.this, BreatherFocus5.class));
            }
        });

        ImageButton button6= (ImageButton) findViewById(R.id.imageButton6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("clicks", "button 6 has been clicked");
                startActivity(new Intent(Breather.this, BreatherFocus6.class));
            }
        });
    }

}







