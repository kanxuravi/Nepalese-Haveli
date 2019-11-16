package com.example.nepalesehaveli;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class mem_ravi extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mem_ravi);
        setTitle("Ravi Kumar Sah");
    }

    public void raviSocial(View view) {
        Uri raviUri = Uri.parse("https://www.google.com/search?q=kanxuravi&oq=kanxuravi");
        Intent UriIntent = new Intent(Intent.ACTION_VIEW, raviUri);
        startActivity(UriIntent);
    }
}
