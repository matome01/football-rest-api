package com.vkdltjs.football.model;

public class Season {
    private final int seasonId;
    private final String seasonName;

    public Season(int seasonId, String seasonName) {
        this.seasonId = seasonId;
        this.seasonName = seasonName;
    }

    public int getSeasonId() {
        return seasonId;
    }

    public String getSeasonName() {
        return seasonName;
    }
}
