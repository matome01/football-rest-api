package com.vkdltjs.football.service;

import com.vkdltjs.football.dao.TeamDAO;
import com.vkdltjs.football.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TeamService {
    private final TeamDAO teamDAO;
    @Autowired
    public TeamService(TeamDAO teamDAO) {
        this.teamDAO = teamDAO;
    }
    public List<Team> getTeams() {
        return teamDAO.getTeams();
    }
    public Team getSingleTeam(int teamId) {
        return teamDAO.getSingleTeam(teamId);
    }
}
