package ar.edu.utn.frc.tup.lc.iii.services;

import ar.edu.utn.frc.tup.lc.iii.dtos.match.MatchDTO;
import ar.edu.utn.frc.tup.lc.iii.dtos.play.PlayRequest;
import ar.edu.utn.frc.tup.lc.iii.models.Match;
import ar.edu.utn.frc.tup.lc.iii.models.Play;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface MatchService {

    List<Match> getMatchesByPlayer(Long playerId);

    Match createMatch(MatchDTO matchDTO);

    Match getMatchById(Long id);

    Play play(Long matchId, PlayRequest play);
}
