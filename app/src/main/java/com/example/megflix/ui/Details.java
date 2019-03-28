package com.example.megflix.ui;


import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;


import com.example.megflix.R;
import com.example.megflix.adapters.MoviePagerAdapter;
import com.example.megflix.models.Popular;


import org.parceler.Parcels;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Details extends AppCompatActivity {
    @BindView(R.id.viewPager) ViewPager mViewPager;
        private MoviePagerAdapter adapterViewPager;
    ArrayList<Popular> mComics = new ArrayList<>();
    public static final String TAG = Details.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
         ButterKnife.bind(this);

        mComics = Parcels.unwrap(getIntent().getParcelableExtra("popular"));
        Log.v(TAG, "Response " + mComics);


        int startingPosition = getIntent().getIntExtra("position", 0);
        Log.v(TAG, "Response " + startingPosition);


        adapterViewPager = new MoviePagerAdapter(getSupportFragmentManager(), mComics);
        mViewPager.setAdapter(adapterViewPager);
        mViewPager.setCurrentItem(startingPosition);
    }
}
