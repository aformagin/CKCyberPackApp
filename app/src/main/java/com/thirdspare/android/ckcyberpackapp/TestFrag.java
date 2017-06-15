package com.thirdspare.android.ckcyberpackapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class TestFrag extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parentViewGroup, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_test, parentViewGroup, false);
    }
}
