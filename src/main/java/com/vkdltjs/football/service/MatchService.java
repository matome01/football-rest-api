package com.vkdltjs.football.service;

import com.vkdltjs.football.dao.MatchDAO;
import com.vkdltjs.football.model.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class MatchService {
    private final MatchDAO matchDAO;

    @Autowired
    public MatchService(@Qualifier("SqliteDAO") MatchDAO matchDAO) {
        this.matchDAO = matchDAO;
    }

    public List<Match> getMatches(Map<String, String> allParams) {
        String from = Optional.ofNullable(allParams.get("from")).orElse("1992-01-01");
        String to = Optional.ofNullable(allParams.get("to")).orElse("2030-01-01");
        String teamIdStr = Optional.ofNullable(allParams.get("teamId")).orElse("0");
        from = Date.valueOf(from).toString();
        to = Date.valueOf(to).toString();
        Integer teamId = Integer.valueOf(teamIdStr);
        return matchDAO.getMatches(from, to, teamId);
    }
}
