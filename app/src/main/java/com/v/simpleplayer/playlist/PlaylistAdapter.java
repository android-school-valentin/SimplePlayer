package com.v.simpleplayer.playlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.v.simpleplayer.R;

import java.util.ArrayList;

public class PlaylistAdapter extends RecyclerView.Adapter<PlaylistAdapter.PlaylistViewHolder> {
    ArrayList<Playlist> playlists;

    public static class PlaylistViewHolder extends RecyclerView.ViewHolder{
        public ImageView imagePlaylist;
        public TextView textName;

        public PlaylistViewHolder(@NonNull View itemView) {
            super(itemView);
            imagePlaylist = itemView.findViewById(R.id.image_playlist_card);
            textName = itemView.findViewById(R.id.text_playlist_card);
        }
    }

    public PlaylistAdapter(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    @NonNull
    @Override
    public PlaylistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_playlist, parent, false);
        PlaylistViewHolder viewHolder = new PlaylistViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PlaylistViewHolder holder, int position) {
        Playlist currentPlaylist = playlists.get(position);
        holder.imagePlaylist.setImageResource(currentPlaylist.getResId());
        holder.textName.setText(currentPlaylist.getName());
    }



    @Override
    public int getItemCount() {
        return playlists.size();
    }
}
