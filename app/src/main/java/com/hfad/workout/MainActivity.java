package com.hfad.workout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements WorkoutListFragment.WorkoutListListener {

    WorkoutListFragment workoutListFragment;
    WorkoutDetailFragment workoutDetailFragment;
    FragmentTransaction ft1,ft2;
    FragmentManager fm;
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //workoutDetailFragment = new WorkoutDetailFragment();
        //workoutListFragment = new WorkoutListFragment();
        //fm = getSupportFragmentManager();
        //ft1 = fm.beginTransaction();
        //ft1.add(R.id.list_frag,workoutListFragment);
        //ft1.commit();
        //ft2 = fm.beginTransaction();
        //ft2.add(R.id.detail_fragment,workoutDetailFragment);
        //workoutDetailFragment.setWorkoutID(0);
        //ft2.commit();
    }
    public void itemClicked(int id){
        //workoutDetailFragment.setWorkoutID(id);
    }

}
