package com.vkdltjs.football.model;

public class Team {
    private final int teamId;
    private final String key;
    private final String title;
    private final String synonyms;

    public Team(int teamId, String key, String title, String synonyms) {
        this.teamId = teamId;
        this.key = key;
        this.title = title;
        this.synonyms = synonyms;
    }

    public int getTeamId() {
        return teamId;
    }

    public String getKey() {
        return key;
    }

    public String getTitle() {
        return title;
    }

    public String getSynonyms() {
        return synonyms;
    }
}
