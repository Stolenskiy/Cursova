package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.YefreytorEntity;
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
@RequestMapping("/yefreytor")
public class YefreytorRestController {
    @Autowired
    private IEntityService yefreytorService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<YefreytorEntity> getYefreytor(@PathVariable("id") Long yefreytorId) {
        System.out.println("Get");
        if (yefreytorId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        YefreytorEntity yefreytor = (YefreytorEntity) this.yefreytorService.getById(yefreytorId);

        if (yefreytor == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(yefreytor, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<YefreytorEntity> saveYefreytor(@RequestBody @Valid YefreytorEntity yefreytor) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (yefreytor == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.yefreytorService.save(yefreytor);

        return new ResponseEntity(yefreytor, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<YefreytorEntity> updateYefreytor(@RequestBody @Valid YefreytorEntity yefreytor, @PathVariable("id") Long yefreytorId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (yefreytor == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.yefreytorService.delete(yefreytorId);
        this.yefreytorService.save(yefreytor);

        return new ResponseEntity(yefreytor, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<YefreytorEntity> deleteYefreytor(@PathVariable("id") Long yefreytorId) {
        System.out.println("delete");
        YefreytorEntity yefreytor = (YefreytorEntity) this.yefreytorService.getById(yefreytorId);

        if (yefreytor == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.yefreytorService.delete(yefreytorId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<YefreytorEntity>> getAllYefreytors() {
        List yefreytor = this.yefreytorService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(yefreytor, HttpStatus.OK);
    }

}