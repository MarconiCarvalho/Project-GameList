package com.dev.projectGames.service;

import com.dev.projectGames.dto.GameListDTO;
import com.dev.projectGames.dto.GameMinDTO;
import com.dev.projectGames.entities.GameList;
import com.dev.projectGames.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
      List<GameList> result = gameListRepository. findAll();
      return  result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
