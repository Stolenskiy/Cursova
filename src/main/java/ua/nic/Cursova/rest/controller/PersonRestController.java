package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.PersonEntity;
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
@RequestMapping("/person")
public class PersonRestController {
    @Autowired
    private IEntityService personService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PersonEntity> getPerson(@PathVariable("id") Long personId) {
        System.out.println("Get");
        if (personId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        PersonEntity person = (PersonEntity) this.personService.getById(personId);

        if (person == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(person, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PersonEntity> savePerson(@RequestBody @Valid PersonEntity person) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (person == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.personService.save(person);

        return new ResponseEntity(person, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PersonEntity> updatePerson(@RequestBody @Valid PersonEntity person, @PathVariable("id") Long personId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (person == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.personService.delete(personId);
        this.personService.save(person);

        return new ResponseEntity(person, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PersonEntity> deletePerson(@PathVariable("id") Long personId) {
        System.out.println("delete");
        PersonEntity person = (PersonEntity) this.personService.getById(personId);

        if (person == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.personService.delete(personId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<PersonEntity>> getAllPersons() {
        List person = this.personService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(person, HttpStatus.OK);
    }

}