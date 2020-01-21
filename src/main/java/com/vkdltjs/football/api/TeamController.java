package com.vkdltjs.football.api;

import com.vkdltjs.football.model.Team;
import com.vkdltjs.football.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("api/v1/teams")
@RestController
public class TeamController {
    private final TeamService teamService;
    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }
    @GetMapping
    public List<Team> getTeams() {
        return teamService.getTeams();
    }
    @GetMapping("/{teamId}")
    public Team getSingleTeam(@PathVariable("teamId") int teamId) {
        return teamService.getSingleTeam(teamId);
    }
}
