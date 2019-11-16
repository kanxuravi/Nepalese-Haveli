package com.example.nepalesehaveli;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class gallery extends AppCompatActivity {
    ImageView img1 = findViewById(R.id.imageView2);
    ImageView img2 = findViewById(R.id.imageView3);
    ImageView img3 = findViewById(R.id.imageView4);
    ImageView img4 = findViewById(R.id.imageView5);
    ImageView img5 = findViewById(R.id.imageView6);
    ImageView img6 = findViewById(R.id.imageView7);
    ImageView img7 = findViewById(R.id.imageView8);
    ImageView img8 = findViewById(R.id.imageView9);
    ImageView img9 = findViewById(R.id.imageView10);
    TextView def = findViewById(R.id.viewDef);
    ImageView imgdef = findViewById(R.id.newImgDef);

    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);
        setTitle("Gallery of Nepalese Haveli");
    }


    public void img1(View view) {

    }
}
