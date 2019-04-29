package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.BuildingEntity;
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
@RequestMapping("/building")
public class BuildingRestController {
    @Autowired
    private IEntityService buildingService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<BuildingEntity> getBuilding(@PathVariable("id") Long buildingId) {
        System.out.println("Get");
        if (buildingId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        BuildingEntity building = (BuildingEntity) this.buildingService.getById(buildingId);

        if (building == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(building, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<BuildingEntity> saveBuilding(@RequestBody @Valid BuildingEntity building) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (building == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.buildingService.save(building);

        return new ResponseEntity(building, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<BuildingEntity> updateBuilding(@RequestBody @Valid BuildingEntity building, @PathVariable("id") Long buildingId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (building == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.buildingService.delete(buildingId);
        this.buildingService.save(building);

        return new ResponseEntity(building, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<BuildingEntity> deleteBuilding(@PathVariable("id") Long buildingId) {
        System.out.println("delete");
        BuildingEntity building = (BuildingEntity) this.buildingService.getById(buildingId);

        if (building == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.buildingService.delete(buildingId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<BuildingEntity>> getAllBuildings() {
        List building = this.buildingService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(building, HttpStatus.OK);
    }

}