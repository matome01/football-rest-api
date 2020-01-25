package com.vkdltjs.football.dao;

import com.vkdltjs.football.model.Match;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
@Repository("TestDAO")
public class TestMatchDataAccessService implements MatchDAO {
    @Override
    public List<Match> getMatches(String from, String to, int teamId) {
        List<Match> test = new ArrayList<>();
        test.add(new Match(1, Date.valueOf("2020-02-08"), "HoroTeam1", "HoroTeam2", 7, 4));

        return test;
    }
}
