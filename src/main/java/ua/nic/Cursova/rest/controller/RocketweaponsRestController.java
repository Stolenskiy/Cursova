package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.RocketweaponsEntity;
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
@RequestMapping("/rocketweapons")
public class RocketweaponsRestController {
    @Autowired
    private IEntityService rocketweaponsService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<RocketweaponsEntity> getRocketweapons(@PathVariable("id") Long rocketweaponsId) {
        System.out.println("Get");
        if (rocketweaponsId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        RocketweaponsEntity rocketweapons = (RocketweaponsEntity) this.rocketweaponsService.getById(rocketweaponsId);

        if (rocketweapons == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(rocketweapons, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<RocketweaponsEntity> saveRocketweapons(@RequestBody @Valid RocketweaponsEntity rocketweapons) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (rocketweapons == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.rocketweaponsService.save(rocketweapons);

        return new ResponseEntity(rocketweapons, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<RocketweaponsEntity> updateRocketweapons(@RequestBody @Valid RocketweaponsEntity rocketweapons, @PathVariable("id") Long rocketweaponsId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (rocketweapons == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.rocketweaponsService.delete(rocketweaponsId);
        this.rocketweaponsService.save(rocketweapons);

        return new ResponseEntity(rocketweapons, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<RocketweaponsEntity> deleteRocketweapons(@PathVariable("id") Long rocketweaponsId) {
        System.out.println("delete");
        RocketweaponsEntity rocketweapons = (RocketweaponsEntity) this.rocketweaponsService.getById(rocketweaponsId);

        if (rocketweapons == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.rocketweaponsService.delete(rocketweaponsId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<RocketweaponsEntity>> getAllRocketweaponss() {
        List rocketweapons = this.rocketweaponsService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(rocketweapons, HttpStatus.OK);
    }

}