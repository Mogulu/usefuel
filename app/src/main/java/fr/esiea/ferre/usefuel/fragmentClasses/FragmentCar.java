package fr.esiea.ferre.usefuel.fragmentClasses;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.esiea.ferre.usefuel.R;

public class FragmentCar extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.activity_fragment_car, container, false);
        return view;
    }
}