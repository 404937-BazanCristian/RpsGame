package ar.edu.utn.frc.tup.lc.iii.repositories.jpa;

import ar.edu.utn.frc.tup.lc.iii.entities.MatchEntity;
import ar.edu.utn.frc.tup.lc.iii.entities.MatchRpsEntity;
import ar.edu.utn.frc.tup.lc.iii.models.Match;

public class MatchEntityFactory {

    public static Class<? extends MatchEntity> getTypeOfMatch(Match match){
        switch (match.getGame().getCode()){
            case "RPS":
                return MatchRpsEntity.class;
            default:
                return MatchRpsEntity.class;
        }
    }
}
