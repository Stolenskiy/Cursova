package ua.nic.Cursova.service;

import ua.nic.Cursova.model.GeneralEntity;
import ua.nic.Cursova.repository.IGeneralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class GeneralService implements IEntityService {
    
    private static Logger log = Logger.getLogger(GeneralService.class.getName());
    @Autowired
    IGeneralRepository generalRepository;


    @Override
    public GeneralEntity getById(Long id) {
        log.info("In GeneralService getById{{}" + id);
        return generalRepository.getOne(id);
    }

    @Override
    public void save(Object general) {
        log.info("In GeneralService save{}" + general);

        generalRepository.save((GeneralEntity) general);
    }

    @Override
    public void delete(Long id) {
        log.info("In GeneralService delete{}" + id);
        generalRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return generalRepository.findAll();
    }
}
