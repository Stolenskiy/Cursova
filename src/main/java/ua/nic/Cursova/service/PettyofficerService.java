package ua.nic.Cursova.service;

import ua.nic.Cursova.model.PettyofficerEntity;
import ua.nic.Cursova.repository.IPettyofficerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class PettyofficerService implements IEntityService {
    
    private static Logger log = Logger.getLogger(PettyofficerService.class.getName());
    @Autowired
    IPettyofficerRepository pettyofficerRepository;


    @Override
    public PettyofficerEntity getById(Long id) {
        log.info("In PettyofficerService getById{{}" + id);
        return pettyofficerRepository.getOne(id);
    }

    @Override
    public void save(Object pettyofficer) {
        log.info("In PettyofficerService save{}" + pettyofficer);

        pettyofficerRepository.save((PettyofficerEntity) pettyofficer);
    }

    @Override
    public void delete(Long id) {
        log.info("In PettyofficerService delete{}" + id);
        pettyofficerRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return pettyofficerRepository.findAll();
    }
}
