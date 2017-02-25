package com.netclub.moviesapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.netclub.moviesapp.R;
import com.netclub.moviesapp.model.MoviesData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edityomurti on 2/24/17.
 */

public class MoviesRVAdapter extends RecyclerView.Adapter<MoviesRVAdapter.MoviesViewHolder> {

    private Context context;
    private List<MoviesData> moviesDataList = new ArrayList<>();

    public MoviesRVAdapter(Context context, List<MoviesData> moviesDataList) {
        this.context = context;
        this.moviesDataList = moviesDataList;
    }


    public class MoviesViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPoster;
        TextView tvTitle, tvDate, tvRating;
        public MoviesViewHolder(View itemView) {
            super(itemView);
            ivPoster = (ImageView) itemView.findViewById(R.id.iv_poster);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
            tvDate = (TextView) itemView.findViewById(R.id.tv_date);
            tvRating = (TextView) itemView.findViewById(R.id.tv_rating);
        }
    }

    @Override
    public MoviesRVAdapter.MoviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_movie, parent, false);
        return new MoviesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MoviesRVAdapter.MoviesViewHolder holder, int position) {
        MoviesData moviesData = moviesDataList.get(position);
//        holder.ivPoster.setImageResource(context.getResources().getIdentifier("com.netclub.moviesapp:drawable/" + moviesData.getPoster(), null, null));
        holder.ivPoster.setImageResource(R.drawable.image_mrrobot);
        holder.tvTitle.setText(moviesData.getTitle());
        holder.tvDate.setText(moviesData.getDate());
        holder.tvRating.setText(String.valueOf(moviesData.getRating()));
    }

    @Override
    public int getItemCount() {
        return moviesDataList == null ? 0 : moviesDataList.size();
    }
}