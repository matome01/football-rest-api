package com.vkdltjs.football.dao;

import com.vkdltjs.football.model.Match;
import com.vkdltjs.football.model.Team;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public interface TeamDAO extends CommonDAO{
    List<Team> getTeams();
    Team getSingleTeam(int teamId);
}
