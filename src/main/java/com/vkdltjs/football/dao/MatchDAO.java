package com.vkdltjs.football.dao;

import com.vkdltjs.football.model.Match;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public interface MatchDAO extends CommonDAO{
    List<Match> getMatches(String from, String to, int teamId);
}
