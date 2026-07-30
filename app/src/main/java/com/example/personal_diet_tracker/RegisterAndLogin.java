package com.example.personal_diet_tracker;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class RegisterAndLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register_and_login);


        Button register = findViewById(R.id.buttonRegisterLog);
        register.setOnClickListener(view -> {
            Intent intent = new Intent(RegisterAndLogin.this, Register.class);
            startActivity(intent);
        });
    }
}