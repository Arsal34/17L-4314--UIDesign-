package com.example.try2;

import android.content.Context;
import android.service.autofill.UserData;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


@Database(entities = Contact.class, version = 1)
public abstract class UserDatabase extends RoomDatabase {
    public abstract UserDao userDao();

}
