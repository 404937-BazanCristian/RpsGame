package ar.edu.utn.frc.tup.lc.iii;

import static org.assertj.core.api.Assertions.assertThat;

import ar.edu.utn.frc.tup.lc.iii.controllers.PingController;
import ar.edu.utn.frc.tup.lc.iii.controllers.PlayerController;
import ar.edu.utn.frc.tup.lc.iii.services.PlayerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {

    @Autowired
    private PlayerController playerController;

    @Autowired
    private PingController pingController;

    @Autowired
    private PlayerService playerService;

    @Test
    public void contextLoads() throws Exception{
        assertThat(playerController).isNotNull();
        assertThat(pingController).isNotNull();
        assertThat(playerService).isNotNull();
    }
}