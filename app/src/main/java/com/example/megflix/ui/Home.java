package com.example.megflix.ui;


import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.megflix.R;
import com.example.megflix.adapters.PopularAdapter;
import com.example.megflix.models.Popular;
import com.example.megflix.services.Service;

import java.io.IOException;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {

    public ArrayList<Popular> populars = new ArrayList<>();
    private Handler mHandler = new Handler(Looper.getMainLooper());

    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;
    private PopularAdapter mAdapter;



    public Home() {
        // Required empty public constructor
    }

    public static Home newInstance() {
        Home home = new Home();
        return home;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ButterKnife.bind(this.getActivity());
        
        getPopularMovies();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        return view;
    }


    private void getPopularMovies() {
        final Service service = new Service();
        service.findPopularMovies(new Callback() {

            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                populars = service.processResults(response);

                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        mAdapter = new PopularAdapter(getContext(), populars);
                        mRecyclerView.setAdapter(mAdapter);
//                        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Home.this.getContext());
                        GridLayoutManager gridLayoutManager = new GridLayoutManager(Home.this.getContext(),3,LinearLayoutManager.VERTICAL, false);
                        mRecyclerView.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView
//                        mRecyclerView.setLayoutManager(layoutManager);
                    }
                });
            }

        });
    }

}
