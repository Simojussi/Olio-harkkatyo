package com.example.lutemon_fighter_ultimate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BattelingStatListAdapter extends RecyclerView.Adapter<BattelingStatViewHolder> {

    private Context context;
    private ArrayList<Lutemon> lutemons = new ArrayList<>();

    public BattelingStatListAdapter(Context context, ArrayList<Lutemon> lutemons){
        this.context = context;
        this.lutemons = lutemons;
    }

    @NonNull
    @Override
    public BattelingStatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BattelingStatViewHolder(LayoutInflater.from(context).inflate(R.layout.batteling_stats_view,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BattelingStatViewHolder holder, int position) {
        holder.lutemonName.setText(lutemons.get(position).getName() + "(" + lutemons.get(position).getColor() + ")");
        holder.wins.setText("Voitot: "  + lutemons.get(position).getWins());
        holder.losses.setText("Häviöt: " + lutemons.get(position).getLoses());
        holder.lutemonPic.setImageResource(lutemons.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return lutemons.size();
    }
}
