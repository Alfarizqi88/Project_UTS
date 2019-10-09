package id.ac.polinema.project_uts.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import id.ac.polinema.project_uts.R;
import id.ac.polinema.project_uts.activities.SegitigaActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class SegitigaFragment extends Fragment {


    public SegitigaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_segitiga, container, false);
        Button btnLatihan = (Button) view.findViewById(R.id.btnLatihan);
        btnLatihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SegitigaActivity.class);
                getActivity().startActivity(intent);
            }
        });
        return view;
    }

}
