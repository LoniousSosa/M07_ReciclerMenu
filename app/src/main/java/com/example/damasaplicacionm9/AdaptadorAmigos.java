package com.example.damasaplicacionm9;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AdaptadorAmigos extends RecyclerView.Adapter<AdaptadorAmigos.AmigoViewHolder> {

    private final List<Amigo> amigosList;

    public AdaptadorAmigos(List<Amigo> amigosList) {
        this.amigosList = amigosList;
    }

    @NonNull
    @Override
    public AmigoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_friend, parent, false);
        return new AmigoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AmigoViewHolder holder, int position) {
        Amigo amigo = amigosList.get(position);
        holder.friendNameTextView.setText(amigo.getName());
        holder.friendStatusTextView.setText(amigo.getStatus());
        holder.profileImageView.setImageResource(amigo.getImageResource());

        holder.inviteButton.setOnClickListener(v -> {
            // Acción al presionar el botón INVITAR
        });
    }

    @Override
    public int getItemCount() {
        return amigosList.size();
    }

    static class AmigoViewHolder extends RecyclerView.ViewHolder {
        TextView friendNameTextView;
        TextView friendStatusTextView;
        ImageView profileImageView;
        Button inviteButton;

        public AmigoViewHolder(@NonNull View itemView) {
            super(itemView);
            friendNameTextView = itemView.findViewById(R.id.holderName);
            friendStatusTextView = itemView.findViewById(R.id.friendStatus);
            profileImageView = itemView.findViewById(R.id.friendAvatar);
            inviteButton = itemView.findViewById(R.id.actionButton);
        }
    }
}

