package com.vkdltjs.football.dao;

import com.vkdltjs.football.model.Match;
import com.vkdltjs.football.model.Season;
import com.vkdltjs.football.model.SeasonDetail;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public interface SeasonDAO {
    List<Season> getSeasons();
    SeasonDetail getSingleSeason(int seasonId);
    default Connection connect() {
        String dbFile = ":resource:sport.db";
        String url = "jdbc:sqlite:"+dbFile;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        }catch(SQLException e) {
            System.out.println(e);
        }
        return conn;
    };
}
