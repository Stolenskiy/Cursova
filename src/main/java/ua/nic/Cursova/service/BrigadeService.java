package ua.nic.Cursova.service;

import ua.nic.Cursova.model.BrigadeEntity;
import ua.nic.Cursova.repository.IBrigadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class BrigadeService implements IEntityService {
    
    private static Logger log = Logger.getLogger(BrigadeService.class.getName());
    @Autowired
    IBrigadeRepository brigadeRepository;


    @Override
    public BrigadeEntity getById(Long id) {
        log.info("In BrigadeService getById{{}" + id);
        return brigadeRepository.getOne(id);
    }

    @Override
    public void save(Object brigade) {
        log.info("In BrigadeService save{}" + brigade);

        brigadeRepository.save((BrigadeEntity) brigade);
    }

    @Override
    public void delete(Long id) {
        log.info("In BrigadeService delete{}" + id);
        brigadeRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return brigadeRepository.findAll();
    }
}
