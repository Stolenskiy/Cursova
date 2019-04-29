package ua.nic.Cursova.service;

import ua.nic.Cursova.model.ColonelEntity;
import ua.nic.Cursova.repository.IColonelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class ColonelService implements IEntityService {
    
    private static Logger log = Logger.getLogger(ColonelService.class.getName());
    @Autowired
    IColonelRepository colonelRepository;


    @Override
    public ColonelEntity getById(Long id) {
        log.info("In ColonelService getById{{}" + id);
        return colonelRepository.getOne(id);
    }

    @Override
    public void save(Object colonel) {
        log.info("In ColonelService save{}" + colonel);

        colonelRepository.save((ColonelEntity) colonel);
    }

    @Override
    public void delete(Long id) {
        log.info("In ColonelService delete{}" + id);
        colonelRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return colonelRepository.findAll();
    }
}
