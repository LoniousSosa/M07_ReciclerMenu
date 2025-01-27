package com.example.damasaplicacionm9;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class FriendsActivity extends AppCompatActivity {

    private RecyclerView friendsRecyclerView;
    private AdaptadorAmigos adaptadorAmigos;
    private List<Amigo> friendsList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        // Inicializar RecyclerView
        friendsRecyclerView = findViewById(R.id.friendsRecyclerView);
        friendsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Crear la lista de amigos
        friendsList = getFriendsList();

        // Configurar el adaptador
        adaptadorAmigos = new AdaptadorAmigos(friendsList);
        friendsRecyclerView.setAdapter(adaptadorAmigos);
    }

    /**
     * Método para crear una lista de amigos con datos de ejemplo
     */
    private List<Amigo> getFriendsList() {
        List<Amigo> friends = new ArrayList<>();
        friends.add(new Amigo("Juan Pérez", "Conectado", R.drawable.default_profile));
        friends.add(new Amigo("María López", "Ausente", R.drawable.default_profile));
        friends.add(new Amigo("Carlos Gómez", "Ocupado", R.drawable.default_profile));
        friends.add(new Amigo("Ana Torres", "Disponible", R.drawable.default_profile));
        friends.add(new Amigo("Luis Martínez", "Offline", R.drawable.default_profile));
        return friends;
    }
}
