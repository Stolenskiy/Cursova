package ua.nic.Cursova.service;

import ua.nic.Cursova.model.OrdinaryEntity;
import ua.nic.Cursova.repository.IOrdinaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class OrdinaryService implements IEntityService {
    
    private static Logger log = Logger.getLogger(OrdinaryService.class.getName());
    @Autowired
    IOrdinaryRepository ordinaryRepository;


    @Override
    public OrdinaryEntity getById(Long id) {
        log.info("In OrdinaryService getById{{}" + id);
        return ordinaryRepository.getOne(id);
    }

    @Override
    public void save(Object ordinary) {
        log.info("In OrdinaryService save{}" + ordinary);

        ordinaryRepository.save((OrdinaryEntity) ordinary);
    }

    @Override
    public void delete(Long id) {
        log.info("In OrdinaryService delete{}" + id);
        ordinaryRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return ordinaryRepository.findAll();
    }
}
