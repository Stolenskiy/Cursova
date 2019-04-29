package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.AutomxaticweaponEntity;
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
@RequestMapping("/automxaticweapon")
public class AutomxaticweaponRestController {
    @Autowired
    private IEntityService automxaticweaponService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AutomxaticweaponEntity> getAutomxaticweapon(@PathVariable("id") Long automxaticweaponId) {
        System.out.println("Get");
        if (automxaticweaponId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        AutomxaticweaponEntity automxaticweapon = (AutomxaticweaponEntity) this.automxaticweaponService.getById(automxaticweaponId);

        if (automxaticweapon == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(automxaticweapon, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AutomxaticweaponEntity> saveAutomxaticweapon(@RequestBody @Valid AutomxaticweaponEntity automxaticweapon) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (automxaticweapon == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.automxaticweaponService.save(automxaticweapon);

        return new ResponseEntity(automxaticweapon, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AutomxaticweaponEntity> updateAutomxaticweapon(@RequestBody @Valid AutomxaticweaponEntity automxaticweapon, @PathVariable("id") Long automxaticweaponId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (automxaticweapon == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.automxaticweaponService.delete(automxaticweaponId);
        this.automxaticweaponService.save(automxaticweapon);

        return new ResponseEntity(automxaticweapon, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AutomxaticweaponEntity> deleteAutomxaticweapon(@PathVariable("id") Long automxaticweaponId) {
        System.out.println("delete");
        AutomxaticweaponEntity automxaticweapon = (AutomxaticweaponEntity) this.automxaticweaponService.getById(automxaticweaponId);

        if (automxaticweapon == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.automxaticweaponService.delete(automxaticweaponId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<AutomxaticweaponEntity>> getAllAutomxaticweapons() {
        List automxaticweapon = this.automxaticweaponService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(automxaticweapon, HttpStatus.OK);
    }

}