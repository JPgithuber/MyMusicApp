package com.example.android.musicplayerapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer, mMediaPlayer;
    private double startTime = 0;
    private double finalTime = 0;
    public static int oneTimeOnly = 0;
    private SeekBar seekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.pista);

        Button playButton = (Button) findViewById(R.id.play_button);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        Button pauseButton = (Button) findViewById(R.id.pause_button);

        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });

        Button resetdButton = (Button) findViewById(R.id.reset_button);

        resetdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.reset();
            }
        });
    }
}
