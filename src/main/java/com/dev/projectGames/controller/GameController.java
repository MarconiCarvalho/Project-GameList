package com.dev.projectGames.controller;

import com.dev.projectGames.dto.GameMinDto;
import com.dev.projectGames.entities.Game;
import com.dev.projectGames.repositories.GameRepository;
import com.dev.projectGames.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {
  @Autowired
  private GameService gameService;

  @GetMapping
    public List<GameMinDto> findAll(){
     List<GameMinDto> result = gameService.findAll();
     return result;
    }

}
