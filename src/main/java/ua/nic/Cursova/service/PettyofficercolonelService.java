package ua.nic.Cursova.service;

import ua.nic.Cursova.model.PettyofficercolonelEntity;
import ua.nic.Cursova.repository.IPettyofficercolonelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class PettyofficercolonelService implements IEntityService {
    
    private static Logger log = Logger.getLogger(PettyofficercolonelService.class.getName());
    @Autowired
    IPettyofficercolonelRepository pettyofficercolonelRepository;


    @Override
    public PettyofficercolonelEntity getById(Long id) {
        log.info("In PettyofficercolonelService getById{{}" + id);
        return pettyofficercolonelRepository.getOne(id);
    }

    @Override
    public void save(Object pettyofficercolonel) {
        log.info("In PettyofficercolonelService save{}" + pettyofficercolonel);

        pettyofficercolonelRepository.save((PettyofficercolonelEntity) pettyofficercolonel);
    }

    @Override
    public void delete(Long id) {
        log.info("In PettyofficercolonelService delete{}" + id);
        pettyofficercolonelRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return pettyofficercolonelRepository.findAll();
    }
}
