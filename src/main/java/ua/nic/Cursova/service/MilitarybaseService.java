package ua.nic.Cursova.service;

import ua.nic.Cursova.model.MilitarybaseEntity;
import ua.nic.Cursova.repository.IMilitarybaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class MilitarybaseService implements IEntityService {
    
    private static Logger log = Logger.getLogger(MilitarybaseService.class.getName());
    @Autowired
    IMilitarybaseRepository militarybaseRepository;


    @Override
    public MilitarybaseEntity getById(Long id) {
        log.info("In MilitarybaseService getById{{}" + id);
        return militarybaseRepository.getOne(id);
    }

    @Override
    public void save(Object militarybase) {
        log.info("In MilitarybaseService save{}" + militarybase);

        militarybaseRepository.save((MilitarybaseEntity) militarybase);
    }

    @Override
    public void delete(Long id) {
        log.info("In MilitarybaseService delete{}" + id);
        militarybaseRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return militarybaseRepository.findAll();
    }
}
