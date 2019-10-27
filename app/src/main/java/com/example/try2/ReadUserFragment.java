package com.example.try2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReadUserFragment extends Fragment {

    private TextView txtinfo;
    public ReadUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_read_user, container, false);
        txtinfo = view.findViewById(R.id.txt1);

        List<Contact> contacts = MainActivity.userDatabase.userDao().getContacts();

        String info = "";

        for(Contact contact : contacts)
        {
            String name= contact.getEmail();
            String email = contact.getEmail();
            int number = contact.getNumber();
            String image = contact.getImage();
            info = info+"\n\n"+"name :"+name+"\n email :" +email+"\n"+"Number :"+number;

        }
        txtinfo.setText(info);
        return view;
    }

}
