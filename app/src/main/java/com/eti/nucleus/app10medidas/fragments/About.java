package com.eti.nucleus.app10medidas.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import com.eti.nucleus.app10medidas.R;
import com.eti.nucleus.app10medidas.activity.MainActivity;

public class About extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        MainActivity.isOpenDrawer = true;
        return inflater.inflate(R.layout.fragment_about,container,false);
    }

    @Override
    public void onResume() {
        super.onResume();
        MainActivity.myToolbar.setTitle(R.string.about);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_know_more,menu);
    }
}
