package com.example.lungcancer.adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.lungcancer.fragment.FragmentCare;
import com.example.lungcancer.fragment.FragmentContact;
import com.example.lungcancer.fragment.FragmentHome;
import com.example.lungcancer.fragment.FragmentSample;
import com.example.lungcancer.fragment.FragmentTool;

public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        //home,care,tool,sample,contact
        final Fragment result;
        switch (position) {
            case 0:
                // First Fragment of First Tab
                result = new FragmentHome();
                break;
            case 1:
                // First Fragment of Second Tab
                result = new FragmentCare();
                break;
            case 2:
                // First Fragment of Third Tab
                result = new FragmentTool();
                break;
            case 3:
                result = new FragmentSample();
                break;
            default:
                result = new FragmentContact();
                break;
        }

        return result;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "Trang chủ";
        }
        if(position==1){
            return "Hỗ trợ chuẩn đoán";
        }
        if(position==2){
            return "Công cụ dán nhãn";
        }
        if(position==3){
            return "Bộ dữ liệu biểu mẫu";
        }
        else
            return "Liên hệ";
    }
}
