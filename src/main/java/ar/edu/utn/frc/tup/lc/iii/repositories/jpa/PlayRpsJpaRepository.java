package ar.edu.utn.frc.tup.lc.iii.repositories.jpa;

import ar.edu.utn.frc.tup.lc.iii.entities.PlayRpsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayRpsJpaRepository extends JpaRepository<PlayRpsEntity, Long> {
}
