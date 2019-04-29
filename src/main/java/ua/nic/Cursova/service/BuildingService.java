package ua.nic.Cursova.service;

import ua.nic.Cursova.model.BuildingEntity;
import ua.nic.Cursova.repository.IBuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class BuildingService implements IEntityService {
    
    private static Logger log = Logger.getLogger(BuildingService.class.getName());
    @Autowired
    IBuildingRepository buildingRepository;


    @Override
    public BuildingEntity getById(Long id) {
        log.info("In BuildingService getById{{}" + id);
        return buildingRepository.getOne(id);
    }

    @Override
    public void save(Object building) {
        log.info("In BuildingService save{}" + building);

        buildingRepository.save((BuildingEntity) building);
    }

    @Override
    public void delete(Long id) {
        log.info("In BuildingService delete{}" + id);
        buildingRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return buildingRepository.findAll();
    }
}
