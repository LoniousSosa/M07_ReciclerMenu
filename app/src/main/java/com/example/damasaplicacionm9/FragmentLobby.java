package com.example.damasaplicacionm9;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentLobby extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lobby,container,false);
        Button btnOpenProfile =view.findViewById(R.id.btnOpenLobby);
        btnOpenProfile.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(),LobbyActivity.class);
            startActivity(intent);
        });
        return view;
    }
}
