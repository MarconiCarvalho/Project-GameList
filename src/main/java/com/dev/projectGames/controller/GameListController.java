package com.dev.projectGames.controller;

import com.dev.projectGames.dto.GameMinDTO;
import com.dev.projectGames.service.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result =
    }
}
