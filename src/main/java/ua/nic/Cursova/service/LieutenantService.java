package ua.nic.Cursova.service;

import ua.nic.Cursova.model.LieutenantEntity;
import ua.nic.Cursova.repository.ILieutenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class LieutenantService implements IEntityService {
    
    private static Logger log = Logger.getLogger(LieutenantService.class.getName());
    @Autowired
    ILieutenantRepository lieutenantRepository;


    @Override
    public LieutenantEntity getById(Long id) {
        log.info("In LieutenantService getById{{}" + id);
        return lieutenantRepository.getOne(id);
    }

    @Override
    public void save(Object lieutenant) {
        log.info("In LieutenantService save{}" + lieutenant);

        lieutenantRepository.save((LieutenantEntity) lieutenant);
    }

    @Override
    public void delete(Long id) {
        log.info("In LieutenantService delete{}" + id);
        lieutenantRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return lieutenantRepository.findAll();
    }
}
