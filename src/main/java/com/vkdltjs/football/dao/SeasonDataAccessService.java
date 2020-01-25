package com.vkdltjs.football.dao;

import com.vkdltjs.football.model.Season;
import com.vkdltjs.football.model.SeasonDetail;
import com.vkdltjs.football.model.Team;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SeasonDataAccessService implements SeasonDAO{

    @Override
    public List<Season> getSeasons() {
        String sql = "SELECT season_id, key FROM events WHERE league_id = 1;";
        List<Season> seasons = new ArrayList<>();
        try(Connection conn = this.connect();
            PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int seasonId = resultSet.getInt("season_id");
                String seasonName = resultSet.getString("key");
                seasons.add(new Season(seasonId, seasonName));
            }
        }catch(SQLException e) {
            System.out.println(e);
        }
        return seasons;
    }

    @Override
    public SeasonDetail getSingleSeason(int seasonId) {
        String sql = "SELECT events.season_id, events.key, events_teams.team_id, teams.key AS team_key, teams.title, teams.synonyms FROM events JOIN events_teams ON events.id = events_teams.event_id JOIN teams ON teams.id = events_teams.team_id WHERE events.league_id = 1 AND events.season_id = ?;";
        List<Team> seasonTeams = new ArrayList<>();
        String seasonName = "";
        try(Connection conn = this.connect();
            PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setInt(1, seasonId);
            ResultSet resultSet = preparedStatement.executeQuery();
            seasonName = resultSet.getString("key");
            while(resultSet.next()) {
                int teamId = resultSet.getInt("team_id");
                String teamKey =resultSet.getString("team_key");
                String title = resultSet.getString("title");
                String synonyms = resultSet.getString("synonyms");
                seasonTeams.add(new Team(teamId, teamKey, title, synonyms));
            }
        }catch(SQLException e) {
            System.out.println(e);
        }
        return new SeasonDetail(seasonId, seasonName, seasonTeams);
    }

}
