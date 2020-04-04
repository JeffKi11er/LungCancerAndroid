package com.example.lungcancer.adapter;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lungcancer.R;
import com.example.lungcancer.fragment.FragmentCare;
import com.example.lungcancer.fragment.FragmentContact;
import com.example.lungcancer.fragment.FragmentSample;
import com.example.lungcancer.fragment.FragmentTool;
import com.example.lungcancer.item.ItemPage;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyHolder> {
    private Context context;
    private List<ItemPage>itemPages;
    private Dialog care;
    private Dialog contact;
    private Dialog sample;
    private Dialog tool;
    public RecycleViewAdapter(Context context, List<ItemPage> itemPages) {
        this.context = context;
        this.itemPages = itemPages;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.page_system,parent,false);
        care = new Dialog(context);
        care.setContentView(R.layout.dialog_care);
        tool = new Dialog(context);
        tool.setContentView(R.layout.dialog_tool);
        sample = new Dialog(context);
        sample.setContentView(R.layout.dialog_sample);
        contact= new Dialog(context);
        contact.setContentView(R.layout.dialog_contact);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder holder, final int position) {
        holder.tvHeader.setText(itemPages.get(position).getHeadTitle());
        holder.img.setImageResource(itemPages.get(position).getImageset());
        holder.tvDetail.setText(itemPages.get(position).getDetail());
        holder.tvLink.setText("Xem thêm >>");
        holder.tvLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Text click"+holder.getAdapterPosition(),Toast.LENGTH_LONG).show();
                switch (holder.getAdapterPosition()){
                    case 0:
                        FragmentSample sample = new FragmentSample();
                        trasactionFragment(sample);
                        break;
                    case 1:
                        FragmentCare care = new FragmentCare();
                        trasactionFragment(care);
                        break;
                    case 2 :
                        FragmentTool tool = new FragmentTool();
                        trasactionFragment(tool);
                        break;
                    case 3 :
                        FragmentContact contact = new FragmentContact();
                        trasactionFragment(contact);
                        break;
                }
            }
        });
    }
    private void trasactionFragment(Fragment fragment){
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,fragment).addToBackStack(null).commit();
    }
    private Activity getActivity() {
        Context context1 = context;
        while (context1 instanceof ContextWrapper) {
            if (context1 instanceof Activity) {
                return (Activity)context1;
            }
            context1 = ((ContextWrapper)context1).getBaseContext();
        }
        return null;
    }
    @Override
    public int getItemCount() {
        return itemPages.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder {
        TextView tvHeader;
        ImageView img;
        TextView tvDetail;
        TextView tvLink;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            tvHeader = (TextView)itemView.findViewById(R.id.tv_headtitle);
            img = (ImageView)itemView.findViewById(R.id.img);
            tvDetail = (TextView)itemView.findViewById(R.id.tv_detail);
            tvLink = (TextView)itemView.findViewById(R.id.tv_link);
        }
    }
}
