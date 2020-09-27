package com.v.simpleplayer.folder;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.v.simpleplayer.R;
import com.v.simpleplayer.music.TrackAdapter;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Logger;


public class FilesFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    public FilesFragment() {
        // Required empty public constructor
    }


    public static FilesFragment newInstance() {
        FilesFragment fragment = new FilesFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<AudioFile> audioFiles = getAudioFilesList(getActivity());
        audioFiles.add(new AudioFile(null, "Name", 14));
        layoutManager = new LinearLayoutManager(getActivity());
        adapter = new AudioFilesAdapter(audioFiles);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_files, container, false);
        recyclerView = rootView.findViewById(R.id.recycler_view_audiofiles_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return rootView;
    }

    //TODO FIX empty arraylist
    private ArrayList<AudioFile> getAudioFilesList(Context context) {
        ArrayList<AudioFile> audioFiles = new ArrayList<>();
        String[] projection = new String[] {
                MediaStore.Audio.Media._ID,
                MediaStore.Audio.Media.DISPLAY_NAME,
                MediaStore.Video.Media.SIZE
        };

        Cursor cursor = context.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, projection, null, null, null);
        int idColumn = cursor.getColumnIndexOrThrow(MediaStore.Audio.Media._ID);
        int nameColumn = cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DISPLAY_NAME);
        int sizeColumn = cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.SIZE);
        while (cursor.moveToNext()) {
            // Get values of columns for a given video.
            long id = cursor.getLong(idColumn);
            String name = cursor.getString(nameColumn);
            int size = cursor.getInt(sizeColumn);

            Uri contentUri = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, id);

            // Stores column values and the contentUri in a local object
            // that represents the media file.
            audioFiles.add(new AudioFile(contentUri, name, size));
        }
        return audioFiles;
    }

}