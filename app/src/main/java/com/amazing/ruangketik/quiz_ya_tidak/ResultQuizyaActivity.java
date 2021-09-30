package com.amazing.ruangketik.quiz_ya_tidak;

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
import com.amazing.ruangketik.quiz.ResultQuizActivity;

public class ResultQuizyaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_quizya);
        TextView txtScore = (TextView) findViewById(R.id.textScore);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        double a = 20;
        txtScore.setText("Nilaimu :\n" + score*a);


    }

    public void onClick(View view) {
        Intent intent = new Intent(ResultQuizyaActivity.this, QuizyaActivity.class);
        startActivity(intent);
        finish();
    }
}