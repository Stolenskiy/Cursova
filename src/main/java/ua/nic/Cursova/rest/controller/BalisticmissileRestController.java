package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.BalisticmissileEntity;
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
@RequestMapping("/balisticmissile")
public class BalisticmissileRestController {
    @Autowired
    private IEntityService balisticmissileService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<BalisticmissileEntity> getBalisticmissile(@PathVariable("id") Long balisticmissileId) {
        System.out.println("Get");
        if (balisticmissileId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        BalisticmissileEntity balisticmissile = (BalisticmissileEntity) this.balisticmissileService.getById(balisticmissileId);

        if (balisticmissile == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(balisticmissile, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<BalisticmissileEntity> saveBalisticmissile(@RequestBody @Valid BalisticmissileEntity balisticmissile) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (balisticmissile == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.balisticmissileService.save(balisticmissile);

        return new ResponseEntity(balisticmissile, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<BalisticmissileEntity> updateBalisticmissile(@RequestBody @Valid BalisticmissileEntity balisticmissile, @PathVariable("id") Long balisticmissileId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (balisticmissile == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.balisticmissileService.delete(balisticmissileId);
        this.balisticmissileService.save(balisticmissile);

        return new ResponseEntity(balisticmissile, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<BalisticmissileEntity> deleteBalisticmissile(@PathVariable("id") Long balisticmissileId) {
        System.out.println("delete");
        BalisticmissileEntity balisticmissile = (BalisticmissileEntity) this.balisticmissileService.getById(balisticmissileId);

        if (balisticmissile == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.balisticmissileService.delete(balisticmissileId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<BalisticmissileEntity>> getAllBalisticmissiles() {
        List balisticmissile = this.balisticmissileService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(balisticmissile, HttpStatus.OK);
    }

}