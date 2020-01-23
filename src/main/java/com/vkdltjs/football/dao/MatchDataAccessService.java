package com.vkdltjs.football.dao;

import com.vkdltjs.football.model.Match;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository("SqliteDAO")
public class MatchDataAccessService implements MatchDAO{

    @Override
    public List<Match> getMatches(String from, String to, int teamId) {
        String sql;
        if(teamId == 0) {
            sql = "SELECT games.id, play_at, teams1.title AS home, teams2.title AS away, score1 AS home_score, score2 AS away_score FROM games JOIN teams teams1 ON games.team1_id = teams1.id JOIN teams teams2 ON games.team2_id = teams2.id WHERE games.play_at >= ? AND games.play_at <= ?;";
        }else {
            sql = "SELECT games.id, play_at, teams1.title AS home, teams2.title AS away, score1 AS home_score, score2 AS away_score FROM games JOIN teams teams1 ON games.team1_id = teams1.id JOIN teams teams2 ON games.team2_id = teams2.id WHERE (teams1.id = ? OR teams2.id = ?) AND games.play_at >= ? AND games.play_at <= ?;";
        }
        List<Match> matches = new ArrayList<>();
        try(Connection conn = this.connect();
            PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            if(teamId == 0) {
                preparedStatement.setString(1, from);
                preparedStatement.setString(2, to);
            }else {
                preparedStatement.setInt(1, teamId);
                preparedStatement.setInt(2, teamId);
                preparedStatement.setString(3, from);
                preparedStatement.setString(4, to);
            }
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String playAt = resultSet.getString("play_at");
                String home = resultSet.getString("home");
                String away = resultSet.getString("away");
                Integer homeScore = resultSet.getInt("home_score");
                Integer awayScore = resultSet.getInt("away_score");
                if(resultSet.wasNull()) {
                    homeScore = null;
                    awayScore = null;
                }
                matches.add(new Match(id, Date.valueOf(playAt), home, away, homeScore, awayScore));
            }

        }catch(SQLException e) {
            System.out.println(e);
        }
        return matches;
    }

    @Override
    public Connection connect() {
        String dbFile = ":resource:sport.db";
        String url = "jdbc:sqlite:"+dbFile;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        }catch(SQLException e) {
            System.out.println(e);
        }
        return conn;
    }
}
