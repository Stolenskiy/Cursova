package ua.nic.Cursova.service;

import ua.nic.Cursova.model.DivisionEntity;
import ua.nic.Cursova.repository.IDivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class DivisionService implements IEntityService {
    
    private static Logger log = Logger.getLogger(DivisionService.class.getName());
    @Autowired
    IDivisionRepository divisionRepository;


    @Override
    public DivisionEntity getById(Long id) {
        log.info("In DivisionService getById{{}" + id);
        return divisionRepository.getOne(id);
    }

    @Override
    public void save(Object division) {
        log.info("In DivisionService save{}" + division);

        divisionRepository.save((DivisionEntity) division);
    }

    @Override
    public void delete(Long id) {
        log.info("In DivisionService delete{}" + id);
        divisionRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return divisionRepository.findAll();
    }
}
