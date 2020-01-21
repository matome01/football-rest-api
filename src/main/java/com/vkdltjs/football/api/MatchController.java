package com.vkdltjs.football.api;

import com.vkdltjs.football.model.Match;
import com.vkdltjs.football.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@RequestMapping("api/v1/matches")
@RestController
public class MatchController {
    private final MatchService matchService;

    @Autowired
    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping
    public List<Match> getMatches(@RequestParam Map<String, String> allParams) {
        return matchService.getMatches(allParams);
    }
}
