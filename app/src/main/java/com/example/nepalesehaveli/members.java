package com.example.nepalesehaveli;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class members extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.members);
        setTitle("Members of Nepalese Haveli");
    }

    public void chapurInfo(View view) {
        Intent myIntent = new Intent(members.this,mem_chapur.class);
        startActivity(myIntent);
    }

    public void pawanInfo(View view) {
        Intent myIntent = new Intent(members.this,mem_pawan.class);
        startActivity(myIntent);
    }

    public void ankitInfo(View view) {
        Intent myIntent = new Intent(members.this,mem_ankit.class);
        startActivity(myIntent);
    }

    public void manojInfo(View view) {
        Intent myIntent = new Intent(members.this,mem_manoj.class);
        startActivity(myIntent);
    }

    public void bikashInfo(View view) {
        Intent myIntent = new Intent(members.this,mem_bikash.class);
        startActivity(myIntent);
    }

    public void kanhaiyaInfo(View view) {
        Intent myIntent = new Intent(members.this,mem_kanhaiya.class);
        startActivity(myIntent);
    }

    public void amanInfo(View view) {
        Intent myIntent = new Intent(members.this,mem_aman.class);
        startActivity(myIntent);
    }

    public void raviInfo(View view) {
        Intent myIntent = new Intent(members.this,mem_ravi.class);
        startActivity(myIntent);
    }

    public void ravirajInfo(View view) {
        Intent myIntent = new Intent(members.this,mem_raviraaz.class);
        startActivity(myIntent);
    }

    public void nandanInfo(View view) {
        Intent myIntent = new Intent(members.this,mem_nandan.class);
        startActivity(myIntent);
    }

    public void roshanInfo(View view) {
        Intent myIntent = new Intent(members.this,mem_roshan.class);
        startActivity(myIntent);
    }

    public void sachinInfo(View view) {
        Intent myIntent = new Intent(members.this,mem_sachin.class);
        startActivity(myIntent);
    }
}
