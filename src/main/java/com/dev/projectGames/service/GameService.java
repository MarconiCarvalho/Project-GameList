package com.dev.projectGames.service;

import com.dev.projectGames.dto.GameDTO;
import com.dev.projectGames.dto.GameMinDTO;
import com.dev.projectGames.entities.Game;
import com.dev.projectGames.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
      List<Game> result = gameRepository. findAll();
      return  result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
