package com.vkdltjs.football.service;

import com.vkdltjs.football.dao.SeasonDAO;
import com.vkdltjs.football.model.Season;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SeasonService {
    private final SeasonDAO seasonDAO;
    @Autowired
    public SeasonService(SeasonDAO seasonDAO) {
        this.seasonDAO = seasonDAO;
    }
    public List<Season> getSeasons(Map<String, String> allParams) {


    }
}
