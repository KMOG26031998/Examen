package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Placeholder;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
private Placeholder placeholder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       placeholder = findViewById(R.id.placeholder);
    }
    public void swapView(View v)
    {
        Object transitionManager;
        transitionManager.beginDelayedTrons(layout);

    }
}