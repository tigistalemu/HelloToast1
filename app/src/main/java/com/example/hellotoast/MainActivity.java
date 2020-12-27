package com.example.hellotoast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hellotoast.R;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    private int count1=0;
    private Button button1;
    private Button button2;
    private TextView textView1;
    private String toast1;
    private Intent  intent;


    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1=findViewById(R.id.textView1);

    }

    public void sayHello(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        // textView1 = (TextView) findViewById(R.id.textView1);
        String message = textView1.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

        //Toast toast=Toast.makeText((this,"HELLO:"+textView1.getText()));
        Toast.makeText(this, "HELLO:"+textView1.getText(), Toast.LENGTH_LONG).show();
    }

    public void count(View view) {
        ++count1;
        if(textView1.getText()!=null)
        {
            textView1.setText(Integer.toString(count1));
        }
    }
}
