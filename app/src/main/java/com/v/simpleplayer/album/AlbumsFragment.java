package com.v.simpleplayer.album;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.v.simpleplayer.R;

import java.util.ArrayList;


public class AlbumsFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    public AlbumsFragment() {
        // Required empty public constructor
    }


    public static AlbumsFragment newInstance() {
        AlbumsFragment fragment = new AlbumsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album("Jopa", "jopa", R.drawable.ic_notification_note));
        albums.add(new Album("Jopa", "jopa", R.drawable.ic_notification_note));
        albums.add(new Album("Jopa", "jopa", R.drawable.ic_notification_note));
        albums.add(new Album("Jopa", "jopa", R.drawable.ic_notification_note));
        albums.add(new Album("Jopa", "jopa", R.drawable.ic_notification_note));
        albums.add(new Album("Jopa", "jopa", R.drawable.ic_notification_note));
        albums.add(new Album("Jopa", "jopa", R.drawable.ic_notification_note));
        albums.add(new Album("Jopa", "jopa", R.drawable.ic_notification_note));
        layoutManager = new GridLayoutManager(getActivity(), 2);
        adapter = new AlbumAdapter(albums);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_albums, container, false);
        recyclerView = rootView.findViewById(R.id.recycler_view_albums_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return rootView;
    }
}