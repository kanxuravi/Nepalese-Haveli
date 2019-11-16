package com.example.nepalesehaveli;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class mem_manoj extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mem_manoj);
        setTitle("Manoj Patel");
    }

    public void manojSocial(View view) {
        Uri manojUri = Uri.parse("https://www.facebook.com/love.manoj.94");
        Intent UriIntent = new Intent(Intent.ACTION_VIEW, manojUri);
        startActivity(UriIntent);
    }
}

