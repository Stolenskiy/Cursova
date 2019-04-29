package ua.nic.Cursova.service;

import ua.nic.Cursova.model.RotaEntity;
import ua.nic.Cursova.repository.IRotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class RotaService implements IEntityService {
    
    private static Logger log = Logger.getLogger(RotaService.class.getName());
    @Autowired
    IRotaRepository rotaRepository;


    @Override
    public RotaEntity getById(Long id) {
        log.info("In RotaService getById{{}" + id);
        return rotaRepository.getOne(id);
    }

    @Override
    public void save(Object rota) {
        log.info("In RotaService save{}" + rota);

        rotaRepository.save((RotaEntity) rota);
    }

    @Override
    public void delete(Long id) {
        log.info("In RotaService delete{}" + id);
        rotaRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return rotaRepository.findAll();
    }
}
