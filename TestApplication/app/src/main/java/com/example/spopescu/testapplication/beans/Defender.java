package com.example.spopescu.testapplication.beans;

import com.example.spopescu.testapplication.interfaces.FootballPlayer;

/**
 * Created by spopescu on 11/16/2015.
 */
public class Defender implements FootballPlayer {
    private String name;
    private int header, standingTackle, slidingTackle;

    public Defender(String name, int slidingTackle, int header, int standingTackle) {
        this.slidingTackle = slidingTackle;
        this.name = name;
        this.header = header;
        this.standingTackle = standingTackle;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeader() {
        return header;
    }

    public void setHeader(int header) {
        this.header = header;
    }

    public int getStandingTackle() {
        return standingTackle;
    }

    public void setStandingTackle(int standingTackle) {
        this.standingTackle = standingTackle;
    }

    public int getSlidingTackle() {
        return slidingTackle;
    }

    public void setSlidingTackle(int slidingTackle) {
        this.slidingTackle = slidingTackle;
    }

    @Override
    public float getOverall() {
        return (header + standingTackle + slidingTackle) / 3;
    }
}
