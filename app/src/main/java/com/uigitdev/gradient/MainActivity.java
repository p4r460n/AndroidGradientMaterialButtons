package com.uigitdev.gradient;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout gradient_button_1;
    private RelativeLayout gradient_button_2;
    private RelativeLayout gradient_button_3;
    private RelativeLayout gradient_button_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setType();
        setButtonClicks();
    }

    private void setType() {
        gradient_button_1 = findViewById(R.id.gradient_button_1);
        gradient_button_2 = findViewById(R.id.gradient_button_2);
        gradient_button_3 = findViewById(R.id.gradient_button_3);
        gradient_button_4 = findViewById(R.id.gradient_button_4);
    }

    private void setButtonClicks() {
        gradient_button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.button_title_1), Toast.LENGTH_LONG).show();
            }
        });

        gradient_button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.button_title_2), Toast.LENGTH_LONG).show();
            }
        });

        gradient_button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.button_title_3), Toast.LENGTH_LONG).show();
            }
        });

        gradient_button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.button_title_4), Toast.LENGTH_LONG).show();
            }
        });
    }
}
