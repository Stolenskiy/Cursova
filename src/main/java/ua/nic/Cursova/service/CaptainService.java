package ua.nic.Cursova.service;

import ua.nic.Cursova.model.CaptainEntity;
import ua.nic.Cursova.repository.ICaptainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class CaptainService implements IEntityService {
    
    private static Logger log = Logger.getLogger(CaptainService.class.getName());
    @Autowired
    ICaptainRepository captainRepository;


    @Override
    public CaptainEntity getById(Long id) {
        log.info("In CaptainService getById{{}" + id);
        return captainRepository.getOne(id);
    }

    @Override
    public void save(Object captain) {
        log.info("In CaptainService save{}" + captain);

        captainRepository.save((CaptainEntity) captain);
    }

    @Override
    public void delete(Long id) {
        log.info("In CaptainService delete{}" + id);
        captainRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return captainRepository.findAll();
    }
}
