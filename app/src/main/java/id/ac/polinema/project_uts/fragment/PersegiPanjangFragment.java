package id.ac.polinema.project_uts.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.ac.polinema.project_uts.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PersegiPanjangFragment extends Fragment {


    public PersegiPanjangFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_persegi_panjang, container, false);
    }

}
