package com.vkdltjs.football.dao;

import com.vkdltjs.football.model.Team;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.List;

@Repository
public class TeamDataAccessService implements TeamDAO{

    @Override
    public List<Team> getTeams() {

        return null;
    }

    @Override
    public Team getSingleTeam(int teamId) {
        return null;
    }

    @Override
    public Connection connect() {
        return null;
    }
}
