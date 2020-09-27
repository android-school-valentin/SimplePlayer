package com.v.simpleplayer.playlist;

public class Playlist {
    private String name;
    private int resId;

    public Playlist(String name, int resId) {
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
