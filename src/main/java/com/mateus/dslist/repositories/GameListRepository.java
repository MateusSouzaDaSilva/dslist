package com.mateus.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mateus.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
