package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.hellotoast.R;

public class Main2Activity extends AppCompatActivity{

    private TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        // Capture the layout's TextView and set the string as its text
        textView2 = findViewById(R.id.textView2);
        Intent intent = getIntent();
        String message = intent.getStringExtra(com.example.hellotoast.MainActivity.EXTRA_MESSAGE);
        textView2.setText(message);



    }
}
