package com.example.try2;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import io.reactivex.Flowable;

@Dao
public interface UserDao {
    @Insert
    void insertUser(Contact contacts);

    @Query("Select * from contact")
    public List<Contact> getContacts();

    @Delete
    public void deleteUser(Contact contact);



}
