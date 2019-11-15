package com.example.nepalesehaveli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendToMember(View view) {
        Intent member = new Intent(MainActivity.this,members.class);
        startActivity(member);
    }

    public void about(View view) {
        Intent abouts = new Intent(MainActivity.this,aboutus.class);
        startActivity(abouts);
    }

    public void gallery(View view) {
        Intent photos = new Intent(MainActivity.this,gallery.class);
        startActivity(photos);
    }
}
