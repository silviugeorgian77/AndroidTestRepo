package com.example.spopescu.testapplication.beans;

import com.example.spopescu.testapplication.interfaces.FootballPlayer;

/**
 * Created by spopescu on 11/16/2015.
 */
public class Attacker implements FootballPlayer {
    private String name;
    private int positioning, shot, speed, header;

    public Attacker(String name, int positioning, int shot, int speed, int header) {
        this.name = name;
        this.positioning = positioning;
        this.shot = shot;
        this.speed = speed;
        this.header = header;
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

    public int getShot() {
        return shot;
    }

    public void setShot(int shot) {
        this.shot = shot;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHeader() {
        return header;
    }

    public void setHeader(int header) {
        this.header = header;
    }


    @Override
    public float getOverall() {
        return (positioning + shot + speed + header) / 4;
    }
}
