package com.v.simpleplayer.music;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.v.simpleplayer.R;

import java.util.ArrayList;

public class TrackAdapter extends RecyclerView.Adapter<TrackAdapter.TrackViewHolder>  {
    private ArrayList<Track> tracks;

    public static class TrackViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageAlbum;
        public TextView textName;
        public TextView textArtistName;

        public TrackViewHolder(@NonNull View itemView) {
            super(itemView);
            imageAlbum = itemView.findViewById(R.id.image_album);
            textName = itemView.findViewById(R.id.text_track_name);
            textArtistName = itemView.findViewById(R.id.text_artist_name_duration);
        }
    }

    public TrackAdapter(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    @NonNull
    @Override
    public TrackViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_track, parent, false);
        TrackViewHolder viewHolder = new TrackViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TrackViewHolder holder, int position) {
        Track currentTrack = tracks.get(position);
        holder.imageAlbum.setImageResource(currentTrack.getResId());
        holder.textName.setText(currentTrack.getName());
        holder.textArtistName.setText(currentTrack.getArtistName() + "*" + currentTrack.getDuration());
    }

    @Override
    public int getItemCount() {
        return tracks.size();
    }
}
