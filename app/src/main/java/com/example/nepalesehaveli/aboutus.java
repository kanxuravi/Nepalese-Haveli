package com.example.nepalesehaveli;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class aboutus extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus);
        setTitle("About Nepalese Haveli");
    }

    public void locate(View view) {
        Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Nepalese+Haveli/@30.3534558,77.8863518,17z/data=!3m1!4b1!4m5!3m4!1s0x390f2b9a3e3dbfbf:0x255fb93100b56d83!8m2!3d30.3534512!4d77.8885405");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}
