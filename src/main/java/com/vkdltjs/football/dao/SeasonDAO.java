package com.vkdltjs.football.dao;

import com.vkdltjs.football.model.Match;
import com.vkdltjs.football.model.Season;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.List;

public interface SeasonDAO {
    List<Season> getSeasons(String from, String to, int teamId);
    Connection connect();
}
