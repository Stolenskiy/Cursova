package ua.nic.Cursova.service;

import ua.nic.Cursova.model.EnsignEntity;
import ua.nic.Cursova.repository.IEnsignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class EnsignService implements IEntityService {
    
    private static Logger log = Logger.getLogger(EnsignService.class.getName());
    @Autowired
    IEnsignRepository ensignRepository;


    @Override
    public EnsignEntity getById(Long id) {
        log.info("In EnsignService getById{{}" + id);
        return ensignRepository.getOne(id);
    }

    @Override
    public void save(Object ensign) {
        log.info("In EnsignService save{}" + ensign);

        ensignRepository.save((EnsignEntity) ensign);
    }

    @Override
    public void delete(Long id) {
        log.info("In EnsignService delete{}" + id);
        ensignRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return ensignRepository.findAll();
    }
}
