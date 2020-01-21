package com.vkdltjs.football.dao;

import com.vkdltjs.football.model.Match;

import java.sql.Connection;
import java.util.List;

public interface MatchDAO {
    List<Match> getMatches(String from, String to, int teamId);
    Connection connect();
}
