package com.example.personal_diet_tracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

        ImageView backButton = findViewById(R.id.imageBackButton);
        backButton.setOnClickListener(view -> {
            Intent intent = new Intent(Register.this, RegisterAndLogin.class);
            startActivity(intent);
        });

    }

    public void onButtonClick(View view) {
        Toast.makeText(this, "Back to Welcome Page", Toast.LENGTH_SHORT).show();
    }
}