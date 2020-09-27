package com.v.simpleplayer.playlist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.v.simpleplayer.R;

import java.util.ArrayList;

public class PlaylistFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    public PlaylistFragment() {
        // Required empty public constructor
    }

    public static PlaylistFragment newInstance() {
        PlaylistFragment fragment = new PlaylistFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<Playlist> playlists = new ArrayList<>();
        playlists.add(new Playlist("My own playlist", R.drawable.ic_launcher_foreground));
        playlists.add(new Playlist("My own playlist", R.drawable.ic_launcher_foreground));
        playlists.add(new Playlist("My own playlist", R.drawable.ic_launcher_foreground));
        playlists.add(new Playlist("My own playlist", R.drawable.ic_launcher_foreground));
        playlists.add(new Playlist("My own playlist", R.drawable.ic_launcher_foreground));
        playlists.add(new Playlist("My own playlist", R.drawable.ic_launcher_foreground));
        playlists.add(new Playlist("My own playlist", R.drawable.ic_launcher_foreground));
        playlists.add(new Playlist("My own playlist", R.drawable.ic_launcher_foreground));
        layoutManager = new LinearLayoutManager(getActivity());
        adapter = new PlaylistAdapter(playlists);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_playlist, container, false);
        recyclerView = rootView.findViewById(R.id.recycler_view_playlists_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return rootView;
    }
}