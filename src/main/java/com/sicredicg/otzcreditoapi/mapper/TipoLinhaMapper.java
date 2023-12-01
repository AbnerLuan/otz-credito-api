package com.sicredicg.otzcreditoapi.mapper;

import com.sicredicg.otzcreditoapi.entity.linhas.TipoLinha;
import com.sicredicg.otzcreditoapi.model.dto.TipoLinhaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = IGNORE,
        nullValueCheckStrategy = ALWAYS
)
public interface TipoLinhaMapper {

    //@Mapping(target = "tipoLinhaId", ignore = true)
    TipoLinha toEntity(final TipoLinhaDTO dto);

    TipoLinhaDTO toDTO(final TipoLinha entity);
}
