package ar.edu.utn.frc.tup.lc.iii.scaffolding.Repositories;

import ar.edu.utn.frc.tup.lc.iii.scaffolding.Entities.DummyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyRepository extends JpaRepository<DummyEntity,Long>{

}
