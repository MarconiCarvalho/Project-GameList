package com.dev.projectGames.controller;
import com.dev.projectGames.dto.GameDTO;
import com.dev.projectGames.dto.GameMinDto;
import com.dev.projectGames.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {
  @Autowired
  private GameService gameService;

  @GetMapping(value = "/{id}")
  public GameDTO findById(@PathVariable Long id){
      GameDTO result = gameService.findById(id);
      return result;
  }
  @GetMapping
    public List<GameMinDto> findAll(){
     List<GameMinDto> result = gameService.findAll();
     return result;
    }

}
