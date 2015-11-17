package com.example.spopescu.testapplication.beans;

import com.example.spopescu.testapplication.interfaces.FootballPlayer;

/**
 * Created by spopescu on 11/16/2015.
 */
public class Midfielder implements FootballPlayer {
    private String name;
    private int shot, pass, speed;

    public Midfielder(String name, int shot, int pass, int speed) {
        this.name = name;
        this.shot = shot;
        this.pass = pass;
        this.speed = speed;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShot() {
        return shot;
    }

    public void setShot(int shot) {
        this.shot = shot;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    @Override
    public float getOverall() {
        return (shot + pass + speed) / 2;
    }
}
