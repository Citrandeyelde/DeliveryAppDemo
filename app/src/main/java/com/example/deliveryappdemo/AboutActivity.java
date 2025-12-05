package com.example.deliveryappdemo;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class AboutActivity extends AppCompatActivity {

    ImageView gifImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_about);
        gifImageView = findViewById(R.id.gifImageView);
        Glide.with(this)
                .load("https://media1.giphy.com/media/v1.Y2lkPTc5MGI3NjExb24zMjhlZG8xcDc0eWlybDljdm1reDNianNwaGxxOTR6dm1sZWE3MyZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/fUQ4rhUZJYiQsas6WD/giphy.gif")  // Reemplaza 'tu_gif' con el nombre de tu archivo GIF
                .into(gifImageView);


    }
}