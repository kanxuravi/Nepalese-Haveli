package com.example.nepalesehaveli;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class mem_bikash extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mem_bikash);
        setTitle("Bikash Thakur");
    }

    public void bikashSocial(View view) {
        Uri bikashUri = Uri.parse("https://www.facebook.com/profile.php?id=100007843429477");
        Intent UriIntent = new Intent(Intent.ACTION_VIEW, bikashUri);
        startActivity(UriIntent);
    }
}

