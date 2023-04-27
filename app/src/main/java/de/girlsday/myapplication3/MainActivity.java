package de.girlsday.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mainmusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainmusic = MediaPlayer.create(MainActivity.this, R.raw.mainmusic);
        Button iAmAButton = findViewById(R.id.button);

        iAmAButton.setOnClickListener(view -> {
            iAmAButton.setText("Clicked");

        });
        playMusic();
    }

    private void playMusic() {
        mainmusic.start();
    }
}