package com.gameracks.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gameracks.backend.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
