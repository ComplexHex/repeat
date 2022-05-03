package com.game.controller;

import com.game.entity.Player;
import com.game.service.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/rest/players")
@RestController
public class PlayersController {
    private PlayersService playersService;

    @Autowired
    public void setPlayersService(PlayersService playersService) {
        this.playersService = playersService;
    }

    @GetMapping("")
    public List<Player> list(){
        return playersService.getAllPlayers();
    }

//    public String showPlayersPage(Model model) {
//        System.out.println(1);
//        model.addAttribute("players", playersService.getAllPlayers());
//        System.out.println(2);
//        return "index";
//    }

//    @PostMapping("/")
//    public String addPlayer(@RequestBody Player player){
//        playersService.savePlayer(player);
//        return "redirect://rest/players";
//    }

    @PostMapping("/")
    public void add(@RequestBody Player player) {
        playersService.savePlayer(player);
    }


    @GetMapping("/{id}")
    public String show(@PathVariable("id") Long id, Model model){
        Player player = playersService.getByID(id);
        model.addAttribute("player", player);
        return "/{id}";
    }


}
