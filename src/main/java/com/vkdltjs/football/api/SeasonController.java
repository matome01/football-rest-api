package com.vkdltjs.football.api;

import com.vkdltjs.football.model.Season;
import com.vkdltjs.football.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}