package com.getafesoftwarefactory.ifct0062_2025_supergames.services;

import com.getafesoftwarefactory.ifct0062_2025_supergames.model.Genre;
import com.getafesoftwarefactory.ifct0062_2025_supergames.model.Videogame;
import com.getafesoftwarefactory.ifct0062_2025_supergames.repository.IGenreRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VideogameServiceTest {
    @Autowired
    VideogameService videogameService;

    @Autowired
    IGenreRepository genreRepository;

    @Test
    public void createVideogame() {
        Genre genero = new Genre("Genero Borrar", "Descripción Borrar");
        genero = genreRepository.save(genero);

        Videogame videogame = new Videogame("Borrar", "Platform", true, 100, true, genero);
        videogame = videogameService.createVideogame(videogame);
        assertNotNull(videogame);
    }
}
