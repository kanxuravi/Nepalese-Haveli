package com.example.nepalesehaveli;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class mem_pawan extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mem_pawan);
        setTitle("Pawan Gupta");
    }

    public void pawanSocial(View view) {
        Uri pawanUri = Uri.parse("https://www.facebook.com/hancy.pawan2");
        Intent UriIntent = new Intent(Intent.ACTION_VIEW, pawanUri);
        startActivity(UriIntent);
    }
}

