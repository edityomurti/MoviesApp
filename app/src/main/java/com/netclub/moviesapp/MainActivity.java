package com.netclub.moviesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.netclub.moviesapp.adapter.MoviesRVAdapter;
import com.netclub.moviesapp.model.MoviesData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<MoviesData> moviesDataList = new ArrayList<>();
    private MoviesRVAdapter moviesRVAdapter;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moviesRVAdapter = new MoviesRVAdapter(this, moviesDataList);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(moviesRVAdapter);

        fetchData();
    }

    private void fetchData() {
        MoviesData moviesData1 = new MoviesData();
        moviesData1.setTitle("Mr. Robot");
        moviesData1.setDate("Feb 2015");
        moviesData1.setRating((float)4.3);
        moviesDataList.add(moviesData1);
        moviesRVAdapter.notifyDataSetChanged();
        MoviesData moviesData2 = new MoviesData();
        moviesData2.setTitle("Mrs. Robot");
        moviesData2.setDate("Feb 2014");
        moviesData2.setRating((float)9.3);
        moviesDataList.add(moviesData2);
        moviesRVAdapter.notifyDataSetChanged();
    }
}
