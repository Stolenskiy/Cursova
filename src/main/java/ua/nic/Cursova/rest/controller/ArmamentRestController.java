package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.ArmamentEntity;
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
@RequestMapping("/armament")
public class ArmamentRestController {
    @Autowired
    private IEntityService armamentService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ArmamentEntity> getArmament(@PathVariable("id") Long armamentId) {
        System.out.println("Get");
        if (armamentId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        ArmamentEntity armament = (ArmamentEntity) this.armamentService.getById(armamentId);

        if (armament == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(armament, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ArmamentEntity> saveArmament(@RequestBody @Valid ArmamentEntity armament) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (armament == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.armamentService.save(armament);

        return new ResponseEntity(armament, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ArmamentEntity> updateArmament(@RequestBody @Valid ArmamentEntity armament, @PathVariable("id") Long armamentId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (armament == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.armamentService.delete(armamentId);
        this.armamentService.save(armament);

        return new ResponseEntity(armament, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ArmamentEntity> deleteArmament(@PathVariable("id") Long armamentId) {
        System.out.println("delete");
        ArmamentEntity armament = (ArmamentEntity) this.armamentService.getById(armamentId);

        if (armament == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.armamentService.delete(armamentId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<ArmamentEntity>> getAllArmaments() {
        List armament = this.armamentService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(armament, HttpStatus.OK);
    }

}