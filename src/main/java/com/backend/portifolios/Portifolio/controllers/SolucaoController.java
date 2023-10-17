package com.backend.portifolios.Portifolio.controllers;

import com.backend.portifolios.Portifolio.dtos.SolucaoRecordDto;
import com.backend.portifolios.Portifolio.models.Solucao;
import com.backend.portifolios.Portifolio.services.SolucaoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/solucao")
public class SolucaoController {

    @Autowired
    private SolucaoService solucaoService;

    @PostMapping
    public ResponseEntity<Solucao> saveSolucao(@RequestBody SolucaoRecordDto solucaoRecordDto){
        var solucao = new Solucao();
        BeanUtils.copyProperties(solucaoRecordDto, solucao);
        return ResponseEntity.status(HttpStatus.CREATED).body(solucaoService.save(solucao));
    }
}
