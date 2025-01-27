package com.example.damasaplicacionm9;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button signIn;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signIn = findViewById(R.id.signInButtonMain);
        register = findViewById(R.id.registerButtonMain);

        signIn.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,LogInActivity.class);
            startActivity(intent);
        });

        register.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
            startActivity(intent);
        });
    }
}