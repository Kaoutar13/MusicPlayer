package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Locating the library TextView
        TextView library = (TextView) findViewById(R.id.library);

        // Set listener on the View
        library.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(NowPlaying.this, MainActivity.class);
                startActivity(libraryIntent);
            }
        });

        // Locating the ImageView of the play/pause
       final ImageView playPause = (ImageView) findViewById(R.id.play_pause);
        playPause.setImageResource(R.drawable.playbutton);

        playPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playPause.setImageResource(R.drawable.pause);
            }
        });
        // Locating the song_title and song_artist TextViews
       final TextView title = (TextView) findViewById(R.id.song_title);
       final TextView artist = (TextView) findViewById(R.id.song_artist);

        // Locating the next and previous views
        ImageView next = (ImageView) findViewById(R.id.next);
        ImageView previous = (ImageView) findViewById(R.id.previous);

        //Setting a listener to each of them
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            title.setText(getString(R.string.idol));
            artist.setText(getString(R.string.bts));
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title.setText(getString(R.string.ghosts));
                artist.setText(getString(R.string.michael_jackson));
            }
        });
    }

}
