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
        setContentView(R.layout.activity_navigation);

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
    }

}







