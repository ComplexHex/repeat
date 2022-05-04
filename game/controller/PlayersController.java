package com.game.controller;

import com.game.entity.Player;
import com.game.repository.PlayerRepository;
import com.game.service.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/rest/players")
@RestController
public class PlayersController {
    private PlayersService playersService;
    private PlayerRepository playerRepository;

    @Autowired
    public void setPlayersService(PlayersService playersService) {
        this.playersService = playersService;
    }

        @GetMapping("")
    public List<Player> list() {
        return playersService.getAllPlayers();
    }



    @GetMapping("/count")
    public long getCount() {
        return playersService.count();
    }


//    @PostMapping("/")
//    public void add(@RequestBody Player player) {
//        playersService.savePlayer(player);
//    }
//
//
//    @GetMapping("/{id}")
//    public String show(@PathVariable("id") Long id, Model model){
//        Player player = playersService.getByID(id);
//        model.addAttribute("player", player);
//        return "/{id}";
//    }


}
