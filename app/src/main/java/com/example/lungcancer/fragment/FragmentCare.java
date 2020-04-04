package com.example.lungcancer.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lungcancer.R;
import com.example.lungcancer.adapter.PagerAdapter;
import com.example.lungcancer.adapter.PassengerAdapter;
import com.example.lungcancer.item.ItemCare;
import com.example.lungcancer.item.ItemPassenger;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class FragmentCare extends Fragment {
    private ArrayList<ItemPassenger>passengers = new ArrayList<>();
    TextView tvCare;
    TextView tvDetail;
    TableLayout tableLayout;
    private String[]datacheck = {"ID","Họ và tên","Giới tính","Loại dữ liệu","Ngày chụp",
            "Xác định vị trí kích thước khối u","Phân loại lành tính hay ác tính "};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_care,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        dataInsert();
        init();
    }

    @SuppressLint("ResourceAsColor")
    private void init() {
        tvCare = getActivity().findViewById(R.id.tv_care);
        tvDetail = getActivity().findViewById(R.id.tv_detail_care);
        RecyclerView recyclerView = getActivity().findViewById(R.id.rcl_passenger);
        PassengerAdapter adapter = new PassengerAdapter(passengers,getContext());
        recyclerView.setAdapter(adapter);
//        tvCare = getActivity().findViewById(R.id.tv_care);
////        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
////        params.topMargin = 100;
////        tvCare.setLayoutParams(params);
//        tvDetail = getActivity().findViewById(R.id.tv_detail_care);
//        tableLayout = getActivity().findViewById(R.id.table);
//        for (int i = 0; i < datacheck.length; i++) {
//            TableRow row = new TableRow(getActivity());
//            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//            row.setLayoutParams(params);
//            TextView taskdate = new  TextView(getContext());
//            taskdate.setTextSize(10);
//            taskdate.setText(datacheck[i]);
//            row.addView(taskdate);
//
////            TextView title = new  TextView(getContext());
////            taskdate.setText(cares.get(i).getName());
////            row.addView(title);
////            taskdate.setTextSize(10);
////
////            TextView taskhour = new  TextView(getContext());
////            taskdate.setText(cares.get(i).getDataType());
////            taskhour.setTextSize(10);
////            row.addView(taskhour);
////
////            TextView description = new  TextView(getContext());
////            taskdate.setText(cares.get(i).getGender());
////            row.addView(description);
////            description.setTextSize(10);
////            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
////            params.rightMargin = 1;
////            params.bottomMargin = 1;
////            taskID.setLayoutParams(params);
//            tableLayout.addView(row);
//        }
    }

    private void dataInsert() {
        passengers.add(new ItemPassenger("K1.171050199","K1.171050199","Nam","CT","10/13/17"));
        passengers.add(new ItemPassenger("K1.171050199","K1.171050199","Nam","CT","10/13/17"));
        passengers.add(new ItemPassenger("K1.171050199","K1.171050199","Nam","CT","10/13/17"));
        passengers.add(new ItemPassenger("K1.171050199","K1.171050199","Nam","CT","10/13/17"));
        passengers.add(new ItemPassenger("K1.171050199","K1.171050199","Nam","CT","10/13/17"));
        passengers.add(new ItemPassenger("K1.171050199","K1.171050199","Nam","CT","10/13/17"));
        passengers.add(new ItemPassenger("K1.171050199","K1.171050199","Nam","CT","10/13/17"));
        passengers.add(new ItemPassenger("K1.171050199","K1.171050199","Nam","CT","10/13/17"));
        passengers.add(new ItemPassenger("K1.171050199","K1.171050199","Nam","CT","10/13/17"));
        passengers.add(new ItemPassenger("K1.171050199","K1.171050199","Nam","CT","10/13/17"));
        passengers.add(new ItemPassenger("K1.171050199","K1.171050199","Nam","CT","10/13/17"));


    }
}
