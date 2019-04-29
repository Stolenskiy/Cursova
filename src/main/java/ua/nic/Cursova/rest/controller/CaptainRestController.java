package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.CaptainEntity;
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
@RequestMapping("/captain")
public class CaptainRestController {
    @Autowired
    private IEntityService captainService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CaptainEntity> getCaptain(@PathVariable("id") Long captainId) {
        System.out.println("Get");
        if (captainId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        CaptainEntity captain = (CaptainEntity) this.captainService.getById(captainId);

        if (captain == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(captain, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CaptainEntity> saveCaptain(@RequestBody @Valid CaptainEntity captain) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (captain == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.captainService.save(captain);

        return new ResponseEntity(captain, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CaptainEntity> updateCaptain(@RequestBody @Valid CaptainEntity captain, @PathVariable("id") Long captainId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (captain == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.captainService.delete(captainId);
        this.captainService.save(captain);

        return new ResponseEntity(captain, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CaptainEntity> deleteCaptain(@PathVariable("id") Long captainId) {
        System.out.println("delete");
        CaptainEntity captain = (CaptainEntity) this.captainService.getById(captainId);

        if (captain == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.captainService.delete(captainId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<CaptainEntity>> getAllCaptains() {
        List captain = this.captainService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(captain, HttpStatus.OK);
    }

}