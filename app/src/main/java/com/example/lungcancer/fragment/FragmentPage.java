package com.example.lungcancer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.lungcancer.R;
import com.example.lungcancer.adapter.PagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class FragmentPage extends Fragment {
    ViewPager viewPager;
    TabLayout tabLayout;
    private int[]tabIcon = {
            R.drawable.lo3
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pager,container,false);
        tabLayout = view.findViewById(R.id.tabs);
        viewPager = view.findViewById(R.id.view);
        viewPager.setAdapter(new PagerAdapter(getChildFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
        //setupTabIconLogo();
        return view;
    }

    private void setupTabIconLogo() {
        tabLayout.getTabAt(0).setIcon(tabIcon[0]);
    }
}
