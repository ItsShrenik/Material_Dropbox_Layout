package com.apps.shrenoid.dropbox;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AdapterFragPager extends FragmentPagerAdapter{


    public AdapterFragPager(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch(position){
            case 0:
                fragment=new FragCreateLay();
                break;
            case 1: fragment=new FragSignLay();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }


}
