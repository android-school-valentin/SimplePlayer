package com.v.simpleplayer.artist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.v.simpleplayer.R;

import java.util.ArrayList;

public class ArtistAdapter extends RecyclerView.Adapter<ArtistAdapter.ArtistViewHolder> {
    private ArrayList<Artist> artists;

    public static class ArtistViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageArtist;
        public TextView textName;

        public ArtistViewHolder(@NonNull View itemView) {
            super(itemView);
            imageArtist = itemView.findViewById(R.id.image_artist_card);
            textName = itemView.findViewById(R.id.text_artist_name_card);
        }
    }

    public ArtistAdapter(ArrayList<Artist> artists) {
        this.artists = artists;
    }

    @NonNull
    @Override
    public ArtistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_artist, parent, false);
        ArtistAdapter.ArtistViewHolder viewHolder = new ArtistAdapter.ArtistViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ArtistAdapter.ArtistViewHolder holder, int position) {
        Artist currentArtist = artists.get(position);
        holder.imageArtist.setImageResource(currentArtist.getResId());
        holder.textName.setText(currentArtist.getName());
    }

    @Override
    public int getItemCount() {
        return artists.size();
    }
}
