package ua.nic.Cursova.service;

import ua.nic.Cursova.model.CarbineEntity;
import ua.nic.Cursova.repository.ICarbineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class CarbineService implements IEntityService {
    
    private static Logger log = Logger.getLogger(CarbineService.class.getName());
    @Autowired
    ICarbineRepository carbineRepository;


    @Override
    public CarbineEntity getById(Long id) {
        log.info("In CarbineService getById{{}" + id);
        return carbineRepository.getOne(id);
    }

    @Override
    public void save(Object carbine) {
        log.info("In CarbineService save{}" + carbine);

        carbineRepository.save((CarbineEntity) carbine);
    }

    @Override
    public void delete(Long id) {
        log.info("In CarbineService delete{}" + id);
        carbineRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return carbineRepository.findAll();
    }
}
