package com.example.damasaplicacionm9;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import androidx.appcompat.app.AppCompatActivity;

public class LobbyActivity extends AppCompatActivity {

    Button onlineButton,customButton, tiendaButton,puzzleButton;
    ImageButton ayudaButton,puzzledosButton,reglasDeUsoButton,settingsButton,profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);

        onlineButton = findViewById(R.id.onlineButton);
        customButton = findViewById(R.id.customButton);
        tiendaButton = findViewById(R.id.tiendaButton);
        puzzleButton = findViewById(R.id.puzzleLobby);
        ayudaButton = findViewById(R.id.imageHelp);
        puzzledosButton = findViewById(R.id.imagePuzzle);
        reglasDeUsoButton = findViewById(R.id.imageRules);
        settingsButton = findViewById(R.id.settings);
        profileButton = findViewById(R.id.profile);
        Intent intentTablero = new Intent(LobbyActivity.this,TableroActivity.class);

        onlineButton.setOnClickListener(v -> {
            startActivity(intentTablero);
        });

        customButton.setOnClickListener(v -> {
            startActivity(intentTablero);
        });

        puzzleButton.setOnClickListener(v -> {
            Intent intent = new Intent(LobbyActivity.this,PuzzleSelectionActivity.class);
            startActivity(intent);
        });

        tiendaButton.setOnClickListener(v -> {
            Intent intent = new Intent(LobbyActivity.this,ShopActivity.class);
            startActivity(intent);
        });


        puzzledosButton.setOnClickListener(v -> {
            Intent intent = new Intent(LobbyActivity.this,PuzzlesActivity.class);
            startActivity(intent);
        });

        settingsButton.setOnClickListener(this::showPopupMenu);

        profileButton.setOnClickListener(v -> {
            Intent intent = new Intent(LobbyActivity.this,ProfileActivity.class);
            startActivity(intent);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    private void showPopupMenu(View anchor) {
        PopupMenu popup = new PopupMenu(this, anchor);
        popup.getMenuInflater().inflate(R.menu.menu, popup.getMenu());
        popup.setOnMenuItemClickListener(item -> {
            if (item.getItemId() == R.id.action_lobby){
                replaceFragment(new FragmentLobby());
            }
            else if (item.getItemId()==R.id.action_profile){
                replaceFragment(new FragmentProfile());
            }
            else if (item.getItemId()==R.id.action_settings){
                replaceFragment(new FragmentFriends());
            }
            else if (item.getItemId()==R.id.action_friends){
                replaceFragment(new FragmentFriends());
            }
            else if (item.getItemId()==R.id.action_logout){
                return true;
            }
            return false;

        });
        popup.show();
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragmentContainer, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private void logout() {
        // Redirigir al usuario a la pantalla de inicio de sesión
        Intent intent = new Intent(this, LogInActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }

}