package ua.nic.Cursova.service;

import ua.nic.Cursova.model.YefreytorEntity;
import ua.nic.Cursova.repository.IYefreytorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class YefreytorService implements IEntityService {
    
    private static Logger log = Logger.getLogger(YefreytorService.class.getName());
    @Autowired
    IYefreytorRepository yefreytorRepository;


    @Override
    public YefreytorEntity getById(Long id) {
        log.info("In YefreytorService getById{{}" + id);
        return yefreytorRepository.getOne(id);
    }

    @Override
    public void save(Object yefreytor) {
        log.info("In YefreytorService save{}" + yefreytor);

        yefreytorRepository.save((YefreytorEntity) yefreytor);
    }

    @Override
    public void delete(Long id) {
        log.info("In YefreytorService delete{}" + id);
        yefreytorRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return yefreytorRepository.findAll();
    }
}
