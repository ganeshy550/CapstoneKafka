package com.capstone.teams.dto;

public class TeamScoreDTO {

    private String teamName;
    private int teamScore;
    private int teamWickets;

    public TeamScoreDTO(String teamName, int teamScore, int teamWickets) {
        this.teamName = teamName;
        this.teamScore = teamScore;
        this.teamWickets = teamWickets;
    }

    public TeamScoreDTO() {
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamScore() {
        return teamScore;
    }

    public void setTeamScore(int teamScore) {
        this.teamScore = teamScore;
    }

    public int getTeamWickets() {
        return teamWickets;
    }

    public void setTeamWickets(int teamWickets) {
        this.teamWickets = teamWickets;
    }
}
