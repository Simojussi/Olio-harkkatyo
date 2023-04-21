package com.example.lutemon_fighter_ultimate;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LutemonViewHolder extends RecyclerView.ViewHolder {

    ImageView lutemon1;
    TextView txtName, txtAttack, txtDefence, txtHealth, txtExperience;

    public LutemonViewHolder(@NonNull View itemView) {
        super(itemView);

        lutemon1 = itemView.findViewById(R.id.imageLutemon1);
        txtName = itemView.findViewById(R.id.txtName);
        txtAttack = itemView.findViewById(R.id.txtAttack);
        txtDefence = itemView.findViewById(R.id.txtDefence);
        txtHealth = itemView.findViewById(R.id.txtHealth);
        txtExperience = itemView.findViewById(R.id.txtExperience);


    }
}
