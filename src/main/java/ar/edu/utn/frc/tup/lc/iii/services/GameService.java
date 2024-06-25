package ar.edu.utn.frc.tup.lc.iii.services;

import ar.edu.utn.frc.tup.lc.iii.models.Game;
import org.springframework.stereotype.Service;

@Service
public interface GameService {

    Game getGame(Long gameId);
}
