package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.AutotransportEntity;
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
@RequestMapping("/autotransport")
public class AutotransportRestController {
    @Autowired
    private IEntityService autotransportService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AutotransportEntity> getAutotransport(@PathVariable("id") Long autotransportId) {
        System.out.println("Get");
        if (autotransportId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        AutotransportEntity autotransport = (AutotransportEntity) this.autotransportService.getById(autotransportId);

        if (autotransport == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(autotransport, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AutotransportEntity> saveAutotransport(@RequestBody @Valid AutotransportEntity autotransport) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (autotransport == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.autotransportService.save(autotransport);

        return new ResponseEntity(autotransport, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AutotransportEntity> updateAutotransport(@RequestBody @Valid AutotransportEntity autotransport, @PathVariable("id") Long autotransportId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (autotransport == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.autotransportService.delete(autotransportId);
        this.autotransportService.save(autotransport);

        return new ResponseEntity(autotransport, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AutotransportEntity> deleteAutotransport(@PathVariable("id") Long autotransportId) {
        System.out.println("delete");
        AutotransportEntity autotransport = (AutotransportEntity) this.autotransportService.getById(autotransportId);

        if (autotransport == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.autotransportService.delete(autotransportId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<AutotransportEntity>> getAllAutotransports() {
        List autotransport = this.autotransportService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(autotransport, HttpStatus.OK);
    }

}