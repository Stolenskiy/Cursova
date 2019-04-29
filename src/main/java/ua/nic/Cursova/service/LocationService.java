package ua.nic.Cursova.service;

import ua.nic.Cursova.model.LocationEntity;
import ua.nic.Cursova.repository.ILocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class LocationService implements IEntityService {
    
    private static Logger log = Logger.getLogger(LocationService.class.getName());
    @Autowired
    ILocationRepository locationRepository;


    @Override
    public LocationEntity getById(Long id) {
        log.info("In LocationService getById{{}" + id);
        return locationRepository.getOne(id);
    }

    @Override
    public void save(Object location) {
        log.info("In LocationService save{}" + location);

        locationRepository.save((LocationEntity) location);
    }

    @Override
    public void delete(Long id) {
        log.info("In LocationService delete{}" + id);
        locationRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return locationRepository.findAll();
    }
}
