package com.sicredicg.otzcreditoapi.service;

import com.sicredicg.otzcreditoapi.entity.linhas.Linha;
import com.sicredicg.otzcreditoapi.repository.LinhaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class LinhaService {

    private final LinhaRepository repository;

    public Linha createLinhaPf(Linha linhaPf) {
        return repository.save(linhaPf);
    }

    public Linha findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

}



//    public GrupoLinhaPf create(GrupoLinhaPf grupoLinhaPf) {
//        return repository.save(grupoLinhaPf);
//    }
//
//    public LinhaPf findCreditoPf(Long id) {
//        return repository.findById(id).orElseThrow();
//    }
//
//    public List<LinhaPf> findAllCreditoPf(){
//        return repository.findAll();
//    }
