package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.DivisionEntity;
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
@RequestMapping("/division")
public class DivisionRestController {
    @Autowired
    private IEntityService divisionService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<DivisionEntity> getDivision(@PathVariable("id") Long divisionId) {
        System.out.println("Get");
        if (divisionId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        DivisionEntity division = (DivisionEntity) this.divisionService.getById(divisionId);

        if (division == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(division, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<DivisionEntity> saveDivision(@RequestBody @Valid DivisionEntity division) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (division == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.divisionService.save(division);

        return new ResponseEntity(division, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<DivisionEntity> updateDivision(@RequestBody @Valid DivisionEntity division, @PathVariable("id") Long divisionId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (division == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.divisionService.delete(divisionId);
        this.divisionService.save(division);

        return new ResponseEntity(division, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<DivisionEntity> deleteDivision(@PathVariable("id") Long divisionId) {
        System.out.println("delete");
        DivisionEntity division = (DivisionEntity) this.divisionService.getById(divisionId);

        if (division == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.divisionService.delete(divisionId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<DivisionEntity>> getAllDivisions() {
        List division = this.divisionService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(division, HttpStatus.OK);
    }

}