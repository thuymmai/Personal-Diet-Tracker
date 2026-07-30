package com.example.personal_diet_tracker;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_homepage);

        Button buttonViewMeal = findViewById(R.id.buttonViewMeal);
        buttonViewMeal.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), ViewMeal.class);
            startActivity(intent);
        });
    }
}