package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.MilitarybaseEntity;
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
@RequestMapping("/militarybase")
public class MilitarybaseRestController {
    @Autowired
    private IEntityService militarybaseService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<MilitarybaseEntity> getMilitarybase(@PathVariable("id") Long militarybaseId) {
        System.out.println("Get");
        if (militarybaseId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        MilitarybaseEntity militarybase = (MilitarybaseEntity) this.militarybaseService.getById(militarybaseId);

        if (militarybase == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(militarybase, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<MilitarybaseEntity> saveMilitarybase(@RequestBody @Valid MilitarybaseEntity militarybase) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (militarybase == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.militarybaseService.save(militarybase);

        return new ResponseEntity(militarybase, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<MilitarybaseEntity> updateMilitarybase(@RequestBody @Valid MilitarybaseEntity militarybase, @PathVariable("id") Long militarybaseId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (militarybase == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.militarybaseService.delete(militarybaseId);
        this.militarybaseService.save(militarybase);

        return new ResponseEntity(militarybase, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<MilitarybaseEntity> deleteMilitarybase(@PathVariable("id") Long militarybaseId) {
        System.out.println("delete");
        MilitarybaseEntity militarybase = (MilitarybaseEntity) this.militarybaseService.getById(militarybaseId);

        if (militarybase == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.militarybaseService.delete(militarybaseId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<MilitarybaseEntity>> getAllMilitarybases() {
        List militarybase = this.militarybaseService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(militarybase, HttpStatus.OK);
    }

}