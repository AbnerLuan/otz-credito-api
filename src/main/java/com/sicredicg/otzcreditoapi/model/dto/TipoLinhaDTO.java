package com.sicredicg.otzcreditoapi.model.dto;

import com.sicredicg.otzcreditoapi.entity.linhas.GrupoLinha;

import java.util.List;

public record TipoLinhaDTO(
        Long tipoLinhaId,
        String tipoLinha,
        List<GrupoLinha> grupoLinha
) {
}
