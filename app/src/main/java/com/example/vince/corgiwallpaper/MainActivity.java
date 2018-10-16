package com.example.vince.corgiwallpaper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<CorgiImage> corgiImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        corgiImages = CorgiImage.createCorgiList(100);

        RecyclerView rvCorgiImages = findViewById(R.id.mRecyclerView);

        final CorgiImageAdapter adapter = new CorgiImageAdapter(corgiImages);
        rvCorgiImages.setAdapter(adapter);
        rvCorgiImages.setLayoutManager(new GridLayoutManager(this,2));

        ItemClickSupport.addTo(rvCorgiImages).setOnItemClickListener(
                new ItemClickSupport.OnItemClickListener() {
                    @Override
                    public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                        // do it

                        CorgiImage corgiImage = adapter.getItem(position);
                        Toast toast=Toast.makeText(getApplicationContext(),"Corgi image position is:" + corgiImage.getDescription(),Toast.LENGTH_SHORT);
                        toast.show();

                        corgiImages.add(0, new CorgiImage("new", "address" +position));
                        adapter.notifyItemChanged(0);
                    }
                }
        );
    }
}
