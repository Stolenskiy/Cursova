package ua.nic.Cursova.service;

import ua.nic.Cursova.model.DepartmentEntity;
import ua.nic.Cursova.repository.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class DepartmentService implements IEntityService {
    
    private static Logger log = Logger.getLogger(DepartmentService.class.getName());
    @Autowired
    IDepartmentRepository departmentRepository;


    @Override
    public DepartmentEntity getById(Long id) {
        log.info("In DepartmentService getById{{}" + id);
        return departmentRepository.getOne(id);
    }

    @Override
    public void save(Object department) {
        log.info("In DepartmentService save{}" + department);

        departmentRepository.save((DepartmentEntity) department);
    }

    @Override
    public void delete(Long id) {
        log.info("In DepartmentService delete{}" + id);
        departmentRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return departmentRepository.findAll();
    }
}
