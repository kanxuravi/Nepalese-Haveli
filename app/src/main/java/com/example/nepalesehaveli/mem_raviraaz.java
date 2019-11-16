package com.example.nepalesehaveli;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class mem_raviraaz extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mem_raviraaz);
        setTitle("Raviraaz Kushwaha");
    }

    public void ravirajSocial(View view) {
        Uri raviraazUri = Uri.parse("https://www.facebook.com/raviraj.nepal");
        Intent UriIntent = new Intent(Intent.ACTION_VIEW, raviraazUri);
        startActivity(UriIntent);
    }
}

