package com.example.hshack.destress;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.content.*;
import android.util.*;
import android.media.*;
import android.widget.*;
import android.view.*;

public class Sounds extends AppCompatActivity {


    public MediaPlayer mpBird;
    public MediaPlayer mpOcean;
    public MediaPlayer mpCrisp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sounds);

        Log.v("tag", "Initializing sounds...");

        mpBird = MediaPlayer.create(this, R.raw.birds);
        Button play_button = (Button)this.findViewById(R.id.bird_button);
        play_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(mpBird.isPlaying())
                {
                    Log.v("tag", "Playing sound...");
                    mpBird.pause();
                }
                else
                {
                    mpBird.start();

                }

            }
        });

        mpOcean = MediaPlayer.create(this, R.raw.crisp);
        Button play_button2 = (Button)this.findViewById(R.id.crisp_button);
        play_button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(mpOcean.isPlaying())
                {
                    Log.v("tag", "Playing sound...");
                    mpOcean.pause();
                }
                else
                {
                    mpOcean.start();

                }

            }
        });

        mpCrisp = MediaPlayer.create(this, R.raw.ocean);
        Button play_button3 = (Button)this.findViewById(R.id.ocean_button);
        play_button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(mpCrisp.isPlaying())
                {
                    Log.v("tag", "Playing sound...");
                    mpCrisp.pause();
                }
                else
                {
                    mpCrisp.start();

                }

            }
        });


    }

}