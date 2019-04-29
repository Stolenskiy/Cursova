package ua.nic.Cursova.service;

import ua.nic.Cursova.model.CombatAndTransportVehiclesEntity;
import ua.nic.Cursova.repository.ICombatAndTransportVehiclesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class CombatAndTransportVehiclesService implements IEntityService {
    
    private static Logger log = Logger.getLogger(CombatAndTransportVehiclesService.class.getName());
    @Autowired
    ICombatAndTransportVehiclesRepository combatAndTransportVehiclesRepository;


    @Override
    public CombatAndTransportVehiclesEntity getById(Long id) {
        log.info("In CombatAndTransportVehiclesService getById{{}" + id);
        return combatAndTransportVehiclesRepository.getOne(id);
    }

    @Override
    public void save(Object combatAndTransportVehicles) {
        log.info("In CombatAndTransportVehiclesService save{}" + combatAndTransportVehicles);

        combatAndTransportVehiclesRepository.save((CombatAndTransportVehiclesEntity) combatAndTransportVehicles);
    }

    @Override
    public void delete(Long id) {
        log.info("In CombatAndTransportVehiclesService delete{}" + id);
        combatAndTransportVehiclesRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return combatAndTransportVehiclesRepository.findAll();
    }
}
