package com.vkdltjs.football.model;

public class Team {
    private final int teamId;
    private final String teamName;
    private final String countryName;

    public Team(int teamId, String teamName, String countryName) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.countryName = countryName;
    }
    public int getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getCountryName() {
        return countryName;
    }
}
