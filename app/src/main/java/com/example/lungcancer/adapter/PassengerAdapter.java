package com.example.lungcancer.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lungcancer.R;
import com.example.lungcancer.item.ItemPassenger;

import java.util.List;

import static com.example.lungcancer.R.*;
import static com.example.lungcancer.R.color.*;

public class PassengerAdapter extends RecyclerView.Adapter<PassengerAdapter.PHolder> {
    private List<ItemPassenger>passengers;
    private Context context;

    public PassengerAdapter(List<ItemPassenger> passengers, Context context) {
        this.passengers = passengers;
        this.context = context;
    }

    @NonNull
    @Override
    public PHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater = LayoutInflater.from(context);
        v = inflater.inflate(layout.item_person,parent,false);
        return new PHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PHolder holder, int position) {
        holder.id.setText(passengers.get(position).getId());
        holder.name.setText(passengers.get(position).getName());
        holder.gender.setText(passengers.get(position).getGender());
        holder.type.setText(passengers.get(position).getType());
        holder.date.setText(passengers.get(position).getDate());
        holder.btnlocation.setText("Định vị khối u");
        holder.btndisting.setText("Phân loại");
        if(position>=0 && position%2==0){
            holder.id.setBackgroundColor(Color.LTGRAY);
            holder.name.setBackgroundColor(Color.LTGRAY);
            holder.gender.setBackgroundColor(Color.LTGRAY);
            holder.type.setBackgroundColor(Color.LTGRAY);
            holder.date.setBackgroundColor(Color.LTGRAY);
            holder.linearLayoutdis.setBackgroundColor(Color.LTGRAY);
            holder.linearLayoutlocate.setBackgroundColor(Color.LTGRAY);
        }
        else{
            holder.id.setBackgroundColor(Color.WHITE);
            holder.name.setBackgroundColor(Color.WHITE);
            holder.gender.setBackgroundColor(Color.WHITE);
            holder.type.setBackgroundColor(Color.WHITE);
            holder.date.setBackgroundColor(Color.WHITE);
            holder.linearLayoutdis.setBackgroundColor(Color.WHITE);
            holder.linearLayoutlocate.setBackgroundColor(Color.WHITE);
        }
    }

    @Override
    public int getItemCount() {
        return passengers.size();
    }

    public static class PHolder extends RecyclerView.ViewHolder{
        private TextView id;
        private TextView name;
        private TextView gender;
        private TextView type;
        private TextView date;
        private Button btnlocation;
        private Button btndisting;
        private LinearLayout linearLayoutlocate;
        private LinearLayout linearLayoutdis;
        public PHolder(@NonNull View itemView) {
            super(itemView);
            id = (TextView)itemView.findViewById(R.id.tv_id_people);
            name = (TextView)itemView.findViewById(R.id.tv_name_people);
            gender = (TextView)itemView.findViewById(R.id.tv_gender_people);
            type = (TextView)itemView.findViewById(R.id.tv_type_input);
            date = (TextView)itemView.findViewById(R.id.tv_day_took);
            btndisting = (Button)itemView.findViewById(R.id.btn_distinguish);
            btnlocation = (Button)itemView.findViewById(R.id.btn_location_size);
            linearLayoutlocate = (LinearLayout)itemView.findViewById(R.id.lncolorlocated);
            linearLayoutdis = (LinearLayout)itemView.findViewById(R.id.lncolordis);
        }
    }
}
