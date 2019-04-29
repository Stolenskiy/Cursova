package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.DepartmentEntity;
import ua.nic.Cursova.service.IEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentRestController {
    @Autowired
    private IEntityService departmentService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<DepartmentEntity> getDepartment(@PathVariable("id") Long departmentId) {
        System.out.println("Get");
        if (departmentId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        DepartmentEntity department = (DepartmentEntity) this.departmentService.getById(departmentId);

        if (department == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(department, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<DepartmentEntity> saveDepartment(@RequestBody @Valid DepartmentEntity department) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (department == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.departmentService.save(department);

        return new ResponseEntity(department, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<DepartmentEntity> updateDepartment(@RequestBody @Valid DepartmentEntity department, @PathVariable("id") Long departmentId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (department == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.departmentService.delete(departmentId);
        this.departmentService.save(department);

        return new ResponseEntity(department, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<DepartmentEntity> deleteDepartment(@PathVariable("id") Long departmentId) {
        System.out.println("delete");
        DepartmentEntity department = (DepartmentEntity) this.departmentService.getById(departmentId);

        if (department == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.departmentService.delete(departmentId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<DepartmentEntity>> getAllDepartments() {
        List department = this.departmentService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(department, HttpStatus.OK);
    }

}