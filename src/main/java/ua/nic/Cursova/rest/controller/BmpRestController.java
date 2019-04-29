package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.BmpEntity;
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
@RequestMapping("/bmp")
public class BmpRestController {
    @Autowired
    private IEntityService bmpService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<BmpEntity> getBmp(@PathVariable("id") Long bmpId) {
        System.out.println("Get");
        if (bmpId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        BmpEntity bmp = (BmpEntity) this.bmpService.getById(bmpId);

        if (bmp == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(bmp, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<BmpEntity> saveBmp(@RequestBody @Valid BmpEntity bmp) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (bmp == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.bmpService.save(bmp);

        return new ResponseEntity(bmp, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<BmpEntity> updateBmp(@RequestBody @Valid BmpEntity bmp, @PathVariable("id") Long bmpId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (bmp == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.bmpService.delete(bmpId);
        this.bmpService.save(bmp);

        return new ResponseEntity(bmp, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<BmpEntity> deleteBmp(@PathVariable("id") Long bmpId) {
        System.out.println("delete");
        BmpEntity bmp = (BmpEntity) this.bmpService.getById(bmpId);

        if (bmp == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.bmpService.delete(bmpId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<BmpEntity>> getAllBmps() {
        List bmp = this.bmpService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(bmp, HttpStatus.OK);
    }

}