package com.example.hshack.destress;

import android.content.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button breathing = (Button) findViewById(R.id.breathing_button);
        breathing.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Breather.class));
            }
        });

        Button messages = (Button) findViewById(R.id.messages_button);
        messages.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Messages.class));
            }
        });

        Button notifications = (Button) findViewById(R.id.notifications_button);
        notifications.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Notifications.class));
            }
        });

        Button sounds = (Button) findViewById(R.id.sounds_button);
        sounds.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Sounds.class));
            }
        });
    }
}
