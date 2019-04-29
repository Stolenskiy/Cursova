package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.ArtilleryEntity;
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
@RequestMapping("/artillery")
public class ArtilleryRestController {
    @Autowired
    private IEntityService artilleryService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ArtilleryEntity> getArtillery(@PathVariable("id") Long artilleryId) {
        System.out.println("Get");
        if (artilleryId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        ArtilleryEntity artillery = (ArtilleryEntity) this.artilleryService.getById(artilleryId);

        if (artillery == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(artillery, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ArtilleryEntity> saveArtillery(@RequestBody @Valid ArtilleryEntity artillery) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (artillery == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.artilleryService.save(artillery);

        return new ResponseEntity(artillery, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ArtilleryEntity> updateArtillery(@RequestBody @Valid ArtilleryEntity artillery, @PathVariable("id") Long artilleryId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (artillery == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.artilleryService.delete(artilleryId);
        this.artilleryService.save(artillery);

        return new ResponseEntity(artillery, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ArtilleryEntity> deleteArtillery(@PathVariable("id") Long artilleryId) {
        System.out.println("delete");
        ArtilleryEntity artillery = (ArtilleryEntity) this.artilleryService.getById(artilleryId);

        if (artillery == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.artilleryService.delete(artilleryId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<ArtilleryEntity>> getAllArtillerys() {
        List artillery = this.artilleryService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(artillery, HttpStatus.OK);
    }

}