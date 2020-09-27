package com.v.simpleplayer.artist;

import java.util.ArrayList;

public class Artist {
    private String name;
    private int resId;
    //private ArrayList<Album> albums;
    //private ArrayList<Track> tracks;

    public Artist(String name, int resId) {
        this.name = name;
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public int getResId() {
        return resId;
    }
}
