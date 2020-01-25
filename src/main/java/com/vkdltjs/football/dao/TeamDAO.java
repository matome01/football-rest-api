package com.vkdltjs.football.dao;

import com.vkdltjs.football.model.Match;
import com.vkdltjs.football.model.Team;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public interface TeamDAO {
    List<Team> getTeams();
    Team getSingleTeam(int teamId);
    default Connection connect() {
        String dbFile = ":resource:sport.db";
        String url = "jdbc:sqlite:"+dbFile;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        }catch(SQLException e) {
            System.out.println(e);
        }
        return conn;
    };
}
