package com.getafesoftwarefactory.ifct0062_2025_supergames.repository;

import com.getafesoftwarefactory.ifct0062_2025_supergames.model.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;

// Persistence layer
public interface IVideogameRepository extends JpaRepository<Videogame, Integer> {

}
