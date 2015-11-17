package com.example.spopescu.testapplication.controllers;

import com.example.spopescu.testapplication.interfaces.FootballPlayer;

import java.util.ArrayList;

/**
 * Created by spopescu on 11/17/2015.
 */
public class MainController {
    public static final MainController instance = new MainController();
    private ArrayList<FootballPlayer> footballPlayersList;
    private MainController (){
        footballPlayersList = new ArrayList<>();
    }

    public ArrayList<FootballPlayer> getFootballPlayersList() {
        return footballPlayersList;
    }
}
