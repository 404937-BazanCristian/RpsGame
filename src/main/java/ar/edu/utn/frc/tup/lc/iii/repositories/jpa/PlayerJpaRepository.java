package ar.edu.utn.frc.tup.lc.iii.repositories.jpa;

import ar.edu.utn.frc.tup.lc.iii.entities.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerJpaRepository extends JpaRepository<PlayerEntity, Long> {

    Optional<PlayerEntity> findByUserNameOrEmail(String username, String mail);

    Optional<PlayerEntity> findByUserNameAndPassword(String username, String password);

    Optional<PlayerEntity> findByEmailAndPassword(String email, String password);

    @Query("SELECT p FROM PlayerEntity p " +
            "WHERE (p.userName LIKE :identity OR p.email LIKE :identity) AND p.password LIKE :password")
    Optional<PlayerEntity> findByUserNameOrEmailAndPassword(@Param("identity") String identity, @Param("password") String password);
}
