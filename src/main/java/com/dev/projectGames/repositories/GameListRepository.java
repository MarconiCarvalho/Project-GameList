package com.dev.projectGames.repositories;

import com.dev.projectGames.entities.Game;
import com.dev.projectGames.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GameListRepository extends JpaRepository<GameList, Long> {
}
