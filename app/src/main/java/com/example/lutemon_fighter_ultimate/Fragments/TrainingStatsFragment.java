package com.example.lutemon_fighter_ultimate.Fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lutemon_fighter_ultimate.R;
import com.example.lutemon_fighter_ultimate.Storage;
import com.example.lutemon_fighter_ultimate.TrainingStatListAdapter;


public class TrainingStatsFragment extends Fragment {


    private Storage storage;

    private RecyclerView recyclerView;

    private Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_training_stats, container, false);

        storage = Storage.getInstance();

        recyclerView = view.findViewById(R.id.rwTrainingStats);

        recyclerView.setLayoutManager(new LinearLayoutManager(this.context));
        recyclerView.setAdapter(new TrainingStatListAdapter(getActivity().getApplicationContext(),storage.getLutemons()));

        return view;
    }
}