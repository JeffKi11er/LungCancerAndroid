package com.example.lungcancer.fragment;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
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

public class FragmentSample extends Fragment {
    private TextView tvHead;
    private TextView tvTitle;
    private TextView tvDetail1;
    private TextView tvDetail2;
    private TextView tvdot1;
    private TextView tvdot2;
    private TextView tvdot3;
    private ImageView imv1;
    private ImageView imv2;
    private ImageView imv3;
    private ImageView edtdot1;
    private ImageView edtdot2;
    private ImageView edtdot3;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_sample, container,false);
        Log.e(getClass().getName(),"onCreateView");
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(getClass().getName(),"onActivityCreated");
        init();
        Log.e(getClass().getName(),"onDestroy");
    }

    private void init() {
        tvHead = getActivity().findViewById(R.id.tv_head);
        tvTitle = getActivity().findViewById(R.id.tv_title);
        tvDetail1 = getActivity().findViewById(R.id.tv_detail1);
        tvDetail2 = getActivity().findViewById(R.id.tv_detail2);
        tvdot1 = getActivity().findViewById(R.id.tv_dot1);
        tvdot2 = getActivity().findViewById(R.id.tv_dot2);
        tvdot3 = getActivity().findViewById(R.id.tv_dot3);
        edtdot1 = getActivity().findViewById(R.id.edt_1);
        edtdot2 = getActivity().findViewById(R.id.edt_2);
        edtdot3 = getActivity().findViewById(R.id.edt_3);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
