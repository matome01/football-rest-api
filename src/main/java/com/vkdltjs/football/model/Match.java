package com.vkdltjs.football.model;


import java.sql.Date;

public class Match {
    private final int match_id;
    private final Date play_date;
    private final String home;
    private final String away;
    private final Integer home_score;
    private final Integer away_score;

    public Match(int match_id, Date play_date, String home, String away, Integer home_score, Integer away_score) {
        this.match_id = match_id;
        this.play_date = play_date;
        this.home = home;
        this.away = away;
        this.home_score = home_score;
        this.away_score = away_score;
    }

    public int getMatch_id() {
        return match_id;
    }

    public Date getPlay_date() {
        return play_date;
    }

    public String getHome() {
        return home;
    }

    public String getAway() {
        return away;
    }

    public Integer getHome_score() {
        return home_score;
    }

    public Integer getAway_score() {
        return away_score;
    }
}
