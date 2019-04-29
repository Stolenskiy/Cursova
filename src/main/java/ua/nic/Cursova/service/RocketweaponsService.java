package ua.nic.Cursova.service;

import ua.nic.Cursova.model.RocketweaponsEntity;
import ua.nic.Cursova.repository.IRocketweaponsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class RocketweaponsService implements IEntityService {
    
    private static Logger log = Logger.getLogger(RocketweaponsService.class.getName());
    @Autowired
    IRocketweaponsRepository rocketweaponsRepository;


    @Override
    public RocketweaponsEntity getById(Long id) {
        log.info("In RocketweaponsService getById{{}" + id);
        return rocketweaponsRepository.getOne(id);
    }

    @Override
    public void save(Object rocketweapons) {
        log.info("In RocketweaponsService save{}" + rocketweapons);

        rocketweaponsRepository.save((RocketweaponsEntity) rocketweapons);
    }

    @Override
    public void delete(Long id) {
        log.info("In RocketweaponsService delete{}" + id);
        rocketweaponsRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return rocketweaponsRepository.findAll();
    }
}
