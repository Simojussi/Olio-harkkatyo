package com.example.lutemon_fighter_ultimate;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.lutemon_fighter_ultimate.Fragments.BattelingStatsFragment;
import com.example.lutemon_fighter_ultimate.Fragments.TrainingStatsFragment;

public class TabPagerAdapter extends FragmentStateAdapter {

    public TabPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new TrainingStatsFragment();
            case 1:
                return new BattelingStatsFragment();
            default:
                return new TrainingStatsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
