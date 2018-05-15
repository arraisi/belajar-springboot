/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.controller;

import com.tabeldata.entity.Anggota;
import com.tabeldata.repository.AnggotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author arrai
 */
//(url didefinisikan tiap methods)
@RestController
@RequestMapping("/api/anggota")
public class AnggotaApi {
    @Autowired
    private AnggotaRepository repo;
    
    @GetMapping("/list")
    public List<Anggota> cariSemuaData(){
      return repo.findAll();
    }
    
    @GetMapping("/{id}")
    public Anggota findById(@PathVariable("id") Integer kode){
      return repo.findOne(kode);
    }
    
    @PostMapping("/")
    public Anggota simpanAnggota(@RequestBody Anggota anggota){
      return repo.save(anggota);
    }
    
    @PutMapping("/")
    public Anggota updateAnggota(@RequestBody Anggota anggota){
      return repo.save(anggota);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Anggota> delete(@PathVariable("id") Integer id){
      repo.delete(id);
      return new ResponseEntity<>(HttpStatus.OK);
    }
}
