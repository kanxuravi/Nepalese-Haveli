package com.example.nepalesehaveli;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import uk.co.senab.photoview.PhotoViewAttacher;


public class gallery extends AppCompatActivity {
    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);
        setTitle("Gallery of Nepalese Haveli");
    }



    public void img1(View view) {
        TextView def = findViewById(R.id.viewDef);
        ImageView imgdef = findViewById(R.id.newImgDef);
        def.setVisibility(View.GONE);
        imgdef.setVisibility(View.VISIBLE);
        imgdef.setImageResource(R.drawable.ravi);
        PhotoViewAttacher photoAttacher;
        photoAttacher= new PhotoViewAttacher(imgdef);
        photoAttacher.update();
    }

    public void img2(View view) {
        TextView def = findViewById(R.id.viewDef);
        ImageView imgdef = findViewById(R.id.newImgDef);
        def.setVisibility(View.GONE);
        imgdef.setVisibility(View.VISIBLE);
        imgdef.setImageResource(R.drawable.aman);
        PhotoViewAttacher photoAttacher;
        photoAttacher= new PhotoViewAttacher(imgdef);
        photoAttacher.update();
    }

    public void img3(View view) {
        TextView def = findViewById(R.id.viewDef);
        ImageView imgdef = findViewById(R.id.newImgDef);
        def.setVisibility(View.GONE);
        imgdef.setVisibility(View.VISIBLE);
        imgdef.setImageResource(R.drawable.bikash);
        PhotoViewAttacher photoAttacher;
        photoAttacher= new PhotoViewAttacher(imgdef);
        photoAttacher.update();
    }

    public void img4(View view) {
        TextView def = findViewById(R.id.viewDef);
        ImageView imgdef = findViewById(R.id.newImgDef);
        def.setVisibility(View.GONE);
        imgdef.setVisibility(View.VISIBLE);
        imgdef.setImageResource(R.drawable.roshan);
        PhotoViewAttacher photoAttacher;
        photoAttacher= new PhotoViewAttacher(imgdef);
        photoAttacher.update();
    }

    public void img5(View view) {
        TextView def = findViewById(R.id.viewDef);
        ImageView imgdef = findViewById(R.id.newImgDef);
        def.setVisibility(View.GONE);
        imgdef.setVisibility(View.VISIBLE);
        imgdef.setImageResource(R.drawable.ankit);
        PhotoViewAttacher photoAttacher;
        photoAttacher= new PhotoViewAttacher(imgdef);
        photoAttacher.update();
    }

    public void img6(View view) {
        TextView def = findViewById(R.id.viewDef);
        ImageView imgdef = findViewById(R.id.newImgDef);
        def.setVisibility(View.GONE);
        imgdef.setVisibility(View.VISIBLE);
        imgdef.setImageResource(R.drawable.chapur);
        PhotoViewAttacher photoAttacher;
        photoAttacher= new PhotoViewAttacher(imgdef);
        photoAttacher.update();
    }

    public void img7(View view) {
        TextView def = findViewById(R.id.viewDef);
        ImageView imgdef = findViewById(R.id.newImgDef);
        def.setVisibility(View.GONE);
        imgdef.setVisibility(View.VISIBLE);
        imgdef.setImageResource(R.drawable.pawan);
        PhotoViewAttacher photoAttacher;
        photoAttacher= new PhotoViewAttacher(imgdef);
        photoAttacher.update();
    }

    public void img8(View view) {
        TextView def = findViewById(R.id.viewDef);
        ImageView imgdef = findViewById(R.id.newImgDef);
        def.setVisibility(View.GONE);
        imgdef.setVisibility(View.VISIBLE);
        imgdef.setImageResource(R.drawable.sachin);
        PhotoViewAttacher photoAttacher;
        photoAttacher= new PhotoViewAttacher(imgdef);
        photoAttacher.update();
    }

    public void img9(View view) {
        TextView def = findViewById(R.id.viewDef);
        ImageView imgdef = findViewById(R.id.newImgDef);
        def.setVisibility(View.GONE);
        imgdef.setVisibility(View.VISIBLE);
        imgdef.setImageResource(R.drawable.manoj);
        PhotoViewAttacher photoAttacher;
        photoAttacher= new PhotoViewAttacher(imgdef);
        photoAttacher.update();
    }
}
