package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.CombatAndTransportVehiclesEntity;
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
@RequestMapping("/combatAndTransportVehicles")
public class CombatAndTransportVehiclesRestController {
    @Autowired
    private IEntityService combatAndTransportVehiclesService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CombatAndTransportVehiclesEntity> getCombatAndTransportVehicles(@PathVariable("id") Long combatAndTransportVehiclesId) {
        System.out.println("Get");
        if (combatAndTransportVehiclesId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        CombatAndTransportVehiclesEntity combatAndTransportVehicles = (CombatAndTransportVehiclesEntity) this.combatAndTransportVehiclesService.getById(combatAndTransportVehiclesId);

        if (combatAndTransportVehicles == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(combatAndTransportVehicles, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CombatAndTransportVehiclesEntity> saveCombatAndTransportVehicles(@RequestBody @Valid CombatAndTransportVehiclesEntity combatAndTransportVehicles) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (combatAndTransportVehicles == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.combatAndTransportVehiclesService.save(combatAndTransportVehicles);

        return new ResponseEntity(combatAndTransportVehicles, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CombatAndTransportVehiclesEntity> updateCombatAndTransportVehicles(@RequestBody @Valid CombatAndTransportVehiclesEntity combatAndTransportVehicles, @PathVariable("id") Long combatAndTransportVehiclesId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (combatAndTransportVehicles == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.combatAndTransportVehiclesService.delete(combatAndTransportVehiclesId);
        this.combatAndTransportVehiclesService.save(combatAndTransportVehicles);

        return new ResponseEntity(combatAndTransportVehicles, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CombatAndTransportVehiclesEntity> deleteCombatAndTransportVehicles(@PathVariable("id") Long combatAndTransportVehiclesId) {
        System.out.println("delete");
        CombatAndTransportVehiclesEntity combatAndTransportVehicles = (CombatAndTransportVehiclesEntity) this.combatAndTransportVehiclesService.getById(combatAndTransportVehiclesId);

        if (combatAndTransportVehicles == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.combatAndTransportVehiclesService.delete(combatAndTransportVehiclesId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<CombatAndTransportVehiclesEntity>> getAllCombatAndTransportVehicless() {
        List combatAndTransportVehicles = this.combatAndTransportVehiclesService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(combatAndTransportVehicles, HttpStatus.OK);
    }

}