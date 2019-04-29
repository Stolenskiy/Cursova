package ua.nic.Cursova.service;

import ua.nic.Cursova.model.SergeantEntity;
import ua.nic.Cursova.repository.ISergeantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class SergeantService implements IEntityService {
    
    private static Logger log = Logger.getLogger(SergeantService.class.getName());
    @Autowired
    ISergeantRepository sergeantRepository;


    @Override
    public SergeantEntity getById(Long id) {
        log.info("In SergeantService getById{{}" + id);
        return sergeantRepository.getOne(id);
    }

    @Override
    public void save(Object sergeant) {
        log.info("In SergeantService save{}" + sergeant);

        sergeantRepository.save((SergeantEntity) sergeant);
    }

    @Override
    public void delete(Long id) {
        log.info("In SergeantService delete{}" + id);
        sergeantRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return sergeantRepository.findAll();
    }
}
