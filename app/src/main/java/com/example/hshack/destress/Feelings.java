package com.example.hshack.destress;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Feelings extends AppCompatActivity {

    public MediaPlayer mpOcean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feelings);

        mpOcean = MediaPlayer.create(this, R.raw.crisp);
        Button mic = (Button)this.findViewById(R.id.mic_button);
        mic.setOnClickListener(new View.OnClickListener() {

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


    }




}
