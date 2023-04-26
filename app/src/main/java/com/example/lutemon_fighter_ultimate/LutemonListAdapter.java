package com.example.lutemon_fighter_ultimate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LutemonListAdapter extends RecyclerView.Adapter<LutemonViewHolder> {

    private Context context;
    private ArrayList<Lutemon> lutemons = new ArrayList<>();



    private HomeStorage hs;
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
        hs = HomeStorage.getInstance();
        holder.txtName.setText(lutemons.get(position).getName() + " (" + lutemons.get(position).getColor() + ")");
        holder.txtAttack.setText("Hyökkäys: " + lutemons.get(position).getAttack());
        holder.txtDefence.setText("Puolustus: " + lutemons.get(position).getDefense());
        holder.txtHealth.setText("Elämä: " + lutemons.get(position).getHealth() + "/" + lutemons.get(position).getMaxHealth());
        holder.txtExperience.setText("Kokemus: " + lutemons.get(position).getExperience());
        holder.lutemonPic.setImageResource(lutemons.get(position).getImage());
        holder.toTrain.setImageResource(R.drawable.train);
        holder.toBattle.setImageResource(R.drawable.fight);
        holder.toTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hs.moveLutemonToTrain(holder.getAdapterPosition());
                notifyItemRemoved(holder.getAdapterPosition());
            }
        });

        holder.toBattle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hs.moveLutemonToBattle(holder.getAdapterPosition());
                notifyItemRemoved(holder.getAdapterPosition());
            }
        });

    }

    @Override
    public int getItemCount() {
        return lutemons.size();
    }
}
