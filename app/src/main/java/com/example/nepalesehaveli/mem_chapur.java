package com.example.nepalesehaveli;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class mem_chapur extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mem_chapur);
        setTitle("Roshan Shah");
    }

    public void chapurSocial(View view) {
        Uri chapurUri = Uri.parse("https://www.facebook.com/Hrrishava");
        Intent UriIntent = new Intent(Intent.ACTION_VIEW, chapurUri);
        startActivity(UriIntent);
    }
}

