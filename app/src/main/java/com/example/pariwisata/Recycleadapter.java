package com.example.pariwisata;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Recycleadapter extends RecyclerView.Adapter<Recycleadapter.VideoViewHolder> {

    private List<Recycleitem> recycleList;

    public Recycleadapter(List<Recycleitem> recycleList) {
        this.recycleList = recycleList;
    }

    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycle, parent ,false);
        return new VideoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {
        Recycleitem recycleitem = recycleList.get(position);
        holder.imageView5.setImageResource(recycleitem.getImageView5());
        holder.imageView6.setImageResource(recycleitem.getImageView6());
        holder.imageView7.setImageResource(recycleitem.getImageView7());
        holder.textView10.setText(recycleitem.getTextView10());
        holder.textView11.setText(recycleitem.getTextView11());
        holder.textView12.setText(recycleitem.getTextView12());
    }

    @Override
    public int getItemCount() {
        return recycleList.size();
    }

    public static class VideoViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView5;
        ImageView imageView6;
        ImageView imageView7;
        TextView textView10;
        TextView textView11;
        TextView textView12;

        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView5 = itemView.findViewById(R.id.imageView5);
            imageView6 = itemView.findViewById(R.id.imageView6);
            imageView7 = itemView.findViewById(R.id.imageView7);
            textView10 = itemView.findViewById(R.id.textView10);
            textView11 = itemView.findViewById(R.id.textView11);
            textView12 = itemView.findViewById(R.id.textView12);
        }
    }
}