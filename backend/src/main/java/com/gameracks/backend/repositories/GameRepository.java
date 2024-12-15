package com.gameracks.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gameracks.backend.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
