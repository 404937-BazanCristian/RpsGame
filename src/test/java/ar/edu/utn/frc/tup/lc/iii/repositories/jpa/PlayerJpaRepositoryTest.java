package ar.edu.utn.frc.tup.lc.iii.repositories.jpa;

import ar.edu.utn.frc.tup.lc.iii.entities.PlayerEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class PlayerJpaRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private PlayerJpaRepository playerJpaRepository;

    @Test
    public  void findByUserNameOrEmailTest(){
        PlayerEntity playerEntity = new PlayerEntity();
        playerEntity.setEmail("email@email.com");
        playerEntity.setUserName("Cristian");
        playerEntity.setPassword("Password03#");

        entityManager.persist(playerEntity);
        entityManager.flush();

        Optional<PlayerEntity> result = playerJpaRepository.findByUserNameOrEmail("Cristian", "email@email.com");
        assertEquals("Cristian", result.get().getUserName());
    }
}
