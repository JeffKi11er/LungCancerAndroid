package com.example.lungcancer.fragment;

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

import javax.xml.transform.Templates;

public class FragmentTool extends Fragment {
    private TextView tvHead;
    private TextView tvTail;
    private TextView tvDot1;
    private TextView tvDot2;
    private ImageView img;
    private ImageView edtDownload;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tool,container,false);
        Log.e(getClass().getName(),"onCreateView");
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(getClass().getName(),"onActivityCreated");
        tvHead = getActivity().findViewById(R.id.tv_titleTool);
        tvTail = getActivity().findViewById(R.id.tv_detailTool);
        tvDot1 = getActivity().findViewById(R.id.tv_dot_text1);
        tvDot2 = getActivity().findViewById(R.id.tv_dot_tex2);
        img = getActivity().findViewById(R.id.img_tool);
        edtDownload = getActivity().findViewById(R.id.edt_download);

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
