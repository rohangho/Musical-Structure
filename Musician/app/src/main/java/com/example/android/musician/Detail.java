package com.example.android.musician;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Button a=(Button)findViewById(R.id.detail);
        a.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent numbers = new Intent(Detail.this,MainActivity.class);
                startActivity(numbers);
            }
        });

    }
}
