package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.GeneralEntity;
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
@RequestMapping("/general")
public class GeneralRestController {
    @Autowired
    private IEntityService generalService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<GeneralEntity> getGeneral(@PathVariable("id") Long generalId) {
        System.out.println("Get");
        if (generalId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        GeneralEntity general = (GeneralEntity) this.generalService.getById(generalId);

        if (general == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(general, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<GeneralEntity> saveGeneral(@RequestBody @Valid GeneralEntity general) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (general == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.generalService.save(general);

        return new ResponseEntity(general, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<GeneralEntity> updateGeneral(@RequestBody @Valid GeneralEntity general, @PathVariable("id") Long generalId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (general == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.generalService.delete(generalId);
        this.generalService.save(general);

        return new ResponseEntity(general, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<GeneralEntity> deleteGeneral(@PathVariable("id") Long generalId) {
        System.out.println("delete");
        GeneralEntity general = (GeneralEntity) this.generalService.getById(generalId);

        if (general == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.generalService.delete(generalId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<GeneralEntity>> getAllGenerals() {
        List general = this.generalService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(general, HttpStatus.OK);
    }

}