package ar.edu.utn.frc.tup.lc.iii.services;

import ar.edu.utn.frc.tup.lc.iii.models.Player;
import org.springframework.stereotype.Service;

@Service
public interface PlayerService {

    Player getPlayerById(Long id);

    Player savePlayer(Player player);

    Player getPlayerByUserNameAndPassword(String userName, String password);

    Player getPlayerByEmailAndPassword(String email, String password);

    Player getPlayerByUsernameOrEmailAndPassword(String identity, String password);
}
