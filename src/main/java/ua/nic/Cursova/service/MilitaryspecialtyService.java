package ua.nic.Cursova.service;

import ua.nic.Cursova.model.MilitaryspecialtyEntity;
import ua.nic.Cursova.repository.IMilitaryspecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class MilitaryspecialtyService implements IEntityService {
    
    private static Logger log = Logger.getLogger(MilitaryspecialtyService.class.getName());
    @Autowired
    IMilitaryspecialtyRepository militaryspecialtyRepository;


    @Override
    public MilitaryspecialtyEntity getById(Long id) {
        log.info("In MilitaryspecialtyService getById{{}" + id);
        return militaryspecialtyRepository.getOne(id);
    }

    @Override
    public void save(Object militaryspecialty) {
        log.info("In MilitaryspecialtyService save{}" + militaryspecialty);

        militaryspecialtyRepository.save((MilitaryspecialtyEntity) militaryspecialty);
    }

    @Override
    public void delete(Long id) {
        log.info("In MilitaryspecialtyService delete{}" + id);
        militaryspecialtyRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return militaryspecialtyRepository.findAll();
    }
}
