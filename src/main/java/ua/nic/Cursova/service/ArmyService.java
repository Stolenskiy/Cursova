package ua.nic.Cursova.service;

import ua.nic.Cursova.model.ArmyEntity;
import ua.nic.Cursova.repository.IArmyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class ArmyService implements IEntityService {
    
    private static Logger log = Logger.getLogger(ArmyService.class.getName());
    @Autowired
    IArmyRepository armyRepository;


    @Override
    public ArmyEntity getById(Long id) {
        log.info("In ArmyService getById{{}" + id);
        return armyRepository.getOne(id);
    }

    @Override
    public void save(Object army) {
        log.info("In ArmyService save{}" + army);

        armyRepository.save((ArmyEntity) army);
    }

    @Override
    public void delete(Long id) {
        log.info("In ArmyService delete{}" + id);
        armyRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return armyRepository.findAll();
    }
}
