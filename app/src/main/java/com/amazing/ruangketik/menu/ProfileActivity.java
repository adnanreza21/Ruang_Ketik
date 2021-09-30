package com.amazing.ruangketik.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amazing.ruangketik.R;
import com.amazing.ruangketik.profile.ProfileDsnActivity;
import com.amazing.ruangketik.profile.ProfileMhsActivity;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView materi01Card,materi02Card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        materi01Card = (CardView) findViewById(R.id.card1);
        materi02Card = (CardView) findViewById(R.id.card2);

        materi01Card.setOnClickListener(this);
        materi02Card.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.card1 : i = new Intent(this, ProfileMhsActivity.class);startActivity(i);break;
            case R.id.card2: i = new Intent(this, ProfileDsnActivity.class);startActivity(i);break;
            default:break;
        }
    }
}
