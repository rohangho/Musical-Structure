package com.example.android.musician;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.os.Build.VERSION_CODES.M;

public class Online extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online);


        Button a=(Button)findViewById(R.id.online);
        a.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent numbers = new Intent(Online.this,Detail.class);
                startActivity(numbers);
            }
        });


    }
}
