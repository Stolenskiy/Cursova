package ua.nic.Cursova.service;

import ua.nic.Cursova.model.ArmamentEntity;
import ua.nic.Cursova.repository.IArmamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class ArmamentService implements IEntityService {
    
    private static Logger log = Logger.getLogger(ArmamentService.class.getName());
    @Autowired
    IArmamentRepository armamentRepository;


    @Override
    public ArmamentEntity getById(Long id) {
        log.info("In ArmamentService getById{{}" + id);
        return armamentRepository.getOne(id);
    }

    @Override
    public void save(Object armament) {
        log.info("In ArmamentService save{}" + armament);

        armamentRepository.save((ArmamentEntity) armament);
    }

    @Override
    public void delete(Long id) {
        log.info("In ArmamentService delete{}" + id);
        armamentRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return armamentRepository.findAll();
    }
}
