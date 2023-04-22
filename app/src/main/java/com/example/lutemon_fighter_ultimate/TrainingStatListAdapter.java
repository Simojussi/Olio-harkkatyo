package com.example.lutemon_fighter_ultimate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TrainingStatListAdapter extends RecyclerView.Adapter<TrainingStatViewHolder> {

    private Context context;
    private ArrayList<Lutemon> lutemons = new ArrayList<>();

    public TrainingStatListAdapter(Context context, ArrayList<Lutemon> lutemons) {
        this.context = context;
        this.lutemons = lutemons;
    }

    @NonNull
    @Override
    public TrainingStatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TrainingStatViewHolder(LayoutInflater.from(context).inflate(R.layout.training_stats_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull TrainingStatViewHolder holder, int position) {

        holder.lutemonName.setText(lutemons.get(position).getName() + " (" + lutemons.get(position).getColor() + ")");
        holder.experience.setText("Kokemus: " + lutemons.get(position).getExperience());
        holder.trainingDays.setText("Treenipäivät: "+lutemons.get(position).getTrainingDays());
        holder.lutemonPic.setImageResource(lutemons.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return lutemons.size();
    }
}
