package com.example.pokemonteam.classes;

import android.os.Parcelable;

import java.io.Serializable;

public class Pokemon implements Serializable {
    private String name;
    private int number;
    private String type;
    private String ability;
    private int resID;

    public Pokemon(String name, int number, String type, String ability, int resID) {
        this.name = name;
        this.number = number;
        this.type = type;
        this.ability = ability;
        this.resID = resID;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public String getAbility() {
        return ability;
    }

    public int getResID() {
        return resID;
    }

    public String toString() {
        return name;
    }
}
