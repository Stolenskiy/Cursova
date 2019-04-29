package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.OrdinaryEntity;
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
@RequestMapping("/ordinary")
public class OrdinaryRestController {
    @Autowired
    private IEntityService ordinaryService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<OrdinaryEntity> getOrdinary(@PathVariable("id") Long ordinaryId) {
        System.out.println("Get");
        if (ordinaryId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        OrdinaryEntity ordinary = (OrdinaryEntity) this.ordinaryService.getById(ordinaryId);

        if (ordinary == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(ordinary, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<OrdinaryEntity> saveOrdinary(@RequestBody @Valid OrdinaryEntity ordinary) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (ordinary == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.ordinaryService.save(ordinary);

        return new ResponseEntity(ordinary, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<OrdinaryEntity> updateOrdinary(@RequestBody @Valid OrdinaryEntity ordinary, @PathVariable("id") Long ordinaryId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (ordinary == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.ordinaryService.delete(ordinaryId);
        this.ordinaryService.save(ordinary);

        return new ResponseEntity(ordinary, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<OrdinaryEntity> deleteOrdinary(@PathVariable("id") Long ordinaryId) {
        System.out.println("delete");
        OrdinaryEntity ordinary = (OrdinaryEntity) this.ordinaryService.getById(ordinaryId);

        if (ordinary == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.ordinaryService.delete(ordinaryId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<OrdinaryEntity>> getAllOrdinarys() {
        List ordinary = this.ordinaryService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(ordinary, HttpStatus.OK);
    }

}