package com.vkdltjs.football.dao;

import com.vkdltjs.football.model.Team;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TeamDataAccessService implements TeamDAO{

    @Override
    public List<Team> getTeams() {
        String sql = "SELECT id, key, title, synonyms FROM teams;";
        List<Team> teams = new ArrayList<>();
        try(Connection conn = this.connect();
            PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String key = resultSet.getString("key");
                String title = resultSet.getString("title");
                String synonyms = resultSet.getString("synonyms");
                teams.add(new Team(id, key, title, synonyms));
            }
        }catch(SQLException e) {
            System.out.println(e);
        }
        return teams;
    }

    @Override
    public Team getSingleTeam(int teamId) {
        return null;
    }

    @Override
    public Connection connect(){
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
