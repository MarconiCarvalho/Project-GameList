package com.dev.projectGames.service;

import com.dev.projectGames.dto.GameMinDto;
import com.dev.projectGames.entities.Game;
import com.dev.projectGames.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDto> findAll(){
      List<Game> result = gameRepository. findAll();
      return  result.stream().map(x -> new GameMinDto(x)).toList();
    }
}
