package com.example.nepalesehaveli;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class mem_roshan extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mem_roshan);
        setTitle("Roshan Gupta");
    }

    public void roshanSocial(View view) {
        Uri roshanUri = Uri.parse("https://www.facebook.com/arya.gupta.7165");
        Intent UriIntent = new Intent(Intent.ACTION_VIEW, roshanUri);
        startActivity(UriIntent);
    }
}

