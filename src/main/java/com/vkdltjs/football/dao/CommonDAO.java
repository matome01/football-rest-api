package com.vkdltjs.football.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface CommonDAO {
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
