package ua.nic.Cursova.service;

import ua.nic.Cursova.model.PersonEntity;
import ua.nic.Cursova.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class PersonService implements IEntityService {
    
    private static Logger log = Logger.getLogger(PersonService.class.getName());
    @Autowired
    IPersonRepository personRepository;


    @Override
    public PersonEntity getById(Long id) {
        log.info("In PersonService getById{{}" + id);
        return personRepository.getOne(id);
    }

    @Override
    public void save(Object person) {
        log.info("In PersonService save{}" + person);

        personRepository.save((PersonEntity) person);
    }

    @Override
    public void delete(Long id) {
        log.info("In PersonService delete{}" + id);
        personRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return personRepository.findAll();
    }
}
