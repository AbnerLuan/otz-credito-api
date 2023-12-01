package com.sicredicg.otzcreditoapi.controller;


import com.sicredicg.otzcreditoapi.entity.linhas.Linha;
import com.sicredicg.otzcreditoapi.service.LinhaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/api/credito/linha")
@RestController
@RequiredArgsConstructor
public class LinhaController {

    private final LinhaService service;

    @PostMapping
    public ResponseEntity<Linha> createCreditoPf(@RequestBody Linha linhaPf) {
        return ResponseEntity.ok().body(service.createLinhaPf(linhaPf));
    }
    //teste2

    @GetMapping("/{id}")
    public ResponseEntity<Linha> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(service.findById(id));
    }
}
