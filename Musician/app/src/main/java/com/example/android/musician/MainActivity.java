package com.example.android.musician;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView musics=(TextView)findViewById(R.id.track);
        musics.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent musicsintent = new Intent(MainActivity.this,Music.class);
                startActivity(musicsintent);
            }
        });


        TextView album=(TextView)findViewById(R.id.album);
        album.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent albumintent = new Intent(MainActivity.this,Album.class);
                startActivity(albumintent);
            }
        });
        TextView artists=(TextView)findViewById(R.id.artist);
        artists.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent numbersintent = new Intent(MainActivity.this,Artist.class);
                startActivity(numbersintent);
            }
        });

        TextView store=(TextView)findViewById(R.id.store);
        store.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent storeintent = new Intent(MainActivity.this,Online.class);
                startActivity(storeintent);
            }
        });

        TextView detail=(TextView)findViewById(R.id.nowplaying);
        detail.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent detailintent = new Intent(MainActivity.this,Detail.class);
                startActivity(detailintent);
            }
        });

    }
}
