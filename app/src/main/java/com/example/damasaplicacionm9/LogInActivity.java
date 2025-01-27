package com.example.damasaplicacionm9;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LogInActivity extends AppCompatActivity {
    private EditText etUsername, etPassword;
    Button singInButton;
    /*
    private DataBaseAPP db;

     */
    String username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        singInButton = findViewById(R.id.signInButton);
        singInButton.setOnClickListener(v -> {
            Intent intent = new Intent(LogInActivity.this,LobbyActivity.class);
            startActivity(intent);
        });
    }
}