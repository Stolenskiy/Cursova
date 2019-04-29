package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.ColonelEntity;
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
@RequestMapping("/colonel")
public class ColonelRestController {
    @Autowired
    private IEntityService colonelService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ColonelEntity> getColonel(@PathVariable("id") Long colonelId) {
        System.out.println("Get");
        if (colonelId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        ColonelEntity colonel = (ColonelEntity) this.colonelService.getById(colonelId);

        if (colonel == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(colonel, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ColonelEntity> saveColonel(@RequestBody @Valid ColonelEntity colonel) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (colonel == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.colonelService.save(colonel);

        return new ResponseEntity(colonel, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ColonelEntity> updateColonel(@RequestBody @Valid ColonelEntity colonel, @PathVariable("id") Long colonelId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (colonel == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.colonelService.delete(colonelId);
        this.colonelService.save(colonel);

        return new ResponseEntity(colonel, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ColonelEntity> deleteColonel(@PathVariable("id") Long colonelId) {
        System.out.println("delete");
        ColonelEntity colonel = (ColonelEntity) this.colonelService.getById(colonelId);

        if (colonel == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.colonelService.delete(colonelId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<ColonelEntity>> getAllColonels() {
        List colonel = this.colonelService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(colonel, HttpStatus.OK);
    }

}