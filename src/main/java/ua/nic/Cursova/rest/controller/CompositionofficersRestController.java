package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.CompositionofficersEntity;
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
@RequestMapping("/compositionofficers")
public class CompositionofficersRestController {
    @Autowired
    private IEntityService compositionofficersService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CompositionofficersEntity> getCompositionofficers(@PathVariable("id") Long compositionofficersId) {
        System.out.println("Get");
        if (compositionofficersId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        CompositionofficersEntity compositionofficers = (CompositionofficersEntity) this.compositionofficersService.getById(compositionofficersId);

        if (compositionofficers == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(compositionofficers, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CompositionofficersEntity> saveCompositionofficers(@RequestBody @Valid CompositionofficersEntity compositionofficers) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (compositionofficers == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.compositionofficersService.save(compositionofficers);

        return new ResponseEntity(compositionofficers, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CompositionofficersEntity> updateCompositionofficers(@RequestBody @Valid CompositionofficersEntity compositionofficers, @PathVariable("id") Long compositionofficersId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (compositionofficers == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.compositionofficersService.delete(compositionofficersId);
        this.compositionofficersService.save(compositionofficers);

        return new ResponseEntity(compositionofficers, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CompositionofficersEntity> deleteCompositionofficers(@PathVariable("id") Long compositionofficersId) {
        System.out.println("delete");
        CompositionofficersEntity compositionofficers = (CompositionofficersEntity) this.compositionofficersService.getById(compositionofficersId);

        if (compositionofficers == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.compositionofficersService.delete(compositionofficersId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<CompositionofficersEntity>> getAllCompositionofficerss() {
        List compositionofficers = this.compositionofficersService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(compositionofficers, HttpStatus.OK);
    }

}