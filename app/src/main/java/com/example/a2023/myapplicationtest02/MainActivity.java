package com.example.a2023.myapplicationtest02;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"sssfs",Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,"aaaaa",Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,"aaaaa",Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,"aaaaa",Toast.LENGTH_LONG).show();
            }
        });

    }
}
