package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.MilitaryspecialtyEntity;
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
@RequestMapping("/militaryspecialty")
public class MilitaryspecialtyRestController {
    @Autowired
    private IEntityService militaryspecialtyService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<MilitaryspecialtyEntity> getMilitaryspecialty(@PathVariable("id") Long militaryspecialtyId) {
        System.out.println("Get");
        if (militaryspecialtyId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        MilitaryspecialtyEntity militaryspecialty = (MilitaryspecialtyEntity) this.militaryspecialtyService.getById(militaryspecialtyId);

        if (militaryspecialty == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(militaryspecialty, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<MilitaryspecialtyEntity> saveMilitaryspecialty(@RequestBody @Valid MilitaryspecialtyEntity militaryspecialty) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (militaryspecialty == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.militaryspecialtyService.save(militaryspecialty);

        return new ResponseEntity(militaryspecialty, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<MilitaryspecialtyEntity> updateMilitaryspecialty(@RequestBody @Valid MilitaryspecialtyEntity militaryspecialty, @PathVariable("id") Long militaryspecialtyId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (militaryspecialty == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.militaryspecialtyService.delete(militaryspecialtyId);
        this.militaryspecialtyService.save(militaryspecialty);

        return new ResponseEntity(militaryspecialty, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<MilitaryspecialtyEntity> deleteMilitaryspecialty(@PathVariable("id") Long militaryspecialtyId) {
        System.out.println("delete");
        MilitaryspecialtyEntity militaryspecialty = (MilitaryspecialtyEntity) this.militaryspecialtyService.getById(militaryspecialtyId);

        if (militaryspecialty == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.militaryspecialtyService.delete(militaryspecialtyId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<MilitaryspecialtyEntity>> getAllMilitaryspecialtys() {
        List militaryspecialty = this.militaryspecialtyService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(militaryspecialty, HttpStatus.OK);
    }

}