package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.screens.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Button goToActivityTwo;
    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        goToActivityTwo = binding.activityMainGoToActivityTwo;
        text = binding.editText;
        goToActivityTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = text.getText().toString();
                passData(input);
            }
        });
    }

    private void passData(String input) {
        String str = input;
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("keyInput", str);
        startActivity(intent);
    }
}
