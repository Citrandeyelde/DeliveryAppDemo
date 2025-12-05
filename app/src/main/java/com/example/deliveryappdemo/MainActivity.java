package com.example.deliveryappdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageSlider slider;
    ImageView menu;

    LinearLayout about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        drawerLayout=findViewById(R.id.drawerlayout);
        menu=findViewById(R.id.menu);
        slider = findViewById(R.id.slider);
        about= findViewById(R.id.about);

        ArrayList<SlideModel> listaImagenes = new ArrayList<>();
        listaImagenes.add(new SlideModel(R.drawable.food1, "Primera Imagen", ScaleTypes.FIT));
        listaImagenes.add(new SlideModel(R.drawable.food2, "Segunda Imagen.", ScaleTypes.FIT));
        listaImagenes.add(new SlideModel(R.drawable.food3, "Tercera Imagen", ScaleTypes.FIT));
        listaImagenes.add(new SlideModel(R.drawable.food4, "Cuarta Imagen", ScaleTypes.FIT));
        listaImagenes.add(new SlideModel(R.drawable.food5, "Quinta Imagen", ScaleTypes.FIT));
        slider.setImageList(listaImagenes);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(i);
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDrawer(drawerLayout);
            }
        });


    }

    public static void openDrawer(DrawerLayout drawerLayout) {
        drawerLayout.openDrawer(GravityCompat.START);
    }

    public static void closeDrawer(DrawerLayout drawerLayout) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    public static void redirectActivity(Activity activity, Class secondActivity) {
        Intent i = new Intent(activity, secondActivity);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(i);
//        activity.finish();
    }

    protected void onPause() {
        super.onPause();
        closeDrawer(drawerLayout);
    }
}