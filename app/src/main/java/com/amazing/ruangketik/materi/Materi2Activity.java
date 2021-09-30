package com.amazing.ruangketik.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

import com.amazing.ruangketik.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class Materi2Activity extends AppCompatActivity {
    ImageView GambarGif1;
    MediaPlayer audio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi2);
        GambarGif1 = (ImageView) findViewById(R.id.gifsatu);

        Glide.with(Materi2Activity.this)
                // LOAD URL DARI LOKAL DRAWABLE
                .load(R.drawable.gifsatu)
                .asGif()
                //PENGATURAN CACHE
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(GambarGif1);

        audio = MediaPlayer.create(this, R.raw.mengetik10jari);
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
        Materi2Activity.this.finish();
    }
}
