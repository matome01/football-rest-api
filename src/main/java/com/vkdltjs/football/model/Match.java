package com.vkdltjs.football.model;


import java.sql.Date;
import java.sql.Timestamp;

public class Match {
    private final int match_id;
    private final Date play_date;
    private final String home;
    private final String away;
    private final int home_score;
    private final int away_score;

    public Match(int match_id, Date play_date, String home, String away, int home_score, int away_score) {
        this.match_id = match_id;
        this.play_date = play_date;
        this.home = home;
        this.away = away;
        this.home_score = home_score;
        this.away_score = away_score;
    }

    public int getMatchId() { return match_id; }

    public Date getPlay_at() { return play_date; }

    public String getTeam1() { return home; }

    public String getTeam2() {
        return away;
    }

    public int getScore1() {
        return home_score;
    }

    public int getScore2() {
        return away_score;
    }
}
