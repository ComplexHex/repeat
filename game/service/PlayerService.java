package com.game.service;

import com.game.entity.Player;
import com.game.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;
    public PlayerService() {
    }

    public List<Player> listAllPlayer() {
        return playerRepository.findAll();
    }

    public void saveUser(Player player) {
        playerRepository.save(player);
    }

    public Player getUser(Integer id) {
        return playerRepository.findById(id).get();
    }

    public void deleteUser(Integer id) {
        playerRepository.deleteById(id);
    }

}
