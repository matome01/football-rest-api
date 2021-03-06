package com.vkdltjs.football.api;

import com.vkdltjs.football.model.Season;
import com.vkdltjs.football.model.Team;
import com.vkdltjs.football.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("api/v1/seasons")
@RestController
public class SeasonController {
    private final SeasonService seasonService;
    @Autowired
    public SeasonController(SeasonService seasonService) {
        this.seasonService = seasonService;
    }
    @GetMapping
    public List<Season> getSeasons(@RequestParam Map<String, String> allParams) {
        return seasonService.getSeasons(allParams);
    }
    @GetMapping("/{seasonId}")
    public Season getSingleSeason(@PathVariable("seasonId") int seasonId) {
        return seasonService.getSingleSeason(seasonId);
    }
}