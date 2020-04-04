package com.example.lungcancer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lungcancer.item.ItemCare;

import java.util.List;

public class RecylePassengers extends RecyclerView.Adapter<RecylePassengers.MyHolder> {
    private List<ItemCare>passengers;
    private Context context;
    public RecylePassengers(Context context, List<ItemCare> passengers) {
        this.context = context;
        this.passengers = passengers;
    }
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater = LayoutInflater.from(context);
//        v = inflater.inflate()
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return passengers.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder{

        public MyHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
