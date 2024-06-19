package ar.edu.utn.frc.tup.lc.iii.scaffolding.Services;

import ar.edu.utn.frc.tup.lc.iii.scaffolding.Models.Dummy;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DummyService {

    Dummy getDummy(Long id);

    List<Dummy> getDummyList();

    Dummy createDummy(Dummy dummy);

    void deleteDummy(Dummy dummy);

    Dummy updateDummy (Dummy dummy);


}
