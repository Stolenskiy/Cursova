package ua.nic.Cursova.service;

import ua.nic.Cursova.model.RankandfileEntity;
import ua.nic.Cursova.repository.IRankandfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class RankandfileService implements IEntityService {
    
    private static Logger log = Logger.getLogger(RankandfileService.class.getName());
    @Autowired
    IRankandfileRepository rankandfileRepository;


    @Override
    public RankandfileEntity getById(Long id) {
        log.info("In RankandfileService getById{{}" + id);
        return rankandfileRepository.getOne(id);
    }

    @Override
    public void save(Object rankandfile) {
        log.info("In RankandfileService save{}" + rankandfile);

        rankandfileRepository.save((RankandfileEntity) rankandfile);
    }

    @Override
    public void delete(Long id) {
        log.info("In RankandfileService delete{}" + id);
        rankandfileRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return rankandfileRepository.findAll();
    }
}
