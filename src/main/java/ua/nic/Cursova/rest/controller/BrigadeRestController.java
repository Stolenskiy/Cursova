package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.BrigadeEntity;
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
@RequestMapping("/brigade")
public class BrigadeRestController {
    @Autowired
    private IEntityService brigadeService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<BrigadeEntity> getBrigade(@PathVariable("id") Long brigadeId) {
        System.out.println("Get");
        if (brigadeId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        BrigadeEntity brigade = (BrigadeEntity) this.brigadeService.getById(brigadeId);

        if (brigade == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(brigade, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<BrigadeEntity> saveBrigade(@RequestBody @Valid BrigadeEntity brigade) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (brigade == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.brigadeService.save(brigade);

        return new ResponseEntity(brigade, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<BrigadeEntity> updateBrigade(@RequestBody @Valid BrigadeEntity brigade, @PathVariable("id") Long brigadeId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (brigade == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.brigadeService.delete(brigadeId);
        this.brigadeService.save(brigade);

        return new ResponseEntity(brigade, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<BrigadeEntity> deleteBrigade(@PathVariable("id") Long brigadeId) {
        System.out.println("delete");
        BrigadeEntity brigade = (BrigadeEntity) this.brigadeService.getById(brigadeId);

        if (brigade == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.brigadeService.delete(brigadeId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<BrigadeEntity>> getAllBrigades() {
        List brigade = this.brigadeService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(brigade, HttpStatus.OK);
    }

}