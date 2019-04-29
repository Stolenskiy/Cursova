package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.PettyofficercolonelEntity;
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
@RequestMapping("/pettyofficercolonel")
public class PettyofficercolonelRestController {
    @Autowired
    private IEntityService pettyofficercolonelService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PettyofficercolonelEntity> getPettyofficercolonel(@PathVariable("id") Long pettyofficercolonelId) {
        System.out.println("Get");
        if (pettyofficercolonelId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        PettyofficercolonelEntity pettyofficercolonel = (PettyofficercolonelEntity) this.pettyofficercolonelService.getById(pettyofficercolonelId);

        if (pettyofficercolonel == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(pettyofficercolonel, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PettyofficercolonelEntity> savePettyofficercolonel(@RequestBody @Valid PettyofficercolonelEntity pettyofficercolonel) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (pettyofficercolonel == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.pettyofficercolonelService.save(pettyofficercolonel);

        return new ResponseEntity(pettyofficercolonel, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PettyofficercolonelEntity> updatePettyofficercolonel(@RequestBody @Valid PettyofficercolonelEntity pettyofficercolonel, @PathVariable("id") Long pettyofficercolonelId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (pettyofficercolonel == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.pettyofficercolonelService.delete(pettyofficercolonelId);
        this.pettyofficercolonelService.save(pettyofficercolonel);

        return new ResponseEntity(pettyofficercolonel, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PettyofficercolonelEntity> deletePettyofficercolonel(@PathVariable("id") Long pettyofficercolonelId) {
        System.out.println("delete");
        PettyofficercolonelEntity pettyofficercolonel = (PettyofficercolonelEntity) this.pettyofficercolonelService.getById(pettyofficercolonelId);

        if (pettyofficercolonel == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.pettyofficercolonelService.delete(pettyofficercolonelId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<PettyofficercolonelEntity>> getAllPettyofficercolonels() {
        List pettyofficercolonel = this.pettyofficercolonelService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(pettyofficercolonel, HttpStatus.OK);
    }

}