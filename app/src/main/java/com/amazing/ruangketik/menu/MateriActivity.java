package com.amazing.ruangketik.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amazing.ruangketik.R;
import com.amazing.ruangketik.materi.Materi1Activity;
import com.amazing.ruangketik.materi.Materi2Activity;
import com.amazing.ruangketik.materi.Materi3Activity;

public class MateriActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView materi01Card,materi02Card,materi03Card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
        materi01Card = (CardView) findViewById(R.id.card1);
        materi02Card = (CardView) findViewById(R.id.card2);
        materi03Card = (CardView) findViewById(R.id.card3);

        materi01Card.setOnClickListener(this);
        materi02Card.setOnClickListener(this);
        materi03Card.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.card1 : i = new Intent(this,Materi1Activity.class);startActivity(i);break;
            case R.id.card2: i = new Intent(this,Materi2Activity.class);startActivity(i);break;
            case R.id.card3 : i = new Intent(this,Materi3Activity.class);startActivity(i);break;
            default:break;
        }
    }
}
