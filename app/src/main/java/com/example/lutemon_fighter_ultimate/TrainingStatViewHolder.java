package com.example.lutemon_fighter_ultimate;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TrainingStatViewHolder extends RecyclerView.ViewHolder {

    TextView lutemonName, trainingDays, experience;

    ImageView lutemonPic;

    public TrainingStatViewHolder(@NonNull View itemView) {
        super(itemView);
        lutemonName = itemView.findViewById(R.id.txtLutemonName);

        trainingDays = itemView.findViewById(R.id.txtTrainingDays);

        experience = itemView.findViewById(R.id.txtExperiencePoints);

        lutemonPic = itemView.findViewById(R.id.imageLutemon);

    }
}
