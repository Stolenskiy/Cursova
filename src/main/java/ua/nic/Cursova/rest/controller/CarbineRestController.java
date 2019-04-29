package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.CarbineEntity;
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
@RequestMapping("/carbine")
public class CarbineRestController {
    @Autowired
    private IEntityService carbineService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CarbineEntity> getCarbine(@PathVariable("id") Long carbineId) {
        System.out.println("Get");
        if (carbineId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        CarbineEntity carbine = (CarbineEntity) this.carbineService.getById(carbineId);

        if (carbine == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(carbine, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CarbineEntity> saveCarbine(@RequestBody @Valid CarbineEntity carbine) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (carbine == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.carbineService.save(carbine);

        return new ResponseEntity(carbine, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CarbineEntity> updateCarbine(@RequestBody @Valid CarbineEntity carbine, @PathVariable("id") Long carbineId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (carbine == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.carbineService.delete(carbineId);
        this.carbineService.save(carbine);

        return new ResponseEntity(carbine, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CarbineEntity> deleteCarbine(@PathVariable("id") Long carbineId) {
        System.out.println("delete");
        CarbineEntity carbine = (CarbineEntity) this.carbineService.getById(carbineId);

        if (carbine == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.carbineService.delete(carbineId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<CarbineEntity>> getAllCarbines() {
        List carbine = this.carbineService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(carbine, HttpStatus.OK);
    }

}