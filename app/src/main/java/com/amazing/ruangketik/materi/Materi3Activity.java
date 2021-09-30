package com.amazing.ruangketik.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

import com.amazing.ruangketik.R;

public class Materi3Activity extends AppCompatActivity {
    MediaPlayer audio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi3);
        audio = MediaPlayer.create(this, R.raw.caramengetikkeyboard);
        audio.setLooping(true);
        audio.setVolume(0,0);
        audio.start();
    }

    public void onToggleClicked(View view) {
        boolean on = ((ToggleButton)view).isChecked();

        if (on){
            audio.setVolume(0,0);
        }
        else {
            audio.setVolume(1,1);
        }
    }
    public void onBackPressed(){
        audio.stop();
        Materi3Activity.this.finish();
    }
}
