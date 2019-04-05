package com.example.bspi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void creditsActivity(View view) {

        Intent intent = new Intent(MainActivity.this, CreditsActivity.class);
        startActivity(intent);

    }

    public void aboutActivity(View view) {

        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);

    }

    public void cgpaCalculatorActivity(View view) {

        Intent intent = new Intent(MainActivity.this, CgpaCalculatorActivity.class);
        startActivity(intent);

    }

    public void browserActivity(View view) {

        Intent intent = new Intent(MainActivity.this, BrowserActivity.class);
        startActivity(intent);

    }
}
