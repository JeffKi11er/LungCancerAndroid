package com.example.lungcancer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lungcancer.R;

public class FragmentContact extends Fragment {
    private TextView tvTitle;
    private ImageView edtLink1;
    private ImageView edtLink2;
    private ImageView edtLink3;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_contact,container,false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        init();
    }

    private void init() {
        tvTitle = getActivity().findViewById(R.id.tv_title_contact);
        tv1 = getActivity().findViewById(R.id.tv_text1);
        tv2 = getActivity().findViewById(R.id.tv_text2);
        tv3 = getActivity().findViewById(R.id.tv_text3);
        edtLink1 = getActivity().findViewById(R.id.edt_link1);
        edtLink2 = getActivity().findViewById(R.id.edt_link2);
        edtLink3 = getActivity().findViewById(R.id.edt_link3);
    }
}
