package com.example.checkbox_basic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox c1, c2, c3, c4, c5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = findViewById(R.id.androidcheckBox);
        c1.setOnClickListener(this);
        c2 = findViewById(R.id.javacheckBox3);
        c2.setOnClickListener(this);
        c3 = findViewById(R.id.phpcheckBox4);
        c3.setOnClickListener(this);
        c4 = findViewById(R.id.pythoncheckBox5);
        c4.setOnClickListener(this);
        c5 = findViewById(R.id.unitycheckBox6);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.androidcheckBox:
                if (c1.isChecked())
                    Toast.makeText(MainActivity.this, "Android", Toast.LENGTH_SHORT).show();
                break;
            case R.id.javacheckBox3:
                if (c2.isChecked())
                    Toast.makeText(MainActivity.this, "Java", Toast.LENGTH_SHORT).show();
                break;

            case R.id.phpcheckBox4:
                if (c3.isChecked())
                    Toast.makeText(MainActivity.this, "php", Toast.LENGTH_SHORT).show();
                break;
            case R.id.pythoncheckBox5:
                if (c4.isChecked())
                    Toast.makeText(MainActivity.this, "python", Toast.LENGTH_SHORT).show();
                break;
            case R.id.unitycheckBox6:
                if (c5.isChecked())
                    Toast.makeText(MainActivity.this, "unity   ", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
