package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.MajorEntity;
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
@RequestMapping("/major")
public class MajorRestController {
    @Autowired
    private IEntityService majorService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<MajorEntity> getMajor(@PathVariable("id") Long majorId) {
        System.out.println("Get");
        if (majorId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        MajorEntity major = (MajorEntity) this.majorService.getById(majorId);

        if (major == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(major, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<MajorEntity> saveMajor(@RequestBody @Valid MajorEntity major) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (major == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.majorService.save(major);

        return new ResponseEntity(major, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<MajorEntity> updateMajor(@RequestBody @Valid MajorEntity major, @PathVariable("id") Long majorId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (major == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.majorService.delete(majorId);
        this.majorService.save(major);

        return new ResponseEntity(major, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<MajorEntity> deleteMajor(@PathVariable("id") Long majorId) {
        System.out.println("delete");
        MajorEntity major = (MajorEntity) this.majorService.getById(majorId);

        if (major == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.majorService.delete(majorId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<MajorEntity>> getAllMajors() {
        List major = this.majorService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(major, HttpStatus.OK);
    }

}