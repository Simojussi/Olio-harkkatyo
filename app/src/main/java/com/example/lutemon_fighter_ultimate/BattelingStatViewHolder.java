package com.example.lutemon_fighter_ultimate;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BattelingStatViewHolder  extends RecyclerView.ViewHolder {

    TextView lutemonName, wins, losses;

    ImageView lutemonPic;

    public BattelingStatViewHolder(@NonNull View itemView) {
        super(itemView);

        lutemonName = itemView.findViewById(R.id.txtLutemonName);

        wins = itemView.findViewById(R.id.txtWins);

        losses = itemView.findViewById(R.id.txtLosses);

        lutemonPic = itemView.findViewById(R.id.imageLutemon);
    }
}
