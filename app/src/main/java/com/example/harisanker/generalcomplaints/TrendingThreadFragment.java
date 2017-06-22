package com.example.harisanker.generalcomplaints;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class TrendingThreadFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    List<Complaints> compalintList = new ArrayList<>();

    public TrendingThreadFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        compalintList.add(new Complaints("Godav",
                "Heisenberg,Walterdfdfdf",
                "BLAH",
                "Random",
                "Title",
                "Subject",
                null,
                "Description",
                null,
                25,
                1,
                1,
                true,
                null));
        compalintList.add(new Complaints("Cauvery",
                "Javier",
                "BLAH",
                "Random",
                "Random",
                "Fugazi",
                null,
                "Stuff",
                null,
                25,
                1,
                1,
                false,
                null));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_trending_thread, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.general_complaint_recycler);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new ComplaintAdapter(compalintList);
        mRecyclerView.setAdapter(mAdapter);


        return view;
    }
}
