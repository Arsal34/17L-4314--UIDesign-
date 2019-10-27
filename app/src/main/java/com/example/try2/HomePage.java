package com.example.try2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


    }

    public void btn_contacts(View view) {

        startActivity(new Intent(getApplicationContext(),Contacts.class));

    }
}
