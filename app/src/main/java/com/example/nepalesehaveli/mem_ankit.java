package com.example.nepalesehaveli;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class mem_ankit extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mem_ankit);
        setTitle("Ankit Gupta");
    }

    public void ankitSocial(View view) {
        Uri ankitUri = Uri.parse("https://www.facebook.com/profile.php?id=100008229043378");
        Intent UriIntent = new Intent(Intent.ACTION_VIEW, ankitUri);
        startActivity(UriIntent);
    }
}

