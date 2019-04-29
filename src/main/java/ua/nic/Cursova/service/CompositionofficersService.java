package ua.nic.Cursova.service;

import ua.nic.Cursova.model.CompositionofficersEntity;
import ua.nic.Cursova.repository.ICompositionofficersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class CompositionofficersService implements IEntityService {
    
    private static Logger log = Logger.getLogger(CompositionofficersService.class.getName());
    @Autowired
    ICompositionofficersRepository compositionofficersRepository;


    @Override
    public CompositionofficersEntity getById(Long id) {
        log.info("In CompositionofficersService getById{{}" + id);
        return compositionofficersRepository.getOne(id);
    }

    @Override
    public void save(Object compositionofficers) {
        log.info("In CompositionofficersService save{}" + compositionofficers);

        compositionofficersRepository.save((CompositionofficersEntity) compositionofficers);
    }

    @Override
    public void delete(Long id) {
        log.info("In CompositionofficersService delete{}" + id);
        compositionofficersRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return compositionofficersRepository.findAll();
    }
}
