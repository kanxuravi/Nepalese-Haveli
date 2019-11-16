package com.example.nepalesehaveli;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class mem_aman extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mem_aman);
        setTitle("Aman Gupta");
    }

        public void amanSocial(View view) {
            Uri amanUri = Uri.parse("https://www.facebook.com/profile.php?id=100002391116501");
            Intent UriIntent = new Intent(Intent.ACTION_VIEW, amanUri);
            startActivity(UriIntent);
        }
    }

