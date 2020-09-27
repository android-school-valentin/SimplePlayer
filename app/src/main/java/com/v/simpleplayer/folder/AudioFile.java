package com.v.simpleplayer.folder;

import android.net.Uri;

import java.net.URI;

public class AudioFile {
    private final Uri uri;
    private final String name;
    private final int size;

    public AudioFile(Uri uri, String name, int size) {
        this.uri = uri;
        this.name = name;
        this.size = size;
    }

    public Uri getUri() {
        return uri;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

}
