package com.example.try2;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import io.reactivex.annotations.NonNull;


@Entity(tableName = "Contact")
public class Contact {
    @NonNull
    @ColumnInfo(name = "id")
    String name;

    @PrimaryKey
    @ColumnInfo(name = "number")
    int number;

    @ColumnInfo(name = "email")
    String email;

    @ColumnInfo(name = "image")
    String image;


    public Contact()
    {
        name = "";
        number = 0;
        email = "";
        image = "" ;

    }

    public Contact(String n,int num, String em, String img )
    {
        this.name = n;
        this.number=num;
        this.email = em;
        this.image = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    @Override
    public String toString()
    {
        return new StringBuilder(name).append("\n").append(email).append("\n").append(number).toString();

    }
}
