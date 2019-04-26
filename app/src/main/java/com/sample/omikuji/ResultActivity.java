package com.sample.omikuji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ResultActivity extends AppCompatActivity {

    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        doOmikuji();
        //
    }

    private void doOmikuji() {
        TextView textView = findViewById(R.id.text);
        boolean isDaikichi = random.nextBoolean();
        if (isDaikichi) {
            textView.setText("大吉");
        } else {
            textView.setText("凶");
        }
    }
}

