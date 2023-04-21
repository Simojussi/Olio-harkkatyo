package com.example.lutemon_fighter_ultimate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LutemonListAdapter extends RecyclerView.Adapter<LutemonViewHolder> {

    private Context context;
    private ArrayList<Lutemon> lutemons = new ArrayList<>();

    public LutemonListAdapter(Context context, ArrayList<Lutemon> lutemons) {
        this.context = context;
        this.lutemons = lutemons;
    }

    @NonNull
    @Override
    public LutemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LutemonViewHolder(LayoutInflater.from(context).inflate(R.layout.lutemon_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LutemonViewHolder holder, int position) {

        holder.txtName.setText(String.valueOf(lutemons.get(position).getName()));
        holder.txtAttack.setText(String.valueOf(lutemons.get(position).getAttack()));
        holder.txtDefence.setText(String.valueOf(lutemons.get(position).getDefense()));
        holder.txtHealth.setText(String.valueOf(lutemons.get(position).getHealth()) + "/" + String.valueOf(lutemons.get(position).getMaxHealth()));
        holder.txtExperience.setText(String.valueOf(lutemons.get(position).getExperience()));
        //holder.lutemon1.setImageResource(lutemons.get(position).getImage()); TODO laita tämä toimimaan

    }

    @Override
    public int getItemCount() {
        return lutemons.size();
    }
}
