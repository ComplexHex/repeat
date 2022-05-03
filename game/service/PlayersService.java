package com.game.service;

import com.game.entity.Player;
import com.game.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PlayersService {
    private PlayerRepository playerRepository;

    @Autowired
    public void setPlayerRepository(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }


    public List<Player> getAllPlayers() {
        System.out.println(3);
        return playerRepository.findAll();
    }

    public Player getByID(Long id){
        return playerRepository.getOne(id);
    }

    public void savePlayer(Player player){
        playerRepository.save(player);
    }
}
