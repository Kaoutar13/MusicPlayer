package com.example.android.musicplayer;

import android.media.Image;
import android.widget.ImageView;

public class Song {
    //Declaring the fields
    private String mTitle;
    private String mArtist;

    // The constructor
    public Song(String songTitle, String songArtist) {
        mTitle = songTitle;
        mArtist = songArtist;
    }

    // Defining the methods
    public String getTitle(){
        return mTitle;
    }
    public String getArtist(){
        return mArtist;
    }
}

