package com.vkdltjs.football.dao;

import com.vkdltjs.football.model.Match;
import com.vkdltjs.football.model.Team;

import java.sql.Connection;
import java.util.List;

public interface TeamDAO {
    List<Team> getTeams();
    Team getSingleTeam(int teamId);
    Connection connect();
}
