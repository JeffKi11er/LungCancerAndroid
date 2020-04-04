package com.example.lungcancer.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;

import com.example.lungcancer.R;
import com.example.lungcancer.fragment.FragmentContact;
import com.example.lungcancer.fragment.FragmentHome;
import com.example.lungcancer.fragment.FragmentPage;
import com.example.lungcancer.fragment.FragmentSample;
import com.example.lungcancer.fragment.FragmentTool;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout drawerLayout;
    private FragmentSample fragmentSample = new FragmentSample();
    private FragmentTool fragmentTool = new FragmentTool();
    private FragmentContact fragmentContact = new FragmentContact();
    private FragmentHome fragmentHome = new FragmentHome();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*showFragment(fragmentTool);
        initFragment();
        showFragmentWithAdd(fragmentTool);*/
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawer_layout);
//        NavigationView navigationView = findViewById(R.id.navigationView);
//        navigationView.setNavigationItemSelectedListener(this);
//        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,
//                R.string.navigation_open,R.string.navigation_close);
//        drawerLayout.addDrawerListener(drawerToggle);
//        drawerToggle.syncState();
//        if(savedInstanceState==null) {
//            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,
//                    new FragmentTool()).commit();
//            navigationView.setCheckedItem(R.id.nav_home);
//        }

//        getSupportActionBar().setHomeButtonEnabled(true);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setHomeAsUpIndicator(R.drawable.lo3);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new FragmentPage()).commit();

    }

    private void initFragment() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frame_container,fragmentSample);
        transaction.add(R.id.frame_container,fragmentTool);
        transaction.commitAllowingStateLoss();
    }

    private void showFragmentWithAdd(Fragment fm) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.setCustomAnimations(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
        transaction.hide(fragmentSample);
        transaction.hide(fragmentTool);
        transaction.show(fm);
        transaction.commitAllowingStateLoss();
    }

    private void showFragment(Fragment fm) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.setCustomAnimations(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
        transaction.replace(R.id.frame_container,fm);
        transaction.runOnCommit(new Runnable() {
            @Override
            public void run() {
                Log.e(getClass().getName(),"runOnCommit");
            }
        });
        transaction.commitAllowingStateLoss();
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.nav_sample:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,
                        new FragmentSample()).commit();
                break;
            case R.id.nav_tool:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,
                        new FragmentTool()).commit();
                break;
            case R.id.nav_contact:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,
                        new FragmentContact()).commit();
                break;
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,
                        new FragmentHome()).commit();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
