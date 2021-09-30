package com.amazing.ruangketik.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.amazing.ruangketik.R;
import com.amazing.ruangketik.menu.QuizActivity;

public class ResultQuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_quiz);

        TextView txtScore = (TextView) findViewById(R.id.textScore);
//        TextView txtKKM = (TextView) findViewById(R.id.textKKM);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        int a = 20;
        int b = a/3;
        txtScore.setText("Nilaimu :\n" + score*b);

    }

    public void onClick(View view) {
        Intent intent = new Intent(ResultQuizActivity.this, QuizActivity.class);
        startActivity(intent);
        finish();
    }
}