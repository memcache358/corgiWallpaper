package com.example.vince.corgiwallpaper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<CorgiImage> corgiImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        corgiImages = CorgiImage.createCorgiList(10);

        RecyclerView rvCorgiImages = findViewById(R.id.mRecyclerView);

        CorgiImageAdapter adapter = new CorgiImageAdapter(corgiImages);
        rvCorgiImages.setAdapter(adapter);
        rvCorgiImages.setLayoutManager(new GridLayoutManager(this,2));

    }
}
