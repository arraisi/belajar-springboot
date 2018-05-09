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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author arrai
 */
//(url didefinisikan tiap methods)
@RestController
public class AnggotaApi {
    @Autowired
    private AnggotaRepository repo;
    
    @GetMapping("/api/anggota/list")
    public List<Anggota> cariSemuaData(){
        
      return repo.findAll();
    }
    
}
