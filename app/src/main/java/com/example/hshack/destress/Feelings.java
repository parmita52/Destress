package com.example.hshack.destress;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.ibm.watson.developer_cloud.android.library.audio.MicrophoneInputStream;
import com.ibm.watson.developer_cloud.http.HttpMediaType;
import com.ibm.watson.developer_cloud.http.ServiceCall;
import com.ibm.watson.developer_cloud.http.ServiceCallback;
import com.ibm.watson.developer_cloud.speech_to_text.v1.SpeechToText;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.RecognizeOptions;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.SpeechModel;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.SpeechResults;
import com.ibm.watson.developer_cloud.speech_to_text.v1.websocket.BaseRecognizeCallback;

import android.media.*;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Feelings extends AppCompatActivity {

    public MediaPlayer mpOcean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feelings);

        Toast.makeText(this, "service logged in", Toast.LENGTH_SHORT).show();
        //------------------



        //-------------------






//        mpOcean = MediaPlayer.create(this, R.raw.crisp);
//        Button mic = (Button)this.findViewById(R.id.mic_button);
//        mic.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v) {
//                if(mpOcean.isPlaying())
//                {
//                    Log.v("tag", "Playing sound...");
//                    mpOcean.pause();
//                }
//                else
//                {
//                    mpOcean.start();
//
//                }
//
//            }
//        });


    }




}
