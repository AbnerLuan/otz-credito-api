package com.sicredicg.otzcreditoapi.service;

import com.sicredicg.otzcreditoapi.entity.linhas.TipoLinha;
import com.sicredicg.otzcreditoapi.mapper.TipoLinhaMapper;
import com.sicredicg.otzcreditoapi.model.dto.TipoLinhaDTO;
import com.sicredicg.otzcreditoapi.repository.TipoLinhaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class TipoLinhaService {

    private final TipoLinhaRepository tipoLinhaRepository;

    private final TipoLinhaMapper mapper;

    public TipoLinhaDTO save(TipoLinhaDTO dto) {
       return mapper.toDTO(tipoLinhaRepository.saveAndFlush(mapper.toEntity(dto)));
    }

    public TipoLinhaDTO findById(Long id) {
        TipoLinha tipoLinha = tipoLinhaRepository.findById(id).orElseThrow();
        return mapper.toDTO(tipoLinha);
    }

    public List<TipoLinhaDTO> findAll() {
        List<TipoLinha> listTipoLinha = tipoLinhaRepository.findAll();
        return listTipoLinha.stream().map(mapper::toDTO).toList();
    }
}
