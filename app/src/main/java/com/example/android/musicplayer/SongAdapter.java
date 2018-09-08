package com.example.android.musicplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    //Defining the constructor
    public SongAdapter(Activity context, ArrayList<Song> songs){
        super(context, 0, songs);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.playlist, parent, false);

        }
        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the playlist.xml layout with the ID song_title
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.song_title);
        // Get the title name from the current Song object and
        // set this text on the name TextView
        titleTextView.setText(currentSong.getTitle());

        // Find the TextView in the playlist.xml layout with the ID song_singer
        TextView singerTextView = (TextView) listItemView.findViewById(R.id.song_artist);
        // Get the singer name from the current Song object and
        // set this text on the singer TextView
        singerTextView.setText(currentSong.getArtist());

        // Find the ImageView in the playlist.xml layout with the ID list_song_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.song_icon);
        // Get the image resource ID and
        // set the image to iconView
        iconView.setImageResource(R.drawable.ballad);
            return listItemView;
    }
}
