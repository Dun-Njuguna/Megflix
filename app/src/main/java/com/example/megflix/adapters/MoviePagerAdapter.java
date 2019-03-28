package com.example.megflix.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.megflix.models.Popular;
import com.example.megflix.ui.DetailFragment;

import java.util.ArrayList;


public class MoviePagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Popular> mPopular;

    public MoviePagerAdapter(FragmentManager fm, ArrayList<Popular> popular) {
        super(fm);
        mPopular = popular;
    }

    @Override
    public Fragment getItem(int position) {
        return DetailFragment.newInstance(mPopular.get(position));
    }

    @Override
    public int getCount() {
        return mPopular.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mPopular.get(position).getName();
    }
}
