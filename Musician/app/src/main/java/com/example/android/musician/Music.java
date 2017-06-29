package com.example.android.musician;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.id;
import static android.os.Build.VERSION_CODES.M;

public class Music extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        Button a=(Button)findViewById(R.id.song);
        a.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent numbersintent = new Intent(Music.this,Detail.class);
                startActivity(numbersintent);
            }
        });
    }
}
