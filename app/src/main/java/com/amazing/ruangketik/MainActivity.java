package com.amazing.ruangketik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

import com.amazing.ruangketik.materi.Materi1Activity;
import com.amazing.ruangketik.menu.DapusActivity;
import com.amazing.ruangketik.menu.KompetensiActivity;
import com.amazing.ruangketik.menu.MainQuizActivity;
import com.amazing.ruangketik.menu.MateriActivity;
import com.amazing.ruangketik.menu.ProfileActivity;
import com.amazing.ruangketik.menu.VideoActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView kikdCard,materiCard,quizCard,videoCard,dapusCard,profilCard;
    MediaPlayer audio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kikdCard = (CardView) findViewById(R.id.card1);
        materiCard = (CardView) findViewById(R.id.card2);
        videoCard = (CardView) findViewById(R.id.card3);
        quizCard = (CardView) findViewById(R.id.card4);
        dapusCard = (CardView) findViewById(R.id.card5);
        profilCard = (CardView) findViewById(R.id.card6);


        kikdCard.setOnClickListener(this);
        materiCard.setOnClickListener(this);
        videoCard.setOnClickListener(this);
        quizCard.setOnClickListener(this);
        dapusCard.setOnClickListener(this);
        profilCard.setOnClickListener(this);

        audio = MediaPlayer.create(this, R.raw.suarabelakang);
        audio.setLooping(true);
        audio.setVolume(1,1);
        audio.start();
    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.card1 : i = new Intent(this,KompetensiActivity.class);startActivity(i);break;
            case R.id.card2: i = new Intent(this,MateriActivity.class);startActivity(i);break;
            case R.id.card3 : i = new Intent(this,VideoActivity.class);startActivity(i);break;
            case R.id.card4 : i = new Intent(this,MainQuizActivity.class);startActivity(i);break;
            case R.id.card5 : i = new Intent(this,DapusActivity.class);startActivity(i);break;
            case R.id.card6 : i = new Intent(this,ProfileActivity.class);startActivity(i);break;
            default:break;
        }
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
        MainActivity.this.finish();
    }
}
