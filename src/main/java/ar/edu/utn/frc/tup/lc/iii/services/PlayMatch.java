package ar.edu.utn.frc.tup.lc.iii.services;

import ar.edu.utn.frc.tup.lc.iii.models.Match;
import ar.edu.utn.frc.tup.lc.iii.models.Play;
import org.springframework.stereotype.Service;

/**
 *
 * @param <P> The Play response
 * @param <M> The Match to play
 */

@Service
public interface PlayMatch<P extends Play, M extends Match> {

    P play(P play, M match);
}
