package com.example.spopescu.testapplication.beans;

import com.example.spopescu.testapplication.interfaces.FootballPlayer;

/**
 * Created by spopescu on 11/16/2015.
 */
public class FootballPlayerFactory {
    public enum PlayerType {
        GOALKEEPER, DEFENDER, MIDFIELDFER, ATTACKER
    }
    public static FootballPlayer getFootballPlayer (PlayerType type, Object[] parameters) {
        if (type == PlayerType.GOALKEEPER) {
            return new Goalkeeper((String) parameters[0], (int) parameters[1], (int) parameters[2]);
        } else if (type == PlayerType.DEFENDER) {
            return new Defender((String) parameters[0], (int) parameters[1], (int) parameters[2], (int) parameters[3]);
        } else if (type == PlayerType.MIDFIELDFER) {
            return new Midfielder((String) parameters[0], (int) parameters[1], (int) parameters[2], (int) parameters[3]);
        } else if (type == PlayerType.ATTACKER) {
            return new Attacker((String) parameters[0], (int) parameters[1], (int) parameters[2], (int) parameters[3], (int) parameters[4]);
        } else {
            return null;
        }
    }
}
