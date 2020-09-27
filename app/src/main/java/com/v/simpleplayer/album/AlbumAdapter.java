package com.v.simpleplayer.album;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.v.simpleplayer.R;

import java.util.ArrayList;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder> {
    private ArrayList<Album> albums;

    public static class AlbumViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageAlbum;
        public TextView textName;
        public TextView textArtistName;

        public AlbumViewHolder(@NonNull View itemView) {
            super(itemView);
            imageAlbum = itemView.findViewById(R.id.image_album_card);
            textName = itemView.findViewById(R.id.text_album_name_card);
            textArtistName = itemView.findViewById(R.id.text_album_artist_name_card);
        }
    }

    public AlbumAdapter(ArrayList<Album> albums) {
        this.albums = albums;
    }

    @NonNull
    @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_album, parent, false);
        AlbumViewHolder albumViewHolder = new AlbumViewHolder(view);
        return albumViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumViewHolder holder, int position) {
        Album currentAlbum = albums.get(position);
        holder.imageAlbum.setImageResource(currentAlbum.getResId());
        holder.textName.setText(currentAlbum.getName());
        holder.textArtistName.setText(currentAlbum.getArtistName());
    }


    @Override
    public int getItemCount() {
        return albums.size();
    }
}
