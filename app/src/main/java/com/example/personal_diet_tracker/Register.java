package com.example.personal_diet_tracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

        Button registerButton = findViewById(R.id.buttonRegisterReg);
        registerButton.setOnClickListener(view -> {
            EditText userName = findViewById(R.id.editUserNameReg);
            String userNameText = userName.getText().toString();

            EditText password = findViewById(R.id.editPasswordReg);
            String passwordText = password.getText().toString();

            if (userNameText.isEmpty() && passwordText.isEmpty()) {
                Toast.makeText(this, "Please enter valid input", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Yay!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void onButtonClick(View view) {
        Toast.makeText(this, "Back to Welcome Page", Toast.LENGTH_SHORT).show();
    }
}