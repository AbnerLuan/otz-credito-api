package com.sicredicg.otzcreditoapi.controller;

import com.sicredicg.otzcreditoapi.entity.linhas.TipoLinha;
import com.sicredicg.otzcreditoapi.model.dto.TipoLinhaDTO;
import com.sicredicg.otzcreditoapi.service.TipoLinhaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/api/credito/tipolinha")
@RestController
@RequiredArgsConstructor
public class TipoLinhaController {

    private final TipoLinhaService tipoLinhaService;

    @GetMapping
    public ResponseEntity<List<TipoLinhaDTO>> findAll(){
        return ResponseEntity.ok().body(tipoLinhaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoLinhaDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(tipoLinhaService.findById(id));
    }

    @PostMapping
    public ResponseEntity<TipoLinhaDTO> saveTipoLinha(@RequestBody TipoLinhaDTO dto) {
        return ResponseEntity.ok().body(tipoLinhaService.save(dto));
    }

}
