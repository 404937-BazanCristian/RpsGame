package ar.edu.utn.frc.tup.lc.iii.dtos.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Credential {

    private Identity identity;
    private String password;

}
