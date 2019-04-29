package ua.nic.Cursova.service;

import ua.nic.Cursova.model.TractorEntity;
import ua.nic.Cursova.repository.ITractorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class TractorService implements IEntityService {
    
    private static Logger log = Logger.getLogger(TractorService.class.getName());
    @Autowired
    ITractorRepository tractorRepository;


    @Override
    public TractorEntity getById(Long id) {
        log.info("In TractorService getById{{}" + id);
        return tractorRepository.getOne(id);
    }

    @Override
    public void save(Object tractor) {
        log.info("In TractorService save{}" + tractor);

        tractorRepository.save((TractorEntity) tractor);
    }

    @Override
    public void delete(Long id) {
        log.info("In TractorService delete{}" + id);
        tractorRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return tractorRepository.findAll();
    }
}
