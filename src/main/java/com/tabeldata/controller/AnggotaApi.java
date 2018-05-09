/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author arrai
 */
//(url didefinisikan tiap methods)
@RestController
public class AnggotaApi {
    //membuat servlet (url)
    @GetMapping(value = "/api/info")
    public Map info(@RequestParam(required = false) String data) {
        Map<String, Object> param = new HashMap<>();
        param.put("nama", "Dimas Maryanto");
        param.put("tanggal", new Date());
        param.put("method", "get");
        return param;
    }
    
    @PostMapping(value="/api/info")
    public Map set(@RequestParam(required = false) String data){
        Map<String, Object> params = new HashMap<>();
        params.put("nama", "Dimas Maryanto");
        params.put("tanggal", new Date());
        params.put("method", "post");
        return params;
    }
}
