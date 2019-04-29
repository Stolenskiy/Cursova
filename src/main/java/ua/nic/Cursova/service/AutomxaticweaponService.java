package ua.nic.Cursova.service;

import ua.nic.Cursova.model.AutomxaticweaponEntity;
import ua.nic.Cursova.repository.IAutomxaticweaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class AutomxaticweaponService implements IEntityService {
    
    private static Logger log = Logger.getLogger(AutomxaticweaponService.class.getName());
    @Autowired
    IAutomxaticweaponRepository automxaticweaponRepository;


    @Override
    public AutomxaticweaponEntity getById(Long id) {
        log.info("In AutomxaticweaponService getById{{}" + id);
        return automxaticweaponRepository.getOne(id);
    }

    @Override
    public void save(Object automxaticweapon) {
        log.info("In AutomxaticweaponService save{}" + automxaticweapon);

        automxaticweaponRepository.save((AutomxaticweaponEntity) automxaticweapon);
    }

    @Override
    public void delete(Long id) {
        log.info("In AutomxaticweaponService delete{}" + id);
        automxaticweaponRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return automxaticweaponRepository.findAll();
    }
}
