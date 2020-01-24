package com.vkdltjs.football.model;


import java.sql.Date;

public class Match {
    private final int matchId;
    private final Date playDate;
    private final String home;
    private final String away;
    private final Integer homeScore;
    private final Integer awayScore;

    public Match(int matchId, Date playDate, String home, String away, Integer homeScore, Integer awayScore) {
        this.matchId = matchId;
        this.playDate = playDate;
        this.home = home;
        this.away = away;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public int getMatchId() {
        return matchId;
    }

    public Date getPlayDate() {
        return playDate;
    }

    public String getHome() {
        return home;
    }

    public String getAway() {
        return away;
    }

    public Integer getHomeScore() {
        return homeScore;
    }

    public Integer getAwayScore() {
        return awayScore;
    }
}
