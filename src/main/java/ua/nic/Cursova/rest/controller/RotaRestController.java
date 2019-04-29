package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.RotaEntity;
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
@RequestMapping("/rota")
public class RotaRestController {
    @Autowired
    private IEntityService rotaService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<RotaEntity> getRota(@PathVariable("id") Long rotaId) {
        System.out.println("Get");
        if (rotaId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        RotaEntity rota = (RotaEntity) this.rotaService.getById(rotaId);

        if (rota == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(rota, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<RotaEntity> saveRota(@RequestBody @Valid RotaEntity rota) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (rota == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.rotaService.save(rota);

        return new ResponseEntity(rota, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<RotaEntity> updateRota(@RequestBody @Valid RotaEntity rota, @PathVariable("id") Long rotaId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (rota == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.rotaService.delete(rotaId);
        this.rotaService.save(rota);

        return new ResponseEntity(rota, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<RotaEntity> deleteRota(@PathVariable("id") Long rotaId) {
        System.out.println("delete");
        RotaEntity rota = (RotaEntity) this.rotaService.getById(rotaId);

        if (rota == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.rotaService.delete(rotaId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<RotaEntity>> getAllRotas() {
        List rota = this.rotaService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(rota, HttpStatus.OK);
    }

}