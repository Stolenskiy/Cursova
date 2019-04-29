package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.ArmyEntity;
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
@RequestMapping("/army")
public class ArmyRestController {
    @Autowired
    private IEntityService armyService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ArmyEntity> getArmy(@PathVariable("id") Long armyId) {
        System.out.println("Get");
        if (armyId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        ArmyEntity army = (ArmyEntity) this.armyService.getById(armyId);

        if (army == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(army, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ArmyEntity> saveArmy(@RequestBody @Valid ArmyEntity army) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (army == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.armyService.save(army);

        return new ResponseEntity(army, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ArmyEntity> updateArmy(@RequestBody @Valid ArmyEntity army, @PathVariable("id") Long armyId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (army == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.armyService.delete(armyId);
        this.armyService.save(army);

        return new ResponseEntity(army, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ArmyEntity> deleteArmy(@PathVariable("id") Long armyId) {
        System.out.println("delete");
        ArmyEntity army = (ArmyEntity) this.armyService.getById(armyId);

        if (army == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.armyService.delete(armyId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<ArmyEntity>> getAllArmys() {
        List army = this.armyService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(army, HttpStatus.OK);
    }

}