package com.v.simpleplayer.music;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.v.simpleplayer.R;

import java.util.ArrayList;


public class MusicFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    public MusicFragment() {
        // Required empty public constructor
    }


    public static MusicFragment newInstance() {
        return new MusicFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(new Track("loooooooong name", "artist name", 3600, R.drawable.ic_notification_note));
        tracks.add(new Track("loooooooong name", "artist name", 3600, R.drawable.ic_notification_note));
        tracks.add(new Track("loooooooong name", "artist name", 3600, R.drawable.ic_notification_note));
        tracks.add(new Track("loooooooong name", "artist name", 3600, R.drawable.ic_launcher_foreground));
        tracks.add(new Track("loooooooong name", "artist name", 3600, R.drawable.ic_launcher_foreground));
        tracks.add(new Track("loooooooong name", "artist name", 3600, R.drawable.ic_launcher_foreground));
        tracks.add(new Track("loooooooong name", "artist name", 3600, R.drawable.ic_launcher_foreground));
        tracks.add(new Track("loooooooong name", "artist name", 3600, R.drawable.ic_launcher_foreground));
        tracks.add(new Track("loooooooong name", "artist name", 3600, R.drawable.ic_launcher_foreground));
        tracks.add(new Track("loooooooong name", "artist name", 3600, R.drawable.ic_launcher_foreground));
        tracks.add(new Track("loooooooong name", "artist name", 3600, R.drawable.ic_launcher_foreground));
        tracks.add(new Track("loooooooong name", "artist name", 3600, R.drawable.ic_launcher_foreground));
        layoutManager = new LinearLayoutManager(getActivity());
        adapter = new TrackAdapter(tracks);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_music, container, false);
        recyclerView = rootView.findViewById(R.id.recycler_view_music_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return rootView;
    }
}