package ua.nic.Cursova.service;

import ua.nic.Cursova.model.MajorEntity;
import ua.nic.Cursova.repository.IMajorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class MajorService implements IEntityService {
    
    private static Logger log = Logger.getLogger(MajorService.class.getName());
    @Autowired
    IMajorRepository majorRepository;


    @Override
    public MajorEntity getById(Long id) {
        log.info("In MajorService getById{{}" + id);
        return majorRepository.getOne(id);
    }

    @Override
    public void save(Object major) {
        log.info("In MajorService save{}" + major);

        majorRepository.save((MajorEntity) major);
    }

    @Override
    public void delete(Long id) {
        log.info("In MajorService delete{}" + id);
        majorRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return majorRepository.findAll();
    }
}
