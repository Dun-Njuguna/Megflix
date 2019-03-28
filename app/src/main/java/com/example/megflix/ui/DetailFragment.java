package com.example.megflix.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.megflix.R;
import com.example.megflix.models.Popular;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
.
 */
public class DetailFragment extends Fragment {


    @BindView(R.id.appCompatImageView) ImageView mImageLabel;


    private Popular mPopular;

    public static DetailFragment newInstance(Popular popular) {
        DetailFragment detailFragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putParcelable("popular", Parcels.wrap(popular));

        detailFragment.setArguments(args);

        return detailFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPopular = Parcels.unwrap(getArguments().getParcelable("popular"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        ButterKnife.bind(this, view);
        Picasso.get().load(mPopular.getImage_thumbnail_path()).fit().into(mImageLabel);
        return view;
    }

}
