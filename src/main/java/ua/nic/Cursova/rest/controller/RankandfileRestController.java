package ua.nic.Cursova.rest.controller;

import ua.nic.Cursova.model.RankandfileEntity;
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
@RequestMapping("/rankandfile")
public class RankandfileRestController {
    @Autowired
    private IEntityService rankandfileService;


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<RankandfileEntity> getRankandfile(@PathVariable("id") Long rankandfileId) {
        System.out.println("Get");
        if (rankandfileId == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        RankandfileEntity rankandfile = (RankandfileEntity) this.rankandfileService.getById(rankandfileId);

        if (rankandfile == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        return new ResponseEntity(rankandfile, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<RankandfileEntity> saveRankandfile(@RequestBody @Valid RankandfileEntity rankandfile) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("save");
        if (rankandfile == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        this.rankandfileService.save(rankandfile);

        return new ResponseEntity(rankandfile, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<RankandfileEntity> updateRankandfile(@RequestBody @Valid RankandfileEntity rankandfile, @PathVariable("id") Long rankandfileId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.println("update");
        if (rankandfile == null)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        this.rankandfileService.delete(rankandfileId);
        this.rankandfileService.save(rankandfile);

        return new ResponseEntity(rankandfile, httpHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<RankandfileEntity> deleteRankandfile(@PathVariable("id") Long rankandfileId) {
        System.out.println("delete");
        RankandfileEntity rankandfile = (RankandfileEntity) this.rankandfileService.getById(rankandfileId);

        if (rankandfile == null)
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        this.rankandfileService.delete(rankandfileId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<RankandfileEntity>> getAllRankandfiles() {
        List rankandfile = this.rankandfileService.getAll();
        System.out.println("GetAll");
        return new ResponseEntity(rankandfile, HttpStatus.OK);
    }

}