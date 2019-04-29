package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.SergeantEntity;
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
@RequestMapping("/sergeant")
public class SergeantRestController {
    @Autowired
    private IEntityService sergeantService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<SergeantEntity> getSergeant(@PathVariable("id") Long sergeantId) {
        System.out.println("Get");
        if (sergeantId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        SergeantEntity sergeant = (SergeantEntity) this.sergeantService.getById(sergeantId);

        if (sergeant == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(sergeant, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<SergeantEntity> saveSergeant(@RequestBody @Valid SergeantEntity sergeant) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (sergeant == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.sergeantService.save(sergeant);

        return new ResponseEntity(sergeant, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<SergeantEntity> updateSergeant(@RequestBody @Valid SergeantEntity sergeant, @PathVariable("id") Long sergeantId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (sergeant == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.sergeantService.delete(sergeantId);
        this.sergeantService.save(sergeant);

        return new ResponseEntity(sergeant, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<SergeantEntity> deleteSergeant(@PathVariable("id") Long sergeantId) {
        System.out.println("delete");
        SergeantEntity sergeant = (SergeantEntity) this.sergeantService.getById(sergeantId);

        if (sergeant == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.sergeantService.delete(sergeantId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<SergeantEntity>> getAllSergeants() {
        List sergeant = this.sergeantService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(sergeant, HttpStatus.OK);
    }

}