package com.example.imageviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.imageviewer.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.cat.setOnClickListener(v -> {
            binding.pic.setImageResource(R.drawable.cat);
        });

        binding.dog.setOnClickListener(v -> {
            binding.pic.setImageResource(R.drawable.dog);
        });

        binding.rabbit.setOnClickListener(v -> {
            binding.pic.setImageResource(R.drawable.rabbit);
        });
    }
}