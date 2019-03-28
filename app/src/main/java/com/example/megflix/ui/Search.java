package com.example.megflix.ui;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.megflix.R;

import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class Search extends Fragment {

    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;
    private String mComicSearch;

    public Search() {
        // Required empty public constructor
    }

    public static Search newInstance() {
        Search search = new Search();
        return search;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false);

    }


}
