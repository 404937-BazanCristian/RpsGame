package ar.edu.utn.frc.tup.lc.iii.services.impl;

import ar.edu.utn.frc.tup.lc.iii.entities.GameEntity;
import ar.edu.utn.frc.tup.lc.iii.models.Game;
import ar.edu.utn.frc.tup.lc.iii.repositories.jpa.GameJpaRepository;
import ar.edu.utn.frc.tup.lc.iii.services.GameService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameJpaRepository gameJpaRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Game getGame(Long gameId) {
        GameEntity gameEntity = gameJpaRepository.getReferenceById(gameId);
        return modelMapper.map(gameEntity, Game.class);
    }
}
