package com.example.demo.controller;

import com.example.demo.model.BenhAn;
import com.example.demo.service.IBenhAnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/benhans")
public class BenhAnController {
    @Autowired
    private IBenhAnService benhAnService;

    @GetMapping
    public ResponseEntity<Iterable<BenhAn>> findAllBennAn(){
        List<BenhAn> benhAns = (List<BenhAn>) benhAnService.findAll();
        if(benhAns.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(benhAns, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public  ResponseEntity<BenhAn> findBenhAnById(@PathVariable long id){
        Optional<BenhAn> benhAnOptional = benhAnService.findById(id);
        if(!benhAnOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(benhAnOptional.get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BenhAn> saveBenhAn(@RequestBody BenhAn benhAn) {
        return new ResponseEntity<>(benhAnService.save(benhAn), HttpStatus.CREATED);
    }


    @PutMapping("/{id}")
    public ResponseEntity<BenhAn> updateBenhAn(@PathVariable Long id,
                                                   @RequestBody BenhAn benhAn ){
        Optional<BenhAn> benhAnOptional = benhAnService.findById(id);
        if(!benhAnOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        benhAn.setId(benhAnOptional.get().getId());
        return new ResponseEntity<>(benhAnService.save(benhAn), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BenhAn> deleteBenhAn(@PathVariable Long id) {
        Optional<BenhAn> benhAnOptional = benhAnService.findById(id);
        if (!benhAnOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        benhAnService.remove(id);
        return new ResponseEntity<>(benhAnOptional.get(), HttpStatus.NO_CONTENT);
    }
}
