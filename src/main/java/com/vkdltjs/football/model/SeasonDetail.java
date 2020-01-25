package com.vkdltjs.football.model;

import java.util.List;

public class SeasonDetail extends Season {
    private final List<Team> seasonTeams;

    public SeasonDetail(int seasonId, String seasonName, List<Team> seasonTeams) {
        super(seasonId, seasonName);
        this.seasonTeams = seasonTeams;
    }
    public List<Team> getSeasonTeams() {
        return seasonTeams;
    }
}