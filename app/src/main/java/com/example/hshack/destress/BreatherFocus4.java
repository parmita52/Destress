package com.example.hshack.destress;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class BreatherFocus4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breather_focus4);

        GifImageView gifImageView = (GifImageView) findViewById(R.id.gif4);
        gifImageView.setGifImageResource(R.drawable.persong);

        gifImageView.setScaleX(2.0f);
        gifImageView.setScaleY(2.0f);

    }

}
