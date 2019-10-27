package com.example.try2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddUserFragment extends Fragment {
    String name;
    private Button b;
    public AddUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_user, container, false);

        b = view.findViewById(R.id.bn_Save);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            Contact contact = new Contact();
            contact.setEmail("asfas");
            contact.setName("asfags");
            contact.setNumber(1241256);
            contact.setImage("asgadgag");

            MainActivity.userDatabase.userDao().insertUser(contact);
                Toast.makeText(getActivity(),"User Added Successfully",Toast.LENGTH_SHORT).show();

            contact.setImage("");
            contact.setEmail("");
            contact.setName("");
            }
        });

        return view;
        }

}
