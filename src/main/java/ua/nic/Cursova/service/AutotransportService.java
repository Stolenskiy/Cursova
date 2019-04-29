package ua.nic.Cursova.service;

import ua.nic.Cursova.model.AutotransportEntity;
import ua.nic.Cursova.repository.IAutotransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class AutotransportService implements IEntityService {
    
    private static Logger log = Logger.getLogger(AutotransportService.class.getName());
    @Autowired
    IAutotransportRepository autotransportRepository;


    @Override
    public AutotransportEntity getById(Long id) {
        log.info("In AutotransportService getById{{}" + id);
        return autotransportRepository.getOne(id);
    }

    @Override
    public void save(Object autotransport) {
        log.info("In AutotransportService save{}" + autotransport);

        autotransportRepository.save((AutotransportEntity) autotransport);
    }

    @Override
    public void delete(Long id) {
        log.info("In AutotransportService delete{}" + id);
        autotransportRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return autotransportRepository.findAll();
    }
}
