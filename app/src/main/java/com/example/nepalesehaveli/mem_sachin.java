package com.example.nepalesehaveli;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class mem_sachin extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mem_sachin);
        setTitle("Sachin Gupta");
    }

    public void sachinSocial(View view) {
        Uri sachinUri = Uri.parse("https://www.facebook.com/profile.php?id=100038035921356");
        Intent UriIntent = new Intent(Intent.ACTION_VIEW, sachinUri);
        startActivity(UriIntent);
    }
}

