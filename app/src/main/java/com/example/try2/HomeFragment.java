package com.example.try2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static com.example.try2.R.id.bn_add;
import static com.example.try2.R.id.bn_deleter;
import static com.example.try2.R.id.viewsss;
import static com.example.try2.R.id.Delete;



/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{
    private Button bn;
    private Button bn_view2;
    private Button bn_delete;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home2, container, false);

        bn = view.findViewById(bn_add);
        bn.setOnClickListener(this);

        bn_view2 = view.findViewById(viewsss);
        bn_view2.setOnClickListener(this);

        bn_delete = view.findViewById(Delete);
        bn_delete.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
    switch (view.getId())
    {
        case R.id.bn_add:
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new AddUserFragment()).addToBackStack(null).commit();
            break;
        case Delete:
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new DeleteUserFragment()).addToBackStack(null).commit();
            break;
        case viewsss:
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new ReadUserFragment()).addToBackStack(null).commit();
            break;


    }
    }
}
