package com.vkdltjs.football.dao;

import com.vkdltjs.football.model.Season;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.List;

@Repository
public class SeasonDataAccessService implements SeasonDAO{

    @Override
    public List<Season> getSeasons(String from, String to, int teamId) {
        return null;
    }

    @Override
    public Connection connect() {
        return null;
    }
}
