package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.LocationEntity;
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
@RequestMapping("/location")
public class LocationRestController {
    @Autowired
    private IEntityService locationService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<LocationEntity> getLocation(@PathVariable("id") Long locationId) {
        System.out.println("Get");
        if (locationId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        LocationEntity location = (LocationEntity) this.locationService.getById(locationId);

        if (location == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(location, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<LocationEntity> saveLocation(@RequestBody @Valid LocationEntity location) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (location == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.locationService.save(location);

        return new ResponseEntity(location, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<LocationEntity> updateLocation(@RequestBody @Valid LocationEntity location, @PathVariable("id") Long locationId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (location == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.locationService.delete(locationId);
        this.locationService.save(location);

        return new ResponseEntity(location, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<LocationEntity> deleteLocation(@PathVariable("id") Long locationId) {
        System.out.println("delete");
        LocationEntity location = (LocationEntity) this.locationService.getById(locationId);

        if (location == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.locationService.delete(locationId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<LocationEntity>> getAllLocations() {
        List location = this.locationService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(location, HttpStatus.OK);
    }

}