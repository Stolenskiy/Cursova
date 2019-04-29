package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.PettyofficerEntity;
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
@RequestMapping("/pettyofficer")
public class PettyofficerRestController {
    @Autowired
    private IEntityService pettyofficerService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PettyofficerEntity> getPettyofficer(@PathVariable("id") Long pettyofficerId) {
        System.out.println("Get");
        if (pettyofficerId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        PettyofficerEntity pettyofficer = (PettyofficerEntity) this.pettyofficerService.getById(pettyofficerId);

        if (pettyofficer == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(pettyofficer, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PettyofficerEntity> savePettyofficer(@RequestBody @Valid PettyofficerEntity pettyofficer) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (pettyofficer == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.pettyofficerService.save(pettyofficer);

        return new ResponseEntity(pettyofficer, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PettyofficerEntity> updatePettyofficer(@RequestBody @Valid PettyofficerEntity pettyofficer, @PathVariable("id") Long pettyofficerId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (pettyofficer == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.pettyofficerService.delete(pettyofficerId);
        this.pettyofficerService.save(pettyofficer);

        return new ResponseEntity(pettyofficer, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PettyofficerEntity> deletePettyofficer(@PathVariable("id") Long pettyofficerId) {
        System.out.println("delete");
        PettyofficerEntity pettyofficer = (PettyofficerEntity) this.pettyofficerService.getById(pettyofficerId);

        if (pettyofficer == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.pettyofficerService.delete(pettyofficerId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<PettyofficerEntity>> getAllPettyofficers() {
        List pettyofficer = this.pettyofficerService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(pettyofficer, HttpStatus.OK);
    }

}