package com.capstone.cricketmatch.entity;


public class PlayerStats {
    private String playerId;      // Changed from userId
    private String playerName;    // Changed from userName
    private int runsScored;      // Changed from currentScore
    private int wicketsTaken;    // Changed from currentWickets

    public PlayerStats(String playerId, String playerName, int runsScored, int wicketsTaken) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runsScored = runsScored;
        this.wicketsTaken = wicketsTaken;
    }

    public PlayerStats() {
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public int getWicketsTaken() {
        return wicketsTaken;
    }

    public void setWicketsTaken(int wicketsTaken) {
        this.wicketsTaken = wicketsTaken;
    }
}