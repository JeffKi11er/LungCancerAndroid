package com.example.lungcancer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lungcancer.R;
import com.example.lungcancer.adapter.RecycleViewAdapter;
import com.example.lungcancer.item.ItemPage;

import java.util.ArrayList;
import java.util.List;

public class FragmentHome extends Fragment {
    List<ItemPage>pageList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home,container,false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        pageList = new ArrayList<>();
        pageList.add(new ItemPage("Hệ thống Lung Cancer Care","Theo thống kê gần đây, ung thư phổi là loại bệnh chiếm tỉ lệ cao nhất về tỉ lệ mắc và tử vong trong các bệnh lý ung thư trên phạm vi toàn cầu. Chỉ tính riêng năm 2012, đã có thêm 1.8 triệu trường hợp mới mắc trong đó 58% số bệnh nhân này là ở các nước kém phát triển."
        ,R.drawable.lung_cancer_in_xray,""));
        pageList.add(new ItemPage("Hỗ trợ chuẩn đoán","Theo thống kê gần đây, ung thư phổi là loại bệnh chiếm tỉ lệ cao nhất về tỉ lệ mắc và tử vong trong các bệnh lý ung thư trên phạm vi toàn cầu. Chỉ tính riêng năm 2012, đã có thêm 1.8 triệu trường hợp mới mắc trong đó 58% số bệnh nhân này là ở các nước kém phát triển."
                ,R.drawable.lung_cancer_in_xray,""));
        pageList.add(new ItemPage("Công cụ dán nhãn ","Theo thống kê gần đây, ung thư phổi là loại bệnh chiếm tỉ lệ cao nhất về tỉ lệ mắc và tử vong trong các bệnh lý ung thư trên phạm vi toàn cầu. Chỉ tính riêng năm 2012, đã có thêm 1.8 triệu trường hợp mới mắc trong đó 58% số bệnh nhân này là ở các nước kém phát triển."
                ,R.drawable.lung_cancer_in_xray,""));
        pageList.add(new ItemPage("Bộ dữ liệu mẫu ","Theo thống kê gần đây, ung thư phổi là loại bệnh chiếm tỉ lệ cao nhất về tỉ lệ mắc và tử vong trong các bệnh lý ung thư trên phạm vi toàn cầu. Chỉ tính riêng năm 2012, đã có thêm 1.8 triệu trường hợp mới mắc trong đó 58% số bệnh nhân này là ở các nước kém phát triển."
                ,R.drawable.lung_cancer_in_xray,""));
        RecycleViewAdapter adapter = new RecycleViewAdapter(getContext(),pageList);
        RecyclerView recyclerView = (RecyclerView)getActivity().findViewById(R.id.rclist);
        recyclerView.setAdapter(adapter);
    }
}
