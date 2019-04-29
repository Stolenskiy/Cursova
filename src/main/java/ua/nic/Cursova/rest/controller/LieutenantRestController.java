package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.LieutenantEntity;
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
@RequestMapping("/lieutenant")
public class LieutenantRestController {
    @Autowired
    private IEntityService lieutenantService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<LieutenantEntity> getLieutenant(@PathVariable("id") Long lieutenantId) {
        System.out.println("Get");
        if (lieutenantId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        LieutenantEntity lieutenant = (LieutenantEntity) this.lieutenantService.getById(lieutenantId);

        if (lieutenant == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(lieutenant, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<LieutenantEntity> saveLieutenant(@RequestBody @Valid LieutenantEntity lieutenant) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (lieutenant == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.lieutenantService.save(lieutenant);

        return new ResponseEntity(lieutenant, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<LieutenantEntity> updateLieutenant(@RequestBody @Valid LieutenantEntity lieutenant, @PathVariable("id") Long lieutenantId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (lieutenant == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.lieutenantService.delete(lieutenantId);
        this.lieutenantService.save(lieutenant);

        return new ResponseEntity(lieutenant, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<LieutenantEntity> deleteLieutenant(@PathVariable("id") Long lieutenantId) {
        System.out.println("delete");
        LieutenantEntity lieutenant = (LieutenantEntity) this.lieutenantService.getById(lieutenantId);

        if (lieutenant == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.lieutenantService.delete(lieutenantId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<LieutenantEntity>> getAllLieutenants() {
        List lieutenant = this.lieutenantService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(lieutenant, HttpStatus.OK);
    }

}