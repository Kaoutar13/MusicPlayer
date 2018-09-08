package com.example.android.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Locating the nowPlaying TextView
        final TextView nowPlaying = (TextView) findViewById(R.id.now_playing);

        // Set the listener to it
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

        // Creating an ArrayList of songs
        ArrayList<Song> music = new ArrayList<Song>();
        music.add(new Song("Ghosts", "Michael Jackson"));
        music.add(new Song("This is it", "Michael Jackson"));
        music.add(new Song("IDOL", "BTS"));
        music.add(new Song("MIC DROP (Remix)", "BTS"));
        music.add(new Song("Demons", "Imaginary Dragons"));
        music.add(new Song("Sitya Loss", "Eddy Kenzo"));
        music.add(new Song("Healing", "Sami Yusuf"));
        music.add(new Song("La vignette", "Mazagan"));
        music.add(new Song("Galik", "H-Kayn"));
        music.add(new Song("Jambole", "Eddy Kenzo"));
        music.add(new Song("7it 3arfini", "Shayfeen"));
        music.add(new Song("So 4 More", "BTS"));
        music.add(new Song("Dirty Diana", "Michael Jackson"));

        // Using the constructor to create the Adapter
        SongAdapter musicAdapter = new SongAdapter(this, music);

        // Locating the ListView in activity_main.xml using ID list
        final ListView playlist = (ListView) findViewById(R.id.list);

        // Attaching the ListView to the Adapter
        playlist.setAdapter(musicAdapter);

        // Set a clickListener to it to transfer to the activity_now_playing.xml and show details of the title "currently playing"
        playlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

    }
}
