package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.TractorEntity;
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
@RequestMapping("/tractor")
public class TractorRestController {
    @Autowired
    private IEntityService tractorService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<TractorEntity> getTractor(@PathVariable("id") Long tractorId) {
        System.out.println("Get");
        if (tractorId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        TractorEntity tractor = (TractorEntity) this.tractorService.getById(tractorId);

        if (tractor == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(tractor, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<TractorEntity> saveTractor(@RequestBody @Valid TractorEntity tractor) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (tractor == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.tractorService.save(tractor);

        return new ResponseEntity(tractor, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<TractorEntity> updateTractor(@RequestBody @Valid TractorEntity tractor, @PathVariable("id") Long tractorId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (tractor == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.tractorService.delete(tractorId);
        this.tractorService.save(tractor);

        return new ResponseEntity(tractor, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<TractorEntity> deleteTractor(@PathVariable("id") Long tractorId) {
        System.out.println("delete");
        TractorEntity tractor = (TractorEntity) this.tractorService.getById(tractorId);

        if (tractor == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.tractorService.delete(tractorId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<TractorEntity>> getAllTractors() {
        List tractor = this.tractorService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(tractor, HttpStatus.OK);
    }

}