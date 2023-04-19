package com.example.screens;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.screens.databinding.ActivityMainBinding;
import com.example.screens.databinding.ActivityTwoBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivityTwoBinding twoBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        twoBinding = ActivityTwoBinding.inflate(getLayoutInflater());
        setContentView(twoBinding.getRoot());
    }
}
