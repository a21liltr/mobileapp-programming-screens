package com.example.screens;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.screens.databinding.ActivityMainBinding;
import com.example.screens.databinding.ActivityTwoBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivityTwoBinding twoBinding;
    private Button closeButton;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        twoBinding = ActivityTwoBinding.inflate(getLayoutInflater());
        setContentView(twoBinding.getRoot());

        closeButton = twoBinding.activityTwoGoBack;
        output = twoBinding.activityTwoOutput;

        String input = getIntent().getStringExtra("keyInput");

        output.setText(input);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
