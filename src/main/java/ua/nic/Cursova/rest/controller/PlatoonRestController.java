package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.PlatoonEntity;
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
@RequestMapping("/platoon")
public class PlatoonRestController {
    @Autowired
    private IEntityService platoonService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PlatoonEntity> getPlatoon(@PathVariable("id") Long platoonId) {
        System.out.println("Get");
        if (platoonId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        PlatoonEntity platoon = (PlatoonEntity) this.platoonService.getById(platoonId);

        if (platoon == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(platoon, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PlatoonEntity> savePlatoon(@RequestBody @Valid PlatoonEntity platoon) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (platoon == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.platoonService.save(platoon);

        return new ResponseEntity(platoon, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PlatoonEntity> updatePlatoon(@RequestBody @Valid PlatoonEntity platoon, @PathVariable("id") Long platoonId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (platoon == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.platoonService.delete(platoonId);
        this.platoonService.save(platoon);

        return new ResponseEntity(platoon, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PlatoonEntity> deletePlatoon(@PathVariable("id") Long platoonId) {
        System.out.println("delete");
        PlatoonEntity platoon = (PlatoonEntity) this.platoonService.getById(platoonId);

        if (platoon == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.platoonService.delete(platoonId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<PlatoonEntity>> getAllPlatoons() {
        List platoon = this.platoonService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(platoon, HttpStatus.OK);
    }

}