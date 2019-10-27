package com.example.try2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeleteUserFragment extends Fragment {

    private EditText txtnum;
    private Button dltbn;
    public DeleteUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view = inflater.inflate(R.layout.fragment_delete_user, container, false);
       txtnum = view.findViewById(R.id.txt_editor);
       dltbn = view.findViewById(R.id.bn_deleter);

       dltbn.setOnClickListener(new View.OnClickListener()
        {


            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(txtnum.getText().toString());
                Contact contact = new Contact();
                contact.setNumber(num);
                MainActivity.userDatabase.userDao().deleteUser(contact);

                Toast.makeText(getActivity(),"Contact Removed", Toast.LENGTH_SHORT).show();
                txtnum.setText("");
            }
        });

        return view;
    }

}
