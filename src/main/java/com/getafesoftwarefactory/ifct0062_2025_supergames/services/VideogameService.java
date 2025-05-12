package com.getafesoftwarefactory.ifct0062_2025_supergames.services;

import com.getafesoftwarefactory.ifct0062_2025_supergames.model.Videogame;
import com.getafesoftwarefactory.ifct0062_2025_supergames.repository.IVideogameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VideogameService {
    @Autowired
    IVideogameRepository videogameRepository;

    public List<Videogame> getAllVideogames(){

        return videogameRepository.findAll();
    }

    public Videogame createVideogame(Videogame videogame){
        return videogameRepository.save(videogame);
    }

    public Videogame updateVideogame(Videogame videogame){
        return videogameRepository.save(videogame);
    }
}
