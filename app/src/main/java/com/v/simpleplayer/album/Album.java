package com.v.simpleplayer.album;

import java.util.ArrayList;

public class Album {
    private String name;
    private String artistName;
    private int resId;

    public Album(String name, String artistName, int resId) {
        this.name = name;
        this.artistName = artistName;
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public String getArtistName() {
        return artistName;
    }

    public int getResId() {
        return resId;
    }
}
