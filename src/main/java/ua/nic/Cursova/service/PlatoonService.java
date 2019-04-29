package ua.nic.Cursova.service;

import ua.nic.Cursova.model.PlatoonEntity;
import ua.nic.Cursova.repository.IPlatoonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class PlatoonService implements IEntityService {
    
    private static Logger log = Logger.getLogger(PlatoonService.class.getName());
    @Autowired
    IPlatoonRepository platoonRepository;


    @Override
    public PlatoonEntity getById(Long id) {
        log.info("In PlatoonService getById{{}" + id);
        return platoonRepository.getOne(id);
    }

    @Override
    public void save(Object platoon) {
        log.info("In PlatoonService save{}" + platoon);

        platoonRepository.save((PlatoonEntity) platoon);
    }

    @Override
    public void delete(Long id) {
        log.info("In PlatoonService delete{}" + id);
        platoonRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return platoonRepository.findAll();
    }
}
