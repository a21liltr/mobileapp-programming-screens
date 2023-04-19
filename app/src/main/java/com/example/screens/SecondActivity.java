package com.example.screens;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.screens.databinding.ActivityMainBinding;
import com.example.screens.databinding.ActivityTwoBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivityTwoBinding twoBinding;
    private Button closeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        twoBinding = ActivityTwoBinding.inflate(getLayoutInflater());
        setContentView(twoBinding.getRoot());

        closeButton = twoBinding.activityTwoGoBack;
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
