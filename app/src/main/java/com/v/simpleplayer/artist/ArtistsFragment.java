package com.v.simpleplayer.artist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.v.simpleplayer.R;

import java.util.ArrayList;


public class ArtistsFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    public ArtistsFragment() {
        // Required empty public constructor
    }


    public static ArtistsFragment newInstance() {
        ArtistsFragment fragment = new ArtistsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<Artist> artists = new ArrayList<>();
        artists.add(new Artist("Metallica", R.drawable.ic_launcher_foreground));
        artists.add(new Artist("Metallica", R.drawable.ic_launcher_foreground));
        artists.add(new Artist("Metallica", R.drawable.ic_launcher_foreground));
        artists.add(new Artist("Metallica", R.drawable.ic_launcher_foreground));
        artists.add(new Artist("Metallica", R.drawable.ic_launcher_foreground));
        artists.add(new Artist("Metallica", R.drawable.ic_launcher_foreground));
        artists.add(new Artist("Metallica", R.drawable.ic_launcher_foreground));
        artists.add(new Artist("Metallica", R.drawable.ic_launcher_foreground));
        artists.add(new Artist("Metallica", R.drawable.ic_launcher_foreground));
        artists.add(new Artist("Metallica", R.drawable.ic_launcher_foreground));
        layoutManager = new GridLayoutManager(getActivity(), 2);
        adapter = new ArtistAdapter(artists);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_artists, container, false);
        recyclerView = rootView.findViewById(R.id.recycler_view_artists_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return rootView;
    }
}