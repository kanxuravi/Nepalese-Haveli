package com.example.nepalesehaveli;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class mem_kanhaiya extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mem_kanhaiya);
        setTitle("Kanhaiya Shah");
    }

    public void kanhaiyaSocial(View view) {
        Uri kanhaiyaUri = Uri.parse("https://www.facebook.com/kanhaiyasah.kanhaiyasah");
        Intent UriIntent = new Intent(Intent.ACTION_VIEW, kanhaiyaUri);
        startActivity(UriIntent);
    }
}

