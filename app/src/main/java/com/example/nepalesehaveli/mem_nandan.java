package com.example.nepalesehaveli;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class mem_nandan extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mem_nandan);
        setTitle("Nandan Chaurasiya");
    }

    public void nandanSocial(View view) {
        Uri nandanUri = Uri.parse("https://www.facebook.com/nandan.chaurasiya.37");
        Intent UriIntent = new Intent(Intent.ACTION_VIEW, nandanUri);
        startActivity(UriIntent);
    }
}

