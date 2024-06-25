package ar.edu.utn.frc.tup.lc.iii.services;

import ar.edu.utn.frc.tup.lc.iii.dtos.login.Credential;
import ar.edu.utn.frc.tup.lc.iii.dtos.login.CredentialV2;
import ar.edu.utn.frc.tup.lc.iii.models.Player;
import org.springframework.stereotype.Service;

@Service
public interface LoginService{

    Player login(Credential credential);

    Player login(CredentialV2 credential);
}
