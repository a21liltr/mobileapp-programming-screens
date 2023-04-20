package com.example.screens;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.screens.databinding.ActivityTwoBinding;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.example.screens.databinding.ActivityTwoBinding twoBinding = ActivityTwoBinding.inflate(getLayoutInflater());
        setContentView(twoBinding.getRoot());

        Button closeButton = twoBinding.activityTwoGoBack;
        TextView output = twoBinding.activityTwoOutput;

        Random rand = new Random();
        int upperbound = 250;
        int years = rand.nextInt(upperbound);

        String input = getIntent().getStringExtra("keyInput");

        output.setText(input.toUpperCase() + ", they were " + years + " old!");
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
