package com.mateus.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
    
}
