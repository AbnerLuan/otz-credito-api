package com.sicredicg.otzcreditoapi.mapper;

import com.sicredicg.otzcreditoapi.entity.linhas.GrupoLinha;
import com.sicredicg.otzcreditoapi.entity.linhas.TipoLinha;
import com.sicredicg.otzcreditoapi.model.dto.TipoLinhaDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-01T16:54:22-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class TipoLinhaMapperImpl implements TipoLinhaMapper {

    @Override
    public TipoLinha toEntity(TipoLinhaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TipoLinha tipoLinha = new TipoLinha();

        if ( dto.tipoLinhaId() != null ) {
            tipoLinha.setTipoLinhaId( dto.tipoLinhaId() );
        }
        if ( dto.tipoLinha() != null ) {
            tipoLinha.setTipoLinha( dto.tipoLinha() );
        }
        List<GrupoLinha> list = dto.grupoLinha();
        if ( list != null ) {
            tipoLinha.setGrupoLinha( new ArrayList<GrupoLinha>( list ) );
        }

        return tipoLinha;
    }

    @Override
    public TipoLinhaDTO toDTO(TipoLinha entity) {
        if ( entity == null ) {
            return null;
        }

        Long tipoLinhaId = null;
        String tipoLinha = null;
        List<GrupoLinha> grupoLinha = null;

        if ( entity.getTipoLinhaId() != null ) {
            tipoLinhaId = entity.getTipoLinhaId();
        }
        if ( entity.getTipoLinha() != null ) {
            tipoLinha = entity.getTipoLinha();
        }
        List<GrupoLinha> list = entity.getGrupoLinha();
        if ( list != null ) {
            grupoLinha = new ArrayList<GrupoLinha>( list );
        }

        TipoLinhaDTO tipoLinhaDTO = new TipoLinhaDTO( tipoLinhaId, tipoLinha, grupoLinha );

        return tipoLinhaDTO;
    }
}
