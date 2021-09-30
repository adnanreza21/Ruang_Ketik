package com.amazing.ruangketik.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.amazing.ruangketik.R;
import com.amazing.ruangketik.menu.QuizActivity;

public class PetunjukActivity extends AppCompatActivity {
    private static Button button;
    EditText name, classroom, numberclass;
    private String KEY_NAME = "NAMA";
    private String KEY_CLASSROOM = "CLASS";
    private String KEY_NUMBERCLASS = "NUMBER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petunjuk);

        name = (EditText) findViewById(R.id.edt_nama);
        classroom = (EditText) findViewById(R.id.edt_kelas);
        numberclass = (EditText) findViewById(R.id.edt_nomor);
        button = (Button) findViewById(R.id.mulai);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String nama = name.getText().toString();
                    String kelas = classroom.getText().toString();
                    String nomor = numberclass.getText().toString();
                    if (nama != null && nama != "") {
                        Intent i = new Intent(PetunjukActivity.this, QuizActivity.class);
                        i.putExtra(KEY_NAME, nama);
                        i.putExtra(KEY_CLASSROOM, kelas);
                        i.putExtra(KEY_NUMBERCLASS, nomor);
                        startActivity(i);

                    } else {
                        Toast.makeText(getApplication(), "Kamu Harus Isi Namamu !", Toast.LENGTH_SHORT);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "Cobalagi !", Toast.LENGTH_SHORT);
                }
            }
        });
    }
}