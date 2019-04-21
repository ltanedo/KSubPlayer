package com.example.ksubv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SongListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        //transparent status bar
        //Window w = getWindow();
        //w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        //link recyclerView with adapter
        RecyclerView recyclerView = findViewById(R.id.song_list);
        List<SingingGroup> mList = new ArrayList<>();

        //Add List Items
        mList.add(new SingingGroup("Red Velvet", R.drawable.red_velvet_banner, R.drawable.pro, 5000));
        mList.add(new SingingGroup("BTS", R.drawable.bts, R.drawable.pro, 5000));
        mList.add(new SingingGroup("BlackPink", R.drawable.blackpink_banner, R.drawable.pro, 5000));
        //mList.add(new SingingGroup("Twice", R.drawable.twice_banner, R.drawable.pro, 5000));
        mList.add(new SingingGroup("EXO", R.drawable.exo_banner, R.drawable.pro, 5000));
        mList.add(new SingingGroup("Girls Generation", R.drawable.girls_generation_banner, R.drawable.pro, 5000));

        //Finish Seyup
        SongListAdapter adapter = new SongListAdapter(this, mList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


}
