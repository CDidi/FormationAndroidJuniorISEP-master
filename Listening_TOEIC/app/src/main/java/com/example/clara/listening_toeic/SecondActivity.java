package com.example.clara.listening_toeic;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;

/**
 * Created by Clara on 30/04/2015.
 */
public class SecondActivity extends ActionBarActivity{

    MediaPlayer player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player2 = MediaPlayer.create(SecondActivity.this,R.raw.slowmotion);
                player2.start();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player2.stop();
            }
        });

    }
}

