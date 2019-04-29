package ua.nic.Cursova.service;

import ua.nic.Cursova.model.BmpEntity;
import ua.nic.Cursova.repository.IBmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class BmpService implements IEntityService {
    
    private static Logger log = Logger.getLogger(BmpService.class.getName());
    @Autowired
    IBmpRepository bmpRepository;


    @Override
    public BmpEntity getById(Long id) {
        log.info("In BmpService getById{{}" + id);
        return bmpRepository.getOne(id);
    }

    @Override
    public void save(Object bmp) {
        log.info("In BmpService save{}" + bmp);

        bmpRepository.save((BmpEntity) bmp);
    }

    @Override
    public void delete(Long id) {
        log.info("In BmpService delete{}" + id);
        bmpRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return bmpRepository.findAll();
    }
}
