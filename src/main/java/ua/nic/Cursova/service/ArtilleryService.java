package ua.nic.Cursova.service;

import ua.nic.Cursova.model.ArtilleryEntity;
import ua.nic.Cursova.repository.IArtilleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class ArtilleryService implements IEntityService {
    
    private static Logger log = Logger.getLogger(ArtilleryService.class.getName());
    @Autowired
    IArtilleryRepository artilleryRepository;


    @Override
    public ArtilleryEntity getById(Long id) {
        log.info("In ArtilleryService getById{{}" + id);
        return artilleryRepository.getOne(id);
    }

    @Override
    public void save(Object artillery) {
        log.info("In ArtilleryService save{}" + artillery);

        artilleryRepository.save((ArtilleryEntity) artillery);
    }

    @Override
    public void delete(Long id) {
        log.info("In ArtilleryService delete{}" + id);
        artilleryRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return artilleryRepository.findAll();
    }
}
