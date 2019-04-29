package ua.nic.Cursova.service;

import ua.nic.Cursova.model.BalisticmissileEntity;
import ua.nic.Cursova.repository.IBalisticmissileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class BalisticmissileService implements IEntityService {
    
    private static Logger log = Logger.getLogger(BalisticmissileService.class.getName());
    @Autowired
    IBalisticmissileRepository balisticmissileRepository;


    @Override
    public BalisticmissileEntity getById(Long id) {
        log.info("In BalisticmissileService getById{{}" + id);
        return balisticmissileRepository.getOne(id);
    }

    @Override
    public void save(Object balisticmissile) {
        log.info("In BalisticmissileService save{}" + balisticmissile);

        balisticmissileRepository.save((BalisticmissileEntity) balisticmissile);
    }

    @Override
    public void delete(Long id) {
        log.info("In BalisticmissileService delete{}" + id);
        balisticmissileRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return balisticmissileRepository.findAll();
    }
}
