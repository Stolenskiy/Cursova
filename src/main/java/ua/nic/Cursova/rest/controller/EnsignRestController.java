package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.EnsignEntity;
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
@RequestMapping("/ensign")
public class EnsignRestController {
    @Autowired
    private IEntityService ensignService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<EnsignEntity> getEnsign(@PathVariable("id") Long ensignId) {
        System.out.println("Get");
        if (ensignId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        EnsignEntity ensign = (EnsignEntity) this.ensignService.getById(ensignId);

        if (ensign == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(ensign, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<EnsignEntity> saveEnsign(@RequestBody @Valid EnsignEntity ensign) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (ensign == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.ensignService.save(ensign);

        return new ResponseEntity(ensign, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<EnsignEntity> updateEnsign(@RequestBody @Valid EnsignEntity ensign, @PathVariable("id") Long ensignId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (ensign == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.ensignService.delete(ensignId);
        this.ensignService.save(ensign);

        return new ResponseEntity(ensign, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<EnsignEntity> deleteEnsign(@PathVariable("id") Long ensignId) {
        System.out.println("delete");
        EnsignEntity ensign = (EnsignEntity) this.ensignService.getById(ensignId);

        if (ensign == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.ensignService.delete(ensignId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<EnsignEntity>> getAllEnsigns() {
        List ensign = this.ensignService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(ensign, HttpStatus.OK);
    }

}