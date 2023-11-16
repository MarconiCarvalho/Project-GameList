package com.dev.projectGames.repositories;

import com.dev.projectGames.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GameRepository extends JpaRepository<Game, Long> {
}
