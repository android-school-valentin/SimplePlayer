package com.v.simpleplayer.folder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.v.simpleplayer.R;

import java.util.ArrayList;

public class AudioFilesAdapter extends RecyclerView.Adapter<AudioFilesAdapter.AudioFileViewHolder> {
    private ArrayList<AudioFile> audioFiles;

    public static class AudioFileViewHolder extends RecyclerView.ViewHolder {

        ImageView imageAudioFile;
        TextView textAudioFileName;
        TextView  textAudioFileSize;

        public AudioFileViewHolder(@NonNull View itemView) {
            super(itemView);
            imageAudioFile = itemView.findViewById(R.id.image_audiofile_card);
            textAudioFileName = itemView.findViewById(R.id.text_audiofile_name_card);
            textAudioFileSize = itemView.findViewById(R.id.text_audiofile_size_card);
        }
    }
    public AudioFilesAdapter(ArrayList<AudioFile> audioFiles) {
        this.audioFiles = audioFiles;
    }

    @NonNull
    @Override
    public AudioFileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_audiofile, parent, false);
        AudioFilesAdapter.AudioFileViewHolder viewHolder = new AudioFilesAdapter.AudioFileViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AudioFileViewHolder holder, int position) {
        AudioFile currentAudioFile = audioFiles.get(position);
        holder.imageAudioFile.setImageResource(R.drawable.ic_notification_note);
        holder.textAudioFileName.setText(currentAudioFile.getName());
        holder.textAudioFileSize.setText(String.valueOf(currentAudioFile.getSize()));
    }

    @Override
    public int getItemCount() {
        return audioFiles.size();
    }
}
