package com.game.controller;

import com.game.entity.Player;
import com.game.service.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/rest/players")
@RestController
public class PlayersController {
    private PlayersService playersService;

    @Autowired
    public void setPlayersService(PlayersService playersService) {
        this.playersService = playersService;
    }

//    @GetMapping("")
//    public List<Player> list() {
//        return playersService.getAllPlayers();
//    }

    @GetMapping("")
    public ResponseEntity<List<Player>> getAllPlayer(
            @RequestParam(required = false, defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "3") Integer pageSize,
            @RequestParam (defaultValue = "id" )String sortBy
//
//            @RequestParam(defaultValue = "name") String sortByName
//            @RequestParam(defaultValue = "empty") String sortByExp,
//            @RequestParam(defaultValue = "empty") String sortByBirth


           ) {

//        if (sortBy != null){
//            sortBy = "id";
//        }
//        if (!sortByName.equals("empty")){
//            sortBy = "name";
//        }

// Bad request to GET /rest/players?&pageNumber=0&pageSize=3&order=NAME

        List<Player> list = playersService.getAllPlayers(pageNo, pageSize, sortBy);
        return new ResponseEntity<List<Player>>(list, new HttpHeaders(), HttpStatus.OK);
    }

//    @GetMapping("")
//    Page<Player> getPlayers(Pageable pageable) {
//        return playersService.getAllPlayers(pageable);
//    }


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
