package com.example.hshack.destress;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class BreatherFocus6 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breather_focus6);

        GifImageView gifImageView = (GifImageView) findViewById(R.id.gif6);
        gifImageView.setGifImageResource(R.drawable.shapesg);

        gifImageView.setScaleX(2.0f);
        gifImageView.setScaleY(2.0f);

    }

}
