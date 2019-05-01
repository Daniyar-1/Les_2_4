package com.example.my1_stproject;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.сhange_button);
        final TextView tv1 = findViewById(R.id.text2);

        final TextView tv2 = findViewById(R.id.change_text);
        final Button btn2 = findViewById(R.id.second_button);

        final TextView tv3 = findViewById(R.id.text3);
        final Button btn3 = findViewById(R.id.third_button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("Congratulations");
                btn.setText("Ура!");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText("How do you do?");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv3.setBackgroundColor(Color.YELLOW);
                btn3.setText("Successfully");
            }
        });
    }
    }

