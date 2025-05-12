package com.getafesoftwarefactory.ifct0062_2025_supergames.controller;

import com.getafesoftwarefactory.ifct0062_2025_supergames.model.Videogame;
import com.getafesoftwarefactory.ifct0062_2025_supergames.services.VideogameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {
    VideogameService videogameService;
    public AppController(VideogameService videogameService) {
        this.videogameService = videogameService;
    }

    @GetMapping("/")
    public String showMain(Model model){
        List<Videogame> videogamesList = this.videogameService.getAllVideogames();
        model.addAttribute("videogames", videogamesList);
        return "create";
    }

    @PostMapping("/videogames/") //@ModelAttribute grabs form data and makes parsing to Object
    public String createVideogame(@ModelAttribute Videogame newVideogame){
        // request param
        this.videogameService.createVideogame(newVideogame);
        return "index";
    }
}