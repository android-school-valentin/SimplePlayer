package com.v.simpleplayer.music;

public class Track {
    private String name;
    private String artistName;
    private int duration; // in seconds
    private int resId;

    public Track(String name, String artistName, int duration, int resId) {
        this.name = name;
        this.artistName = artistName;
        this.duration = duration;
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public String getArtistName() {
        return artistName;
    }

    public int getDuration() {
        return duration;
    }

    public int getResId() {
        return resId;
    }

}
