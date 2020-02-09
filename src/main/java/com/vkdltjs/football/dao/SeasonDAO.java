package com.vkdltjs.football.dao;

import com.vkdltjs.football.model.Match;
import com.vkdltjs.football.model.Season;
import com.vkdltjs.football.model.SeasonDetail;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public interface SeasonDAO extends CommonDAO{
    List<Season> getSeasons();
    SeasonDetail getSingleSeason(int seasonId);
}
