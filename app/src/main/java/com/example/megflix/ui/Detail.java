package com.example.megflix.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.megflix.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Detail extends Fragment {


    public Detail() {
        // Required empty public constructor
    }

    public static Detail newInstance() {
        Detail detail = new Detail();
        return detail;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

}
