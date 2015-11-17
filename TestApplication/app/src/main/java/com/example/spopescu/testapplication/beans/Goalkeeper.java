package com.example.spopescu.testapplication.beans;

import com.example.spopescu.testapplication.interfaces.FootballPlayer;

/**
 * Created by spopescu on 11/16/2015.
 */
public class Goalkeeper implements FootballPlayer {
    private String name;
    private int positioning, reflexes;

    public Goalkeeper(String name, int positioning, int reflexes) {
        this.name = name;
        this.positioning = positioning;
        this.reflexes = reflexes;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPositioning() {
        return positioning;
    }

    public void setPositioning(int positioning) {
        this.positioning = positioning;
    }

    public int getReflexes() {
        return reflexes;
    }

    public void setReflexes(int reflexes) {
        this.reflexes = reflexes;
    }

    @Override
    public float getOverall() {
        return (positioning + reflexes) / 2;
    }
}
